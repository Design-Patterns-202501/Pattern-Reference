package com.patrones;

import com.patrones.implementacion.AdaptadorFintechA;
import com.patrones.implementacion.AdaptadorFitechB;
import com.patrones.implementacion.FintechAdapterC;
import com.patrones.implementacion.FintechCreditoRespuesta;
import com.patrones.implementacion.FintechSolicitudCredito;
import com.patrones.implementacion.InterfaceFintechAdaptador;

public class App {
    public static void main(String[] args) {
        FintechSolicitudCredito request = new FintechSolicitudCredito();
        request.setCliente("Cristiano Ronaldo");
        request.setValor(1000);

        InterfaceFintechAdaptador FinancieraB = new AdaptadorFitechB();
        FintechCreditoRespuesta FBresponse = FinancieraB.EnvioSolicitudCredito(request);
        System.out.println("Resultado aprobación Financiera <<B>>: > " + FBresponse.isAprobacion() + "\n");
        
        if (FBresponse.isAprobacion()) {
            System.out.println("Felicitaciones!!!!!, la Financiera <<B>> aprobó su solicitud de crédito." + "\n");
        } 
        else
            { 
             System.out.println("Lo sentimos, la Financiera <<B>> no aprobó su crédito");   
            }
            
        
        
        InterfaceFintechAdaptador FinancieraA = new AdaptadorFintechA();
        FintechCreditoRespuesta FAresponse = FinancieraA.EnvioSolicitudCredito(request);
        System.out.println("Resultado aprobación Financiera <<A>>: > " + FAresponse.isAprobacion() + "\n");
        
        if (FAresponse.isAprobacion()) {
            System.out.println("Felicitaciones!!!!!, la Financiera <<A>> aprobó su solicitud de crédito.");
        } 
        else
            { 
             System.out.println("Lo sentimos, la Financiera <<A>> no aprobó su crédito");   
            }

        InterfaceFintechAdaptador FinancieraC = new FintechAdapterC();

        FintechCreditoRespuesta FCResponse = FinancieraC.EnvioSolicitudCredito(request);

    System.out.println("Resultado aprobación Financiera <<C>>: > " + FCResponse.isAprobacion() + "\n");
        
        if (FCResponse.isAprobacion()) {
            System.out.println("Felicitaciones!!!!!, la Financiera <<C>> aprobó su solicitud de crédito.");
        } 
        else
            { 
             System.out.println("Lo sentimos, la Financiera <<C>> no aprobó su crédito");   
            }
    }
}
