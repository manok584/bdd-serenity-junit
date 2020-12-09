package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class OrangeHRMLoginTest extends PageObject {

	@Managed
	WebDriver driver;
	
	@Test
	public void login() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		typeInto(driver.findElement(By.id("txtUsername")), "Admin");
		
		WebElementFacade password = $(By.id("txtPassword"));
//		password.type("admin123");
		password.typeAndEnter("admin123");
		waitABit(4000);
	

	}

}
