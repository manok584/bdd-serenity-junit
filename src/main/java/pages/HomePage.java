package pages;

public class HomePage {
	
	OrangeHomePage homepage;
	
	
	@Step("This step verifies page title")
	public void verifyPageTitle() {
		
		homepage.verifyPageTitle();
		
	}

	
	@Step("This step enters login credentials")
	public void enterLoginCredentials() {
		
		homepage.enterLoginCredentials();
		
	}
	
	@Step("This step verifies dashboard page")
	public void verifyDashboardPage() {
		
		homepage.verifyDashboardPage();
		
	}
}
