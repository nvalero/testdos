import { BrowserCacheLocation } from '@azure/msal-browser';
import { msalLogin } from 'cypress-msal-login';


const token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyIsImtpZCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyJ9.eyJhdWQiOiJhcGk6Ly80MTBjZjAzMi01NzY0LTRhMTUtYjExMi1iZTRkMDA2ZTgzNDUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC80MzdlYjYzYS1lMTQxLTQ1ZTYtYTMyOC02MDM0ZjQwMzZmZDUvIiwiaWF0IjoxNjc2MDQ2MTgyLCJuYmYiOjE2NzYwNDYxODIsImV4cCI6MTY3NjA1MDczOSwiYWNyIjoiMSIsImFpbyI6IkFWUUFxLzhUQUFBQXROT0FxV3RXQkw2YitENm5aeGZFdFoxSFN6cmh5WS85Y25VQ1ZOdGF6WFJaSXAzR3k5UkhOdEV3eXR0ZHF1cHBKbTVHZjFKR01rSG9qR2dhUkxkNDZvVWZ0Q3BYQ0Z1SkRZRHBvOUVQZnhJPSIsImFtciI6WyJwd2QiLCJtZmEiXSwiYXBwaWQiOiI0MTBjZjAzMi01NzY0LTRhMTUtYjExMi1iZTRkMDA2ZTgzNDUiLCJhcHBpZGFjciI6IjAiLCJmYW1pbHlfbmFtZSI6IkxhcmEgRXNwaXRpYSIsImdpdmVuX25hbWUiOiJKb3JnZSIsImlwYWRkciI6IjE4Ni45OC43NS4yNTAiLCJuYW1lIjoiSm9yZ2UgTGFyYSBFc3BpdGlhIiwib2lkIjoiZGJkNDBjMjctNjkwZC00NmJkLWE1MTQtMDM5NzVlZDZlNmM3Iiwib25wcmVtX3NpZCI6IlMtMS01LTIxLTEyODY4OTMwNTQtMzM5MDA4OTIyMi00MDM4MTE4ODIyLTc1MzUxNSIsInJoIjoiMC5BUThBT3JaLVEwSGg1a1dqS0dBMDlBTnYxVEx3REVGa1Z4VktzUkstVFFCdWcwVVBBSXcuIiwicm9sZXMiOlsicmVhZGVycyJdLCJzY3AiOiJSb2xlcy5SZWFkIiwic3ViIjoiRmxMRWVvMDN2ZldhVFpudER2bndwd2VpLWFTeEo5VkdsMl9uMEpVZzNxbyIsInRpZCI6IjQzN2ViNjNhLWUxNDEtNDVlNi1hMzI4LTYwMzRmNDAzNmZkNSIsInVuaXF1ZV9uYW1lIjoiZXh0LmpsYXJhQGdkbXNlZWRzLmNvbSIsInVwbiI6ImV4dC5qbGFyYUBnZG1zZWVkcy5jb20iLCJ1dGkiOiJTOS1NdlotVi1FcXhybm9vMDg0ckFBIiwidmVyIjoiMS4wIn0.DmQo54GT2aVYuOt9bdJiV7uiVWnKb_XTHPnQJjZP3Xnqn4yE2aRvgTK1QycqWfAPo0tdw7ok6UBRYp9R2bZZPfvoyfsILpdwplxgUWUphdD8BhmRKmJDyRZXPlOSZsEAFMrx8FrWlKTrWo52sbISK5pLu9IlmGoRgcYkZrQ3nNKddULGOqJb3-yfw_NWWK-MKkBlDFBbbQ6WRbOtldiHLXspbmq4NWSuBXh5tqYdUZwnmMwAH229NWbITignmNRq5g4p-Tm0JVSzt7FPTUs6_AqhVBfif-3B8cFIkEqTsHKDmGjxVkVFq7VCvyTXQ-pf48GlLNcbbAMNDPMx6jcGKg";


class headwayHomePage {
  elements = {
    welcomeMessage:() => cy.get("h1._title_kojyg_160"),
    loginButton:() => cy.get('button._loginbutton_125rr_365'),
  };

