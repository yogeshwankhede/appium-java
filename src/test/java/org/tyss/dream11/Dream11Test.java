package org.tyss.dream11;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dream11Test {
	DesiredCapabilities dc;
	public AndroidDriver<WebElement> driver;
	@BeforeClass
	public void capablity() {
	    dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "com.dream11sportsguru");
		dc.setCapability("appActivity", ".MainActivity");
	}
	@BeforeMethod
	public void priSetup() throws MalformedURLException {

		driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement skipButton=(MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"onboarding_skip_button\"]"));
		driver.tap(1, skipButton, 500);
		

		MobileElement shopLink=(MobileElement) driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[939,2016][1005,2082]']"));
		driver.tap(1, shopLink, 500);
		
	}
	

}
