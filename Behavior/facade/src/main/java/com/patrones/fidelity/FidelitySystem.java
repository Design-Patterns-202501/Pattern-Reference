package com.patrones.fidelity;

import java.util.HashMap;

public class FidelitySystem {

    private final HashMap<Long, Long> clientPoints = new HashMap<>();

    public FidelitySystem() {}

    private void verifyClient(Long clientId) {
        if (!clientPoints.containsKey(clientId)) clientPoints.put(clientId, 0L);
    }

    public void addPoints(Long id, Long points) {
        verifyClient(id);
        Long currPoints = clientPoints.get(id);
        clientPoints.put(id, currPoints+points);
    };

    public Long getClientPoints(Long id) {
        verifyClient(id);
        return clientPoints.get(id);
    }
    
}
