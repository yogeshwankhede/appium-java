package org.tyss.appium36.practice;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GeneralStoreScenarioTest {
	@Test
	public void uninstallgenralStoreAppTest() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Alex");
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String p1Value = driver.findElement(By.xpath("//android.widget.TextView[@text='$160.97']")).getText();
		for(int i=1;i<p1Value.length();i++)
			System.out.println(p1Value.charAt(i));
		driver.findElement(By.xpath("//android.widget.LinearLayout[@bounds='[78,974][1002,1030]']")).click();
		String p2Value = driver.findElement(By.xpath("//android.widget.TextView[@text='$120.0']")).getText();
		for(int j=1;j<p2Value.length();j++)
			System.out.println(p2Value.charAt(j));
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[540,1803][1002,1841]']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']")).click();
		
		 String amount = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		 for(int k=1;k<amount.length();k++)
			 System.out.println(amount.charAt(k));
		 
		 
		 assertEquals(amount, "$ 280.97");
		
		 System.out.println("Testcase pass");
		 
		 driver.closeApp();
	}

}
