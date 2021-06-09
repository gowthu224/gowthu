package com.cg.seleniumdemoproject;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchDemo {
	WebDriver driver;
	public WindowSwitchDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar.Murugesan\\Documents\\selenium gow\\tutor\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public void MyntraSwitchWindows() throws InterruptedException
	{
		driver.get("https://www.myntra.com");
		driver.findElement(By.linkText("Men")).click();
		System.out.println(driver.getTitle());
		WebElement Men=driver.findElement(By.linkText("Men"));
		Men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		driver.findElement(By.linkText("Women")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(a.get(2));
		driver.findElement(By.linkText("Kids")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(a.get(3));
		driver.findElement(By.linkText("Home & Living")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(a.get(4));
		driver.findElement(By.linkText("Beauty")).click();
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
	}
}
