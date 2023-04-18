class headwayHomePage {
  elements = {
    welcomeMessage:() => cy.get("h1._title_kojyg_160"),
    loginBtn:() => cy.get("button._primary_10a2v_160._loginbutton_ybv26_364"),
  };

  clickLoginButton() {
    this.elements.loginBtn().click();
  }

  submitLogin(username,password){
    this.elements.loginBtn().click();
  }
}

module.exports = new headwayHomePage();
