package E2E_project;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import resources.base;

public class table_testcase7_SoftAssert extends base{
	
	@BeforeMethod
	public void initiation() throws IOException
	{
		
		browserinitiation();
	}
	@Test
	public void table_SA_tc6_m() throws InterruptedException
	{
		homepage h =new homepage(driver);
		tableDemo t=new tableDemo(driver);
		h.pagealert_m().click();
		
		t.tableTab_m().click();
		t.tableDataSearch_m().click();
		String task=t.browserIssues_m().getText();
		SoftAssert sa=new SoftAssert();
		try{
			sa.assertTrue(task.equalsIgnoreCase("Browser Issues"), "Browser Issues is expected.");
			System.out.println("Extracted task: "+task+" is correct");
		}
		catch(Exception e){
			System.out.println("Extracted task: "+task+" is wrong");
			//System.out.println(e);
			throw e;
		}	
		
	}
	@Test
	public void table_SA_tc6_1_m() throws InterruptedException
	{
		homepage h =new homepage(driver);
		tableDemo t=new tableDemo(driver);
		h.pagealert_m().click();
		t.tableTab_m().click();
		t.tableDataSearch_m().click();
		t.filterBy_m().click();
		Thread.sleep(100);
		t.filterBy_m().sendKeys("Bootstrap");
		System.out.println("After filter,searching for task");
		SoftAssert sa=new SoftAssert();
		String task1=t.browserIssues_m().getText();
		try{
			sa.assertEquals(task1, "Browserrrrrrr");
			//Assert.assertEquals(task1, "Browserrrrrrr");
			System.out.println("Extracted task: "+task1+" is correct");
		}
		catch(Exception e){
			System.out.println("Extracted task: "+task1+" is wrong");
			//System.out.println(e);
			throw e;
		}
		
		
	}
	@AfterMethod
	public void termination() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.close();
	}

}

