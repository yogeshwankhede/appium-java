package org.tyss.dream11;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ShopHomePage extends Dream11Base {
	@AndroidFindBy(xpath = "//android.widget.Image[@text='Team India']")
	private MobileElement teamIndiaBannerLink;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Jackets']")
	private MobileElement jacketLink;
	 
	

}
