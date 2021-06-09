package com.cg.seleniumdemoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
	WebDriver driver;
	public FrameDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar.Murugesan\\Documents\\selenium gow\\tutor\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public void Guru99Frames()
	{
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		
	}
	
}
