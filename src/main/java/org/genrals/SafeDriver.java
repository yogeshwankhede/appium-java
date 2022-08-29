package org.genrals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
/**
 * This class provides common driver
 * @author Mr.Yog
 *
 */
public class SafeDriver {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	public static AndroidDriver<WebElement> getDriver() {
		return (AndroidDriver<WebElement>) driver.get();
	}
	public static void setDriver(AndroidDriver<WebElement> actdriver) {
		driver.set(actdriver);
	}


}
