package pages;

import org.openqa.selenium.WebDriver;

import model.CommonMethods;
import model.Locators;

public class HomePage {
	WebDriver driver;
	CommonMethods cm = new CommonMethods(driver);

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String homePageUrl() {
		return  Locators.homePageUrl;
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}
	public String title() {
		return cm.getTitle();
	}

}
