package E2E_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class actionClass_testcase4 extends base {
	@BeforeTest
	public void initiation() throws IOException
	{
		
		driver=browserinitiation();
	}
	@Test
	public void actionClass_tc4_m() throws IOException, InterruptedException
	{
		homepage h =new homepage(driver);
		h.pagealert_m().click();
		h.Inputforms_m().click();
		actionClassDemo ac=new actionClassDemo(driver);
		ac.ajaxpage_m().click();
		System.out.println("Entered into ajax page");
		Actions a=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ac.ajaxpageloading));
		a.moveToElement(ac.name_m()).click().sendKeys("Gowthami").build().perform();
		System.out.println("Entered into name");
		a.moveToElement(ac.description_m()).click().sendKeys("selenium java candidate").build().perform();
		System.out.println("Entered into description");
		a.moveToElement(ac.submit_m()).click().build().perform();
		System.out.println("submitted");
		//WebDriverWait wait1=new WebDriverWait(driver, 10);
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(ac.textAftSubmit));
		System.out.println(ac.textAftSubmit_m().getText());
		if(ac.textAftSubmit_m().getText().equalsIgnoreCase("Form submited Successfully!"))
		{
			System.out.println("Form is submited successfully");
		}else {
			System.out.println("Form is not submited successfully");
		}
			
	}
	@AfterTest
	public void termination()
	{
		driver.close();
	}
		
}
