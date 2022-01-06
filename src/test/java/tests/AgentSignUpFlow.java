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

import utils.ExtentReports.ExtentTestManager;


public class AgentSignUpFlow extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.

    @Test (priority = 0, description="Verify that agent should get validation error in case of empty fields")
	public void TC_Negative_Verify_that_Agent_ShouldGet_TheValidationError_InCaseOfEmptyFields() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that agent should get validation error in case of empty fields");
        
        //*************PAGE INSTANTIATIONS*************
        AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);
 
        PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
        
        //*************PAGE METHODS********************
   
        homePage.goToJungler();
        SignUp.step2("Sample", "Account", "sample.com");

       
	 
	}
    
}