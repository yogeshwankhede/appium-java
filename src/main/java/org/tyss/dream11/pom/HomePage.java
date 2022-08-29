package org.tyss.dream11.pom;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage {
	@AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
	private AndroidElement continueButton;

	public void setContinueButton(AndroidElement continueButton) {
		this.continueButton = continueButton;
	}

}
