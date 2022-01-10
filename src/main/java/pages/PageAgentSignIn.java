package pages;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageAgentSignIn extends BasePage{

    //*********Constructor*********
	
    public PageAgentSignIn(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********  
    
    String bio2 = "bio";
    String checkbox = "//*[contains(text(),'Aberdeen Township')]";
    String managerfn = "broker_first_name";
    String managerln = "broker_last_name";
    String brokermail = "broker_email";
    
    
    String ename = "email";
    String login = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/header/nav/div[2]/ul/li[1]/a";
    
    
    
     
    //Messages xpath
    

    String mfnerror = "//div[contains(text(),'Enter first name')]";
    String mlnerror = "//div[contains(text(),'Enter last name')]";
    String memerror = "//div[contains(text(),'Enter email address')]";
    String welcome3 = "thankyou-heading";
    String errorclass = "error_field";
    
    
    //Button xpath  
        
    String cancelid = "close_user_modal";
    String btnxpath = "//button[text()='Sign In']";

    
    //*********Page Methods*********
    
    
    public void clickonlogin() throws InterruptedException {

    Thread.sleep(2000);
    click(By.xpath(login));

    
    }
    
    
    public void clickonButton() throws InterruptedException {

        Thread.sleep(2000);
        click(By.xpath(btnxpath));

        
        }
    
  
    public void clicktoCancel() throws InterruptedException {

    Thread.sleep(2000);
    click(By.id(cancelid));

    
    }
    
    public void enteremail(String em) throws InterruptedException {

    	Thread.sleep(1000);
        writeText(By.name(ename),em);
            
    }
    
    
    public void clearemail() throws InterruptedException {

    	Thread.sleep(1000);
    	driver.findElement(By.name(ename)).clear();
            
    }
    
    
    public void verifyCancel() {
    	
    	String actualTitle = driver.getTitle();
    	String expectedTitle = "Suburban Jungle | Agent";
    	assertEquals(expectedTitle,actualTitle);
   }


    
	public void VerifyError(String expectedText) {
        Assert.assertEquals(readText(By.className(errorclass)), expectedText);
        
}
}