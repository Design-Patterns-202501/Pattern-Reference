package com.patrones.factory;

import java.util.Properties;

import com.patrones.factory.adapters.MySqlAdapter;
import com.patrones.factory.adapters.PostgresqlAdapter;
import com.patrones.factory.interfaces.DbTypes;
import com.patrones.factory.interfaces.IAdapter;
import com.patrones.utils.PropsUtil;

public class DatabaseFactory {

   private static final String DB_FACTORY_PROPS_URL = "resources/";
   // Props name
   private static final String DEFAULT_CLASS = "defaultClass";
    

   public static IAdapter getDatabaseAdapter(DbTypes type) {
        switch (type) {
            case MySQL:
                return new MySqlAdapter();
            case Postgresql:
                return new PostgresqlAdapter();
            default:
                throw new IllegalArgumentException();
        }
   }

   public static IAdapter getDefaultAdapter() {
       try {
           Properties props = PropsUtil.loadPropertyFile(DB_FACTORY_PROPS_URL);
           String defaultClass = props.getProperty(DEFAULT_CLASS);
           System.out.println("Default class ==> " + defaultClass);
           return (IAdapter) Class.forName(defaultClass).getDeclaredConstructor().newInstance();
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
}
