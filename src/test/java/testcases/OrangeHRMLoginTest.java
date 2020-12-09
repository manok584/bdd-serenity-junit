package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;



@RunWith(SerenityRunner.class)
public class OrangeHRMLoginTest extends PageObject {

	@Managed
	WebDriver driver;
	
	@Steps
	HomePage homepage;
	
	@Test
	public void login() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		homepage.verifyPageTitle();
		homepage.enterLoginCredentials();
		homepage.verifyPageTitle();
		
	}

}
