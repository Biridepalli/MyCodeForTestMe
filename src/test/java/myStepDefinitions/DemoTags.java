package myStepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DemoTags {
	
	@Given("Application is up and running")
	public void application_is_up_and_running() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Running application");
	}

	@Then("User able to login")
	public void user_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user Login");
	}

	@Given("User searching the product with code")
	public void user_searching_the_product_with_code() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Product search");
	}

	@Then("User able to add it to cart")
	public void user_able_to_add_it_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Add to cart");
	}

	@Given("User able to see items count in cart")
	public void user_able_to_see_items_count_in_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Items display");
	}

	@Then("User decides to remove an item")
	public void user_decides_to_remove_an_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Remove an item");
	}

	@Given("User has active order")
	public void user_has_active_order() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Active order");
	}

	@Then("User verifies the status of the order")
	public void user_verifies_the_status_of_the_order() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Verifies the status");
	}

}
