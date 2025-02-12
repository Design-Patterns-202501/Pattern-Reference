package com.patrones.factories.restfamily;

import com.patrones.abstractfactory.bases.IGenericBaseService;
import com.patrones.services.IArticlesService;
import com.patrones.services.IEmployeesService;

public class RestFactoryImplementation implements IGenericBaseService {
    
    @Override
    public IEmployeesService getEmployees(){
        return new RestEmployeesImplementation();
    }

    @Override
    public IArticlesService getArticles() {
        return new RestArticlesImplementation();
    }
}
