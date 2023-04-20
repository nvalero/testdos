class headwayHomePage {
  elements = {
    welcomeMessage:() => cy.get("h1._title_kojyg_160"),
    loginButton:() => cy.get("button._primary_10a2v_160._loginbutton_ybv26_364"),
    microsoftLoginPopupMessage:() => cy.get('div[role="heading"][data-bind="text: title"]'),
  };

  clickLoginButton() {
    this.elements.loginButton().click();
  }

  submitMicrosoftLoginPopup() {
    
    //Checking the microsoft window pop-up
    cy.on('window:alert',(microsoftLoginPopupMessage)=>{
    //Assertion
    expect(microsoftLoginPopupMessage).to.contains('Sign in');
    })

  }
}

module.exports = new headwayHomePage();
