package com.cg.seleniumdemoproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AmazonDemoDB {
	WebDriver driver;
	public AmazonDemoDB()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar.Murugesan\\Documents\\selenium gow\\tutor\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public void AmazonSignIn() throws SQLException, ClassNotFoundException
	{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click();
		
		String url1 = "jdbc:mysql://localhost:3306/schema1";
        String user = "root";
        String password = "admin";
        
		Connection c=DriverManager.getConnection(url1, user, password);
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select * from user_detail where name='gowthami'");
		rs.next();
		System.out.println(rs.getString("uname"));
		System.out.println(rs.getString("password"));
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(rs.getString("uname"));
	    driver.findElement(By.xpath("//input[@id='continue']")).click();
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(rs.getString("password"));
	    driver.findElement(By.xpath("//*[@id='auth-signin-button']")).click();
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Online Shopping site"));
	   driver.close();
		
	}

}
