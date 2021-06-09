package E2E_project;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import resources.base;

public class table_testcase6 extends base{
	
	@BeforeMethod
	public void initiation() throws IOException
	{
		
		browserinitiation();
	}
	@Test
	public void table_tc6_1_m() throws InterruptedException
	{
		homepage h =new homepage(driver);
		tableDemo t=new tableDemo(driver);
		h.pagealert_m().click();
		t.tableTab_m().click();
		t.tableDataSearch_m().click();
		String task=t.browserIssues_m().getText();
		
		try{
			Assert.assertTrue(task.equalsIgnoreCase("Browser Issues"), "Browser Issues is expected.");
			System.out.println("Extracted task: "+task+" is correct");
		}
		catch(Exception e){
			System.out.println("Extracted task: "+task+" is wrong");
			//System.out.println(e);
			throw e;
		}	
		
	}
	@Test
	public void table_tc6_2_m() throws InterruptedException 
	{
		homepage h =new homepage(driver);
		h.pagealert_m().click();
		tableDemo t=new tableDemo(driver);
		t.tableTab_m().click();
		t.tableDataSearch_m().click();
		t.filterBy_m().click();
		//Thread.sleep(100);
		t.filterBy_m().sendKeys("Bootstrap");
		//Actions a=new Actions(driver);
		//a.moveToElement(t.filterBy_m()).click().sendKeys("failed").build().perform();
		System.out.println("After filter,searching for task");
		String task1=t.browserIssues_m().getText();
		try{
			Assert.assertTrue(task1.equalsIgnoreCase("Browser Issues"), "Browser Issues is expected.");
			System.out.println("Extracted task: "+task1+" is correct");
		}
		catch(Exception e){
			System.out.println("Extracted task: "+task1+" is wrong");
			//System.out.println(e);
			throw e;
		}
	}
	@Test
	public void table2search_tc6_3_m() throws IOException
	{
		homepage h =new homepage(driver);
		h.pagealert_m().click();
		tableDemo t=new tableDemo(driver);
		t.tableTab_m().click();
		t.tableDataSearch_m().click();
		System.out.println("Table 2 heading :"+t.table2heading_m().getText());
		List<WebElement> rows=(List<WebElement>) t.table2RowCount_m();
		System.out.println("Total rows in Table2 :"+rows.size());
		//search for specific data in column 2
		for(int i=1;i<=rows.size();i++)
		{
			String data=driver.findElement(By.xpath(t.table2datab4+i+t.table2dataaft)).getText();
			if(data.equalsIgnoreCase(prop.getProperty("Table2SearchData")))
					{
					System.out.println("Data present   :"+data+" at "+i+"th row");
					}
		}	
		//data search using unique relative xpath
		System.out.println("======================================================================================================");
		System.out.println("searching with unique relative xpath ");
		System.out.println("searching "+prop.getProperty("Table2SearchData")+" using unique rel.xpath : "+t.table2datauniquexpath_m().getText()+" is present in the table2");
		System.out.println("Data "+prop.getProperty("Table2SearchData")+" present in "+t.table2datauniquexpathRow_m().getText()+"th Row");
	}
	@Test
	public void table2search_tc6_4_m() throws InterruptedException
	{
		homepage h =new homepage(driver);
		h.pagealert_m().click();
		tableDemo t=new tableDemo(driver);
		t.tableTab_m().click();
		t.tableDataSearch_m().click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		System.out.println("Table 2 heading :"+t.table2heading_m().getText());
		Thread.sleep(100);
		t.table2filter_m().click();
		System.out.println("Clicked on filter");
		//System.out.println("Filter search is enabled :"+driver.findElement(By.xpath("//input[@placeholder='#']")).isEnabled());
		if(driver.findElement(By.xpath("//input[@placeholder='#']")).isEnabled())
		{
			//do nothing
		}else
		{
			t.table2filter_m().click();
		}
		Thread.sleep(100);
		t.filterLastName_m().click();
		System.out.println("Clicked on filter lastname");
		Thread.sleep(100);
		t.filterLastName_m().sendKeys("Ka");
		String searchdata1=t.dataDaniel_m().getText();
		try {
			Assert.assertEquals(searchdata1, "Daniel");	
			System.out.println("search data "+searchdata1+" is present after applying filter");
		}catch(Exception e) {
			System.out.println("search data "+searchdata1+" is not present after applying filter");
			System.out.println(e);
		}
		String searchdata2=t.dataLarrypt_m().getText();
		try {
			Assert.assertEquals(searchdata2, "larrypt");	
			System.out.println("search data "+searchdata2+" is present after applying filter");
		}catch(Exception e) {
			System.out.println("search data "+searchdata2+" is not present after applying filter");
			System.out.println(e);
		}
		
	}
	@AfterMethod
	public void termination() throws InterruptedException
	{
		//Thread.sleep(10000);
		driver.close();
	}

}
