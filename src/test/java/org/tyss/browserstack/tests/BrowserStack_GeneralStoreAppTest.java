package org.tyss.browserstack.tests;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class BrowserStack_GeneralStoreAppTest {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();

		// Set your access credentials
		caps.setCapability("browserstack.user", "yogeshwankhede_rvWtod");
		caps.setCapability("browserstack.key", "3X2W2gGxBJ5XB4VF62R6");

		// Set URL of the application under test
		caps.setCapability("app", "bs://3c7e37d3c0f36d2dbaecd064b0ab9296fbbfa754");

		// Specify device and os_version for testing
		caps.setCapability("device", "Samsung Galaxy S22 Ultra");
		caps.setCapability("os_version", "12.0");

		// Set other BrowserStack capabilities
		caps.setCapability("project", "GeneralStore On BrowserStack");
		caps.setCapability("build", "build-002");
		caps.setCapability("name", "GeneralStoreB002");


		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);
		//Script

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.runAppInBackground(10);

		 
		driver.quit();

	}
}


