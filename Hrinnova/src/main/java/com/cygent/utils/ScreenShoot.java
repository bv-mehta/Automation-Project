package com.cygent.utils;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class ScreenShoot {
	
	
	public static void Takess()
	{
		
		TakesScreenshot ss =(TakesScreenshot)TestBase.GetDriver();
		File ac =  ss.getScreenshotAs(OutputType.FILE);
		File ex = new File("src/test/resources/screen/" + "aas.png");
		try {
			Files.copy(ac, ex);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
