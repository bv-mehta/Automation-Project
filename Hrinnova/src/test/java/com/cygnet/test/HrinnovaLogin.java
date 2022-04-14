package com.cygnet.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cygent.utils.PropertyManager;
import com.cygent.utils.ReadWriteExcel;
import com.cygent.utils.TestBase;
import com.cygnet.pages.DashBoard;
import com.cygnet.pages.Login;

public class HrinnovaLogin 

{
	//@BeforeSuite
	public void Beforesuite()
	{
		try {
			PropertyManager.loadproperties();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		TestBase.GetDriver().get(PropertyManager.properties.getProperty("Login_Url"));
		System.out.println("Browser Start");
		try {
			ReadWriteExcel.readData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//@org.testng.annotations.AfterSuite
	public void AfterSuite() throws InterruptedException
	{
		Thread.sleep(4000);
		TestBase.GetDriver().close();
		System.out.println("Browser Close");
	}

	@Test
	public void CheckLogin() throws IOException, InterruptedException
	{
		Login login = new Login();
		DashBoard dashboard = new DashBoard(); 
		for (int i = 1; i <=login.getRowCount(); i++)
		{
			String result ;
			login.GetUsername().sendKeys(login.Logindata(i, 0));
			login.GetPassword().sendKeys(login.Logindata(i, 1)); 	
			login.GetLogin_Submit().click();
			login.clearData();
			try 
			{
				System.out.println("Data Start");
				Boolean res = dashboard.GetDashboard().isDisplayed();
				if (res == true) 
				{
					result ="Pass";
					System.out.println("User Name ---->" + login.Logindata(i, 0) + result);	
					ReadWriteExcel.Sheet.getRow(i).createCell(2).setCellValue(result);
				}
				System.out.println("Data end");
			} 
			catch (Exception e) 
			{
				Boolean error = login.Login_Error().isDisplayed();
				if (error == true) 
				{
					result ="Fail";
					System.out.println("User Name ---->" + login.Logindata(i, 0) + result);
					ReadWriteExcel.Sheet.getRow(i).createCell(2).setCellValue(result);
				}
			}
			Thread.sleep(2000);	
		}
		/*
		 * login.GetUsername().sendKeys(PropertyManager.properties.getProperty(
		 * "Username"));
		 * login.GetPassword().sendKeys(PropertyManager.properties.getProperty(
		 * "Password")); login.GetLogin_Submit().click();
		 */
		/*
		 * DashBoard dashboard = new DashBoard(); dashboard.waitForDashboard();
		 * ScreenShoot.Takess();
		 * 
		 * 
		 */
	}

}
