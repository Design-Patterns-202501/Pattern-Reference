package com.patrones.implementacion;

import com.patrones.fintech.c.FintechCAPI;

public class FintechAdapterC implements  InterfaceFintechAdaptador {

	@Override
	public FintechCreditoRespuesta EnvioSolicitudCredito(FintechSolicitudCredito request) {
        FintechCreditoRespuesta response = new FintechCreditoRespuesta();
        try {
            FintechCAPI api = new FintechCAPI();
            api.sendCreditRequest();
        } catch (Exception e) {
            response.setAprobacion(false);
        }
        return response;
	}

    
}
