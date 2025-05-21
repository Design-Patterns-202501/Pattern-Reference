package com.patrones.billing;

import java.util.UUID;

import com.patrones.exceptions.PaymentError;
import com.patrones.lib.MockDb;

public class BankSystem {

    public String transaction(TransactionRequest request) throws PaymentError {
        String cardPrefix = request.getCardNumber().substring(0, 3);
        if (!MockDb.validateCard(cardPrefix)) throw new PaymentError("Tarjeta invalida");

        String cardIssuer = MockDb.getCardIssuer(cardPrefix);

        if ("NEQUI".equals(cardIssuer) && request.getCardNumber().length() != 15){
            throw new PaymentError("Card number invalid");
        } else if (("VISA".equals(cardIssuer) || "MASTERCARD".equals(cardIssuer)) && request.getCardNumber().length() != 16) {
            throw new PaymentError("Card number invalid");
        }

        String number = request.getCardNumber();
        String prefixNumber = number.substring(number.length()-4, number.length());

        System.out.println("Transaction sended to: " + request.getCardName() + " for an ammount of " + request.getAmmount() + " to the card with prefix " + prefixNumber + "\n");

        return UUID.randomUUID().toString();
    }
    
}
