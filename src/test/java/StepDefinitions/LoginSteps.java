package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page ");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enter uname and pass");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("user click on login btn");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user navigated to home page ");
	}

}
