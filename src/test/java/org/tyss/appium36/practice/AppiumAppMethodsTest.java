package org.tyss.appium36.practice;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumAppMethodsTest {
	@Test
	public void launchApp() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		//AndroidDriver< WebElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
		//Activates the given app if it is installed but not running or running in background
		//driver.activateApp("io.appium.android.apis");
		
		
	}
	

}
