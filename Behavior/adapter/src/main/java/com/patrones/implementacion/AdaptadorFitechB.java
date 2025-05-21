package com.patrones.implementacion;

import com.patrones.fintech.b.FintechBCreditosAPI;
import com.patrones.fintech.b.FintechBRespuestaCredito;
import com.patrones.fintech.b.FintechBSolicitudCredito;

public class AdaptadorFitechB implements InterfaceFintechAdaptador {

    @Override
    public FintechCreditoRespuesta EnvioSolicitudCredito(FintechSolicitudCredito request) {
        FintechBSolicitudCredito FBrequest = new FintechBSolicitudCredito();
        FBrequest.setNombreCliente(request.getCliente());
        FBrequest.setValorSolicitado(request.getValor());
        
        FintechBCreditosAPI api = new FintechBCreditosAPI();
        FintechBRespuestaCredito FBresponse = api.sendCreditRequest(FBrequest);
        
        FintechCreditoRespuesta response = new FintechCreditoRespuesta();
        response.setAprobacion(FBresponse.isResultadoAprobacion());
        return response;
    }
    
}
