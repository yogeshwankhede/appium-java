package org.tyss.browserstack.tests;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

class TestClass2 implements Runnable {
	public void run() {
		DesiredCapabilities caps = new DesiredCapabilities();
		// Set URL of the application under test
		caps.setCapability("app", "<app_url>");
		// Specify device and os_version for testing
		caps.setCapability("device", "Samsung Galaxy S10e");
		caps.setCapability("os_version", "9.0");
		// Set other BrowserStack capabilities
		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "Java Android");
		caps.setCapability("name", "first_test");
		BrowserStackSample r1 = new BrowserStackSample();
		try {
			r1.executeTest(caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
