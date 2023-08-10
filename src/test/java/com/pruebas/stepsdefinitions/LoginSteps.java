package com.headway.stepsdefinitions;


import com.headway.pageobjects.ConnectionPage;
import com.headway.pageobjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {

    @Steps
    HomePage stepHomePage;
    
    ConnectionPage connectionPage;

    @Given("open google page")
    public void openApplication() {
        connectionPage.open();
    }

    @Then("the Login Screen is shown with the welcome message {string}")
    public void validateLoginPage(String title) {
        connectionPage.validate(title);
    }

}