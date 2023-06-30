Feature: Login to GDM Headway

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
  # HW-1535
  Scenario: Login - Microsoft log in pop-up

    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    Then the Microsoft log in pop-up is shown
    And it has entered a valid email
    And it presses Next
    Then the Microsoft log in pop-up switches to allow entering the password


    Given an user registered in Headway
    And it is on the https://qa.headway.gdmseeds.com/
    And it has pressed Log In
    And it has entered a valid email
    And it presses Next
    Then the Microsoft log in pop-up switches to allow entering the password


#  @ValidCredentials
#  Scenario: Login to GDM Headway
#
#    Given a web browser is at headway login page with a registered user
#    When User clicks on Login
#    And User connects through Microsoft
#    Then User can see Home page
