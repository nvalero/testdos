
import {
  Given,
  When,
  And,
  Then
} from "@badeball/cypress-cucumber-preprocessor";
import { BrowserCacheLocation } from '@azure/msal-browser';
import { msalLogin } from 'cypress-msal-login';

const loginPage = require("../../pages/LoginPage");
const token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyIsImtpZCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyJ9.eyJhdWQiOiJhcGk6Ly80MTBjZjAzMi01NzY0LTRhMTUtYjExMi1iZTRkMDA2ZTgzNDUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC80MzdlYjYzYS1lMTQxLTQ1ZTYtYTMyOC02MDM0ZjQwMzZmZDUvIiwiaWF0IjoxNjc2MDQ2MTgyLCJuYmYiOjE2NzYwNDYxODIsImV4cCI6MTY3NjA1MDczOSwiYWNyIjoiMSIsImFpbyI6IkFWUUFxLzhUQUFBQXROT0FxV3RXQkw2YitENm5aeGZFdFoxSFN6cmh5WS85Y25VQ1ZOdGF6WFJaSXAzR3k5UkhOdEV3eXR0ZHF1cHBKbTVHZjFKR01rSG9qR2dhUkxkNDZvVWZ0Q3BYQ0Z1SkRZRHBvOUVQZnhJPSIsImFtciI6WyJwd2QiLCJtZmEiXSwiYXBwaWQiOiI0MTBjZjAzMi01NzY0LTRhMTUtYjExMi1iZTRkMDA2ZTgzNDUiLCJhcHBpZGFjciI6IjAiLCJmYW1pbHlfbmFtZSI6IkxhcmEgRXNwaXRpYSIsImdpdmVuX25hbWUiOiJKb3JnZSIsImlwYWRkciI6IjE4Ni45OC43NS4yNTAiLCJuYW1lIjoiSm9yZ2UgTGFyYSBFc3BpdGlhIiwib2lkIjoiZGJkNDBjMjctNjkwZC00NmJkLWE1MTQtMDM5NzVlZDZlNmM3Iiwib25wcmVtX3NpZCI6IlMtMS01LTIxLTEyODY4OTMwNTQtMzM5MDA4OTIyMi00MDM4MTE4ODIyLTc1MzUxNSIsInJoIjoiMC5BUThBT3JaLVEwSGg1a1dqS0dBMDlBTnYxVEx3REVGa1Z4VktzUkstVFFCdWcwVVBBSXcuIiwicm9sZXMiOlsicmVhZGVycyJdLCJzY3AiOiJSb2xlcy5SZWFkIiwic3ViIjoiRmxMRWVvMDN2ZldhVFpudER2bndwd2VpLWFTeEo5VkdsMl9uMEpVZzNxbyIsInRpZCI6IjQzN2ViNjNhLWUxNDEtNDVlNi1hMzI4LTYwMzRmNDAzNmZkNSIsInVuaXF1ZV9uYW1lIjoiZXh0LmpsYXJhQGdkbXNlZWRzLmNvbSIsInVwbiI6ImV4dC5qbGFyYUBnZG1zZWVkcy5jb20iLCJ1dGkiOiJTOS1NdlotVi1FcXhybm9vMDg0ckFBIiwidmVyIjoiMS4wIn0.DmQo54GT2aVYuOt9bdJiV7uiVWnKb_XTHPnQJjZP3Xnqn4yE2aRvgTK1QycqWfAPo0tdw7ok6UBRYp9R2bZZPfvoyfsILpdwplxgUWUphdD8BhmRKmJDyRZXPlOSZsEAFMrx8FrWlKTrWo52sbISK5pLu9IlmGoRgcYkZrQ3nNKddULGOqJb3-yfw_NWWK-MKkBlDFBbbQ6WRbOtldiHLXspbmq4NWSuBXh5tqYdUZwnmMwAH229NWbITignmNRq5g4p-Tm0JVSzt7FPTUs6_AqhVBfif-3B8cFIkEqTsHKDmGjxVkVFq7VCvyTXQ-pf48GlLNcbbAMNDPMx6jcGKg";


Given("a web browser is at headway login page with a registered user", () => {
  cy.visit("https://qa.headway.gdmseeds.com", { headers: {
    'user-agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36',
  
  }});

});

When("it clicks on the Log In button", () => {
  loginPage.clickLoginButton()
});

Then("main page Series Manager shows up", () => {
  loginPage.mainPageShowsUp()
});

Then("the Login Screen is shown with the welcome message {string}", (welcomeMessage) => {
  loginPage.elements.welcomeMessage().should("have.text", welcomeMessage)
});