package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class GoogleSearchTest {

	@Managed
	WebDriver driver;

	@Test
	public void googleSearch() {

		driver.get("https://www.google.com");
		driver.findElement(By.name("p")).sendKeys("serenity  bdd ");
	}

}
