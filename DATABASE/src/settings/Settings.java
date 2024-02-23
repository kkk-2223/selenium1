package settings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Settings {

	public String getProperty(String s) throws IOException
	{
       	 
            	Properties propertiesFile = new Properties();
            	propertiesFile.load(new FileInputStream("config.properties"));
            	return propertiesFile.getProperty(s);
	}

}
