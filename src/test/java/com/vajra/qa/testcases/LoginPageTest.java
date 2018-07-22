package com.vajra.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vajra.qa.base.TestBase;
import com.vajra.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;

	// Call the constructor of the parent class.
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
	}

	@Test
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "VAJRA MART");
	}

	@Test
	public void enterLoginPage() throws InterruptedException {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
