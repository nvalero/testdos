Feature: Login Headway Page [HW-148]

    As the owner of the Headway product I want only users with valid and active login and password to have access to the system to prevent unauthorized access.
        
    Scenario: Login - Login screen [HW-548]
        Given a web browser is at headway login page with a registered user
        Then the Login Screen is shown with the welcome message "Welcome to Headway"
    
    Scenario: Login - Microsoft log in pop-up [HW-1532]
        Given a web browser is at headway login page with a registered user
        When it clicks on the Log In button
        Then the Microsoft log in pop-up is shown

    Scenario: Login - Log in error for invalid user [HW-1533]
        Given a web browser is at headway login page with a registered user
        When it clicks on the Log In button
        And I submit the login form with an invalid email "invalid-email@gdmseeds.com"
        Then an error message is displayed in the Microsoft log in pop-up "This username may be incorrect. Make sure you typed it correctly. Otherwise, contact your admin."
