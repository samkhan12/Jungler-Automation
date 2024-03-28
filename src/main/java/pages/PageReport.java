package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class PageReport<DateFormat> extends BasePage{

    //*********Constructor*********
    public PageReport(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
   
  
    String logoutweb = "//*[@id=\"navbarNav\"]/ul/li/span/a[2]";
    String urltask = "https://selectsourceintl.orangescrum.com/dashboard#/tasks/custom-72913";
    String emailid = "txt_UserId";
    String password = "txt_Password";
    String login = "submit_Pass";
    String taskxpath = "//*[@id=\"side-menu-dynamic-cnt\"]/li[7]/a/span";
    String selectproject = "//*[@id=\"wrapper\"]/div[2]/div/div[2]/div[1]/ul[1]/li[2]/div/button/i";
    String project2 = "//*[@id=\"ajaxViewProjects\"]/a[1]";
    String classname = "proj_lnks ttc ";
    String filterxpath = "//*[@id=\"task_filter\"]/a/i";
    String timexpath = "//*[@id=\"filterModal\"]/div/div/div[2]/div[2]/div[3]/div[1]";
    String timeselect = "//*[@id=\"dropdown_menu_date\"]/li[8]/div/label/span/span";
    

    
    //*********Page Methods*********
    
    public void launchUrl() throws InterruptedException {

    	Thread.sleep(1000);
        driver.get(urltask);        
        }
    
    public void usernameemail(String email, String pass) throws InterruptedException {

    	Thread.sleep(1000);
        writeText(By.id(emailid),email); 
        writeText(By.id(password),pass);       

        }
    
    public void clickSubmit() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.id(login)); 
        
    }
    
    public void savedfilter1() throws InterruptedException {

    	Thread.sleep(1000);
        driver.get(urltask); 
        
    }
    
    
    public void selectProject() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.xpath(taskxpath)); 
    	Thread.sleep(1000);
        click(By.xpath(selectproject)); 
    	Thread.sleep(3000);
        click(By.xpath(project2)); 
    }
  
    public void clickfilter() throws InterruptedException {

        	Thread.sleep(2000);
            click(By.xpath(filterxpath));
        	Thread.sleep(2000);

            click(By.xpath(timexpath));
        	Thread.sleep(2000);

            click(By.xpath(timeselect));
            
    }
    
    
    public void selectweektime() throws InterruptedException {
    
    	 DateTimeFormatter format =
    	            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

    	        LocalDateTime now = LocalDateTime.now();
    	        LocalDateTime then = now.minusDays(7);

    	        System.out.println(String.format(
    	            "Now:  %s\nThen: %s",
    	            now.format(format),
    	            then.format(format)
    	            
    	        ));
    	        
    	       JavascriptExecutor js = (JavascriptExecutor) driver;
    	       js.executeScript("window.scrollBy(0,500)", "");
    	        
	           driver.findElement(By.xpath("//*[@id=\"dropdown_menu_date\"]/li[8]/div/label")).click();
	            
	      
	          
	           WebElement drv = driver.findElement(By.xpath("//*[@id=\"frm\"]"));
	           drv.click();
	       //    drv.sendKeys(now.format(format));//
   

            
            
            
    


   
    
    

    
    /*
    
    public void clickonemail() throws InterruptedException {

    	Thread.sleep(1000);
        click(By.xpath(emailbtn));    
        
        }
    
    
    public void enternum(String number) throws InterruptedException {

    	Thread.sleep(1000);
        writeText(By.xpath(numb),number);
        
        }
    
    public void enteremail(String email1) throws InterruptedException {

    	Thread.sleep(1000);
        writeText(By.xpath(email),email1);
        
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
    
    
    public void clearemail() throws InterruptedException {

    	Thread.sleep(1000);

    	driver.findElement(By.xpath(clremail)).clear();      
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
        
    	
 
    	
    	
    	WebElement click = driver.findElement(By.xpath(profile));
        JavascriptExecutor executor = (JavascriptExecutor) driver; executor.executeScript("arguments[0].click();", click); 
    	WebElement click1 = driver.findElement(By.xpath(logout1));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver; executor1.executeScript("arguments[0].click();", click1); 


        
        }
    
    public void emailLinkVerification() throws InterruptedException {
    	
    String url = "https://www.mailinator.com/v4/public/inboxes.jsp?to=test";
    
    	  {
    		    
    	    	driver.get(url);
    	    	
    	    	Thread.sleep(2000);
    	    	driver.findElement(By.xpath("//*[contains(text(),'Suburban Jungle Team')]")).click();
    	    	
    	    	Thread.sleep(5000);
    	    	driver.switchTo().frame("html_msg_body");
    	    	Thread.sleep(1000);
    	    	driver.findElement(By.linkText("here")).click();
    	    	
    	    	
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
 
 public void verifyEmailVerification() {

	 
	 	String actualTitle = driver.getTitle();
	 	String expectedTitle = "Dashboard | Jungler";
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
 
 public void verifyInvalidEmail(String expectedText)  {
		
	    Assert.assertEquals(readText(By.xpath(emailerror)), expectedText);
	}
 
 
 public void verifyEmptyEmail(String expectedText)  {
		
	    Assert.assertEquals(readText(By.xpath(emptyemail)), expectedText);
	}
 
 public void verifyExistEmail(String expectedText)  {
		
	    Assert.assertEquals(readText(By.xpath(existemail)), expectedText);
	}
 
 public void verifySuccessEmail(String expectedText)  {
		
	    Assert.assertEquals(readText(By.xpath(success)), expectedText);
	}
 */
}
}