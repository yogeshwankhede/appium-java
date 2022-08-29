package org.tyss.browserstack.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowserStackSample {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		Thread object1 = new Thread(new Android_TestClass1());
		object1.start();
		Thread object2 = new Thread(new Android_TestClass_2());
		object2.start();
	}
	public void executeTest(DesiredCapabilities caps) throws InterruptedException, MalformedURLException {
		// Set your access credentials
		caps.setCapability("browserstack.user", "<username>");
		caps.setCapability("browserstack.key", "<access_key>");
		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);
		// Test case for the BrowserStack sample Android app.
		// If you have uploaded your app, update the test case here.
//		AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//				ExpectedConditions.elementToBeClickable(
//						MobileBy.AccessibilityId("Search Wikipedia")));
//		searchElement.click();
//		AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//				ExpectedConditions.elementToBeClickable(
//						MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
//		insertTextElement.sendKeys("BrowserStack");
		Thread.sleep(5000);
		List<AndroidElement> allProductsName = driver.findElementsByClassName(
				"android.widget.TextView");
		assert(allProductsName.size() > 0);
		// Invoke driver.quit() after the test is done to indicate that the test is completed.
		driver.quit();
	}
}