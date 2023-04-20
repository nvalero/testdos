import {
  Given,
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

Then("the Login Screen is shown with the welcome message {string}", (welcomeMessage) => {
  loginPage.elements.welcomeMessage().should("have.text", welcomeMessage)
});

Then("the Microsoft log in pop-up is shown", () => {
  cy.wait(3000)
  loginPage.submitMicrosoftLoginPopup()
});
