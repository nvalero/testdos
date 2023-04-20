class headwayHomePage {
  elements = {
    welcomeMessage:() => cy.get("h1._title_kojyg_160"),
    loginButton:() => cy.get("button._primary_10a2v_160._loginbutton_ybv26_364"),
    microsoftLoginPopupMessage:() => cy.get('div[role="heading"][data-bind="text: title"]'),
    usernameInput: () => cy.get('#i0116'),
    nextButton:() => cy.get('#idSIButton9'),
    errorMessage:() => cy.get('#usernameError'),
  };

  clickLoginButton() {
    this.elements.loginButton().click();
  }

  microsoftLoginPopup() {  
    //Checking the microsoft window pop-up
    cy.on('window:alert', (microsoftLoginPopupMessage) => {
      //Assertion
      expect(microsoftLoginPopupMessage).to.contains('Sign in');
    })
  }
/**
  submitMicrosoftLoginPopup(username) {
    cy.on('window:alert', () => {
      expect(microsoftLoginPopupMessage).to.contains('Sign in');
      this.elements.usernameInput().type(username)
      this.elements.nextButton().click()
    })
  }
  */

}

module.exports = new headwayHomePage();
