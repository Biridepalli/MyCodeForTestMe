package myStepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TestMeApp {
	
	WebDriver driver;
	@Given("testme is launched by user")
	public void testme_is_launched_by_user() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("user clicks on SignIn link")
	public void user_clicks_on_SignIn_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@Then("user provides the valid username {string}")
	public void user_provides_the_valid_username(String uname) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys(uname);
	}

	@Then("user provides the valid password {string}")
	public void user_provides_the_valid_password(String pass) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys(pass);
	}

	@Then("user clicks for submission of credentials")
	public void user_clicks_for_submission_of_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("Login")).click();
		
		driver.close();
		
	}

	@Then("verifies the login status for the account")
	public void verifies_the_login_status_for_the_account() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
//		String act = driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a/i")).getText();
//		String exp = " SignOut";
//		Assert.assertEquals(exp, act);
	}
}