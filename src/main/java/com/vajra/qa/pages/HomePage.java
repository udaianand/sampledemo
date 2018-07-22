package com.vajra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vajra.qa.base.TestBase;

public class HomePage extends TestBase {

	// Page Factory - OR (Object Repository)

	@FindBy(className = "fa fa-edit")
	WebElement freeRegistrationLink;

	public void verifyHomePageTitle() {
		driver.getTitle();

	}

	public RegistrationPage navigateRegistrationPage() {
		freeRegistrationLink.click();
		return new RegistrationPage();
	}

}
