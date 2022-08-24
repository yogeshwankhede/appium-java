package org.tyss.bigbasket.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BB_TestCase_001Test {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability(MobileCapabilityType.NO_RESET, "true");
		dc.setCapability("appPackage", "com.bigbasket.mobileapp");
		dc.setCapability("appActivity", ".activity.SplashActivity");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.tap(1, 450, 850, 500);
		
		driver.swipe(576,1880, 556, 760, 500);
//		driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[7]")).click();
//		driver.findElement(By.xpath("//android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[1]")).click();
//		driver.findElement(By.xpath("//android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[1]")).click();
	}

}
