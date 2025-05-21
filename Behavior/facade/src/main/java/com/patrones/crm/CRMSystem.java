package com.patrones.crm;

import com.patrones.lib.MockDb;
import com.patrones.schemas.Client;

public class CRMSystem {
    public Client searchClient(Long id) {
        return MockDb.getClientById(id);
    }
}
