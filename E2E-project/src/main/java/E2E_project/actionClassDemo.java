package E2E_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class actionClassDemo {
	public WebDriver driver;
	public actionClassDemo(WebDriver driver) {
		this.driver=driver;
	}  
	By ajaxpage=By.xpath("//*[text()='Ajax Form Submit']");
	By ajaxpageloading=By.xpath("//div[contains(@class,'text-left')]");
	By name=By.name("title");
	By description=By.xpath("//textarea[@name='description']");
	By submit=By.name("btn-submit");
	By textAftSubmit=By.xpath("//div[text()='Form submited Successfully!']");
	
	public WebElement name_m()
	{
		return driver.findElement(name);
	}
	public WebElement description_m()
	{
		return driver.findElement(description);
	}
	public WebElement submit_m()
	{
		return driver.findElement(submit);
	}
	public WebElement ajaxpage_m()
	{
		return driver.findElement(ajaxpage);
	}
	public WebElement ajaxpageloading_m()
	{
		return driver.findElement(ajaxpageloading);
	}
	public WebElement textAftSubmit_m()
	{
		return driver.findElement(textAftSubmit);
	}
}
