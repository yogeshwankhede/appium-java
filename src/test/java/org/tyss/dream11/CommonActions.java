package org.tyss.dream11;

import java.util.Set;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class CommonActions {
	
	
	AndroidDriver<WebElement> driver;
	/**
	 * This Method is to Scroll by visibleText
	 * @param driver
	 * @param an
	 * @param av
	 */
	public static void scrolltoElement(AndroidDriver<WebElement> driver,String an, String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
	
	
	/**
	 * This methos is for tap action by element
	 * @param finger
	 * @param element
	 * @param time
	 */

	public void tapActionByElement(int finger,WebElement element,int time) {
		driver.tap(finger, element, time);
	}
	
	
	/**
	 * This Method is for tap action by Co-ordinates
	 * @param finger
	 * @param x
	 * @param y
	 * @param time
	 */
	public void tapActionByCoordinates(int finger,int x,int y, int time) {
		driver.tap(finger, x, y, time);
	}
	
	/**
	 * This method is for swipe action
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param timeInMsec
	 */
	public void swipeByXandY(int x1,int y1,int x2,int y2,int timeInMsec) {
		driver.swipe(x1, y1, x2, y2, timeInMsec);
	}
	
	/**
	 * This method is for drag and drop action
	 * @param src
	 * @param dest
	 */
	public void dragAndDrop(MobileElement src, MobileElement dest) {
		TouchAction tca= new TouchAction(driver);
		tca.longPress(src).moveTo(dest).release().perform();
	}
	
	/**
	 * This method is to run app in background
	 * @param timeInSec
	 */
	public void runAppInBackground(int timeInSec) {
		driver.runAppInBackground(timeInSec);

	}
	/**
	 * This method is to switch app
	 * @param packageName
	 */
	public void switchNativeToWebApp(String packageName) {
		Set<String> windows = driver.getContextHandles();

		for(String window:windows) {
			System.out.print("Active windows "+ window);
			driver.context("WEBVIEW_"+packageName+"");
		}
	}
	/**
	 * This method is to perform installation action for apk
	 * @param apkPath
	 */
	public void installApk(String apkPath) {
		driver.installApp(apkPath);
		
	}
	public void ScrollByCoOrdiantes(int finger, int x , int y , int timeinMsec) {
		driver.swipe(x, y, x, y, timeinMsec);
		
	}
	

}
