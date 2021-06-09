package E2E_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	public WebDriver driver;
	public homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	By pagealert =By.xpath("//*[contains(@style,187)]");
	By inputForms=By.xpath("//div[@id='navbar-brand-centered']/ul/li//a");
	By simpleFormDemo=By.xpath("//*[text()='Simple Form Demo']");
	By inputdataForms=By.xpath("//*[text()='Input Forms']");
	public WebElement Inputforms_m()
	{
		return driver.findElement(inputForms);
	}
	public WebElement pagealert_m()
	{
		return driver.findElement(pagealert);
	}
	public WebElement simpleFormDemo_m()
	{
		return driver.findElement(simpleFormDemo);
	}
	public WebElement inputdataForms_m()
	{
		return driver.findElement(inputdataForms);
	}
	
}
