package org.tyss.appium36.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class OrientationSetUpTest {
	@Test
	public void orientationSetUp() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		@SuppressWarnings("unused")
		ScreenOrientation orient = driver.getOrientation();
		
		ScreenOrientation currentOri = driver.getOrientation();
		System.out.println("Device in "+currentOri+" Mode");
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		driver.rotate(ScreenOrientation.PORTRAIT);
	}
}
