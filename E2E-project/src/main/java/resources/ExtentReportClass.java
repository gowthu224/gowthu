package resources;

import java.io.FileInputStream;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportClass {
	public static ExtentReports extent;
	
	public static ExtentReports extendReport_m()
	{
		System.out.println("User Dir "+System.getProperty("user.dir"));
		String path=System.getProperty("user.dir")+"\\Report\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Application Test");
		reporter.config().setDocumentTitle("Selenium Java Automation");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "gowthami");
		return extent;
		
	}

}
