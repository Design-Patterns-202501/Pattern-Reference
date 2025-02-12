package com.patrones.factories.wsfamily;

import com.patrones.services.IEmployeesService;

public class WsEmployeesImplementation implements IEmployeesService {
    private static final String[] employees = new String[]{"Juan Guillermo", "David", "Luis Fernando"};
    @Override
    public String[] getEmployees() {
        System.out.println("Tipo de servicio: WS");
        return employees;
    }   
}
