package com.cygnet.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cygent.utils.TestBase;
import com.cygnet.locators.AlertLocators;

public class AlertPage implements AlertLocators
{
	public WebElement ConfirmLink()
	{
		return TestBase.GetDriver().findElement(By.xpath(confirmLink));
		
	}
	public void AccepAlert()
	{
	TestBase.GetDriver().switchTo().alert().accept();
	}
	
	public Alert waitforalert()
	{
		WebDriverWait w = new WebDriverWait(TestBase.GetDriver(),10);
		
		return w.until(ExpectedConditions.alertIsPresent());
	}
	public void RejectAlert()
	{
	TestBase.GetDriver().switchTo().alert().dismiss();
	}
	
	public WebElement selectvalue()
	{
		
		Select s = new Select(TestBase.GetDriver().findElement(By.xpath("//select[@id='option_select']")));
		s.selectByVisibleText("confirmLink");
		return null;
	}
	
	
}
