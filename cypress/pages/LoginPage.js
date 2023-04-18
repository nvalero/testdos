class homeSaucePage {
  elements = {
    usernameInput: () => cy.get("#spree_user_email"),
    passwordInput: () => cy.get("#spree_user_password"),
    errorMessage: () => cy.get(".field-error-message"),
    welcomeMessage:() => cy.get("h1._title_kojyg_160"),
    loginBtn:() => cy.get("button._primary_10a2v_160._loginbutton_ybv26_364"),
    //Mapeo de campo custom
    //errorMessage: () => cy.get('h3[data-test="error"]'),
  };

  typeUsername(username) { 
    this.elements.usernameInput().type(username);
  }

  typePassword(password) {
    this.elements.passwordInput().type(password);
  }

  clickLoginButton() {
    this.elements.loginBtn().click();
  }

  submitLogin(username,password){
    this.elements.usernameInput().type(username);
    this.elements.passwordInput().type(password);
    this.elements.loginBtn().click();
  }
}

module.exports = new homeSaucePage();
