package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mailinator {
	
	
	
    static String url = "https://www.mailinator.com/v4/public/inboxes.jsp?to=sam";
    
    public static void main(String args[]) throws IOException, InterruptedException{
  
    WebDriver driver = new ChromeDriver();
     String mailclick = "//td[contains(text(),'Suburban Jungle Team')]";
     
    {
    
    	driver.get(url);
    	WebElement mail = driver.findElement(By.xpath(mailclick));
    	Thread.sleep(5000);
    	mail.click();
    	
    	
}
}
    
}