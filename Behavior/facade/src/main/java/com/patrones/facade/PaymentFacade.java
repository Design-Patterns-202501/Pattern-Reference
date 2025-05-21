package com.patrones.facade;

import java.util.HashMap;

import com.patrones.billing.BankSystem;
import com.patrones.billing.BillPaymentRequest;
import com.patrones.billing.BillingSystem;
import com.patrones.billing.PaymentRequest;
import com.patrones.billing.PaymentResponse;
import com.patrones.billing.TransactionRequest;
import com.patrones.crm.CRMSystem;
import com.patrones.exceptions.PaymentError;
import com.patrones.interfaces.IPaymentFacade;
import com.patrones.lib.MockDb;
import com.patrones.mail.MailSystem;
import com.patrones.schemas.Client;

public class PaymentFacade implements IPaymentFacade {

    private static final CRMSystem crmSystem = new CRMSystem();
    private static final BillingSystem billingSystem = new BillingSystem();
    private static final MailSystem mailSystem = new MailSystem();
    private static final BankSystem bankSystem = new BankSystem();
        

	@Override
	public PaymentResponse payment(PaymentRequest request) throws PaymentError {
        Client customer = crmSystem.searchClient(request.getClientId());
        
        if (customer == null) {
            throw new PaymentError("Client id do not exist " + request.getClientId());
        } else if ("Inactive".equals(customer.getState())) {
            throw new PaymentError("Client id " + request.getClientId() + " is inactive");
        } else if (request.getAmmount() > billingSystem.getBalanceClient(customer.getId())) {
            throw new PaymentError("Client " + request.getClientId() + " do not have the resources to pay: " + request.getAmmount());
        }

        TransactionRequest transfer = new TransactionRequest(request.getAmmount(), request.getCardNumber(), request.getCardName(), request.getCardExpireDate(), request.getCardSecurityNumber());

        String payReference = bankSystem.transaction(transfer);

        BillPaymentRequest paymentRequest = new BillPaymentRequest(
                request.getClientId(), request.getAmmount()
                );

        double newBalance = billingSystem.payment(paymentRequest);

        String newStatus = customer.getState();

        if (newBalance <= 50) {
            MockDb.changeClientState(customer.getId(), "Activo");
            newStatus = "Activo";
        }

        HashMap<String,String> params = new HashMap<>();
        params.put("$nombre", customer.getName());
        params.put("$Monto", request.getAmmount()+"");
        params.put("$NuevoSaldo", newBalance+"");
        String number = request.getCardNumber();
        String subfix = number.substring(number.length()-4, number.length());
        params.put("$NumeroTarjeta", subfix);
        params.put("$Referencia", payReference);
        params.put("$NuevoEstado", newStatus);

        mailSystem.sendEmail(params);

        return new PaymentResponse(payReference, newBalance, newStatus);
	}

    
}
