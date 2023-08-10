package com.pruebas.stepsdefinitions;


import com.pruebas.pageobjects.ConnectionPage;
import com.pruebas.pageobjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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