package org.genrals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CreateAccountFindByTest {@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Create New Account\"]")
private MobileElement createAccountButton;

@FindBy(xpath = "//android.widget.EditText[@bounds='[178,886][968,998]']")
private MobileElement userNameTextBox;

@FindBy(xpath = "//android.widget.EditText[@bounds='[178,1020][968,1133]']")
private MobileElement emailTextBox;

@FindBy(xpath = "//android.widget.EditText[@bounds='[178,1152][968,1268]']")
private MobileElement passwordTextBox;

@FindBy(xpath = "//android.view.View[@content-desc=\"Signup\"]/android.widget.TextView")
private MobileElement signUpButton;

public void CreateAccountTest(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setAccountPage() {
	createAccountButton.tap(1, 500);
	userNameTextBox.sendKeys("Veer123");
	emailTextBox.sendKeys("veer123@gmail.com");
	passwordTextBox.sendKeys("Veer123@abc");
	signUpButton.tap(1, 500);






}


}
