package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class PageSignIn extends BasePage{

    //*********Constructor*********
    public PageSignIn(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
   
  
    String logoutweb = "//*[@id=\"navbarNav\"]/ul/li/span/a[2]";
    String option3 = "//*[@id=\"Questionnaire-Form\"]/div/label[4]/span";
    String showtowns = "//*[@id=\"nextc\"]/div/div[2]/button";
    String option2 = "//*[@id=\"Questionnaire-Form\"]/div/label[3]/span";
    String numbtn = "//*[@id=\"root\"]/div[2]/section/div[2]/div[2]/div/div/div/div/div/div/div/div/div/ul/li[2]/a";
    String numb = "//*[@id=\"phoneTab\"]/div/main/div/div/div/div/div/div/input";
    String savebtn = "//*[@id=\"root\"]/div[2]/section/div[2]/div[2]/div/div/div/div/div/div/div/div/div/button";
    String enterotp = "//*[@id=\"root\"]/div[2]/div/section/div/div[2]/div/div/div/div/div/div/div/div[1]/div[1]/input";
    String profile = "//*[@id=\"root\"]/div[1]/div/div/div/div/div/header/div[4]/a/div[2]/div[1]";
    String logout1 = "//*[text()='Logout']";
    String cancel = "//*[@id=\"root\"]/div[2]/section/div[2]/div[2]/div/div/div/div/button";
    String selectflag = "//*[@id=\"flag-dropdown\"]/div/div";
    String flag = "//*[@id=\"flag-dropdown\"]/ul/li[219]/span[1]";
    String emptyerror = "error_field";
    String resendotp = "//*[@id=\"root\"]/div[2]/div/section/div/div[2]/div/div/div/div/button";
    String optmsg = "//*[@id=\"root\"]/div[2]/div/section/div/div[2]/div/div/div/div/div/div/div/div[3]/span";
    String errormsg1 = "//*[@id=\"phoneTab\"]/div/main/div/div/div/span";
    

    //*********Page Methods*********
    
    public void clickonphone() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.xpath(numbtn));    
        
        }
    
    
    public void enternum(String number) throws InterruptedException {

    	Thread.sleep(1000);
        writeText(By.xpath(numb),number);
        
        }
    
    public void clicksignIn() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.xpath(savebtn));    
        
        }
    
    
    public void clickonResend() throws InterruptedException {

    	  Thread.sleep(80000);
    	  click(By.xpath(resendotp));    
        
        }
    
    public void clickOnCancel() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.xpath(cancel));    
        
        }
    
    public void changeflag() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.xpath(selectflag));    
    	Thread.sleep(1000);
        click(By.xpath(flag)); 
        
        }
    
    
    
    public void enterOTP(String otp) throws InterruptedException {

    	Thread.sleep(1000);
        writeText(By.xpath(enterotp),otp);
        
        }
    	
    public void clicklogout() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.xpath(profile));  
        Thread.sleep(1000);
        click(By.xpath(logout1));  

        
        }
     
    public void verifyLogout() {
    	
    	String actualTitle = driver.getTitle();
    	String expectedTitle = "Jungler: Staff Login";
    	assertEquals(expectedTitle,actualTitle);
   }
    
    
    public void verifyDashboard() {
    	
    	String actualTitle = driver.getTitle();
    	String expectedTitle = "Dashboard | Jungler";
    	assertEquals(expectedTitle,actualTitle);
   }
    
    
 public void verifyWelcome() {

	 
	    
 	String actualTitle = driver.getTitle();
 	String expectedTitle = "Suburban Jungle";
 	assertEquals(expectedTitle,actualTitle);   
 	
   }
 
 public void verifyCancel() {

	 
	    
	 	String actualTitle = driver.getTitle();
	 	String expectedTitle = "Find The Best Suburb | The Suburban Jungle Group";
	 	assertEquals(expectedTitle,actualTitle);   
	 	
	   }
 
 
 public void verifySignUpOption2() {

	 
	 	String actualTitle = driver.getTitle();
	 	String expectedTitle = "Match Characteristics | Suburban Jungle Group";
	 	assertEquals(expectedTitle,actualTitle);   
	 	
   }
 
 public void verifyEmptyCase(String expectedText)  {
		
	    Assert.assertEquals(readText(By.className(emptyerror)), expectedText);
	}
 
 public void verifyResendOTP(String expectedText)  {
		
	    Assert.assertEquals(readText(By.xpath(optmsg)), expectedText);
	}
 
 
 public void verifyInvalidNumber(String expectedText)  {
		
	    Assert.assertEquals(readText(By.xpath(errormsg1)), expectedText);
	}
 
 
}