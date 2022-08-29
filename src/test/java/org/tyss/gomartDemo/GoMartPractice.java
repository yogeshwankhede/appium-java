package org.tyss.gomartDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GoMartPractice {
	@Test
	public void goMartP() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "com.dream11Pro");
		dc.setCapability("appActivity", "com.app.dream11.dream11.SplashActivity");
		
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		//driver.navigate().refresh();
//		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[178,888][968,1001]']")).sendKeys("Veer123");
//		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[178,1020][968,1136]']")).sendKeys("Veer123@abc");
//		
//		
//		
//		String modules = driver.findElement(By.xpath("//android.view.View[@bounds='[11,327][1069,457]']/following-sibling::android.view.View/android.view.View/android.view.View")).getText();
//	
	
	
	}
	

}
