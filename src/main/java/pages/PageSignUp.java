package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class PageSignUp extends BasePage{

    //*********Constructor*********
    public PageSignUp(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
   
    String ValidationSavebtn = "//*[@id=\"aboutForm\"]/div[2]/div[2]/small[1]/span/span";
    String ValidationSavebtnError = "/html/body/div[2]/div/div[3]/form/div[1]/span";
    String ErrorOnFieldEmpty = "//*[@id=\"aboutForm\"]/div[2]/div[2]/small[1]/span/span";
    String MainLogout = "drop1";
    String ErroronNumeric = "/html/body/div[2]/div/div[3]/form/div[2]/div[2]/small[1]/span/span";
    String fbtnxpath = "//*[@id=\"___gatsby\"]/div/div[2]/div/section[1]/div[1]/div[1]/div/div/a";
    String cityxpath = "//*[@id=\"___gatsby\"]/div/div[2]/div/section/div/div/div/div[1]/h1";
    String fname = "firstName";
    String lname = "lastName";
    String number = "phoneNumber";
    String ename = "email";
    String budget = "//*[@id=\"Questionnaire-Form\"]/div/div[2]/div[5]/select";
    String introxpath = "//*[@id=\"Questionnaire-Form\"]/div/div[3]/textarea";	
    String refername = "source";
    String stime = "//*[@id=\"Questionnaire-Form\"]/div/div[5]/div/div[2]/div/select";
    String option1 = "//*[@id=\"Questionnaire-Form\"]/div/label[2]/span";
    String option1click = "//*[@id=\"Questionnaire-Form\"]/div/button";
    String wrap = "//*[@id=\"Questionnaire-Form\"]/div/div[5]/div/div[2]/div";
    String thanku = "thankyou__section--title";
    String fnamerror = "//*[@id=\"Questionnaire-Form\"]/div/div[2]/div[1]/span";
    String lnamerror = "//*[@id=\"Questionnaire-Form\"]/div/div[2]/div[2]/span";
    String numerror = "//*[@id=\"Questionnaire-Form\"]/div/div[2]/div[3]/span";
    String emailerror = "//*[@id=\"Questionnaire-Form\"]/div/div[2]/div[4]/span";
    String referror = "//*[@id=\"Questionnaire-Form\"]/div/div[4]/span";
    String timerror = "//*[@id=\"Questionnaire-Form\"]/div/div[5]/div/div[2]/div/span";
    String title2 = "form__section--title-small";
    String existuser = "//*[@id=\"exampleModalLabel\"]";
    String datexpath = "//*[@id=\"Questionnaire-Form\"]/div/div[5]/div/div[1]/div/div/div/input";
    String datevale = "//*[@id=\"Questionnaire-Form\"]/div/div[5]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[5]";
    String thankdefault = "thankyou__section--icon";
    String gotojungler = "//*[@id=\"navbarNav\"]/ul/li/span/a[1]";
    String welcomexpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div/div/div/h1";
    String profileclass = "//*[@id=\"navbar-example2\"]/div[2]/div[2]/div"; 
    String logout = "//*[@id=\"navbar-example2\"]/div[2]/div[2]/div/ul/li[3]/a";
    String logoutweb = "//*[@id=\"navbarNav\"]/ul/li/span/a[2]";
    String option3 = "//*[@id=\"Questionnaire-Form\"]/div/label[4]/span";
    String showtowns = "//*[@id=\"nextc\"]/div/div[2]/button";
    String option2 = "//*[@id=\"Questionnaire-Form\"]/div/label[3]/span";
    
    //*********Page Methods*********
    
    public void signUpForm (String firstName, String lastname, String phonenumber, String email)
    {
        writeText(By.name(fname),firstName);
        writeText(By.name(lname), lastname);
        writeText(By.name(number), phonenumber);
        writeText(By.name(ename), email);


    }
    
    public void clearform () throws InterruptedException
    {
    	
      driver.findElement(By.name(fname)).clear();
      Thread.sleep(1000);
      driver.findElement(By.name(lname)).clear();
      Thread.sleep(1000);
      driver.findElement(By.name(number)).clear();
      driver.findElement(By.name(ename)).clear();
 




    }
    
    public void EnterNumber(String phonenumber1) throws InterruptedException
    
    {
     
        writeText(By.name(number), phonenumber1);
     

    }
    
    public void selectrange() throws InterruptedException {
    	
    
      
    	WebElement budget_dropdown = driver.findElement(By.xpath(budget));
        Select budget = new Select(budget_dropdown);
        budget.selectByIndex(1);
        
    

    }
    
    public void signUpForm2 (String intro, String refer) {
    	
        writeText(By.xpath(introxpath),intro);
        writeText(By.name(refername), refer);
        
    
    } 
    
   public void clearForm2 () throws InterruptedException {
	 
     Thread.sleep(1000);
     driver.findElement(By.xpath(introxpath)).clear();
     driver.findElement(By.name(refername)).clear();	
       
        
    
    } 

    public void choosedate() throws InterruptedException {

	Thread.sleep(1000);
    click(By.xpath(datexpath)); 
	Thread.sleep(2000);
	click(By.xpath(datevale));     

    
    }
    
    
    public void selecttime() throws InterruptedException {
    	
        click(By.xpath(wrap));     

        Thread.sleep(1000);        
        WebElement time_dropdown = driver.findElement(By.xpath(stime));
        Select time = new Select(time_dropdown);
        time.selectByIndex(1);        
        
    

    }
    
    public void selectoption1  () throws InterruptedException {
    
    	Thread.sleep(1000);
        click(By.xpath(option1));     
        
    }
    
    
    public void selectoption2  () throws InterruptedException {
        
    	Thread.sleep(1000);
        click(By.xpath(option2));     
        
    }
    
    public void selectoption3  () throws InterruptedException {
        
    	Thread.sleep(1000);
        click(By.xpath(option3));     
        
    }
    public void gotoJungler  () throws InterruptedException {
        
    	Thread.sleep(1000);
        click(By.xpath(gotojungler));     
        
    }
    
    public void logout() throws InterruptedException {
        
    	Thread.sleep(1000);
        click(By.xpath(profileclass)); 
        Thread.sleep(1000);
        click(By.xpath(logout));
        
    }
    
   public void logoutWeb() throws InterruptedException {
        
    	Thread.sleep(1000);
        click(By.xpath(logoutweb)); 
        
        
    }
    
    public void submitone  () throws InterruptedException {
    	
        
        click(By.xpath(option1click));     
        
    }
    
    
    public void clickshowtowns  () throws InterruptedException {
    	
        Thread.sleep(2000);
        click(By.xpath(showtowns));     
        
    }
    
    
    public void clickOnButton () throws InterruptedException {
        
        click(By.xpath(fbtnxpath));
    }
    
 
 
    public void MainLogt () throws InterruptedException {
     Thread.sleep(5000);
     click(By.id(MainLogout));
    }

 
 
 //Verify Client SignUp for Option1
 
    public void verifySignUpDefault() {
    	//assertTrue(driver.getTitle().contains("Suburban Jungle | Thank You"));
    	
    	String actualTitle = driver.getTitle();
    	String expectedTitle = "Suburban Jungle | Thank You";
    	assertEquals(expectedTitle,actualTitle);
   }
    
    
    public void verifyLogout() {
    	//assertTrue(driver.getTitle().contains("Suburban Jungle | Thank You"));
    	
    	String actualTitle = driver.getTitle();
    	String expectedTitle = "Jungler: Staff Login";
    	assertEquals(expectedTitle,actualTitle);
   }
    
    
 public void verifyWelcome() {

	 
	    
 	String actualTitle = driver.getTitle();
 	String expectedTitle = "Suburban Jungle";
 	assertEquals(expectedTitle,actualTitle);   
 	
   }
 
 
 public void verifySignUpOption2() {

	 
	 	String actualTitle = driver.getTitle();
	 	String expectedTitle = "Match Characteristics | Suburban Jungle Group";
	 	assertEquals(expectedTitle,actualTitle);   
	 	
   }
 
 
 
 public void verifySignUpOptions(String expectedText) {
	  Assert.assertEquals(readText(By.className(thanku)), expectedText);
 }
 
 //Verify Client SignUp for Next Page

 public void verifyNextPage(String expectedText) {
	  Assert.assertEquals(readText(By.className(title2)), expectedText);
}
 //Verify Client SignUp Error Validation
 
 public void verifyErrorValidation(String expectedText, String expectedText1, String expectedText2, String expectedText3, String expectedText4, String expectedText5 )
 
 
 {
	  Assert.assertEquals(readText(By.xpath(fnamerror)), expectedText);
	  Assert.assertEquals(readText(By.xpath(lnamerror)), expectedText1);
	  Assert.assertEquals(readText(By.xpath(numerror)), expectedText2);
	  Assert.assertEquals(readText(By.xpath(emailerror)), expectedText3);
	  Assert.assertEquals(readText(By.xpath(referror)), expectedText4);
	  Assert.assertEquals(readText(By.xpath(timerror)), expectedText5);

}
 
 
//Verify Client Phone for Alphabetical Value
 

public void verifyNumber(String expectedText)  {
	
    Assert.assertEquals(readText(By.xpath(number)), expectedText);
}
//Verify Client SignUp for Existing User

public void verifyExistingUser(String expectedText) {
    Assert.assertEquals(readText(By.xpath(existuser)), expectedText);
}
 
 public void verifySelectCity (String expectedText) {
     Assert.assertEquals(readText(By.xpath(cityxpath)), expectedText);
 }

    //Verify Password Condition
   
public void verifySavebtnValidation (String expectedText) {
        Assert.assertEquals(readText(By.xpath(ValidationSavebtn)), expectedText);
}  

public void VerifyValidationSavebtnError (String expectedText) {
        Assert.assertEquals(readText(By.xpath(ValidationSavebtnError)), expectedText);
        
}
public void VerifyErrorOnFieldEmpty (String expectedText) {
    Assert.assertEquals(readText(By.xpath(ErrorOnFieldEmpty)), expectedText);
    
    
 
}
public void VerifyErroronNumeric (String expectedText) {
    Assert.assertEquals(readText(By.xpath(ErroronNumeric)), expectedText);  
}
}    
        

