package com.cygent.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase 
{
	public static WebDriver driver;
	


	public static WebDriver GetDriver()
	{
		if(driver == null)	
		{
 
			String browsername = PropertyManager.properties.getProperty("browser");
			if(browsername.toUpperCase().equals("CHROME"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			
			else if (browsername.toUpperCase().equals("FIREFOX")) 
			{
				WebDriverManager.firefoxdriver().setup();
				//driver = new FirefoxDriver();
			}
			else if (browsername.toUpperCase().equals("EDGE")) 
			{

				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			}
			else if (browsername.toUpperCase().equals("EDGE")) 
			{

				WebDriverManager.chromedriver().setup();
				

			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			return driver;
			
		}
		else
			return driver;

	}

}
