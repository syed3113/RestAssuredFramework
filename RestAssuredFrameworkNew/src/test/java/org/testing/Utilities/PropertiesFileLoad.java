package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {
	
	
	public static Properties property_load() throws IOException
	{
		
		File f = new File("..//RestAssuredFrameworkNew//Env.properties");
		FileInputStream fi = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fi);
		
		return pr;
		
	}

}
