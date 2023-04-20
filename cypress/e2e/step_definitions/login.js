import {
  Given,
  And,
  When,
  Then,
} from "@badeball/cypress-cucumber-preprocessor";
const loginPage = require("../../pages/LoginPage");


Given("a web browser is at headway login page with a registered user", () => {
  cy.visit("/");
});

When("it clicks on the Log In button", () => {
  loginPage.clickLoginButton()
});

And("I submit the login form with an invalid email {string}", (invalidEmail) => {
  loginPage.submitMicrosoftLoginPopup(invalidEmail)
});

Then("the Login Screen is shown with the welcome message {string}", (welcomeMessage) => {
  loginPage.elements.welcomeMessage().should("have.text", welcomeMessage)
});

Then("the Microsoft log in pop-up is shown", () => {
  cy.wait(3000)
  loginPage.microsoftLoginPopup()
});

Then("an error message is displayed in the Microsoft log in pop-up {string}", (errorMessage) => {
  cy.wait(3000)
  loginPage.elements.errorMessage.should("have.text", errorMessage)
});
