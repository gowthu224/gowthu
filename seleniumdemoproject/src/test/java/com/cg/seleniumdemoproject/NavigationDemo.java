package com.cg.seleniumdemoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
	WebDriver driver;
	public NavigationDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar.Murugesan\\Documents\\selenium gow\\tutor\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public void NavigationInGoogle()
	{
		driver.get("https://google.com");
		driver.findElement(By.linkText("Images")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div[@id='hplogo']")).isDisplayed());
		driver.quit();
		
		
	}

}
