package E2E_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class simpleFormInput {

		public WebDriver driver;
		public simpleFormInput(WebDriver driver)
		{
			this.driver=driver;
		}
		By enterA=By.xpath("//input[@id='sum1']");
		By enterB=By.xpath("//input[@id='sum2']");
		By total=By.xpath("//button[@onclick='return total()']");
		By totalDisplay=By.xpath("//*[text()='100']");
		
		By checkboxDemo=By.xpath("//*[text()='Checkbox Demo']");
		By checkbox=By.xpath("//input[@id='isAgeSelected']");
		
		By radioButton=By.xpath("//a[text()='Radio Buttons Demo']");
		By buttonFemale=By.xpath("//*[text()='Click on button to get the selected values from Group Sex and Age group']//following::input[@value='Female']");
		By ageGroup=By.xpath("//input[@value='15 - 50']");
		By getValues=By.xpath("//button[@onclick='getValues();']");
		By getValuesText=By.cssSelector(".groupradiobutton");
		
		public WebElement enterA_m()
		{
			return driver.findElement(enterA);
		}
		public WebElement enterB_m()
		{
			return driver.findElement(enterB);
		}
		public WebElement getTotal()
		{
			return driver.findElement(total);
		}
		public WebElement totalDisplay_m()
		{
			return driver.findElement(totalDisplay);
		}
		//chechbox
		public WebElement checkboxDemo_m()
		{
			return driver.findElement(checkboxDemo);
		}
		public WebElement checkbox_m()
		{
			return driver.findElement(checkbox);
		}
		//radio button
		public WebElement radioButton_m()
		{
			return driver.findElement(radioButton);
		}
		public WebElement buttonFemale_m()
		{
			return driver.findElement(buttonFemale);
		}
		public WebElement ageGroup_m()
		{
			return driver.findElement(ageGroup);
		}
		public WebElement getValues_m()
		{
			return driver.findElement(getValues);
		}
		public WebElement getValuesText_m()
		{
			return driver.findElement(getValuesText);
		}
	}



