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

import pages.AgentSignInHome;
import pages.AgentSignUpHome;
import pages.PageAgentSignIn;
import pages.PageAgentSignUp;

import utils.ExtentReports.ExtentTestManager;


public class AgentSignIn extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.

    @Test (priority = 0, description="Verify that agent should get validation error in case of invalid email")
	public void TC_Negative_Verify_that_Agent_ShouldGet_TheValidationError_InCaseOfInvalidEmail() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that agent should get validation error in case of invalid email");
        
        //*************PAGE INSTANTIATIONS*************
        AgentSignInHome homePage = new AgentSignInHome(driver,wait);
 
        PageAgentSignIn SignIn = new PageAgentSignIn(driver,wait);
        
        //*************PAGE METHODS********************
   
        homePage.goToJungler();
        SignIn.clickonlogin();
        SignIn.enteremail("jugler@@mailinator.com");
        SignIn.clickonButton();
        
        
        //*************ASSERTIONS***********************
        
        Thread.sleep(1000);
        SignIn.VerifyError("Invalid email");
        
        
	 
	}
    
    
    @Test (priority = 1, description="Verify that agent should get validation error in case of empty field")
   	public void TC_Negative_Verify_that_Agent_ShouldGet_TheValidationError_InCaseOfEmptyField() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that agent should get validation error in case of empty field");
           
           //*************PAGE INSTANTIATIONS*************
           AgentSignInHome homePage = new AgentSignInHome(driver,wait);
    
           PageAgentSignIn SignIn = new PageAgentSignIn(driver,wait);
           
           //*************PAGE METHODS********************
      
           homePage.goToJungler();
           SignIn.clickonlogin();
           SignIn.clearemail();
           SignIn.clickonButton();
           
           
           //*************ASSERTIONS***********************
           
           Thread.sleep(1000);
           SignIn.VerifyError("Email is required.");
           
           
   	 
   	}
    
    
    @Test (priority = 2, description="Verify that agent should get validation error in case of non existing email")
   	public void TC_Negative_Verify_that_Agent_ShouldGet_TheValidationError_InCaseOf_NonExistingEmail() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that agent should get validation error in case of non existing email");
           
           //*************PAGE INSTANTIATIONS*************
           AgentSignInHome homePage = new AgentSignInHome(driver,wait);
    
           PageAgentSignIn SignIn = new PageAgentSignIn(driver,wait);
           
           //*************PAGE METHODS********************
      
           SignIn.clearemail();
           SignIn.enteremail("jungler@mailinator.com");
           SignIn.clickonButton();
           
           
           //*************ASSERTIONS***********************
           
           Thread.sleep(2000);
           driver.switchTo().alert().accept();
           
           
   	 
   	}
    
    
    @Test (priority = 3, description="Verify that agent should be able to cancel/close login pop-up")
   	public void TC_Negative_Verify_that_Agent_ShouldBeAble_ToCancel_Close_login_Popup() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that agent should be able to cancel/close login pop-up");
           
           //*************PAGE INSTANTIATIONS*************
           AgentSignInHome homePage = new AgentSignInHome(driver,wait);
    
           PageAgentSignIn SignIn = new PageAgentSignIn(driver,wait);
           
           //*************PAGE METHODS********************
      
           SignIn.clearemail();
           SignIn.clicktoCancel();
           
           
           //*************ASSERTIONS***********************
           
           
           Thread.sleep(1000);
           SignIn.verifyCancel();
           
           
   	 
   	}

    
}