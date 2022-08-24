package org.tyss.browserstack.tests;


	import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
	public class BrowserStack_TouchScreenTest {
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
	    	DesiredCapabilities caps = new DesiredCapabilities();
	    	
	    	// Set your access credentials
	    	caps.setCapability("browserstack.user", "yogeshwankhede_rvWtod");
	    	caps.setCapability("browserstack.key", "3X2W2gGxBJ5XB4VF62R6");
	    	
	    	// Set URL of the application under test
	    	caps.setCapability("app", "bs://bcecbfbfb4fa259846d7a59927b7c4291631095d");
	    	
	    	// Specify device and os_version for testing
	    	caps.setCapability("device", "Samsung Galaxy S22 Ultra");
	    	caps.setCapability("os_version", "12.0");
	        
	    	// Set other BrowserStack capabilities
	    	caps.setCapability("project", "First Java Project");
	    	caps.setCapability("build", "browserstack-build-1");
	    	caps.setCapability("name", "first_test");
	       
	    	
	    	// Initialise the remote Webdriver using BrowserStack remote URL
	    	// and desired capabilities defined above
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
	        		new URL("http://hub.browserstack.com/wd/hub"), caps);
	        
	        // Write your test case statements here
	        
	        // Invoke driver.quit() after the test is done to indicate that the test is completed.
	        driver.quit();
			
		}
	}


