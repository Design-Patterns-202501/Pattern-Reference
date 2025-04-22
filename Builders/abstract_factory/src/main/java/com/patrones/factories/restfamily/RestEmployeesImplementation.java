package com.patrones.factories.restfamily;

import com.patrones.services.IEmployeesService;

public class RestEmployeesImplementation implements IEmployeesService {
    
    private static final String[] employees = new String[]{"Juan Guillermo", "David", "Luis Fernando"};
    @Override
    public String[] getEmployees() {
        System.out.println("Tipo de servicio: REST");
        return employees;
    }
}
