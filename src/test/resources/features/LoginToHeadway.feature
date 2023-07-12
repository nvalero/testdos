Feature: Login to GDM Headway
 @Regression @EnterToLogin
 Scenario Outline: Login - Login screenXX

    Given paso tal
      | service   |
      | <service> |

    Examples:
      | code | service | user_data             |
      | 200  | GATEWAY | create_user_data.json |

  @Regression @Login
  # HW-548
  Scenario: Login - Login screen

    Given a web browser is at headway login page with a registered user
    Then the Login Screen is shown with the welcome message "Welcome to Headway"

  @Regression @Login
  # HW-1532
  Scenario: Login - Microsoft log in pop-up

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    Then the Microsoft log in pop-up is shown

  @Regression @Login
  # HW-1533
  Scenario: Login - Log in error for invalid user

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    And the Microsoft log in pop-up is shown
    And I submit the login form with an invalid email "invalid-email@gdmseeds.com"
    And it presses Next
    Then an error message for login is displayed in the Microsoft log in pop-up "Este nombre de usuario puede ser incorrecto. Asegúrese de que lo ha escrito correctamente. De lo contrario, póngase en contacto con el administrador."
  #"This username may be incorrect. Make sure you typed it correctly. Otherwise, contact your admin."

  @Regression @Login
  # HW-1535
  Scenario: Login - Microsoft log in pop-up

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    And the Microsoft log in pop-up is shown
    And it has entered a valid email
    And it presses Next
    Then the Microsoft log in pop-up switches to allow entering the password

  @Regression @Login
  # HW-1536
  Scenario: Login - Log in error for invalid password

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    And the Microsoft log in pop-up is shown
    And it has entered a valid email
    And it presses Next
    And the Microsoft log in pop-up switches to allow entering the password
    And I submit the login form with an invalid password "xxxx"
    And it presses Sign in
    Then an error message for password is displayed in the Microsoft log in pop-up "Su cuenta o contraseña no es correcta. Si no recuerda su contraseña, puede restablecerla ahora."

  @Login @LoginByTextMessage
  # HW-1538
  Scenario: Login - Login screen - Identity validation - Text message

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    And the Microsoft log in pop-up is shown
    And it has entered a valid email
    And it presses Next
    And the Microsoft log in pop-up switches to allow entering the password
    And it has entered a valid password
    And it presses Sign in
    Then it presses receive text message

  @Login @LoginByAuthenticator
  # HW-1539
  Scenario: Login - Login screen - Successful login - Authenticator

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    And the Microsoft log in pop-up is shown
    And it has entered a valid email
    And it presses Next
    And the Microsoft log in pop-up switches to allow entering the password
    And it has entered a valid password
    And it presses Sign in
    And it has presses Verify
    Then the Series Manager Page is displayed

  @Login @LoginByTextMessage
  # HW-1539
  Scenario: Login - Login screen - Successful login - Text message

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    And the Microsoft log in pop-up is shown
    And it has entered a valid email
    And it presses Next
    And the Microsoft log in pop-up switches to allow entering the password
    And it has entered a valid password
    And it presses Sign in
    And it presses receive text message
    And it has presses Continue
    And it has presses Verify
    Then the Series Manager Page is displayed