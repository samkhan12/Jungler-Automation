package pages;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

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
    String city2 = "city_live";
    String year = "year_in_real_estate";
    String town2 = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[3]/div/div/button";
    String buysales = "buy_side_sales";
    String business = "business_profile";
    String zilli = "zillow_profile";
    String bio2 = "bio";
    String checkbox = "//*[contains(text(),'Aberdeen Township')]";
    String managerfn = "broker_first_name";
    String managerln = "broker_last_name";
    String brokermail = "broker_email";
    
    
     
    //Messages xpath
    
    String fnamerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[1]/div[1]/div/span";
    String lnamerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/span";
    String emailerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div/span";
    String mobilerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/span";
    String firmnamerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[3]/span";
    String selectcityerror = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div[4]/span";
    String secondform = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[1]/h5";
    String existuser = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/span";
    String cityerror = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[1]/div";
    String term = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[2]/div";
    String town = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[3]/div/div[2]";
    String value = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[4]/div[1]";
    String profile = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[5]/div";
    String zilprofiel = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[6]/div";
    String profile2 = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[7]/div";
    String image = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[9]";
    String mfnerror = "//div[contains(text(),'Enter first name')]";
    String mlnerror = "//div[contains(text(),'Enter last name')]";
    String memerror = "//div[contains(text(),'Enter email address')]";
    String welcome3 = "thankyou-heading";
    
    
    //Button xpath  
        
    String btnxpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/button";
    String btnxpath2 = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/button";
    String upload = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[8]/div/section/div/button";
    String btnxpath3 = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/div/form/div/div[2]/button";
    
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
    
    
    
    public void entervalues2(String cit,String sales, String prof, String zil, String biod) throws InterruptedException {

    	Thread.sleep(1000);
        writeText(By.name(city2),cit);
        writeText(By.name(buysales),sales);
        writeText(By.name(business),prof);
        writeText(By.name(zilli),zil);
        writeText(By.name(bio2),biod);

    
        }
    
    
    public void entervalues3(String text1,String text2) throws InterruptedException {

    	Thread.sleep(1000);
        writeText(By.name(managerfn),text1);
        writeText(By.name(managerln),text2);
    
    
        }
    
    
    public void selectyear() throws InterruptedException {
    	
        
        
    	WebElement year_dropdown = driver.findElement(By.name(year));
        Select budget = new Select(year_dropdown);
        budget.selectByIndex(1);
        
   
    }
    
    
    public void selectown() throws InterruptedException {
    	
        Thread.sleep(2000);
    	driver.findElement(By.xpath(town2)).click();
    	
    	
    	Thread.sleep(2000);
    	WebElement check = driver.findElement(By.xpath(checkbox));
        JavascriptExecutor executor = (JavascriptExecutor) driver; executor.executeScript("arguments[0].click();", check); 

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]")).click();    	
   
    }
    
    public void clearform1() throws InterruptedException {

    	Thread.sleep(1000);
    	
    	driver.findElement(By.name(fname)).clear();
    	driver.findElement(By.name(lname)).clear();
    	driver.findElement(By.name(firmname)).clear();
    	driver.findElement(By.name(emailvalue)).clear();
    	driver.findElement(By.name(mobile)).clear();
	
    		
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
     
     
     public void clickbtn3() throws InterruptedException {

     	//Thread.sleep(1000);
        //click(By.xpath(btnxpath3));   
    	 
    	Thread.sleep(5000);
      	WebElement check = driver.findElement(By.xpath(btnxpath3));
        JavascriptExecutor executor = (JavascriptExecutor) driver; executor.executeScript("arguments[0].click();", check); 
         
         
         }
     
          
     public void uploadimage() throws InterruptedException, AWTException {
    	 
    	 
    	    JavascriptExecutor js = (JavascriptExecutor)driver; // Scroll operation using Js Executor
    	    js.executeScript("window.scrollBy(0,250)"); // Scroll Down(+ve) upto browse option
    	    Thread.sleep(2000); // suspending execution for specified time period
    	 
    	     WebElement browse = driver.findElement(By.xpath(upload));
    	     // using linkText, to click on browse element 
    	     browse.click(); // Click on browse option on the webpage
    	     Thread.sleep(2000); // suspending execution for specified time period
    	 
    	    // creating object of Robot class
    	     Robot rb = new Robot();
    	 
    	    // copying File path to Clipboard
    	     StringSelection str = new StringSelection("C:\\Users\\khans\\sample.jpg");
    	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
    	 
    	     // press Contol+V for pasting
    	     rb.keyPress(KeyEvent.VK_CONTROL);
    	     rb.keyPress(KeyEvent.VK_V);
    	 
    	    // release Contol+V for pasting
    	     rb.keyRelease(KeyEvent.VK_CONTROL);
    	     rb.keyRelease(KeyEvent.VK_V);
    	 
    	    // for pressing and releasing Enter
    	     rb.keyPress(KeyEvent.VK_ENTER);
    	     rb.keyRelease(KeyEvent.VK_ENTER);
    	     
    	     
    	   }
    	  
     
     public void verifyimage() throws InterruptedException {

      
         Thread.sleep(2000);
         WebElement i = driver.findElement(By.className("form-group dropzone-image"));

         Boolean p = (Boolean) ((JavascriptExecutor)driver)
         .executeScript("return arguments[0].complete "
         + "&& typeof arguments[0].naturalWidth != \"undefined\" "
         + "&& arguments[0].naturalWidth > 0", i);
    
         }
      
         
         
     
     public void clickbtn2() throws InterruptedException {
       

    	 WebElement number = driver.findElement(By.xpath(btnxpath2));
         JavascriptExecutor executor = (JavascriptExecutor) driver; executor.executeScript("arguments[0].click();", number); 
        
    
        

  
         
         }
     public void enteremail() throws InterruptedException {    
   
    	
        	WebElement email = driver.findElement(By.name(emailvalue));
        	email.click();  
        	Random randomGenerator = new Random();  
        	int randomInt = randomGenerator.nextInt(1000);
        	
        	Random randomGenerator1 = new Random();  
        	int randomInt1 = randomGenerator1.nextInt(1000);  
        	email.sendKeys("username"+ randomInt1 + randomInt + "@gmail.com");	
        	
        
        }
    
     
     public void enterinvalidemail() throws InterruptedException {    
    	   
    	
    	WebElement email = driver.findElement(By.name(emailvalue));
    	email.click();  
    	Random randomGenerator = new Random();  
    	int randomInt = randomGenerator.nextInt(1000);  
    	email.sendKeys("username"+ randomInt +"@@gmail.com");	
    	
    
       }
     
     
     public void entermail2() throws InterruptedException {    
    	   
     	
     	WebElement email = driver.findElement(By.name(brokermail));
     	email.click();  
     	Random randomGenerator = new Random();  
     	int randomInt = randomGenerator.nextInt(1000);  
     	

    	Random randomGenerator1 = new Random();  
    	int randomInt1 = randomGenerator1.nextInt(1000);  
    	email.sendKeys("username"+ randomInt1 + randomInt + "@gmail.com");	
    	
     	
     
     }
     
         
     public void enteruseremail(String existuser1) throws InterruptedException {

    	Thread.sleep(1000);
        writeText(By.name(emailvalue),existuser1);

        
            
        }
    
    
    
    public void enternumber() throws InterruptedException {

  	  

    	    WebElement number = driver.findElement(By.name(mobile));
            JavascriptExecutor executor = (JavascriptExecutor) driver; executor.executeScript("arguments[0].click();", number); 
       
   
        	String randomNumbers = RandomStringUtils.randomNumeric(8);
        	String phNo = 83+randomNumbers;
        	number.sendKeys(phNo);
        			
       	
        
        }
    	
  
    public void enterinvalidnumber() throws InterruptedException {

    	  

    	WebElement number = driver.findElement(By.name(mobile));
        JavascriptExecutor executor = (JavascriptExecutor) driver; executor.executeScript("arguments[0].click();", number); 
       
       
        	String randomNumbers = RandomStringUtils.randomNumeric(5);
        	String phNo = 83+randomNumbers;
        	number.sendKeys(phNo);
    }
    
    
    public void verifyalphabetical() throws InterruptedException {
    	
    	
    	WebElement numberField = driver.findElement(By.name("phone_mobile"));
   	 
    
    	numberField.sendKeys("ABCD");

    	String typedValue = numberField.getAttribute("value");

    	int size = typedValue.length();

    	if (size == 0) {
    		
    		  
    		AssertJUnit.assertEquals(size, 0);

  	}
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
   
   
   
   public void verifyStep3() {

	 
	    
 	String actualTitle = driver.getTitle();
 	String expectedTitle = "Suburban Jungler";
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
   
   public void verifyErrors2(String expectedText, String expectedText1, String expectedText2, String expectedText3, String expectedText4, String expectedText5, String expectedText6, String expectedText7 )
   
   
 {
	  Assert.assertEquals(readText(By.xpath(cityerror)), expectedText);
	  Assert.assertEquals(readText(By.xpath(term)), expectedText1);
	  Assert.assertEquals(readText(By.xpath(town)), expectedText2);
	  Assert.assertEquals(readText(By.xpath(value)), expectedText3);
	  Assert.assertEquals(readText(By.xpath(profile)), expectedText4);
	  Assert.assertEquals(readText(By.xpath(zilprofiel)), expectedText5);
	  Assert.assertEquals(readText(By.xpath(profile2)), expectedText6);
	  Assert.assertEquals(readText(By.xpath(image)), expectedText7);



 }
   
   
   public void verifyErrors3(String expectedText, String expectedText1, String expectedText2)
   
   
   {
  	  Assert.assertEquals(readText(By.xpath(mfnerror)), expectedText);
  	  Assert.assertEquals(readText(By.xpath(mlnerror)), expectedText1);
  	  Assert.assertEquals(readText(By.xpath(memerror)), expectedText2);
  



   }
 
 
   public void verifyInvalidNumber(String expectedText )
 
 
 {
	  Assert.assertEquals(readText(By.xpath(mobilerror)), expectedText);

 }
 
 
   public void verifyInvalidEmail(String expectedText )
 
 
 {
	  Assert.assertEquals(readText(By.xpath(emailerror)), expectedText);

 }
 
   public void verifyExistUser(String expectedText )
 
 
 {
	  Assert.assertEquals(readText(By.xpath(existuser)), expectedText);

 }
 

   public void verifyForm2(String expectedText)
 
 
 {
	  Assert.assertEquals(readText(By.xpath(secondform)), expectedText);

 
 }
   
   
   public void verifyForm3(String expectedText)
   
   
   {
  	  Assert.assertEquals(readText(By.className(welcome3)), expectedText);

   
   }
 
}