package org.tyss.appium36.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParellenExeTest {
	@Parameters({"deviceId","port"})
	@Test
	public void launchAppTest(String deviceId,String port) throws MalformedURLException{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	cap.setCapability(MobileCapabilityType.UDID, deviceId);
	cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity", ".ApiDemos");
	
	AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:localhost:"+port+"/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
	
	
	
	
	
	}

}
