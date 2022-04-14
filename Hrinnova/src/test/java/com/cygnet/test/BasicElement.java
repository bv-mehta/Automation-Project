package com.cygnet.test;

import org.testng.annotations.Test;

import com.cygnet.pages.BasicElementPage;

public class BasicElement 
{
	@Test
	public void BasicForm() throws InterruptedException
	{
		BasicElementPage basic = new BasicElementPage();
		basic.Checkbox().click();
		System.out.println(basic.Checkbox().isSelected() + "Drop");
		basic.password().sendKeys("Bhavya");
		basic.radiogrp().click();
		basic.radio().click();
		basic.select();
		basic.txtArea().sendKeys("input Textarea");;
		basic.input().sendKeys("Textbox input");
		basic.button();
		Thread.sleep(3000);
		
		
	}
  
  
}
