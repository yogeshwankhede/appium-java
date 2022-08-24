package org.tyss.browserstack.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class BrowserStackApiDemos {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
    	DesiredCapabilities caps = new DesiredCapabilities();
    	
    	// Set your access credentials
    	caps.setCapability("browserstack.user", "yogeshwankhede_l5qitR");
    	caps.setCapability("browserstack.key", "PuEVpnNGTU5MyuF6FzFt");
    	
    	// Set URL of the application under test
    	caps.setCapability("app", "bs://47c5d3d3b1deb76736bf819c601015012b3a838e");
    	
    	// Specify device and os_version for testing
    	caps.setCapability("device", "Google Pixel 3");
    	caps.setCapability("os_version", "9.0");
        
    	// Set other BrowserStack capabilities
    	caps.setCapability("project", "First Java Project");
    	caps.setCapability("build", "browserstack-build-1");
    	caps.setCapability("name", "first_test");
       
    	
    	// Initialise the remote Webdriver using BrowserStack remote URL
    	// and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
        		new URL("http://hub.browserstack.com/wd/hub"), caps);
        
        
          // API Demos Script
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
		List<AndroidElement> options = driver.findElements(By.className("android.widget.CheckedTextView"));
		
		for(WebElement list:options) {
			System.out.println(list.getText());
		}
        driver.quit();
		
	}
}
