package org.tyss.dream11;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCase_002 {
	@Test
	public void goMartEndToEndTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "com.dream11sportsguru");
		dc.setCapability("appActivity", ".MainActivity");
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		 
		//click on skip 
		MobileElement skipButton=(MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"onboarding_skip_button\"]"));
		driver.tap(1, skipButton, 500);
		
		//click on shop
		MobileElement shopLink=(MobileElement) driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[939,2016][1005,2082]']"));
		driver.tap(1, shopLink, 5000);
		
		driver.findElement(By.xpath("//android.widget.Image[@text='Under 999']")).click();
		driver.findElement(By.xpath("//android.view.View[@bounds='[44,1177][528,1675]']")).click();
		
		driver.swipe(496, 1716, 460, 516, 800);
		
		driver.findElement(By.xpath("//android.view.View[@text='XL']")).click();
		
		//driver.tap(1, 496, 1916, 500);
		
//		WebElement shoes = driver.findElement(By.xpath("//android.widget.Image[@text='Under 999']"));
//		driver.tap(1, shoes, 5000);
		
	
	}
}