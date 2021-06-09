package E2E_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javaScript_Demo {
	public WebDriver driver;
	public javaScript_Demo(WebDriver driver) {
		this.driver=driver;
	}
	By jQuery=By.xpath("//*[text()='JQuery Select dropdown']");
	By selectCountry=By.xpath("//*[@aria-labelledby='select2-country-container']");
	//By selectcountrybox=By.xpath("//*[@dir='ltr']//*[contains(@class,'select2-search--dropdown')]");
	By selectcountrybox=By.xpath("//*[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']");
	By selectState=By.className("select2-search__field");
	By selectTerritories=By.xpath("//*[@title='American Samoa']");
	By territoriesInputBox=By.xpath("//*[@class='select2-search select2-search--dropdown']//input[@type='search']");
	By selectFiles=By.id("files");
	public WebElement jQuery_m()
	{
		return driver.findElement(jQuery);
	}
	public WebElement selectCountry_m()
	{
		return driver.findElement(selectCountry);
	}
	public WebElement selectcountrybox_m()
	{
		return driver.findElement(selectcountrybox);
	}
	public WebElement selectState_m()
	{
		return driver.findElement(selectState);
	}
	public WebElement selectTerritoriese_m()
	{
		return driver.findElement(selectTerritories);
	}
	public WebElement selectFiles_m()
	{
		return driver.findElement(selectFiles);
	}
	public WebElement territoriesInputBox_m()
	{
		return driver.findElement(territoriesInputBox);
	}

}
