package com.testing.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountManagementSteps {
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {

    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String Firstname, String Lastname, String Email, String Password, String ConfirmPassword) {

    }

    @And("I click on log in")
    public void iClickOnLogIn() {

    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {

    }
}
