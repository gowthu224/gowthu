package com.cg.seleniumdemoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
		WebDriver driver;
		public AlertDemo()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar.Murugesan\\Documents\\selenium gow\\tutor\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		public void AlertTask()
		{
			driver.get("http://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.xpath("//*[@onclick='alertbox()']")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			//driver.switchTo().alert().dismiss();
			driver.quit();
			
		}

}
