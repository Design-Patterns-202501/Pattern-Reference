package com.patrones.props_singleton;

import java.util.Properties;

import com.patrones.utils.PropsReader;

public class PropsSingleton {
    private static PropsSingleton instance = null;

    private static final String propsPath = "app.properties";


    private final String NAME_FIELD = "nombreAplicacion";
    private final String VERSION_FIELD = "numeroVersion";

    private String applicationName;
    private String applicationVersion;


	private PropsSingleton() {
        Properties props = PropsReader.loadProperties(propsPath);
        this.applicationName = props.getProperty(this.NAME_FIELD);
        this.applicationVersion = props.getProperty(this.VERSION_FIELD);
    }


	public String getApplicationName() {
		return applicationName;
	}


	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}


	public String getApplicationVersion() {
		return applicationVersion;
	}


	public void setApplicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
	}

    // https://stackoverflow.com/questions/1085709/what-does-synchronized-mean
    public static synchronized PropsSingleton getInstance() {
        if (instance == null) instance = new PropsSingleton();
        return instance;
    }
    @Override
    public String toString() {
        return "Singleton ={ " + this.applicationVersion + " , " + this.applicationName + " }"; 
    }
}
