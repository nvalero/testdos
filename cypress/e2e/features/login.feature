Feature: Login Headway Page [HW-148]

    As the owner of the Headway product I want only users with valid and active login and password to have access to the system to prevent unauthorized access.
        
    Scenario: Login - Login screen [HW-548]
        Given a web browser is at headway login page with a registered user
        Then the Login Screen is shown with the welcome message "Welcome to Headway"

    @only
    Scenario: Login - Microsoft log in pop-up [HW-1532]
        Given a web browser is at headway login page with a registered user
        When it clicks on the Log In button
        Then main page Series Manager shows up
