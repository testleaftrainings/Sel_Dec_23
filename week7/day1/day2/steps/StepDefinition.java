package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition {
	
	public ChromeDriver driver;

	@Given("Launch the Browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
	}

	@And("Load the url")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Enter the username as Demosalesmanager")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

	}

	@And("Enter the password as crmsfa")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("HomePage should be displayed")
	public void verifyHomePage() {

		String text = driver.findElement(By.tagName("h2")).getText();
		if (text.contains("Welcome")) {
			System.out.println("HomePage should be displayed");
		}
		else {
			System.out.println("HomePage is not displayed");
		}

	}


}
