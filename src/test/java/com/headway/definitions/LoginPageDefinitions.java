package com.headway.definitions;

import com.google.inject.Inject;
import com.headway.pageobjects.ConnectionPage;
import com.headway.pageobjects.HomePage;
import com.headway.pageobjects.LoginHeadway;
import com.headway.util.Util;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginPageDefinitions {

    @Steps
    HomePage stepHomePage;

    @Steps
    LoginHeadway stepFirstLogin;

    ConnectionPage stepConnectionPage;

    @Inject
    LocatorsDictionary locatorsDictionary = new LocatorsDictionary();

    @Given("a web browser is at headway login page with a registered user")
    public void openApplication() {
        stepConnectionPage.open();
    }

    @Then("the Login Screen is shown with the welcome message {string}")
    public void validateLoginPage(String title) {
        stepConnectionPage.validate(title);
    }

    @Then("I submit the login form with an invalid email {string}")
    public void entersInvalidEmail(String email) {
        stepConnectionPage.enterInvalidEmail(email);
    }

    @Then("an error message for password is displayed in the Microsoft log in pop-up {string}")
    public void validatePasswordMessage(String message) {
        stepConnectionPage.validatePasswordMessage(message);
    }

    @Then("an error message for login is displayed in the Microsoft log in pop-up {string}")
    public void validateEmailMessage(String message) {
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
        stepConnectionPage.enterValidEmail(Util.getInstance().getCredential().getUser());
    }

    @And("it presses Next")
    public void pressesNext() {
        stepConnectionPage.pressesNext();
    }

    @And("the Microsoft log in pop-up switches to allow entering the password")
    public void validatesMicrosoftPasswordIsShown() {
        stepConnectionPage.validatesMicrosoftPasswordIsShown();
    }

    @And("it has entered a valid password")
    public void enterValidPassword() {
        stepConnectionPage.enterValidPassword(Util.getInstance().getCredential().getPassword());
    }

    @Then("I submit the login form with an invalid password {string}")
    public void entersInvalidPassword(String password) {
        stepConnectionPage.enterInvalidPassword(password);
    }

    @And("it presses Sign in")
    public void pressesSignIn() {
        stepConnectionPage.pressesSignIn();
    }

    @And("it presses receive text message")
    public void pressesReceiveTextMessage() {
        stepConnectionPage.pressesReceiveTextMessage();
    }

    @And("it has presses Verify")
    public void pressesKeepSessionButton() {
        stepConnectionPage.pressesKeepSessionButton();
    }

    @Given("paso tal")
    public void pasoTal(DataTable dataTable) {
        stepConnectionPage.open();
    }

    @Given("it has presses Continue")
    public void pressesContinueButton() {
        stepConnectionPage.pressesContinueButton();
    }

    @Given("it logins into headway by Authenticator")
    public void loginsIntoHeadwayByAuthenticator() {
        stepConnectionPage.open();
        stepFirstLogin.clickLogin();
        stepConnectionPage.validatesMicrosoftPopOpens();
        stepConnectionPage.enterValidEmail(Util.getInstance().getCredential().getUser());
        stepConnectionPage.pressesNext();
        stepConnectionPage.validatesMicrosoftPasswordIsShown();
        stepConnectionPage.enterValidPassword(Util.getInstance().getCredential().getPassword());
        stepConnectionPage.pressesSignIn();
        stepConnectionPage.pressesKeepSessionButton();
        stepHomePage.validate();
    }
    @Given("it logins into headway by text message")
    public void loginsIntoHeadwayByTextMessage() {
        stepConnectionPage.open();
        stepFirstLogin.clickLogin();
        stepConnectionPage.validatesMicrosoftPopOpens();
        stepConnectionPage.enterValidEmail(Util.getInstance().getCredential().getUser());
        stepConnectionPage.pressesNext();
        stepConnectionPage.validatesMicrosoftPasswordIsShown();
        stepConnectionPage.enterValidPassword(Util.getInstance().getCredential().getPassword());
        stepConnectionPage.pressesSignIn();
        stepConnectionPage.pressesReceiveTextMessage();
        stepConnectionPage.pressesContinueButton();
        stepConnectionPage.pressesKeepSessionButton();
        stepConnectionPage.pressesKeepSessionButton();
        stepHomePage.validate();
    }

    @Given("it logins into headway")
    public void loginsIntoHeadway() {
        stepConnectionPage.open();
        stepFirstLogin.clickLogin();
        stepConnectionPage.validatesMicrosoftPopOpens();
        stepConnectionPage.enterValidEmail(Util.getInstance().getCredential().getUser());
        stepConnectionPage.pressesNext();
        stepConnectionPage.validatesMicrosoftPasswordIsShown();
        stepConnectionPage.enterValidPassword(Util.getInstance().getCredential().getPassword());
        stepConnectionPage.pressesSignIn();
        try {
            stepConnectionPage.pressesKeepSessionButton();
            stepHomePage.validate();
        }catch (Exception e) {
            stepConnectionPage.pressesReceiveTextMessage();
            stepConnectionPage.pressesContinueButton();
            stepConnectionPage.pressesKeepSessionButton();
        }
    }
}