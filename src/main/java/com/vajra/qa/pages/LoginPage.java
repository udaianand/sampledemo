package com.vajra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vajra.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - OR (Object Repository)

	@FindBy(xpath = "//a[contains(text(),'Member Login')]")
	WebElement memberlogin;

	@FindBy(xpath = "//input[@name='EMAIL']")
	WebElement memberid;

	@FindBy(xpath = "//input[@name='txtp']")
	WebElement password;

	@FindBy(xpath = "//button")
	WebElement signinbtn;

	// Initialization of WebElelments of this Page using the PageFactory method.

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// ACTIONS

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String un, String pwd) throws InterruptedException {
		memberid.sendKeys(un);
		password.sendKeys(pwd);
		signinbtn.click();
		Thread.sleep(3000);

		return new HomePage();
	}

}