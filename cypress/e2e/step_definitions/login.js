import {
  Given,
  When,
  Then,
} from "@badeball/cypress-cucumber-preprocessor";
const loginPage = require("../../pages/LoginPage");


Given("a web browser is at headway login page with a registered user", () => {
  cy.visit("/");
});

Then("the Login Screen is shown with the welcome message {string}", (welcomeMessage) => {
  loginPage.elements.welcomeMessage().should("have.text", welcomeMessage)
});
