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

public class GoMartEndToEndTest {
	@Test
	public void goMartEndToEndTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "com.shivamits.gomart");
		dc.setCapability("appActivity", ".MainActivity");
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		//driver.navigate().refresh();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create New Account\"]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[178,886][968,998]']")).sendKeys("Veer123");
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[178,1020][968,1133]']")).sendKeys("veer123@gmail.com");
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[178,1152][968,1268]']")).sendKeys("Veer123@abc");
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Signup\"]")).click();
		driver.findElement(By.xpath("(//android.view.View[@text='home Home'])[1]")).click();
		driver.findElement(By.xpath("//android.view.View[@text='SKIN CARE']")).click();
		scrolltoElement(driver, "text", "ProductProduct #5 ₹1415 ₹119555% Off");
		driver.findElement(By.xpath("//android.view.View[@text='ProductProduct #5 ₹1415 ₹119555% Off']")).click();
		String modelName = driver.findElement(By.xpath("//android.view.View[@text='Apple iPhone SE 32GB']")).getText();
		System.out.println(modelName);
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='ADD TO CART']")).click();
		driver.findElement(By.xpath("//android.view.View[@text='41HIWOuRiwL._AA300_']")).click();
		//driver.findElement(By.xpath("(//android.view.View[@text='2 bag handle outline Cart'])[2]"));
		driver.tap(1, 676, 2076, 5000);
		
		//driver.findElement(By.xpath("//android.view.View[@bounds='[539,1994][811,2148]']")).click();
		//driver.tap(1, 944, 176, 500);
		
		String actualbill = driver.findElement(By.xpath("(//android.view.View[@text='₹ 2848']")).getText();
		String[] bill = actualbill.split(" ");
		System.out.println(bill);
		
		
		
//		driver.findElement(By.xpath(""))
//		driver.findElement(By.xpath(""))
//		driver.findElement(By.xpath(""))
//		driver.findElement(By.xpath(""))
		
	
	}
	public static void scrolltoElement(AndroidDriver<WebElement> driver,String an, String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}

}
