package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setup () {
        //Create a Chrome driver. All test classes use this.

        ChromeOptions chromeOptions = new ChromeOptions();
    //    chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown () {
        //driver.quit();
    	//quit driver
    }

}
