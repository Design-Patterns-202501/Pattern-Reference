package com.patrones.factory.adapters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.patrones.factory.interfaces.IAdapter;
import com.patrones.utils.PropsUtil;

public class PostgresqlAdapter implements IAdapter {

    private static final String DB_PROPS = "properties/";


    // Props names for MySQL connection
    private static final String SERVICE = "service";
    private static final String HOST = "host";
    private static final String PASSWORD = "password";
    private static final String PORT = "port";
    private static final String USER = "user";


    static {
        try {
            new org.postgresql.Driver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String createConnectionString() {
        Properties props = PropsUtil.loadPropertyFile(DB_PROPS);
        String host = props.getProperty(HOST);
        String port = props.getProperty(PORT);
        String service = props.getProperty(SERVICE);

        String connectionString = "jdbc:postgresql://"+host+":"+port+"/"+service;

        System.out.println("Connection String ==> " + connectionString);

        return connectionString;
    }

    @Override
    public Connection getConnection() {
        try {
            Properties props = PropsUtil.loadPropertyFile(DB_PROPS);
            String user = props.getProperty(USER);
            String password = props.getProperty(PASSWORD);
            String connectionString = this.createConnectionString();
            Connection con = DriverManager.getConnection(connectionString, user, password);
            System.out.println("Connection class ==> " + con.getClass().getName());

            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
