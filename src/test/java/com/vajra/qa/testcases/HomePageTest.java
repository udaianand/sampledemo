package com.vajra.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vajra.qa.base.TestBase;
import com.vajra.qa.pages.HomePage;
import com.vajra.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		intialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test
	public void registerEntry() {
		homePage.navigateRegistrationPage();

	}

	@AfterMethod
	public void tearDown() {

	}
}
