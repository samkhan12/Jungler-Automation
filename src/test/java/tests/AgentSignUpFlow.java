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

    @Test (enabled = false, description="Verify that agent should resume to step 2 when only step 1 form is submitted through login")
	public void TC_Positive_Verify_that_Agent_Should_AbleTo_ResumeToStep2_WhenOnlyStep1Form_Submitted() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that agent should resume to step 2 when only step 1 form is submitted through login");
        
        //*************PAGE INSTANTIATIONS*************
        AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);
 
        PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
        
        //*************PAGE METHODS********************
   
        homePage.goToJungler();
        SignUp.step2("Sample", "Account", "sample.com");

        
       
	 
	}
    
    
    @Test (enabled = false, description="Verify that agent should resume to step 3 when only step 2 form is submitted through login")
   	public void TC_Positive_Verify_that_Agent_Should_AbleTo_ResumeToStep3_WhenOnlyStep2Form_Submitted() throws InterruptedException, AWTException {
   		
   		
   		BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that agent should resume to step 3 when only step 2 form is submitted through login");
           
           //*************PAGE INSTANTIATIONS*************
           AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);
    
           PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
           
           //*************PAGE METHODS********************
      
           homePage.goToJungler();
           SignUp.step3("Sample", "Account", "sample.com");
           SignUp.verifyStep3();
           

}
    
    
    @Test (priority = 0, description="Verify that agent should resume to step 4 when only step 3 form is submitted through login")
   	public void TC_Positive_Verify_that_Agent_Should_AbleTo_ResumeToStep4_WhenOnlyStep3Form_Submitted() throws InterruptedException, AWTException {
   		
   		
   		BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that agent should resume to step 4 when only step 3 form is submitted through login");
           
           //*************PAGE INSTANTIATIONS*************
           AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);
    
           PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
           
           //*************PAGE METHODS********************
      
           homePage.goToJungler();
           SignUp.step4("Sample", "Account", "sample.com");
           SignUp.verifyStep3();
           

}
    
    
}