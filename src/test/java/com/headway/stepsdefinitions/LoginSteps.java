package com.headway.stepsdefinitions;

import com.headway.pageobjects.ConnectionPage;
import com.headway.pageobjects.LoginHeadway;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {

    @Steps
    ConnectionPage connectionPage;

    @Steps
    LoginHeadway stepFirstLogin;

    @Given("a web browser is at headway login page with a registered user")
    public void openApplication() {
        connectionPage.open();
    }

    @Then("the Login Screen is shown with the welcome message {string}")
    public void validateLoginPage(String title) {
        connectionPage.validate(title);
    }

    @Then("I submit the login form with an invalid email {string}")
    public void entersInvalidEmail(String email) {
        connectionPage.enterInvalidEmail(email);
    }

    @Then("an error message for password is displayed in the Microsoft log in pop-up {string}")
    public void validatePasswordMessage(String message) {
        connectionPage.validatePasswordMessage(message);
    }

    @Then("an error message for login is displayed in the Microsoft log in pop-up {string}")
    public void validateEmailMessage(String message) {
        connectionPage.validateEmailMessage(message);
    }

    @And("User connects through Microsoft")
    public void connect() {
        connectionPage.connect();
    }

    @When("it clicks on the Log In button")
    public void clickLogin() {
        stepFirstLogin.clickLogin();
    }

    @When("the Microsoft log in pop-up is shown")
    public void validatesMicrosoftPopOpens() {
        connectionPage.validatesMicrosoftPopOpens();
    }

    @And("it has entered a valid email")
    public void enterValidEmail() {
        connectionPage.enterValidEmail();
    }

    @And("it presses Next")
    public void pressesNext() {
        connectionPage.pressesNext();
    }

    @And("the Microsoft log in pop-up switches to allow entering the password")
    public void validatesMicrosoftPassword() {
        connectionPage.validatesMicrosoftPasswordIsShown();
    }

    @And("it has entered a valid password")
    public void entersPassword() {
        connectionPage.enterValidPassword();
    }

    @Then("I submit the login form with an invalid password {string}")
    public void entersInvalidPassword(String password) {
        connectionPage.enterInvalidPassword(password);
    }

    @And("it presses Sign in")
    public void pressesSignIn() {
        connectionPage.pressesSignIn();
    }

    @And("it presses receive text message")
    public void pressesReceiveTextMessage() {
        connectionPage.pressesReceiveTextMessage();
    }

    @And("it has presses Verify")
    public void pressesKeepSessionButton() {
        connectionPage.pressesKeepSessionButton();
    }

    @Given("paso tal")
    public void pasoTal(DataTable dataTable) {
        connectionPage.open();
    }

    @Given("it has presses Continue")
    public void pressesContinueButton() {
        connectionPage.pressesContinueButton();
    }
}