package E2E_project;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class dropDown_testcase2 extends base {
	
	@BeforeTest
	public void initiation() throws IOException
	{
		
		driver=browserinitiation();
	}
	@Test
	public void dropDown_m()
	{
		homepage h =new homepage(driver);
		h.pagealert_m().click();
		h.Inputforms_m().click();
		selectDropdown select=new selectDropdown(driver);
		select.dropDownPage_m().click();
		Select sl=new Select(select.selectList_m());
		sl.selectByValue("Monday");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("DropDown options");
		System.out.println("------------------------------------------------------------------------");
		List<WebElement> options=sl.getOptions();
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		} 
		System.out.println("------------------------------------------------------------------------");
		Select msl=new Select(select.multipleSelect_m());
		if(msl.isMultiple())
		{
			System.out.println("This is muliple select Dropdown");
		}else {
			System.out.println("This is not muliple select Dropdown");
		}
		msl.selectByValue("New York");
		msl.selectByIndex(5);
		msl.selectByVisibleText("New Jersey");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Display 1st selected value");
		System.out.println(msl.getFirstSelectedOption().getText());
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Display All selected value");
		List<WebElement> muloptions=msl.getAllSelectedOptions();
		for(int i=0;i<muloptions.size();i++)
		{
			System.out.println(muloptions.get(i).getText());
		} 
		System.out.println("------------------------------------------------------------------------");
		System.out.println(System.getProperty("user.dir"));
	}

	@AfterTest
	public void termination() throws IOException
	{
		
		driver.close();
	}
}
