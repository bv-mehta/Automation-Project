package com.cygnet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cygent.utils.TestBase;
import com.cygnet.locators.Locators;

public class DashBoard implements Locators{
	
	public WebElement GetDashboard()
	{
		return TestBase.GetDriver().findElement(By.xpath(Dashboard));
	}
	
	public void waitForDashboard()
	{
		WebDriverWait wait = new WebDriverWait(TestBase.GetDriver(), 20);
		wait.until(ExpectedConditions.visibilityOf(GetDashboard()));	
		
	}

}
