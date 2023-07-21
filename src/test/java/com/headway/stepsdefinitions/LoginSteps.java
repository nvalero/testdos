package com.headway.stepsdefinitions;

import com.google.inject.Inject;
import com.headway.pageobjects.ConnectionPage;
import com.headway.pageobjects.HomePage;
import com.headway.pageobjects.LocatorsDictionary;
import com.headway.pageobjects.LoginHeadway;
import com.headway.util.Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {

    @Steps
    HomePage stepHomePage;

    @Steps
    LoginHeadway loginHeadway;
    
    ConnectionPage connectionPage;

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
        loginHeadway.clickLogin();
    }

    @When("the Microsoft log in pop-up is shown")
    public void validatesMicrosoftPopOpens() {
        connectionPage.validatesMicrosoftPopOpens();
    }

    @And("it has entered a valid email")
    public void enterValidEmail() {
        connectionPage.enterValidEmail(Util.getInstance().getCredential().getUser());
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
        connectionPage.enterValidPassword(Util.getInstance().getCredential().getPassword());
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

    @Given("it has presses Continue")
    public void pressesContinueButton() {
        connectionPage.pressesContinueButton();
    }

    @Given("it logins into headway by Authenticator")
    public void loginsIntoHeadwayByAuthenticator() {
        connectionPage.open();
        loginHeadway.clickLogin();
        connectionPage.validatesMicrosoftPopOpens();
        connectionPage.enterValidEmail(Util.getInstance().getCredential().getUser());
        connectionPage.pressesNext();
        connectionPage.validatesMicrosoftPasswordIsShown();
        connectionPage.enterValidPassword(Util.getInstance().getCredential().getPassword());
        connectionPage.pressesSignIn();
        connectionPage.pressesKeepSessionButton();
        stepHomePage.validate();
    }
    @Given("it logins into headway by text message")
    public void loginsIntoHeadwayByTextMessage() {
        connectionPage.open();
        loginHeadway.clickLogin();
        connectionPage.validatesMicrosoftPopOpens();
        connectionPage.enterValidEmail(Util.getInstance().getCredential().getUser());
        connectionPage.pressesNext();
        connectionPage.validatesMicrosoftPasswordIsShown();
        connectionPage.enterValidPassword(Util.getInstance().getCredential().getPassword());
        connectionPage.pressesSignIn();
        connectionPage.pressesReceiveTextMessage();
        connectionPage.pressesContinueButton();
        connectionPage.pressesKeepSessionButton();
        connectionPage.pressesKeepSessionButton();
        stepHomePage.validate();
    }

    @Given("it logins into headway")
    public void loginsIntoHeadway() {
        connectionPage.open();
        loginHeadway.clickLogin();
        connectionPage.validatesMicrosoftPopOpens();
        connectionPage.enterValidEmail(Util.getInstance().getCredential().getUser());
        connectionPage.pressesNext();
        connectionPage.enterValidPassword(Util.getInstance().getCredential().getPassword());
        connectionPage.pressesSignIn();
        connectionPage.pressesKeepSessionButton();
    }

}