package pages;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoGenerator {
	
	

    public static void main(String args[]) throws IOException{

    WebDriver driver = new ChromeDriver();
    
   for(int i = 0;i<=5;i++)
    
    {
    	
    	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    	WebElement email = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
    	email.click();  
    	Random randomGenerator = new Random();  
    	int randomInt = randomGenerator.nextInt(1000);  
    	email.sendKeys("username"+ randomInt +"@gmail.com");	
    }
       
  
	
    }}
