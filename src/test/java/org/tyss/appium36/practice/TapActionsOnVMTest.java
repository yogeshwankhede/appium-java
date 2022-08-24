package org.tyss.appium36.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TapActionsOnVMTest {
	AndroidDriver<WebElement> driver;
	@Test
	public void calAddition() throws MalformedURLException {
		
		//Set PreConditions/DesiredCapablities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "com.google.android.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		//Pass url by Creating object of driver and url
		
		 driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		 //Prform actions on elements
		WebElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		//driver.tap(1, two, 500);
		tapActionByElement(1, two, 500);
		 @SuppressWarnings("unused")
		WebElement add = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		 //driver.tap(1, 904, 1740, 500);
		 tapActionByCoordinates(1, 904, 1740, 500);
		 WebElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
		 //driver.tap(1, five, 500);
		 tapActionByElement(1, five, 500);
		@SuppressWarnings("unused")
		WebElement equal = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		//driver.tap(1, 912, 1976, 500);
		tapActionByCoordinates(1, 912, 1976, 500);
		String output = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		System.out.println(output);
	}
	
	public void tapActionByElement(int finger,WebElement element,int time) {
		driver.tap(finger, element, time);
	}
	public void tapActionByCoordinates(int finger,int x,int y, int time) {
		driver.tap(finger, x, y, time);
	}


}
