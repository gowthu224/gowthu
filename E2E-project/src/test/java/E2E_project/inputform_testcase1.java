package E2E_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import resources.base;

public class inputform_testcase1 extends base
{
	@BeforeTest
	public void initiation() throws IOException
	{
		
		driver=browserinitiation();
	}
	@Test
	public void selectInputForm1()
	{
		
		homepage h=new homepage(driver);
		WebElement img=driver.findElement(By.xpath("//img[contains(@alt,Selenium)]"));
		Assert.assertTrue(img.isDisplayed());
		h.pagealert_m().click();
		Reporter.log("entered into homepage");
		h.Inputforms_m().click();
		Reporter.log("entered into InputForm");
		h.simpleFormDemo_m().click();
		Reporter.log("entered into simpleFormDemo_m");
		h.inputdataForms_m().click();
		Reporter.log("entered into inputdataForms_m");
		simpleFormInput s=new simpleFormInput(driver);
		s.enterA_m().sendKeys("50");
		s.enterB_m().sendKeys("50");
		s.getTotal().click();
		if(s.totalDisplay_m().getText().equalsIgnoreCase("100"))
		{
			System.out.println("Total sum is correct");
		}else
		{
			System.out.println("Total sum is wrong");
		}
		//checkbox demo
		h.Inputforms_m().click();
		s.checkboxDemo_m().click();
		s.checkbox_m().click();
		System.out.println("selected the checkboxes? :"+s.checkbox_m().isSelected());
		s.checkbox_m().click();
		System.out.println("(After clearing)---selected the checkboxes? :"+s.checkbox_m().isSelected());
		//radioButton
		h.Inputforms_m().click();
		s.radioButton_m().click();
		s.buttonFemale_m().click();
		s.ageGroup_m().click();
		s.getValues_m().click();
		System.out.println("Selected Values:    "+s.getValuesText_m().getText());
		
	}
	@AfterTest
	public void termination() throws IOException
	{
		
		driver.close();
	}

}
