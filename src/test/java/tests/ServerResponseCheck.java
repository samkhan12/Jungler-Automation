package tests;



import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;


import pages.PageServerResponse;
import utils.ExtentReports.ExtentTestManager;


public class ServerResponseCheck extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.


	@Test (enabled = true, description="Verify Server Response -SJ,UJ,Agent Servers")
	public void TC_Positive_Verify_Server_Response() throws InterruptedException, IOException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify Server Response -SJ,UJ,Agent Servers");
        
        //*************PAGE INSTANTIATIONS*************
 
        PageServerResponse response = new PageServerResponse(driver,wait);
        response.getClass();
        driver.quit();
   
        //*************PAGE METHODS********************
   
    
      
	 
	}
    
}
