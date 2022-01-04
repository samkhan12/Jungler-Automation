package pages;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NumberTest {

    public static void main(String args[]) throws IOException, InterruptedException{

       	 
    	 
    	 

	WebDriver driver = new ChromeDriver();
	{
	driver.get("http://18.232.53.196:3002/application/");
	driver.findElement(By.id("close_user_modal1")).click();
	WebElement numberField = driver.findElement(By.name("phone_mobile"));
	 
	/************************** Way 1 ********************************/
	// Type alphabets
	numberField.sendKeys("ASSDuiouoi");

	// Retrieve typed value
	String typedValue = numberField.getAttribute("value");

	// Get the length of typed value
	int size = typedValue.length();

	if (size == 0) {
		
		  
		AssertJUnit.assertEquals(size, 0);

		
	}

}
}}