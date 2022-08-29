package org.tyss.dream11;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.genrals.AppActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumEndToEndTest {
	@Test

	public void goMartEndToEndTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		AppActions apa = new AppActions();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "com.dream11sportsguru");
		dc.setCapability("appActivity", ".MainActivity");
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		//click on skip 
		MobileElement skipButton=(MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"onboarding_skip_button\"]"));
		driver.tap(1, skipButton, 5000);
		
		//click on shop
		MobileElement shopLink=(MobileElement) driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[939,2016][1005,2082]']"));
		driver.tap(1, shopLink, 5000);
		
		
		//Swipe till jacket
		//driver.swipe(552, 1930, 503, 470, 500);
        //driver.swipe(583, 1903, 605, 1130, 800);
		scrolltoElement(driver, "text", "Jackets");
        //driver.swipe(512, 1932, 512, 612, 5000);
        
       //wait till jacket is visible
//      By jacket=(By) driver.findElement(By.xpath("//android.view.View[@text='Jackets']"));
//		apa.waitForVisibility(jacket);
		
		MobileElement jackets = (MobileElement) driver.findElement(By.xpath("//android.view.View[@text='Jackets']"));
				driver.tap(1,jackets, 500);
		
		//click on NBA Jacket
		WebElement nbaBlack = driver.findElement(By.xpath("(//android.view.View[@text='NBA - Los Angeles Lakers'])[1]"));
		driver.tap(1, nbaBlack, 500);
		
	

		//swip till size
		driver.tap(1, 452, 1744, 500);
		driver.tap(1, 500, 588, 500);
	

		WebElement sizeXL = driver.findElement(By.xpath("//android.view.View[@text='XL']"));
		driver.tap(1, sizeXL, 300);
		WebElement pinCodeTextBox = driver.findElement(By.xpath("//android.widget.EditText[@bounds='[77,1337][869,1403]']"));
		driver.tap(1, pinCodeTextBox, 500);
		
		//enter pincode as 560076
		driver.tap(1, 400, 1792, 500);
		driver.tap(1, 680, 1792, 500);
		driver.tap(1, 400, 2055, 500);
		driver.tap(1, 400, 2055, 500);
		driver.tap(1, 140, 1928, 500);
		driver.tap(1, 680, 1792, 500);
		driver.tap(1, 932, 2055, 500);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO BAG']")).click();
		Thread.sleep(5000); 
		driver.tap(1, 1012, 172, 500);
		driver.findElement(By.xpath("//android.view.View[@text='Total MRP']/following-sibling::android.view.View[1]")).getText();
	}
	public static void scrolltoElement(AndroidDriver<WebElement> driver,String an, String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}

}
