package com.cygnet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cygent.utils.TestBase;
import com.cygnet.locators.BasicElementInterface;

public class BasicElementPage implements BasicElementInterface{
	
	public WebElement Checkbox()
	{
		return TestBase.GetDriver().findElement(By.xpath(CheckBox));
		
	}
	public WebElement password()
	{
		return TestBase.GetDriver().findElement(By.xpath(password));
	}
	
	public WebElement radio()
	
	{
		return TestBase.GetDriver().findElement(By.xpath(Radio));
	}
	public WebElement radiogrp()
	{
		return TestBase.GetDriver().findElement(By.xpath(Radiogrp));
	}
	public void select()
	{
		Select dd = new Select(TestBase.GetDriver().findElement(By.xpath(Drpdown)));
		dd.selectByVisibleText("Ben Bessel");
		
	}
	public WebElement txtArea()
	{
		return TestBase.GetDriver().findElement(By.xpath(Textarea));
	}
	public WebElement input()
	{
		return TestBase.GetDriver().findElement(By.xpath(Input));
	}
	public WebElement button()
	{
		return TestBase.GetDriver().findElement(By.xpath(Button));
	}
	

}
