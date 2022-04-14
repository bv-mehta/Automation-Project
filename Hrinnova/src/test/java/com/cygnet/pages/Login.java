package com.cygnet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cygent.utils.ReadWriteExcel;
import com.cygent.utils.TestBase;
import com.cygnet.locators.Locators;

public class Login implements Locators

{
	public static String username;
	public static String password;
	public WebElement GetUsername()
	{
		return TestBase.GetDriver().findElement(By.xpath(Username));
	}
	
	public WebElement GetPassword()
	{
		return TestBase.GetDriver().findElement(By.xpath(Password));
	}
	
	public WebElement GetLogin_Submit()
	{
		return TestBase.GetDriver().findElement(By.xpath(Login_submit));

	}

	public int getRowCount()
	{
		System.out.println(ReadWriteExcel.Sheet.getLastRowNum() - ReadWriteExcel.Sheet.getFirstRowNum());
		return ReadWriteExcel.Sheet.getLastRowNum() - ReadWriteExcel.Sheet.getFirstRowNum();
	}
	public WebElement toggle()
	{
		return TestBase.GetDriver().findElement(By.xpath(Tog_Pass));

	}
	public  WebElement Login_Error()
	{
		return TestBase.GetDriver().findElement(By.xpath(Login_Error));
	}
	public void clearData()
	{
		try {
			GetUsername().clear();
			GetPassword().clear();
		} catch (Exception e) {
			System.out.println("No Data for Clear");
		}
	}
	public String Logindata(int rowIndex, int colIndex)
	{


		if(colIndex ==0)
		{
			username = ReadWriteExcel.Sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue();
			return username;
		}
		if(colIndex ==1)
		{
			password = ReadWriteExcel.Sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue();
			return password;
		}
		
		username ="";
		password ="";
		return "";

		//return ReadWriteExcel.Sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue();

		//System.out.println(ReadWriteExcel.Sheet.getLastRowNum());
		//System.out.println(ReadWriteExcel.Sheet.getFirstRowNum());

		//rowcount = ReadWriteExcel.Sheet.getLastRowNum() - ReadWriteExcel.Sheet.getFirstRowNum();
		//System.out.println(rowcount);

		//int cellcount = ReadWriteExcel.Sheet.getRow(rowIndex).getLastCellNum();


		/*
		 * String cellvalue = ReadWriteExcel.Sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		 * if(colIndex == 0) { username = cellvalue; return username;
		 * 
		 * 
		 * } if( colIndex == 1) { Password = cellvalue; return Password; }
		 */




		/*
		 * System.out.println("Username----" + username);
		 * System.out.println("Password---" + Password);
		 *
		 *username = "";
		Password = "";




		return "";
		 */	


	}





}
