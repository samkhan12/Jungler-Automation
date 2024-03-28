package tests;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.AgentSignUpHome;
import pages.PageAgentSignUp;
import pages.PageReport;
import pages.ReportHome;
import utils.ExtentReports.ExtentTestManager;


public class AgentReportFlowTest extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.

    @Test (priority = 0, description="Verify that agent should be able to logged in successfully in OrangeScrum")
	public void TC_Positive_Verify_that_Agent_Should_AbletoLogin_OrangeScrum_Successfully() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that agent should be able to logged in successfully in OrangeScrum");
        
        //*************PAGE INSTANTIATIONS*************
        ReportHome baseURL = new ReportHome(driver,wait);
 
        PageReport report = new PageReport(driver,wait);
        
        //*************PAGE METHODS********************
        baseURL.goToJungler();
        report.usernameemail("md.salman@jobma.com", "Uber@1235");
        report.clickSubmit();
        report.selectProject();
        report.savedfilter1();
        report.clickfilter();
        report.selectweektime();

        
        //*************ASSERTIONS***********************
        
        
    }
}
    