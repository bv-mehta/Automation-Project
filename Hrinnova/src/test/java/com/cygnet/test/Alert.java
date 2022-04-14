package com.cygnet.test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.cygent.utils.TestBase;
import com.cygnet.pages.AlertPage;

public class Alert {

	@Test
	public void performAlert() throws InterruptedException
	{
		AlertPage alertpage = new AlertPage();
		JavascriptExecutor js = (JavascriptExecutor)TestBase.GetDriver();
		js.executeScript("arguments[0].scrollIntoView();", alertpage.ConfirmLink());
		Thread.sleep(2000);
		alertpage.ConfirmLink().click();
		System.out.println("Confirm click");
		Thread.sleep(2000);
		if(alertpage.waitforalert() == null)
			
		{
			System.out.println("Fail");
		}
		else
		{
			Thread.sleep(2000);
			System.out.println("Accept");
			String Atext =TestBase.GetDriver().switchTo().alert().getText();
			System.out.println(Atext);
			alertpage.AccepAlert();
			TestBase.GetDriver();
			
			
		}
		
			
			Thread.sleep(2000);
			alertpage.ConfirmLink().click();
			Thread.sleep(2000);
			alertpage.RejectAlert();
		/*
		 * alertpage.ConfirmLink(); alertpage.RejectAlert();
		 */
		
		
	}
}
