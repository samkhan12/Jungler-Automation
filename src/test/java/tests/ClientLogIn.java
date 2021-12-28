package tests;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import pages.PageSignIn;
import pages.SignInHomePage;
import utils.ExtentReports.ExtentTestManager;


public class ClientLogIn extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
    @Test (priority = 2, description="Verify that client should able to login through phone number")
	public void TC_Positive_Verify_that_Client_ShouldAble_ToLogin_Through_PhoneNumber() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that client should able to login through phone number");
        
        //*************PAGE INSTANTIATIONS*************
        SignInHomePage homePage = new SignInHomePage(driver,wait);
 
        PageSignIn SignInPage = new PageSignIn(driver,wait);
        
        //*************PAGE METHODS********************
   
        homePage.goToJungler();
        SignInPage.clickonphone();
        SignInPage.enternum("4047985914");
        SignInPage.clicksignIn();
        Thread.sleep(1000);
        SignInPage.enterOTP("111111");
        
        //*************ASSERTIONS***********************
        
        Thread.sleep(1000);
        SignInPage.verifyDashboard();
        
	    
	}
    
    @Test (priority = 1, description="Verify that client should able to cancel login onclick cancel icon")
   	public void TC_Positive_Verify_that_Client_ShouldAble_cancel_LoginOnclick_CancelButton() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that client should able to cancel login onclick cancel icon");
           
           //*************PAGE INSTANTIATIONS*************
           SignInHomePage homePage = new SignInHomePage(driver,wait);
    
           PageSignIn SignInPage = new PageSignIn(driver,wait);
           
           //*************PAGE METHODS********************
           
           Thread.sleep(1000);
           SignInPage.clicklogout();
           homePage.goToJungler();
           SignInPage.clickOnCancel();
           
           //*************ASSERTIONS***********************
           
           Thread.sleep(5000);
           SignInPage.verifyCancel();
           
   	    
   	}
    
    @Test (priority = 3, description="Verify that client should able to change the country code")
   	public void TC_Positive_Verify_that_Client_ShouldAble_Changethe_CountryCode() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that client should able to change the country code");
           
           //*************PAGE INSTANTIATIONS*************
           SignInHomePage homePage = new SignInHomePage(driver,wait);
    
           PageSignIn SignInPage = new PageSignIn(driver,wait);
           
           //*************PAGE METHODS********************
           
           Thread.sleep(5000);
           SignInPage.changeflag();
           
           //*************ASSERTIONS***********************
           

           
   	    
   	}
    
    
    @Test (priority = 6, description="Verify that client should get error message in case of empty field")
   	public void TC_Positive_Verify_that_Client_ShouldGet_ErrorMessage_inCaseof_Emptyfield() throws InterruptedException {
   		
   		
   		BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that client should get error message in case of empty field");
           
           //*************PAGE INSTANTIATIONS*************
           SignInHomePage homePage = new SignInHomePage(driver,wait);
    
           PageSignIn SignInPage = new PageSignIn(driver,wait);
           
           //*************PAGE METHODS********************
           
           homePage.goToJungler();

           SignInPage.clickonphone();
           SignInPage.clicksignIn();

           
           //*************ASSERTIONS***********************
           
           SignInPage.verifyEmptyCase("Phone is required.");

           
   	    
   	}
    
    @Test (priority = 4, description="Verify that client should able to resend OTP through phone number")
   	public void TC_Positive_Verify_that_Client_ShouldAble_ToResend_OTPThrough_PhoneNumber() throws InterruptedException {
   		
   		
   		   BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that client should able to resend OTP through phone number");
           
           //*************PAGE INSTANTIATIONS*************
           SignInHomePage homePage = new SignInHomePage(driver,wait);
    
           PageSignIn SignInPage = new PageSignIn(driver,wait);
           
           //*************PAGE METHODS********************
      
           homePage.goToJungler();
           SignInPage.clickonphone();
           SignInPage.enternum("4047985914");
           SignInPage.clicksignIn();
           
           Thread.sleep(1000);
           SignInPage.clickonResend();
           
           //*************ASSERTIONS***********************
           
           Thread.sleep(1000);
           SignInPage.verifyResendOTP("OTP resend with text.");
           
   	    
   	}
       
    
    
    @Test (priority = 1, description="Verify that client should get the error message when using invalid number")
   	public void TC_Positive_Verify_that_Client_ShouldAble_Toget_ErrorMessage_onUsing_InvalidNumber() throws InterruptedException {
   		
   		
   		   BasicConfigurator.configure();
   	    

           //ExtentReports Description
           ExtentTestManager.getTest().setDescription("Verify that client should get the error message when using invalid number");
           
           //*************PAGE INSTANTIATIONS*************
           SignInHomePage homePage = new SignInHomePage(driver,wait);
    
           PageSignIn SignInPage = new PageSignIn(driver,wait);
           
           //*************PAGE METHODS********************
      
           homePage.goToJungler();
           SignInPage.clickonphone();
           SignInPage.enternum("4047985934");
           SignInPage.clicksignIn();
           
        
           
           //*************ASSERTIONS***********************
           
           Thread.sleep(1000);
           SignInPage.verifyEmptyCase("We don't recognize this phone number, please try again or sign up for an account.");
           
   	    
   	}
       
    
    
}