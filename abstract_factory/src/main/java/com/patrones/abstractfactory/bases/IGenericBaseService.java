package com.patrones.abstractfactory.bases;

import com.patrones.services.IArticlesService;
import com.patrones.services.IEmployeesService;

public interface IGenericBaseService {
    public IEmployeesService getEmployees();
    public IArticlesService getArticles(); 
}
