package E2E_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inputFormSubmit {
	public WebDriver driver; 
	public inputFormSubmit(WebDriver driver)
	{
		this.driver=driver;
	}
	By inputFormSubmitpage = By.xpath("//*[text()='Input Form Submit']");
	By firstName=By.xpath("//input[@data-bv-field='first_name']");
	By lastName=By.xpath("//input[@data-bv-field='last_name']");
	By email=By.xpath("//input[@data-bv-field='email']");
	By phone=By.xpath("//input[@data-bv-field='phone']");
	By address=By.xpath("//input[@data-bv-field='address']");
	By city=By.xpath("//input[@data-bv-field='city']");
	By state=By.name("state");
	By zip=By.xpath("//input[@data-bv-field='zip']");
	By website=By.xpath("//input[@name='website']");
	By hosting_yes=By.xpath("//input[@value='yes']");
	By hosting_no=By.xpath("//input[@value='no']");
	By description=By.xpath("//textarea[@data-bv-field='comment']");
	By send=By.xpath("//div[@class='col-md-4']//button[@type='submit']");
	
	public WebElement inputFormSubmitpage_m(){
		return driver.findElement(inputFormSubmitpage);
	}
	public WebElement firstName_m(){
		return driver.findElement(firstName);
	}
	public WebElement lastName_m(){
		return driver.findElement(lastName);
	}
	public WebElement email_m(){
		return driver.findElement(email);
	}
	public WebElement phone_m(){
		return driver.findElement(phone);
	}
	public WebElement address_m(){
		return driver.findElement(address);
	}
	public WebElement city_m(){
		return driver.findElement(city);
	}
	public WebElement state_m(){
		return driver.findElement(state);
	}
	public WebElement zip_m(){
		return driver.findElement(zip);
	}
	public WebElement website_m(){
		return driver.findElement(website);
	}
	public WebElement hosting_yes_m(){
		return driver.findElement(hosting_yes);
	}
	public WebElement hosting_no_m(){
		return driver.findElement(hosting_no);
	}
	public WebElement description_m(){
		return driver.findElement(description);
	}
	public WebElement send_m(){
		return driver.findElement(send);
	}
	
	
}
