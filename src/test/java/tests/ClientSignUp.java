package tests;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.PageSignUp;
import utils.ExtentReports.ExtentTestManager;


public class ClientSignUp extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
    @Test (priority = 9, description="Verify that client should able to signup through option 1")
	public void TC_Positive_Verify_that_Client_ShouldAble_ToSignUp_Through_Option1() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that client should able to signup through option 1");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        PageSignUp SignUpPage = new PageSignUp(driver,wait);
        
        //*************PAGE METHODS********************
   
    //  homePage.goToJungler();
        SignUpPage.clearform();

        SignUpPage.signUpForm("Mohd", "Salman", "83388755222222", "clien73t51@mailinator.com");  
        SignUpPage.selectrange();
        SignUpPage.signUpForm2("Test Client Sign Up", "Test Flow");
        SignUpPage.selectoption1();
        SignUpPage.submitone();

        
        
        //*************ASSERTIONS***********************
        
        Thread.sleep(5000);
        SignUpPage.verifySignUpOptions("Thank You, one of our strategists will be in touch with you to find a time that works for you.");
	    
	}
	
    
	@Test (priority = 0, description="Verify that client should get the error in case of empty fields")
	public void TC_Negative_Verify_that_Client_ShouldGet_theError_Onclick_SubmitButton_forEmptyFieldCase() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that client should get the error in case of empty fields");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        PageSignUp SignUpPage = new PageSignUp(driver,wait);
        
        //*************PAGE METHODS********************
   
        homePage.goToJungler();
        
        Thread.sleep(2000);
        SignUpPage.submitone();
        
        
        //*************ASSERTIONS***********************
        
        Thread.sleep(1000);
        
        SignUpPage.verifyErrorValidation("please enter your first name", "please enter your last name", "please enter your number", "please enter your email", "please let us know how you heard of us", "please select time");
	    
	}



   @Test (priority = 1, description="Verify that error displayed when user enter alphabetical value in phone number field")
   public void TC_Negative_Verify_that_ErrorDisplayed_WhenUser_Enter_AlphabeticalValue_InPhoneNumberField() throws InterruptedException {
	
	
	BasicConfigurator.configure();
    

    //ExtentReports Description
    ExtentTestManager.getTest().setDescription("Verify that error displayed when user enter alphabetical value in phone number field");
    
    //*************PAGE INSTANTIATIONS*************
    
    HomePage homePage = new HomePage(driver,wait);

    PageSignUp SignUpPage = new PageSignUp(driver,wait);
    
    //*************PAGE METHODS********************

    
    SignUpPage.signUpForm("", "", "TestFlow", "");  
    SignUpPage.selectrange();
    SignUpPage.signUpForm2("Test Client Sign Up", "Test Flow");
    SignUpPage.selectoption1();
    SignUpPage.submitone();       
    
    //*************ASSERTIONS***********************
    
    Thread.sleep(1000);
    
    SignUpPage.verifyNextPage("Strategize With Us... Schedule your call");
           
    
}

  @Test (priority = 2, description="Verify that error displayed when user enter invalid value in email field")
  public void TC_Negative_Verify_that_ErrorDisplayed_WhenUser_Enter_InvalidValue_InEmailField() throws InterruptedException {
	
	
	BasicConfigurator.configure();
    

    //ExtentReports Description
    ExtentTestManager.getTest().setDescription("Verify that error displayed when user enter invalid value in email field");
    
    //*************PAGE INSTANTIATIONS*************
    
    HomePage homePage = new HomePage(driver,wait);

    PageSignUp SignUpPage = new PageSignUp(driver,wait);
    
    //*************PAGE METHODS********************

    SignUpPage.clearform();
    SignUpPage.signUpForm("", "", "", "m.salman+clientaccount007atlogys.com");  
    SignUpPage.selectrange();
    SignUpPage.clearForm2();
    SignUpPage.signUpForm2("Test Client Sign Up", "Test Flow");
    SignUpPage.selectoption1();
    SignUpPage.submitone();       
    
    //*************ASSERTIONS***********************
    
    Thread.sleep(1000);
    
    SignUpPage.verifyNextPage("Strategize With Us... Schedule your call");
    
    
}

  @Test (priority = 8, description="Verify that error displayed when user enter already existing user in email field")
  public void TC_Negative_Verify_that_ErrorDisplayed_WhenUser_Enter_AlreadyExistingUser_InEmailField() throws InterruptedException {
	
	
	BasicConfigurator.configure();
    

    //ExtentReports Description
    ExtentTestManager.getTest().setDescription("Verify that error displayed when user enter already existing user in email field");
    
    //*************PAGE INSTANTIATIONS*************
    
    HomePage homePage = new HomePage(driver,wait);

    PageSignUp SignUpPage = new PageSignUp(driver,wait);
    
    //*************PAGE METHODS********************

    homePage.goToJungler();

    SignUpPage.clearform();
    SignUpPage.signUpForm("Mohd", "Salman", "896768768768768", "m.salman@atlogys.com");  
    SignUpPage.selectrange();
    SignUpPage.clearForm2();
    SignUpPage.signUpForm2("Test Client Sign Up", "Test Flow");
    SignUpPage.selectoption1();
    SignUpPage.submitone();  
    driver.switchTo().activeElement();

    
    //*************ASSERTIONS***********************
    

    Thread.sleep(2000);
    SignUpPage.verifyExistingUser("You are already registered.");
    
    Thread.sleep(2000);
    
    String cancel = "//*[@id=\"close_user_modal\"]/img";
    driver.findElement(By.xpath(cancel)).click();
  }
    
  @Test (priority = 4, description="Verify that client should able to schedule appointment by default option through date and time")
  public void TC_Positive_Verify_that_clientShould_ableToSchedule_Appointment_byDateAndTime() throws InterruptedException {
	
	
	BasicConfigurator.configure();
    

    //ExtentReports Description
    ExtentTestManager.getTest().setDescription("Verify that client should able to schedule appointment by default option through date and time");
    
    //*************PAGE INSTANTIATIONS*************
    
    HomePage homePage = new HomePage(driver,wait);

    PageSignUp SignUpPage = new PageSignUp(driver,wait);
    
    //*************PAGE METHODS********************

   

    SignUpPage.clearform();
    SignUpPage.signUpForm("Mohd", "Salman", "8591152235699", "te33514323836@mailinator.com");  
    SignUpPage.selectrange();
    SignUpPage.clearForm2();
    SignUpPage.signUpForm2("Test Client Sign Up", "Test Flow");
    Thread.sleep(1000);
    SignUpPage.choosedate();
    SignUpPage.selecttime();
    SignUpPage.submitone();       
    
    //*************ASSERTIONS***********************
    
    
    Thread.sleep(5000);
    SignUpPage.verifySignUpDefault();
}

  
  
 @Test (priority = 5, description="Verify that client redirects to the jungler client dashboard onclick 'Go to jungler' ")
 public void TC_Positive_Verify_that_clientredirects_ToJunglerClientDashboard_Onclick_GoToJungler() throws InterruptedException {
	
	
	BasicConfigurator.configure();
   

   //ExtentReports Description
   ExtentTestManager.getTest().setDescription("Verify that client redirects to the jungler client dashboard onclick 'Go to jungler' ");
   
   //*************PAGE INSTANTIATIONS*************
   
   HomePage homePage = new HomePage(driver,wait);

   PageSignUp SignUpPage = new PageSignUp(driver,wait);
   
   //*************PAGE METHODS********************

   SignUpPage.gotoJungler();
   
   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
   driver.switchTo().window(tabs2.get(1));
   //*************ASSERTIONS***********************
   
   Thread.sleep(10000);
   SignUpPage.verifyWelcome();
  
}
 
 
 @Test (priority = 6, description="Verify that client redirects to the jungler website onclick 'Logout'")
 public void TC_Positive_Verify_that_clientredirects_ToJunglerWebsite_Onclick_LogoutLink() throws InterruptedException {
	
	  
	 
	BasicConfigurator.configure();
   

   //ExtentReports Description
   ExtentTestManager.getTest().setDescription("Verify that client redirects to the jungler website onclick 'Logout'");
   
   //*************PAGE INSTANTIATIONS*************
   
   HomePage homePage = new HomePage(driver,wait);

   PageSignUp SignUpPage = new PageSignUp(driver,wait);
   
   //*************PAGE METHODS********************
   
   Thread.sleep(1000);
   SignUpPage.logout();
   

   //*************ASSERTIONS***********************
   
   Thread.sleep(1000);
   SignUpPage.verifyLogout();
  
}


 
    @Test (priority = 7, description="Verify that client should able to signup through option 3")
	public void TC_Positive_Verify_that_Client_ShouldAble_ToSignUp_Through_Option3() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that client should able to signup through option 3");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        PageSignUp SignUpPage = new PageSignUp(driver,wait);
        
        //*************PAGE METHODS********************
        //SignUpPage.logoutWeb();
        homePage.goToJungler();
        SignUpPage.signUpForm("Mohd", "Salman", "886533411100634", "m.sa31153n58+33238@mailinator.com");  
        SignUpPage.selectrange();
        SignUpPage.signUpForm2("Test Client Sign Up", "Test Flow");
        SignUpPage.selectoption3();
        
        driver.switchTo().activeElement();
        
  
        Thread.sleep(2000);
        
        String cancel = "//*[@id=\"close_user_modal\"]/img";
        driver.findElement(By.xpath(cancel)).click();
        SignUpPage.submitone();


        
        
        //*************ASSERTIONS***********************
        
        Thread.sleep(5000);
        SignUpPage.verifySignUpDefault();
        
        SignUpPage.gotoJungler();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        Thread.sleep(5000);
        SignUpPage.logout();
	}
 
 
    @Test (enabled = false, description="Verify that client should able to signup through option 2")
	public void TC_Positive_Verify_that_Client_ShouldAble_ToSignUp_Through_Option2() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that client should able to signup through option 2");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        PageSignUp SignUpPage = new PageSignUp(driver,wait);
        
        //*************PAGE METHODS********************
        
        //SignUpPage.logoutWeb();
       
        SignUpPage.gotoJungler();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        SignUpPage.logout();
        homePage.goToJungler();
        SignUpPage.signUpForm("Mohd", "Salman", "88556558545626", "m.sal2n+8768582948@mailinator.com");  
        SignUpPage.selectrange();
        SignUpPage.signUpForm2("Test Client Sign Up", "Test Flow");
        SignUpPage.selectoption2();
        
        Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        
        WebElement element = driver.findElement(By.xpath("//*[@id=\"nextb\"]/div[2]/div[2]/a/button"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nextb\"]/div[2]/div[2]/a/button")));
        element.click();
      //  Thread.sleep(5000);
      //  driver.findElement(By.xpath("//*[@id=\"nextb\"]/div[2]/div[2]/a/button")).click();


        
        //*************ASSERTIONS***********************
        
      //  SignUpPage.verifySignUpOption2();	    
	}

}

 
	    
	
	
	