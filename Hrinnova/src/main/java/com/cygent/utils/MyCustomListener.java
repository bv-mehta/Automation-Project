package com.cygent.utils;
import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyCustomListener implements ISuiteListener{
	
	public void onStart(ISuite suite) 
	{
		try {
			PropertyManager.loadproperties();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		TestBase.GetDriver().navigate().to("http://e-shabda.com:9090/click-examples/form/standard-controls-form.htm");
		//TestBase.GetDriver().navigate().to(PropertyManager.properties.getProperty("alert_Url"));
		//TestBase.GetDriver().navigate().to(PropertyManager.properties.getProperty("Login_Url"));
		try {
			ReadWriteExcel.readData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	public void onFinish(ISuite suite) 
	{
		try {
			ReadWriteExcel.writeData();
			Thread.sleep(2000);
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestBase.GetDriver().close();
	}

}
