package pages;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    String imageupload = "//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a[1]";
    
    
     
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
    String logout = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[1]/div[2]/button";
    String logout1 = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[1]/div[2]/button";
    String logout2 = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[1]/div[2]/button";
    String login = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/header/nav/div[2]/ul/li[1]/a";
    String logout3 = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[1]/div[2]/button";
    
    //*********Page Methods*********  
    
    
    public void clickoncancel() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.id(cancelid));    
        
        }
    
    public void logout() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.xpath(logout));    
        
        }
    
    public void entervalues(String fn,String ln, String firm) throws InterruptedException {

    	Thread.sleep(1000);
        writeText(By.name(fname),fn);
        writeText(By.name(lname),ln);
        writeText(By.name(firmname),firm);
        
      
        
        }
    
    public void step2(String fn,String ln, String firm) throws InterruptedException {
    	
    	
    	Thread.sleep(1000);
        click(By.id(cancelid)); 
        
    	Thread.sleep(1000);
        writeText(By.name(fname),fn);
        writeText(By.name(lname),ln);
        writeText(By.name(firmname),firm);
        
        WebElement email = driver.findElement(By.name(emailvalue));
    	email.click();  
    	Random randomGenerator = new Random();  
    	int randomInt = randomGenerator.nextInt(1000);
    	
    	Random randomGenerator1 = new Random();  
    	int randomInt1 = randomGenerator1.nextInt(1000);  
    	email.sendKeys("username"+ randomInt1 + randomInt + "@mailinator.com");	
    	

	    WebElement number = driver.findElement(By.name(mobile));
        JavascriptExecutor executor = (JavascriptExecutor) driver; executor.executeScript("arguments[0].click();", number); 
   

    	String randomNumbers = RandomStringUtils.randomNumeric(8);
    	String phNo = 83+randomNumbers;
    	number.sendKeys(phNo);
    	
    	Thread.sleep(2000);
      	WebElement city_dropdown = driver.findElement(By.xpath(selectcity));
        Select city = new Select(city_dropdown);
        city.selectByIndex(1);
          
    	
    	Thread.sleep(1000);
        click(By.xpath(btnxpath));   
        
    	Thread.sleep(10000);
        click(By.xpath(logout1));    
        
        String URL = "http://18.232.53.196:3002/";
        driver.get(URL);
        
        Thread.sleep(2000);
        click(By.xpath(login));
        
        driver.switchTo().activeElement();
        driver.findElement(By.name("email")).sendKeys("username"+ randomInt1 + randomInt + "@mailinator.com");
        
        Thread.sleep(2000);
        click(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/div[2]/div/button"));
        
        driver.get("https://www.mailinator.com");
        WebElement click =  driver.findElement(By.id("search"));
        click.sendKeys("username"+ randomInt1 + randomInt + "@mailinator.com");
        driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div[1]/div/button")).click();
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(text(),'Suburban Jungle Team')]")).click();
    	
    	Thread.sleep(5000);
    	driver.switchTo().frame("html_msg_body");
    	Thread.sleep(1000);
    	driver.findElement(By.linkText("here")).click();
    	
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    	
        
        }
    
    

    public void step3(String fn,String ln, String firm) throws InterruptedException, AWTException {
    	
    	
    	Thread.sleep(1000);
        click(By.id(cancelid)); 
        
    	Thread.sleep(1000);
        writeText(By.name(fname),fn);
        writeText(By.name(lname),ln);
        writeText(By.name(firmname),firm);
        
        WebElement email = driver.findElement(By.name(emailvalue));
    	email.click();  
    	Random randomGenerator = new Random();  
    	int randomInt = randomGenerator.nextInt(1000);
    	
    	Random randomGenerator1 = new Random();  
    	int randomInt1 = randomGenerator1.nextInt(1000);  
    	email.sendKeys("username"+ randomInt1 + randomInt + "@mailinator.com");	
    	

	    WebElement number = driver.findElement(By.name(mobile));
        JavascriptExecutor executor = (JavascriptExecutor) driver; executor.executeScript("arguments[0].click();", number); 
   

    	String randomNumbers = RandomStringUtils.randomNumeric(8);
    	String phNo = 83+randomNumbers;
    	number.sendKeys(phNo);
    	
    	Thread.sleep(2000);
      	WebElement city_dropdown = driver.findElement(By.xpath(selectcity));
        Select city = new Select(city_dropdown);
        city.selectByIndex(1);
          
    	
    	Thread.sleep(1000);
        click(By.xpath(btnxpath));
        
        
        Thread.sleep(10000);
        driver.findElement(By.name(city2)).sendKeys("San Francisco");
        driver.findElement(By.name(buysales)).sendKeys("100");
        driver.findElement(By.name(business)).sendKeys("sample.com");
        driver.findElement(By.name(zilli)).sendKeys("zillow.com");
        driver.findElement(By.name(bio2)).sendKeys("Test Agent Flow");

       /*
        writeText(By.name(city2),"San Francisco");
        writeText(By.name(buysales),"100");
        writeText(By.name(business),"sample.com");
        writeText(By.name(zilli),"zillow.com");
        writeText(By.name(bio2),"Test Agent Flow");
       */
        
    	WebElement year_dropdown = driver.findElement(By.name(year));
        Select budget = new Select(year_dropdown);
        budget.selectByIndex(1);
        
        
        Thread.sleep(2000);
    	driver.findElement(By.xpath(town2)).click();
    	
    	
    	Thread.sleep(2000);
    	WebElement check = driver.findElement(By.xpath(checkbox));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver; executor2.executeScript("arguments[0].click();", check); 
 
        Thread.sleep(5000);
        WebElement check1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[3]/div/div/button"));
        JavascriptExecutor executor3 = (JavascriptExecutor) driver; executor3.executeScript("arguments[0].click();", check1); 
 
        
        JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("window.scrollBy(0,250)"); 
	    Thread.sleep(2000); 
	 
	     WebElement browse = driver.findElement(By.xpath(upload));
	     browse.click(); 
	     Thread.sleep(2000);
	    
	     Robot rb = new Robot();
	 
	     StringSelection str = new StringSelection("C:\\Users\\khans\\sample.jpg");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	     
	     Thread.sleep(5000);
	     WebElement number1 = driver.findElement(By.xpath(btnxpath2));
         WebDriverWait wait = new WebDriverWait(driver,60);
         wait.until(ExpectedConditions.visibilityOf(number1));
         JavascriptExecutor executor4 = (JavascriptExecutor) driver; executor4.executeScript("arguments[0].click();", number1);
         
         
    	 Thread.sleep(10000);
         click(By.xpath(logout2));    
        
         String URL = "http://18.232.53.196:3002/";
         driver.get(URL);
        
         Thread.sleep(2000);
         click(By.xpath(login));
        
         driver.switchTo().activeElement();
         driver.findElement(By.name("email")).sendKeys("username"+ randomInt1 + randomInt + "@mailinator.com");
        
         Thread.sleep(2000);
         click(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/div[2]/div/button"));
        
         driver.get("https://www.mailinator.com");
         WebElement click =  driver.findElement(By.id("search"));
         click.sendKeys("username"+ randomInt1 + randomInt + "@mailinator.com");
         driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div[1]/div/button")).click();
        
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[contains(text(),'Suburban Jungle Team')]")).click();
    	
    	 Thread.sleep(5000);
    	 driver.switchTo().frame("html_msg_body");
    	 Thread.sleep(1000);
    	 driver.findElement(By.linkText("here")).click();
    	 
         ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
         driver.switchTo().window(tabs.get(1));

    	        
        }
    
    
    public void step4(String fn,String ln, String firm) throws InterruptedException, AWTException {
    	
    	
    	Thread.sleep(1000);
        click(By.id(cancelid)); 
        
    	Thread.sleep(1000);
        writeText(By.name(fname),fn);
        writeText(By.name(lname),ln);
        writeText(By.name(firmname),firm);
        
        WebElement email = driver.findElement(By.name(emailvalue));
    	email.click();  
    	Random randomGenerator = new Random();  
    	int randomInt = randomGenerator.nextInt(1000);
    	
    	Random randomGenerator1 = new Random();  
    	int randomInt1 = randomGenerator1.nextInt(1000);  
    	email.sendKeys("username"+ randomInt1 + randomInt + "@mailinator.com");	
    	

	    WebElement number = driver.findElement(By.name(mobile));
        JavascriptExecutor executor = (JavascriptExecutor) driver; executor.executeScript("arguments[0].click();", number); 
   

    	String randomNumbers = RandomStringUtils.randomNumeric(8);
    	String phNo = 83+randomNumbers;
    	number.sendKeys(phNo);
    	
    	Thread.sleep(2000);
      	WebElement city_dropdown = driver.findElement(By.xpath(selectcity));
        Select city = new Select(city_dropdown);
        city.selectByIndex(1);
          
    	
    	Thread.sleep(1000);
        click(By.xpath(btnxpath));
        
        
        Thread.sleep(10000);
        driver.findElement(By.name(city2)).sendKeys("San Francisco");
        driver.findElement(By.name(buysales)).sendKeys("100");
        driver.findElement(By.name(business)).sendKeys("sample.com");
        driver.findElement(By.name(zilli)).sendKeys("zillow.com");
        driver.findElement(By.name(bio2)).sendKeys("Test Agent Flow");

       /*
        writeText(By.name(city2),"San Francisco");
        writeText(By.name(buysales),"100");
        writeText(By.name(business),"sample.com");
        writeText(By.name(zilli),"zillow.com");
        writeText(By.name(bio2),"Test Agent Flow");
       */
        
    	WebElement year_dropdown = driver.findElement(By.name(year));
        Select budget = new Select(year_dropdown);
        budget.selectByIndex(1);
        
        
        Thread.sleep(2000);
    	driver.findElement(By.xpath(town2)).click();
    	
    	
    	Thread.sleep(2000);
    	WebElement check = driver.findElement(By.xpath(checkbox));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver; executor2.executeScript("arguments[0].click();", check); 
 
        Thread.sleep(5000);
        WebElement check1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[3]/div/div/button"));
        JavascriptExecutor executor3 = (JavascriptExecutor) driver; executor3.executeScript("arguments[0].click();", check1); 
 
        
        JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("window.scrollBy(0,250)"); 
	    Thread.sleep(2000); 
	 
	     WebElement browse = driver.findElement(By.xpath(upload));
	     browse.click(); 
	     Thread.sleep(2000);
	    
	     Robot rb = new Robot();
	 
	     StringSelection str = new StringSelection("C:\\Users\\khans\\sample.jpg");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	     
	     Thread.sleep(5000);
	     WebElement number1 = driver.findElement(By.xpath(btnxpath2));
         WebDriverWait wait = new WebDriverWait(driver,60);
         wait.until(ExpectedConditions.visibilityOf(number1));
         JavascriptExecutor executor4 = (JavascriptExecutor) driver; executor4.executeScript("arguments[0].click();", number1);
         
         
     	Thread.sleep(5000);
        writeText(By.name(managerfn),"FirstName");
        writeText(By.name(managerln),"LastName");
        
        
     	WebElement email1 = driver.findElement(By.name(brokermail));
     	email1.click();  
     	Random randomGenerator3 = new Random();  
     	int randomInt2 = randomGenerator3.nextInt(1000);  
     	

    	Random randomGenerator2 = new Random();  
    	int randomInt3 = randomGenerator2.nextInt(1000);  
    	email1.sendKeys("username"+ randomInt2 + randomInt3 + "@gmail.com");	
    	
    	
       	Thread.sleep(5000);
      	WebElement check3 = driver.findElement(By.xpath(btnxpath3));
        JavascriptExecutor executor5 = (JavascriptExecutor) driver; executor5.executeScript("arguments[0].click();", check3);
        
        Thread.sleep(1000);
        click(By.xpath(logout3));    

   	    Thread.sleep(2000);
        String URL = "http://18.232.53.196:3002/";
         driver.get(URL);
        
         Thread.sleep(2000);
         click(By.xpath(login));
        
         driver.switchTo().activeElement();
         driver.findElement(By.name("email")).sendKeys("username"+ randomInt1 + randomInt + "@mailinator.com");
        
         Thread.sleep(2000);
         click(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/div[2]/div/button"));
        
         driver.get("https://www.mailinator.com");
         WebElement click =  driver.findElement(By.id("search"));
         click.sendKeys("username"+ randomInt1 + randomInt + "@mailinator.com");
         driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div[1]/div/button")).click();
        
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[contains(text(),'Suburban Jungle Team')]")).click();
    	
    	 Thread.sleep(5000);
    	 driver.switchTo().frame("html_msg_body");
    	 Thread.sleep(1000);
    	 driver.findElement(By.linkText("here")).click();
    	 
         ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
         driver.switchTo().window(tabs.get(1));

    	        
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
 
        Thread.sleep(5000);
        WebElement check1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[3]/div/div/button"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver; executor1.executeScript("arguments[0].click();", check1); 
 
    
         
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
    	 
    	     /*WebElement browse = driver.findElement(By.xpath(upload));
    	     Thread.sleep(2000);
    	  
    	     String absoultepath = new File("src//main//resources//sample.jpg").getAbsolutePath();
    	     browse.sendKeys(absoultepath);
    	     System.out.println(absoultepath);*/
    	     
         
          
         
    	     driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[8]/div/section/div/button")).click();

    	     
    	     String fileUploadPath = System.getProperty("user.dir") + File.separator
    	     + "UploadPdfFile" + File.separator;

    	     File file = new File(fileUploadPath);
    	     File[] files = file.listFiles();
    	     String name = null;
    	     {
    	     for (File f : files) {
    	     System.out.println(f.getName());
    	     name = f.getName();
    	     }

    	     //Copy your file's absolute path to the clipboard
    	     StringSelection ss = new StringSelection(fileUploadPath + name);
    	     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    	     clipboard.setContents(ss, null);
    	     try {
    	     	{
    	     	Robot robot = new Robot();
    	     	
    	     	
    	     	robot.delay(250);
    	     	robot.keyPress(KeyEvent.VK_ENTER);
    	     	robot.keyRelease(KeyEvent.VK_ENTER);
    	     	robot.keyPress(KeyEvent.VK_CONTROL);
    	     	robot.keyPress(KeyEvent.VK_V);
    	     	robot.keyRelease(KeyEvent.VK_V);
    	     	robot.keyRelease(KeyEvent.VK_CONTROL);
    	     	robot.keyPress(KeyEvent.VK_ENTER);
    	     	robot.delay(150);
    	     	robot.keyRelease(KeyEvent.VK_ENTER);
    	     	
    	     	
    	     	
    	     	}
    	     } catch (AWTException e) {
    	     	// TODO Auto-generated catch block
    	     	e.printStackTrace();
    	     }}}
    	     
    /*	     
    	     
    	     WebElement element1 = driver.findElement(By.xpath(upload));
    	     LocalFileDetector detector = new LocalFileDetector();
    	     String path1 = new File("src\\main\\resources\\sample.jpg").getAbsolutePath();
    	     File file = detector.getLocalFile(path1);
    	     ((RemoteWebElement) element1).setFileDetector(detector);
    	     element1.sendKeys(file.getAbsolutePath());    	     
     }
   		
   	  	  
    	     Robot rb = new Robot();
    	     StringSelection str = new StringSelection("C:\\Users\\khans\\Downloads\\sample.jpg");
    	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
    	 
    	     rb.keyPress(KeyEvent.VK_CONTROL);
    	     rb.keyPress(KeyEvent.VK_V);
    	 
    	     rb.keyRelease(KeyEvent.VK_CONTROL);
    	     rb.keyRelease(KeyEvent.VK_V);
    	 
    	    // for pressing and releasing Enter
    	     rb.keyPress(KeyEvent.VK_ENTER);
    	     rb.keyRelease(KeyEvent.VK_ENTER);
    	     
    	     
    	   }
    	  */
     
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
         WebDriverWait wait = new WebDriverWait(driver,60);
         wait.until(ExpectedConditions.visibilityOf(number));
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