package com.patrones;

import java.util.Arrays;

import com.patrones.abstractfactory.bases.GenericServiceAbstractFactory;
import com.patrones.abstractfactory.bases.IGenericBaseService;
import com.patrones.services.IArticlesService;
import com.patrones.services.IEmployeesService;

public class Main {
    public static void main(String[] args) {
        IGenericBaseService factory = GenericServiceAbstractFactory.createServiceFactory();
        IEmployeesService employeeService = factory.getEmployees();
        IArticlesService articlesService = factory.getArticles();

         System.out.println("Servicio Empleados class > " 
                + employeeService.getClass().getCanonicalName());
        System.out.println("Servicio Articulos class  > " 
                + articlesService.getClass().getCanonicalName());
        
        System.out.println("getEmployee > " 
                + Arrays.toString(employeeService.getEmployees()));
        System.out.println("getProduct  > " 
                + Arrays.toString(articlesService.getArticles()));
    }
}