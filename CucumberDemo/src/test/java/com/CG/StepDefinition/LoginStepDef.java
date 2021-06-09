package com.CG.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDef {
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar.Murugesan\\Documents\\selenium gow\\tutor\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@When("The user gives {string} and {string} in corresponding field and click on submit")
	public void the_user_gives_and_in_corresponding_field_and_click_on_submit(String string, String string2) {
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(string);
	    driver.findElement(By.xpath("//input[@id='continue']")).click();
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(string2);
	    driver.findElement(By.xpath("//*[@id='auth-signin-button']")).click();
	    //System.out.println(driver.getTitle());
	}
	@Then("user should be able to login succesfully")
	public void user_should_be_able_to_login_succesfully() {
		System.out.println(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Online Shopping"));
	    System.out.println(driver.getTitle());
	    driver.close();
	}
	@Then("user should not be able to login succesfully.")
	public void user_should_not_be_able_to_login_succesfully(io.cucumber.datatable.DataTable dataTable) {
		System.out.println(driver.getTitle());
	    driver.close();
	}
	
	@When("The user gives the details")
	public void the_user_gives_the_details(io.cucumber.datatable.DataTable dataTable) {
	    
	}
	@And("The user enters submit")
	public void the_user_enters_submit() {
	    
	}
	
	
}
