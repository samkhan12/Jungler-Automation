package tests;


import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import pages.AgentSignUpHome;
import pages.PageAgentSignUp;

import utils.ExtentReports.ExtentTestManager;


public class AgentSignUp extends BaseTest {
	
	

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
        SignUp.clickoncancel();

        SignUp.clickbtn();
        
        //*************ASSERTIONS***********************
        
        Thread.sleep(1000);
        SignUp.verifyErrors("Please enter your First Name.", "Please enter your Last Name.", "Please enter your Email.", "Please enter your Mobile Number.", "Please provide Firm details.", "Please select City.");
        
	 
	}
    
    @Test (priority = 1, description="Verify that agent should get validate first form in case of valid fields")
   	public void TC_Negative_Verify_that_Agent_Should_ValidateFirstForm_InCaseOfValidFields() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that agent should get validate first form in case of valid fields");
           
           //*************PAGE INSTANTIATIONS*************
           AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);
    
           PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
           
           //*************PAGE METHODS********************
      
           SignUp.entervalues("Test", "Agent", "sample.com");
           SignUp.enteremail();
           SignUp.enternumber();
           SignUp.selectcity();
           SignUp.clickbtn();
           
           //*************ASSERTIONS***********************
           
           Thread.sleep(10000);
           
           SignUp.verifyForm2("Tell us more about you");
   	 
   	}
    
 /*
    @Test (priority = 0, description="Verify that agent should get validate first form in case of valid fields")
   	public void TC_Negative_Verify_that_Agent_Should_ValidateFirstForm_CaseOfValidFields() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that agent should get validate first form in case of valid fields");
           
           //*************PAGE INSTANTIATIONS*************
           AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);
    
           PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
           
           //*************PAGE METHODS********************
           
           homePage.goToJungler();
           SignUp.clickoncancel();
           SignUp.enteremail();
           SignUp.enternumber();
           
           
           //*************ASSERTIONS***********************
           
      
   	 
   	}
      */
       
}
    