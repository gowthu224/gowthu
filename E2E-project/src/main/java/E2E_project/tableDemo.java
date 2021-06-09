package E2E_project;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class tableDemo extends base {
	public WebDriver driver;
	public tableDemo(WebDriver driver){
		this.driver=driver;
	}
	By tableTab=By.xpath("//ul[@class='nav navbar-nav']/li[3]");
	By tableDataSearch=By.xpath("//*[text()='Table Data Search']");
	By browserIssues=By.xpath("//*[text()='Browser Issues']");
	By filterBy=By.xpath("//input[@id='task-table-filter']");
	
	By table2heading=By.xpath("//h3[contains(text(),'activate column')]");
	By table2filter=By.xpath("//button[contains(@class,'btn-filter')]//*[@class='glyphicon glyphicon-filter']");
	//By table2filter=By.cssSelector(".btn.btn-default.btn-xs.btn-filter");
	By table2RowCount=By.xpath("//div[contains(@class,'panel-primary filterable')]//table/tbody/tr");
	String table2datab4="//div[@class='panel panel-primary filterable']//table/tbody/tr[";
	String table2dataaft="]/td[2]"; //Rel.XPATH traverse table, extract 3rd row 2nd column data
//	String uniquexb4="//*[contains(text(),'";
//	String uniqueaft="')]";
	By table2datauniquexpath=By.xpath("//*[contains(text(),'mikesali')]");
	By table2datauniquexpathRow=By.xpath("//*[text()='mikesali']//preceding-sibling::td");
	By filterLastName=By.xpath("//input[@placeholder='Last Name']");
	By dataLarrypt=By.xpath("//*[contains(text(),'larrypt')]");
	By dataDaniel=By.xpath("//*[contains(text(),'Daniel')]");
	public WebElement tableTab_m()
	{
		return driver.findElement(tableTab);
	}
	public WebElement tableDataSearch_m()
	{
		return driver.findElement(tableDataSearch);
	}
	public WebElement browserIssues_m()
	{
		return driver.findElement(browserIssues);
	}
	public WebElement filterBy_m()
	{
		return driver.findElement(filterBy);
	}
	public WebElement table2filter_m()
	{
		return driver.findElement(table2filter);
	}
	public WebElement table2datauniquexpath_m()
	{
		return driver.findElement(table2datauniquexpath);
	}
	public List<WebElement> table2RowCount_m()
	{
		return driver.findElements(table2RowCount);
	}
	public WebElement table2heading_m() 
	{
		return driver.findElement(table2heading);
	}
	public WebElement table2datauniquexpathRow_m()
	{
		return driver.findElement(table2datauniquexpathRow);
	}
	public WebElement filterLastName_m()
	{
		return driver.findElement(filterLastName);
	}
	public WebElement dataLarrypt_m()
	{
		return driver.findElement(dataLarrypt);
	}
	public WebElement dataDaniel_m()
	{
		return driver.findElement(dataDaniel);
	}

}
