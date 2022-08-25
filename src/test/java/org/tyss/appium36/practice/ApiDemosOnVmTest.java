package org.tyss.appium36.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.genrals.ApiBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ApiDemosOnVmTest extends ApiBaseClass{
	@Test
	public void apiActions() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
//		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//		dc.setCapability("appPackage", "io.appium.android.apis");
//		dc.setCapability("appActivity", ".ApiDemos");
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		WebElement okbtn = driver.findElement(By.id("android:id/button1"));
		okbtn.click();
		//driver.tap(1, 892, 1280, 500);
		//driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("AppiumDemo");
		driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/check2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/radio2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/star")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle2")).click();
		driver.hideKeyboard();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Jupiter']")).click();
		driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Save\"])[1]")).click();
		
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		List<WebElement> options = driver.findElements(By.className("android.widget.CheckedTextView"));
		
		for(WebElement list:options) {
			System.out.println(list.getText());
//			String alllist = list.getText();
//			Reporter.log(alllist);
			
		}
	}
		

}
