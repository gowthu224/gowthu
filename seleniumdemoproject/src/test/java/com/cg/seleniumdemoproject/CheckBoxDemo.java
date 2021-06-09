package com.cg.seleniumdemoproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
		WebDriver driver;
		public CheckBoxDemo()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar.Murugesan\\Documents\\selenium gow\\tutor\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		public void CheckBoxTask()
		{
			driver.get("https://www.myntra.com/men-bags-backpacks");
			driver.manage().window().maximize();
			List<WebElement> checkboxes=driver.findElements(By.xpath("//*[@type='checkbox']"));
			for(int i=0;i<checkboxes.size();i++)
			{
				WebElement text=checkboxes.get(i);
				if(text.getAttribute("value").contains("Laptop Bag"))
				{
					driver.findElement(By.xpath("//*[@value='Laptop Bag']/parent::label")).click();
				}
				
			}
		

		}
}
