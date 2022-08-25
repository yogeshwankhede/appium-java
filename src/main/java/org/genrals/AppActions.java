package org.genrals;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
/**
 * This class contains all App common actions
 * @author Mr.Yog
 *
 */
public class AppActions {
	AndroidDriver<WebElement> driver;
	public final int timeOut = 40;
	
	
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
	/**
	 * This method is to waitexplicitly until the element is visible
	 * @param targetElement
	 * @return
	 */
	public boolean waitForVisibility(By targetElement) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.visibilityOfElementLocated(targetElement));
			return true;
		} catch (Exception e) {
			System.out.println("Element is not visible: " + targetElement);
			throw e;

		}
	}


	/**
	 * This method is to hide the keyboard
	 */
	public void hideKeyboard() {
		((AppiumDriver<WebElement>) driver).hideKeyboard();
	}
	
	
	/**
	 * This method is to perform tap action by x and y co-ordinatesO
	 * @param xPosition
	 * @param yPosition
	 */
	public void tapOn(double xPosition, double yPosition) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> tapObject = new HashMap<String, Double>();
        tapObject.put("startX", xPosition);
        tapObject.put("startY", yPosition);
        js.executeScript("mobile: tap", tapObject);
    }
	
	
	/**
	 * This method is to perform scroll action
	 * @param uiSelector
	 * @return
	 */
	static String UiScrollable(String uiSelector) {
        return "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + uiSelector + ".instance(0));";
    }
	
	
	/**
	 * This method is to open the notification
	 */
	public void openNotifications() {
        ((AndroidDriver<WebElement>) driver).openNotifications();
	}
	
	
}
