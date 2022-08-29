package org.genrals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumBaseClass {
	DesiredCapabilities dc;
	AppiumDriverLocalService service;
	AndroidDriver<WebElement> driver;
	@BeforeSuite
	public void connectionSetup() {
		System.out.println("open database connection");		
	}
	@BeforeTest
	public void parameterization() {
		System.out.println("set up parameterization");
	}
	@AfterTest
	public void closeAPIConnections() {
		System.out.println("Close workbook,csv etc conn");
	}
	@BeforeClass
	public void startServer() {
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
		
	}
	 @BeforeMethod
	 public void openApp() throws MalformedURLException {
			dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
			dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			dc.setCapability("appPackage", "io.appium.android.apis");
			dc.setCapability("appActivity", ".ApiDemos");
			
			AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	 }
	@AfterSuite
	public void closeCon() {
		System.out.println(" close conn");
	}

}