  clickLoginButton() {
/** 
    cy.msalLogin(
      {
        email: 'ext.hmartin@gdmseeds.com',
        password: 'MansaContrasena!'
      },
      {
        auth: {
        clientId: '410cf032-5764-4a15-b112-be4d006e8345',
        authority: 'https://login.microsoftonline.com/437eb63a-e141-45e6-a328-6034f4036fd5/oauth2/v2.0/authorize?client_id=410cf032-5764-4a15-b112-be4d006e8345&scope=openid%20offline_access%20api%3A%2F%2F410cf032-5764-4a15-b112-be4d006e8345%2FRoles.Read%20profile&redirect_uri=https%3A%2F%2Fqa.headway.gdmseeds.com%2Fauth&client-request-id=6aa95e35-1ccc-46bb-965e-844646751cfe&response_mode=fragment&response_type=code&x-client-SKU=msal.js.browser&x-client-VER=2.33.0&client_info=1&code_challenge=7kzi6ovH-j2yx496mdeK53TVri4av7WjxbiK4hlswc4&code_challenge_method=S256&nonce=e4572e86-20e8-47ae-a660-bf9787e7e08e&state=eyJpZCI6ImNiM2M1MTljLWNjYzItNGQ3YS04MDM4LTkwNGYzZDk2NzEyZSIsIm1ldGEiOnsiaW50ZXJhY3Rpb25UeXBlIjoicmVkaXJlY3QifX0%3D',
        },
        cache: {
          cacheLocation: BrowserCacheLocation.LocalStorage,
        },
      },
      ['openid', 'profile', 'user', 'offline_access'],
    )

    cy.request({
      method: 'POST',
      url: 'https://login.microsoftonline.com/437eb63a-e141-45e6-a328-6034f4036fd5/oauth2/v2.0/authorize?client_id=410cf032-5764-4a15-b112-be4d006e8345&scope=openid%20offline_access%20api%3A%2F%2F410cf032-5764-4a15-b112-be4d006e8345%2FRoles.Read%20profile&redirect_uri=https%3A%2F%2Fqa.headway.gdmseeds.com%2Fauth&client-request-id=9eec506e-ae5e-48d2-94ae-b3952b3d0ba5&response_mode=fragment&response_type=code&x-client-SKU=msal.js.browser&x-client-VER=2.33.0&client_info=1&code_challenge=f4nJd19Kk2qoXOVSetozpBgSh4PSlaudPLjJciRBgEM&code_challenge_method=S256&nonce=e082a65b-dbba-49f2-8a39-6625130574fa&state=eyJpZCI6IjYzNTg2Zjc0LWE4M2QtNDcyMi04MTMwLWZhMGIyYzJjOTQxZSIsIm1ldGEiOnsiaW50ZXJhY3Rpb25UeXBlIjoicmVkaXJlY3QifX0%3D',
      form: true,
      body: {
        username: 'ext.hmartin@gdmseeds.com',
        password: 'MansaContrasena!',
      },
    }).then((response) => {
      const accessToken = response.body.accessToken;
      const idToken = response.body.idToken;

      // Set the tokens as cookies or store them for future requests
      cy.session(() => {
        cy.setCookie('your-access-token-cookie-name', accessToken);
        cy.setCookie('your-id-token-cookie-name', idToken);
      })
    });
*/
    // Visit the application's protected page or continue with the test flow
    //cy.visit('https://qa.headway.gdmseeds.com/series');


    cy.wait(3000);

    cy.get('._primary_1lq89_160').should("have.text", 'Log In')

    cy.wait(3000);

    //cy.visit('https://qa.headway.gdmseeds.com/series')

    // click on login button
    cy.get('._primary_1lq89_160').click();

    cy.wait(3000);

    cy.get('#i0116').type("ext.hmartin@gdmseeds.com")

    cy.wait(3000);

    cy.get('input#idSIButton9').click();

    cy.wait(3000);

    cy.get('#i0118').type("M")
    cy.get('#i0118').type("a")
    cy.get('#i0118').type("n")
    cy.get('#i0118').type("s")
    cy.get('#i0118').type("a")
    cy.get('#i0118').type("C")
    cy.get('#i0118').type("o")
    cy.get('#i0118').type("n")
    cy.get('#i0118').type("t")
    cy.get('#i0118').type("r")
    cy.get('#i0118').type("a")
    cy.get('#i0118').type("s")
    cy.get('#i0118').type("e")
    cy.get('#i0118').type("n")
    cy.get('#i0118').type("a")
    cy.get('#i0118').type("!")

    cy.wait(3000); 

    cy.contains('input#idSIButton9', 'Sign in').click();

    cy.wait(2000); 

    cy.reload()
  }

  mainPageShowsUp(){
    cy.wait(3000);
    cy.get("span._xxl_1eq3q_226").should("be.visible").and("have.text", "Series Manager");
    cy.wait(3000);
  }


  
}

module.exports = new headwayHomePage();
