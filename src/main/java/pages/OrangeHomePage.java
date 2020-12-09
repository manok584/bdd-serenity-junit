package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;

public class OrangeHomePage extends PageObject {

	public void verifyPageTitle() {
		
		String pageTitle = getDriver().getTitle();
		Assert.assertTrue(pageTitle.contentEquals("Orange HRM"));
	}

	public void enterLoginCredentials() {
	
			
		typeInto(getDriver().findElement(By.id("txtUsername")), "Admin");
		WebElementFacade password = $(By.id("txtPassword"));
		password.typeAndEnter("admin123");
		waitABit(4000);
		
	}

	public void verifyDashboardPage() {
		
		String pageTitle = getDriver().getTitle();
		Assert.assertTrue(pageTitle.contentEquals("Dashboard"));
		
	}
	
	
	

}
