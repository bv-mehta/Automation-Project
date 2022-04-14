package com.cygnet.locators;

public interface Locators {
	String Username = "//input[@id='username']";
	String Password = "//input[@id='password']";
	String Login_submit = "//button[@id='btnLogin']";
	String Dashboard = "//div[@class='profile-name']";
	String Tog_Pass = "//span[@id=\"toggle_pwd\"]";
	String Login_Error = "//span[text()='Invalid user name or password.']";
	
}
