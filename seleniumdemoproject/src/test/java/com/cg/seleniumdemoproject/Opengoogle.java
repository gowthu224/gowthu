package com.cg.seleniumdemoproject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle {
	WebDriver driver;
	public Opengoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar.Murugesan\\Documents\\selenium gow\\tutor\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public void Loadurl()
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		//driver.quit();
	}
	public void Search()
	{
		driver.findElement(By.name("q")).sendKeys("capgemini");
		driver.findElement(By.name("q")).submit();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public void InputDemo() throws InterruptedException
	{
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(300);
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Gowthami");
		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Selvam");
		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Tamilnadu Erode");
		driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("XXX@gmail.com");
		driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("9876543210");
		List<WebElement> l=driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).getAttribute("value").contains("FeMale"))
			{
				l.get(i).click();
			}
		}
		
		
	}
	
	
}
