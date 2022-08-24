package org.tyss.appium36.practice;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class BaseClassTest {
	AndroidDriver<WebElement> driver;
	
	public void tapActionByElement(int finger,WebElement element,int time) {
		driver.tap(finger, element, time);
	}
	public void tapActionByCoordinates(int finger,int x,int y, int time) {
		driver.tap(finger, x, y, time);
	}
		
	
}

