package E2E_project;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class javaScript_testcase5 extends base{
	@BeforeTest
	public void initiation() throws IOException
	{
		
		driver=browserinitiation();
	}
	@Test
	public void javaScript_testcase5_m() throws InterruptedException
	{
		homepage h =new homepage(driver);
		h.pagealert_m().click();
		h.Inputforms_m().click();
		javaScript_Demo j=new javaScript_Demo(driver);
		j.jQuery_m().click();
		j.selectCountry_m().click();
		if(j.selectcountrybox_m().isDisplayed())
		{
		//
		}else {
			j.selectCountry_m().click();
			j.selectcountrybox_m().click();
		}
		//Thread.sleep(10);
		j.selectcountrybox_m().sendKeys("India");
		j.selectcountrybox_m().sendKeys(Keys.ENTER);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		j.selectState_m().click();
		
		String script = "return document.getElementsByClassName('select2-results__option')";
		Object ob = js.executeScript(script);
		 List<RemoteWebElement> list1 = (List<RemoteWebElement>)ob;
		 for(RemoteWebElement remoteWebElement : list1) {
			 if(remoteWebElement.getText().equalsIgnoreCase("California"))
				{
					remoteWebElement.click();
					break;
				}
		 }
		 WebDriverWait wait=new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(j.selectTerritories));
		j.selectTerritoriese_m().click();
		if(j.territoriesInputBox_m().isDisplayed())
		{
			//
		}else
		{
			j.selectTerritoriese_m().click();
			j.territoriesInputBox_m().click();
		}
		System.out.println("entered territories");
//		String script1="rerurn document.getElementByClassName('select2-results__option')";
//		Object ob1=js.executeScript(script1);
//		List<RemoteWebElement> list2 = (List<RemoteWebElement>)ob1;
//		for(RemoteWebElement r:list2)
//		{
//			System.out.println("for loop");
//			if(r.getText().equalsIgnoreCase("Puerto Rico"))
//			{
//				System.out.println("entered loop");
//				r.click();
//			}
//		}
		j.territoriesInputBox_m().sendKeys(Keys.ARROW_DOWN);
		j.territoriesInputBox_m().sendKeys(Keys.ENTER);
		//System.out.println(j.selectTerritoriese_m().getText());
		Select s=new Select(j.selectFiles_m());
		s.selectByVisibleText("Java");
	}
	@AfterMethod
	public void termination() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.close();
	}

}
