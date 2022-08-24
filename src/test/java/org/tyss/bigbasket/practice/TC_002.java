package org.tyss.bigbasket.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TC_002 {
	@Test
	public void EndToEndTest() throws MalformedURLException, InterruptedException {
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	dc.setCapability(MobileCapabilityType.NO_RESET, "true");
	dc.setCapability("appPackage", "com.bigbasket.mobileapp");
	dc.setCapability("appActivity", ".activity.SplashActivity");
	
	AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
//	//driver.tap(1, 528, 880, 500);
	Thread.sleep(3000);
	driver.swipe(552, 1861, 561, 891, 500);
	driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[7]")).click();
	driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.bigbasket.mobileapp:id/imgCategory'][1]")).click();
	
	}
}
