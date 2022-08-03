package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
	}

	@When("enters username and password")
	public void enters_username_and_password() {
	    System.out.println("enters username and password");
	}

	@When("clicks login button")
	public void clicks_login_button() {
	    System.out.println("clicks login button");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	   System.out.println("user is navigated to the homepage");
	}

}
