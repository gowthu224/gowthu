package com.cg.seleniumdemoproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDBDemo {
	WebDriver driver;
	public AmazonDBDemo() throws SQLException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar.Murugesan\\Documents\\selenium gow\\tutor\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url1 = "jdbc:mysql://localhost:3306/schema1";
        String user = "root";
        String password = "admin";
        
		Connection c=DriverManager.getConnection(url1, user, password);
		Statement s=c.createStatement();
		ResultSet rs1=s.executeQuery("select count(*) from user_detail");
		while(rs1.next()) {
			System.out.println(rs1.getInt(1));	
		}
		
		
		ResultSet rs=s.executeQuery("select * from user_detail'");
		List<UserDetailDTO>  userDetailList = new ArrayList<UserDetailDTO>();
		while(rs.next()) {
			UserDetailDTO detailDTO = new UserDetailDTO();
			detailDTO.setName(rs.getString("name"));
			detailDTO.setUserName(rs.getString("uname"));
			detailDTO.setPassword(rs.getString("password"));
			userDetailList.add(detailDTO);
		}
		for(UserDetailDTO dto:userDetailList) {
			System.out.println("Name -- "+dto.getName()+ " UName -- "+dto.getUserName()+ " Password -- "+dto.getPassword());
		}
		
	}
	public void AmazonSignIn() throws SQLException, ClassNotFoundException
	{
		
//		driver.findElement(By.linkText("Sign in")).click();
//		
//		
//		rs.next();
//		System.out.println(rs.getString("uname"));
//		System.out.println(rs.getString("password"));
//	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(rs.getString("uname"));
//	    driver.findElement(By.xpath("//input[@id='continue']")).click();
//	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(rs.getString("password"));
//	    driver.findElement(By.xpath("//*[@id='auth-signin-button']")).click();
//	    System.out.println(driver.getTitle());
//	    System.out.println(driver.getTitle());
//	    Assert.assertTrue(driver.getTitle().contains("Online Shopping site"));
//	   driver.close();
		
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		AmazonDBDemo am=new AmazonDBDemo();
		am.AmazonSignIn();
	}

}
