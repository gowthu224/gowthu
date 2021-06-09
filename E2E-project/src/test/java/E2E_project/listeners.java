package E2E_project;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReportClass;

public class listeners implements ITestListener{
	ExtentTest test;
	
	ExtentReports extent=ExtentReportClass.extendReport_m();
	@Override		
    public void onFinish(ITestContext result) {					
        // TODO Auto-generated method stub	
		System.out.println("On Finish");
        		extent.flush();
    }		

    @Override		
    public void onStart(ITestContext result) {					
        // TODO Auto-generated method stub		
    	 
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult result) {					
        // TODO Auto-generated method stub
    	System.out.println("On Test failure");
        		test.log(Status.FAIL, result.getThrowable());
    }		

    @Override		
    public void onTestSkipped(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestStart(ITestResult result) {					
        // TODO Auto-generated method stub	
    	System.out.println("On Test Start");
    	test=extent.createTest(result.getMethod().getMethodName());
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult result) {					
        // TODO Auto-generated method stub				
        System.out.println("On success");		
    	test.log(Status.PASS, "Testcase passed");
    }		
	

}
