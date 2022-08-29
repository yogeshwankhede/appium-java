package org.tyss.dream11;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.genrals.AppiumBaseClass;
import org.genrals.DataHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCase_002 extends AppiumBaseClass{
	@Test
	public void goMartEndToEndTest() throws MalformedURLException, InterruptedException {
		DataHandler data= new DataHandler();
		String Package = data.getDataFromProperty("appPackage");
		String Activity = data.getDataFromProperty("appActivity");
		String udid = data.getDataFromProperty("deviceId");
		String platformName=data.getDataFromProperty("platformName");
		
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, udid);
		dc.setCapability("appPackage", Package);
		dc.setCapability("appActivity", Activity);
		
		
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
