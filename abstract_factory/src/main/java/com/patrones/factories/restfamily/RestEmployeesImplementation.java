package com.patrones.factories.restfamily;

import com.patrones.services.IEmployeesService;

public class RestEmployeesImplementation implements IEmployeesService {
    
    @Override
    public String[] getEmployees() {
        return new String[]{};
    }
}
