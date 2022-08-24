package org.tyss.appium36.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeActionsTest {
	@Test
	public void swipeAction() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		
		driver.swipe(401, 106, 466, 2175, 500);
		
		driver.swipe(41, 1055, 990, 1055, 500);
		
		Dimension size = driver.manage().window().getSize();
		
		int h = size.height;
		int w = size.width;
		
		driver.swipe(w, h/2, w, h/2, 500);
		
		driver.swipe(w/2, h, w/2, h, 500);
		
	}

}
