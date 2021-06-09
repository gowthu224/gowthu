package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver browserinitiation() throws IOException
	{	
	prop = new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Rajasekar.Murugesan\\eclipse-workspace\\E2E-project\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String BrowserName=prop.getProperty("browser");
	if(BrowserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajasekar.Murugesan\\Documents\\selenium gow\\tutor\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}else if(BrowserName.equals("firefox"))
	{
		//driver=new GeckoDriver();
	}else
	{
		// IE
	}
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String url = prop.getProperty("url");
	System.out.println(url);
	driver.get(url);
	driver.manage().window().maximize();
	return driver;
	}
	

}