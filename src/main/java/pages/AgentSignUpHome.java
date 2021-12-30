	package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class AgentSignUpHome extends BasePage {



	    //*********Constructor*********
	    public AgentSignUpHome (WebDriver driver, WebDriverWait wait) {
	        super(driver, wait);
	    }

	    //*********Page Variables*******
	    
	    String baseURL = "http://18.232.53.196:3002/application/";

	    
	    //*********Page Methods*********

	    //Go to Homepage
	    
	        public void goToJungler() throws InterruptedException {


	            driver.get(baseURL);
	        
	    }

	}

