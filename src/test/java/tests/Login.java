package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import model.CommonMethods;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.HomePage;

public class Login {

	Base base = new Base();
	WebDriver driver = base.setup();
	CommonMethods commonMethods = new CommonMethods(driver);
	HomePage homePage =  new HomePage(driver);
	Timeout time = new Timeout(driver);
	//Take_Screenshot screenshot = new Take_Screenshot(driver);

	@BeforeClass
	public void start() {
		driver.get(homePage.homePageUrl());
		driver.manage().window().maximize();
	}
	@Test
	public void loginTest() throws IOException {
		assertEquals(commonMethods.getTitle(), Locators.pageTitle);
		time.timeOut();
		System.out.println(homePage.title());
		//screenshot.screenshot("HomePage");
		commonMethods.shadowDomPopUp(Locators.notifiPopUpHost, Locators.notInterestedButtonClick);
		time.timeOut();
		///screenshot.screenshot("HomePage");
		commonMethods.clickOnButton(Locators.loginclick);
		time.timeOut();
		///screenshot.screenshot("Login page");
		commonMethods.sendText(Locators.enterUserName, "01828695933");
		commonMethods.sendText(Locators.enterPassword, "");
		commonMethods.clickOnButton(Locators.loginButtonClick);
		time.timeOut();
		base.tearDown();
	}

}
