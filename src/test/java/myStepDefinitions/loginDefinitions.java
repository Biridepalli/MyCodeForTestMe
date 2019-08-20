package myStepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class loginDefinitions {
	
	@Given("Application is launched")
	public void application_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for Application launching");
	}

	@When("User enters credentials")
	public void user_enters_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    System.out.println("Code for credentials entry");
	}

}


