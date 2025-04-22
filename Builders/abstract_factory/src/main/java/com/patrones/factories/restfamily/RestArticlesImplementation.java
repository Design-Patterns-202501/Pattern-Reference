package com.patrones.factories.restfamily;

import com.patrones.services.IArticlesService;

public class RestArticlesImplementation implements IArticlesService {
    
    private static final String[] articlesMock = new String[]{ "Disco" };

    @Override
    public String[] getArticles() {
        System.out.println("Tipo de Servicio: Restful");
        return articlesMock;
    }
}
