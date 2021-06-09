package E2E_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectDropdown {
	public WebDriver driver;
	public selectDropdown(WebDriver driver){
		this.driver=driver;
	}
	By dropDownPage=By.xpath("//*[text()='Select Dropdown List']");
	By selectList=By.id("select-demo");
	By multipleSelect=By.id("multi-select");
	
	public WebElement dropDownPage_m()
	{
		return driver.findElement(dropDownPage);
	}
	public WebElement selectList_m()
	{
		return driver.findElement(selectList);
	}
	public WebElement multipleSelect_m()
	{
		return driver.findElement(multipleSelect);
	}
	
}
