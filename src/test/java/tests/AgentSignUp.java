package tests;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
    
    @Test (priority = 5, description="Verify that agent should get validate first form in case of valid fields")
   	public void TC_Negative_Verify_that_Agent_Should_ValidateFirstForm_InCaseOfValidFields() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that agent should get validate first form in case of valid fields");
           
           //*************PAGE INSTANTIATIONS*************
           AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);
    
           PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
           
           //*************PAGE METHODS********************
      
           SignUp.clearform1();
           SignUp.entervalues("Test", "Agent", "sample.com");
           SignUp.enteremail();
           SignUp.enternumber();
           SignUp.selectcity();
           SignUp.clickbtn();
           
           //*************ASSERTIONS***********************
           
           Thread.sleep(15000);
           
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
       


    @Test (priority = 1, description="Verify that error get displayed when agent enter invalid number")
	public void TC_Negative_Verify_that_Agent_Should_GetError_OnEnter_InvalidNumber() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

       //ExtentReports Description
       ExtentTestManager.getTest().setDescription("Verify that error get displayed when agent enter invalid number");
       
       //*************PAGE INSTANTIATIONS*************
       AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

       PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
       
       //*************PAGE METHODS********************
  
       homePage.goToJungler();
       SignUp.clickoncancel();
       SignUp.enterinvalidnumber();
       SignUp.clickbtn();
    
       
       //*************ASSERTIONS***********************
       
       Thread.sleep(1000);
       
       SignUp.verifyInvalidNumber("Invalid Mobile Number.");
	}
    
    
    @Test (priority = 2, description="Verify that error get displayed when agent enter invalid email")
   	public void TC_Negative_Verify_that_Agent_Should_GetError_OnEnter_InvalidEmail() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that error get displayed when agent enter invalid email");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
     
          homePage.goToJungler();
          SignUp.clickoncancel();
          SignUp.clearform1();
          SignUp.enterinvalidemail();
          SignUp.clickbtn();
       
          
          //*************ASSERTIONS***********************
          
          Thread.sleep(1000);
          
          
          SignUp.verifyInvalidEmail("Your email address is Invalid.");
   	}

    
    @Test (priority = 3, description="Verify that error get displayed when agent enter already exist user email")
   	public void TC_Negative_Verify_that_Agent_Should_GetError_OnEnter_AlreadyExistUser() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that error get displayed when agent enter already exist user email");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
     
       // homePage.goToJungler();
       // SignUp.clickoncancel();
          SignUp.clearform1();
          SignUp.entervalues("Test", "Agent", "sample.com");
          SignUp.enteruseremail("test@mailinator.com");
          SignUp.enternumber();
          SignUp.selectcity();
          SignUp.clickbtn();
       
          
          //*************ASSERTIONS***********************
          
          Thread.sleep(5000);
          
          
          SignUp.verifyExistUser("You are already registered. Please email info@suburbanjunglegroup.com if you need assistance or have forgotten your login credentials.");
   	}


    
    @Test (priority = 4, description="Verify that agent not able to enter alphabetical value in mobile number field")
   	public void TC_Negative_Verify_that_Agent_ShouldNot_AbleToEnter_AlphabeticalValue_inMobileNumber_Field() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that agent not able to enter alphabetical value in mobile number field");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
     
      
          SignUp.clearform1();
          SignUp.verifyalphabetical();
       
    }
    
    
    @Test (priority = 7, description="Verify that agent should get validation error in case of empty fields-step 2")
   	public void TC_Negative_Verify_that_Agent_ShouldGet_TheValidationError_InCaseOfEmptyFields_Step2() throws InterruptedException, AWTException {
   		
   		
   		BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that agent should get validation error in case of empty fields-step 2");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
     
          Thread.sleep(3000);
          
          Robot robot = new Robot();
          robot.keyPress(KeyEvent.VK_PAGE_DOWN);
          robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
          
          SignUp.clickbtn2();
          
          Thread.sleep(3000);
          SignUp.verifyErrors2("Please enter city", "Please select value", "Please select towns", "Please enter value", "Please enter business profile link", "Please enter Zillow profile link", "Please enter bio", "Please select image");
       
    }
    
    
    
    @Test (priority = 8, description="Verify that agent should be able to upload image successfully")
   	public void TC_Negative_Verify_that_Agent_ShouldbeAble_ToUpload_ImageSuccessfully() throws InterruptedException, AWTException {
   		
   		
   		BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that agent should be able to upload image successfully");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
     
          Thread.sleep(5000);
          SignUp.uploadimage();
          
         
    }
    
    
    @Test (enabled = false , description="Verify that agent should be able to upload valid image successfully")
   	public void TC_Negative_Verify_that_Agent_ShouldbeAble_ToUpload_ValidImageSuccessfully() throws InterruptedException, AWTException {
   		
   		
   		BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that agent should be able to upload valid image successfully");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
     
          Thread.sleep(5000);
          SignUp.verifyimage();
          
         
    }
    
    
    @Test (priority = 9 , description="Verify that agent should be able to select year successfully")
   	public void TC_Negative_Verify_that_Agent_ShouldbeAble_ToSelect_YearSuccessfully() throws InterruptedException, AWTException {
   		
   		
   		BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that agent should be able to select year successfully");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
     
          Thread.sleep(5000);
          SignUp.selectyear();     
         
    }
    
    
    @Test (priority = 10 , description="Verify that agent should be able to select town successfully")
   	public void TC_Negative_Verify_that_Agent_ShouldbeAble_ToSelect_Town_Successfully() throws InterruptedException, AWTException {
   		
   		
   		BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that agent should be able to select town successfully");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
     
          Thread.sleep(1000);
          SignUp.selectown();
         
    }

    
    @Test (priority = 11 , description="Verify that agent should be able to submit step 2 successfully")
   	public void TC_Negative_Verify_that_Agent_ShouldbeAble_ToSubmit_Step2_Successfully() throws InterruptedException, AWTException {
   		
   		
   		  BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that agent should be able to submit step 2 successfully");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
          
          
          SignUp.entervalues2("San Francisco", "100", "sample.com", "zillow.com", "Test Agent Flow");
          
          
            Thread.sleep(2000);

            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
      	

         
    }


    @Test (priority = 12 , description="Verify that agent should be able to reach on step 3 successfully")
   	public void TC_Negative_Verify_that_Agent_ShouldbeAble_ToReachOn_Step3_Successfully() throws InterruptedException, AWTException {
   		
   		
   		  BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that agent should be able to reach on step 3 successfully");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
          
          
          Thread.sleep(2000);
          SignUp.verifyStep3();

         
    }
    
    
    @Test (priority = 13 , description="Verify that agent should get validation error in case of empty fields-step 3")
   	public void TC_Negative_Verify_that_Agent_ShouldGet_TheValidationError_InCaseOfEmptyFields_Step3() throws InterruptedException, AWTException {
   		
   		
   		  BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that agent should get validation error in case of empty fields-step 3");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
          
          
          Thread.sleep(1000);
          SignUp.clickbtn3();
                    
          SignUp.verifyErrors3("Enter first name", "Enter last name", "Enter email address");

         
    }
    
    
    @Test (priority = 14 , description="Verify that agent should signup successfully after step3")
   	public void TC_Negative_Verify_that_Agent_Should_SignUp_Successfully_AfterStep3() throws InterruptedException, AWTException {
   		
   		
   		  BasicConfigurator.configure();
   	    

          //ExtentReports Description
          ExtentTestManager.getTest().setDescription("Verify that agent should signup successfully after step3");
          
          //*************PAGE INSTANTIATIONS*************
          AgentSignUpHome homePage = new AgentSignUpHome(driver,wait);

          PageAgentSignUp SignUp = new PageAgentSignUp(driver,wait);
          
          //*************PAGE METHODS********************
          
          
          Thread.sleep(1000);
          
          SignUp.entervalues3("FirstName", "LastName");
          SignUp.entermail2();
          SignUp.clickbtn3();
          
          //*************ASSERTIONS***********************
          
          Thread.sleep(2000);
          SignUp.verifyForm3("Thank you!");
           
         
    }


    
    









}
    