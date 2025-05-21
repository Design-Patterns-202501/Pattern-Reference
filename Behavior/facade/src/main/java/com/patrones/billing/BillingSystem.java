package com.patrones.billing;

import com.patrones.fidelity.FidelitySystem;
import com.patrones.lib.MockDb;
import com.patrones.schemas.Client;

public class BillingSystem {

    private final FidelitySystem fidelitySystem = new FidelitySystem();

    public double getBalanceClient(Long id) {
        Client client = MockDb.getClientById(id);
        return client.getBalance();
    };

    public double payment(BillPaymentRequest billPay) {
        Client customer = MockDb.getClientById(billPay.getClientId());

        boolean usedPoints = false;
        if (fidelitySystem.getClientPoints(billPay.getClientId())/10 >= billPay.getPayment()) {
            Long neededPoints = (long) (billPay.getPayment()*10L);
            usedPoints = true;
            fidelitySystem.addPoints(billPay.getClientId(), -neededPoints);
        } else {
            customer.setBalance(customer.getBalance() - billPay.getPayment());
            fidelitySystem.addPoints(customer.getId(), (long)billPay.getPayment()/10);

            System.out.println("Added " + billPay.getPayment()/10 + " points to user");
        }

        System.out.println("Payment applied to " + customer.getName() + " " + customer.getId());
        if (usedPoints) System.out.println("The user use points to pay");
        return customer.getBalance();
    };
}
