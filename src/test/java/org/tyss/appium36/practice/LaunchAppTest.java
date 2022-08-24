package org.tyss.appium36.practice;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchAppTest {
	@Test
	public void launchAppTest(){
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity", ".ApiDemos");
	
	
	
	}
}
