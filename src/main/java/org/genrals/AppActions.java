package org.genrals;

import java.util.Set;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
/**
 * This class contains all App common actions
 * @author Mr.Yog
 *
 */
public class AppActions {
	AndroidDriver<WebElement> driver;
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
}
