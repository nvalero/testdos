Feature: Login to GDM Headway

  @EnterToLogin
 Scenario Outline: Login - Login screenXX

    Given paso tal <service>

    Examples:
      | code | service | user_data             |
      | 200  | GATEWAY | create_user_data.json |

  @EnterToLogin
  # HW-548
  Scenario: Login - Login screen

    Given a web browser is at headway login page with a registered user
    Then the Login Screen is shown with the welcome message "Welcome to Headway"

  @EnterToLogin
  # HW-1532
  Scenario: Login - Microsoft log in pop-up

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    Then the Microsoft log in pop-up is shown

  @EnterToLogin
  # HW-1533
  Scenario: Login - Log in error for invalid user

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    Then the Microsoft log in pop-up is shown
    When I submit the login form with an invalid email "invalid-email@gdmseeds.com"
    Then an error message is displayed in the Microsoft log in pop-up "This username may be incorrect. Make sure you typed it correctly. Otherwise, contact your admin."

  @EnterToLogin
  # HW-1535
  Scenario: Login - Microsoft log in pop-up

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    Then the Microsoft log in pop-up is shown
    And it has entered a valid email
    And it presses Next
    Then the Microsoft log in pop-up switches to allow entering the password

  @EnterToLogin
  # HW-1536
  Scenario: Login - Log in error for invalid password

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    Then the Microsoft log in pop-up is shown
    And it has entered a valid email
    And it presses Next
    Then the Microsoft log in pop-up switches to allow entering the password
    And I submit the login form with an invalid password "xxxx"
    When it presses Sign in
    Then an error message for password is displayed in the Microsoft log in pop-up "Su cuenta o contraseña no es correcta. Si no recuerda su contraseña, puede restablecerla ahora."

  @EnterToLogin
  # HW-1538
  Scenario: Login - Login screen - Identity validation

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    Then the Microsoft log in pop-up is shown
    And it has entered a valid email
    And it presses Next
    Then the Microsoft log in pop-up switches to allow entering the password
    And it has entered a valid password
    When it presses Sign in
    #hen the Microsoft log in pop-up switches to validate the identity (text or call)

  @EnterToLogin
  # HW-1539
  Scenario: Login - Login screen - Successful login

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    Then the Microsoft log in pop-up is shown
    And it has entered a valid email
    And it presses Next
    Then the Microsoft log in pop-up switches to allow entering the password
    And it has entered a valid password
    When it presses Sign in
    When it has presses Verify
    And the Series Manager Page is displayed

