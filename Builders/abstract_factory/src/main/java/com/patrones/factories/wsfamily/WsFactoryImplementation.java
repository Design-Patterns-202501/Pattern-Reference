package com.patrones.factories.wsfamily;

import com.patrones.abstractfactory.bases.IGenericBaseService;
import com.patrones.services.IArticlesService;
import com.patrones.services.IEmployeesService;

public class WsFactoryImplementation implements IGenericBaseService {
    
    @Override
    public IArticlesService getArticles() {
        // Cambiar a WsArticlesImplentation();
        return new WsArticlesImplementation();
    }

    @Override
    public IEmployeesService getEmployees() {
        return new WsEmployeesImplementation();
    }
}
