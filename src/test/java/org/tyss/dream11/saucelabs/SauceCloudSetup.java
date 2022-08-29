package org.tyss.dream11.saucelabs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SauceCloudSetup {
	@Test
	public void preSetup() {
		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName","Android");
		caps.setCapability("appium:deviceName","Android GoogleAPI Emulator");
		caps.setCapability("appium:deviceOrientation", "portrait");
		caps.setCapability("appium:platformVersion","12.0");
		caps.setCapability("appium:app", "storage:filename=dream11 (1).apk");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("build", "<your build id>");
		sauceOptions.setCapability("name", "<your test name>");
		caps.setCapability("sauce:options", sauceOptions);
		
		URL url = null;
		try {
			url = new URL("https://oauth-yogesh.s-ba818:cec02785-5157-4365-94c7-714833406d22@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, caps);

	}
}
