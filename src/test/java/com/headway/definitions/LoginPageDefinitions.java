package com.headway.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginPageDefinitions {

    @Steps
    com.headway.steps.StepConnectionPage stepConnectionPage;

    @Steps
    com.headway.steps.StepLoginHeadway stepFirstLogin;

    @Given("a web browser is at headway login page with a registered user")
    public void openApplication() {
        stepConnectionPage.open();
    }

    @Then("the Login Screen is shown with the welcome message {string}")
    public void validateLoginPage(String title) {
        stepConnectionPage.validate(title);
    }

    @Then("I submit the login form with an invalid email {string}")
    public void invalidateLoginPage(String email) {
        stepConnectionPage.enterInvalidEmail(email);
    }

    @Then("an error message is displayed in the Microsoft log in pop-up {string}")
    public void validateMessageIsDisplayed(String message) {
        stepConnectionPage.validateEmailMessage(message);
    }
    @And("User connects through Microsoft")
    public void connect() {
        stepConnectionPage.connect();
    }

    @When("it clicks on the Log In button")
    public void clickLogin() {
        stepFirstLogin.clickLogin();
    }

    @When("the Microsoft log in pop-up is shown")
    public void validatesMicrosoftPopOpens() {
        stepConnectionPage.validatesMicrosoftPopOpens();
    }

    @And("it has entered a valid email")
    public void enterValidEmail() {
        stepConnectionPage.enterValidEmail();
    }

    @And("it presses Next")
    public void pressesNext() {
        stepConnectionPage.pressesNext();
    }

    @And("the Microsoft log in pop-up switches to allow entering the password")
    public void validatesMicrosoftPassword() {
        stepConnectionPage.validatesMicrosoftPasswordIsShown();
    }

    @And("it has entered a valid password")
    public void entersPassword() {
        stepConnectionPage.enterValidPassword();
    }

    @And("it presses Sign in")
    public void pressesSignIn() {
        stepConnectionPage.pressesSignIn();
    }

    @And("it has presses Verify")
    public void pressesKeepSessionButton() {
        stepConnectionPage.pressesKeepSessionButton();
    }
}