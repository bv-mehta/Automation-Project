package com.cygent.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager 

{
	
	public static Properties properties ;
	
	public static void loadproperties() throws IOException
	{
		String propertiesfilepath ="src\\test\\resources\\Base.properties";
		File file = new File(propertiesfilepath);
		
	
			FileReader filereader = new FileReader(file);
			properties = new Properties();
			 properties.load(filereader);
			
		
		
	}
	
	
}
