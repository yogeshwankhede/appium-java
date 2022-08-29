package org.genrals;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.remote.MobileCapabilityType;

public class Dream11BaseClass {
	DesiredCapabilities dc;
	String deviceId;String appPackage;String appActivity;String platformName;String platformVersion;
	
	@BeforeClass
	public void getData() {
		
		DataHandler data = new DataHandler();
		data.intiallizeProperyFile(IFilePath.PROPERTYFILEPATH);
		 deviceId = data.getDataFromProperty("deviceID");
	     appPackage = data.getDataFromProperty("appPackage");
		 appActivity = data.getDataFromProperty("appActivity");
		 platformName=data.getDataFromProperty("platformName");
		 platformVersion=data.getDataFromProperty("platformVersion");
		
	}
	

	 @BeforeMethod
	 public void openApp() throws MalformedURLException {
			dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
			dc.setCapability(MobileCapabilityType.UDID, deviceId);
			dc.setCapability("appPackage", appPackage);
			dc.setCapability("appActivity", appActivity);
			System.out.println(platformName+platformVersion+deviceId+appActivity+appPackage);
	 }
}
