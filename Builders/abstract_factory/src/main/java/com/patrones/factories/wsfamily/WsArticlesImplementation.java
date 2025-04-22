package com.patrones.factories.wsfamily;

import com.patrones.services.IArticlesService;

public class WsArticlesImplementation implements IArticlesService {
    private static final String[] articlesMock = new String[]{ "Disco" };

    @Override
    public String[] getArticles() {
        System.out.println("Tipo de Servicio: WS");
        return articlesMock;
    }
}
