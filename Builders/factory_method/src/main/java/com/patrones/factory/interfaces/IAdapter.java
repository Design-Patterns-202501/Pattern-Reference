package com.patrones.factory.interfaces;

import java.sql.Connection;

public interface IAdapter {

    public Connection getConnection();
    
}
