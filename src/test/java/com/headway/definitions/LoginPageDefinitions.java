package com.headway.definitions;

import io.cucumber.datatable.DataTable;
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

    /*@BeforeAll
    String[] readJson() throws IOException, ParseException {
        JSONParser jsonparser=new JSONParser();
        FileReader reader=new FileReader(".\\resources\\data\\testdata.json");
        Object obj=jsonparser.parse(reader);
        JSONObject userloginsJsonobj=(JSONObject)obj;
        JSONArray userloginsArray=(JSONArray)userloginsJsonobj.get("userlogins");
        String arr[]=new String[userloginsArray.size()];
        for (int i=0; i<userloginsArray.size();i++)
        {
            JSONObject users=(JSONObject) userloginsArray.get(i);
            String user=(String)users.get("username");
            String pwd=(String)users.get("password");
            arr[i]=user+"," +pwd ;
        }
        return null;
    }
*/
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
}