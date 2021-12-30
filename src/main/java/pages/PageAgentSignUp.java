package pages;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageAgentSignUp extends BasePage{

    //*********Constructor*********
	
    public PageAgentSignUp(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********  
    
    
    String cancelid = "close_user_modal1";
    String fname = "first_name";
    String lname = "last_name";
    String emailvalue = "email";
    String mobile = "phone_mobile";
    String firmname = "firm_name";
    String selectcity = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[4]/select";
    
    //Messages xpath
    
    String fnamerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]/div/span";
    String lnamerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/span";
    String emailerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div/span";
    String mobilerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/span";
    String firmnamerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[3]/span";
    String selectcityerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[4]/span";
    String secondform = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[1]/h5";
    
    //Button xpath  
        
    String btnxpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/button";
    
    
    //*********Page Methods*********  
    
    
    public void clickoncancel() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.id(cancelid));    
        
        }
    
    
    public void entervalues(String fn,String ln, String firm) throws InterruptedException {

    	Thread.sleep(1000);
        writeText(By.name(fname),fn);
        writeText(By.name(lname),ln);
        writeText(By.name(firmname),firm);
        
      
        
        }
    
    
    public void selectcity() throws InterruptedException {
    	
    	
        Thread.sleep(2000);
    	WebElement city_dropdown = driver.findElement(By.xpath(selectcity));
        Select city = new Select(city_dropdown);
        city.selectByIndex(1);
        
    }
    
    
    public void clickbtn() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.xpath(btnxpath));    
        
        }
    
    public void enteremail() throws InterruptedException {

    	  
            
        {
        	
        	WebElement email = driver.findElement(By.name(emailvalue));
        	email.click();  
        	Random randomGenerator = new Random();  
        	int randomInt = randomGenerator.nextInt(1000);  
        	email.sendKeys("username"+ randomInt +"@gmail.com");	
         }
           
        
        }
    
    
    public void enternumber() throws InterruptedException {

  	  

       
        	WebElement number = driver.findElement(By.name(mobile));
        	number.click(); 
        	String randomNumbers = RandomStringUtils.randomNumeric(5);
        	String phNo = 83456+randomNumbers;
        	number.sendKeys(phNo);
        			
       		/* 	
        	WebElement email = driver.findElement(By.name(mobile));
        	email.click();  
        	Random randomGenerator = new Random();  
        	int randomInt = randomGenerator.nextInt(1000);
        	email.sendKeys("98"+ randomInt + "986" + randomInt);	
         }
           */
        
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


 public void verifyErrors(String expectedText, String expectedText1, String expectedText2, String expectedText3, String expectedText4, String expectedText5 )
 
 
 {
	  Assert.assertEquals(readText(By.xpath(fnamerror)), expectedText);
	  Assert.assertEquals(readText(By.xpath(lnamerror)), expectedText1);
	  Assert.assertEquals(readText(By.xpath(emailerror)), expectedText2);
	  Assert.assertEquals(readText(By.xpath(mobilerror)), expectedText3);
	  Assert.assertEquals(readText(By.xpath(firmnamerror)), expectedText4);
	  Assert.assertEquals(readText(By.xpath(selectcityerror)), expectedText5);


}
 
 
 public void verifyForm2(String expectedText)
 
 
 {
	  Assert.assertEquals(readText(By.xpath(secondform)), expectedText);

 
 }
 
}