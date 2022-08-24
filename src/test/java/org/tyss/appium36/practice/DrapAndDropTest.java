package org.tyss.appium36.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DrapAndDropTest {
	@Test
	public void drapanddropaction() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		WebElement okbtn = driver.findElement(By.id("android:id/button1"));
		okbtn.click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		
		driver.findElementByAccessibilityId("Drag and Drop").click();
		
		MobileElement src = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		MobileElement dest = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_3"));
		
		TouchAction tca= new TouchAction(driver);
		tca.longPress(src).moveTo(dest).release().perform();
		driver.quit();
		
		
	
	}

}
