package com.patrones.fintech.c;

import java.util.Random;

public class FintechCAPI {

    public boolean sendCreditRequest() throws Exception {
        boolean result = new Random().nextBoolean();
        if (!result) throw new Exception("The Fintech denied the credit");
        return true;
    };
    
}
