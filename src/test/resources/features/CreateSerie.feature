Feature: Login to GDM Headway

  @CreateSerie
  # HW-1468
  Scenario: Confirmation Window component - Confirmation Window components Test
#QUITARRRR agrupar los pasos del login en uno solo
    Given a web browser is at headway login page with a registered user
    When it clicks on the Log In button
    And the Microsoft log in pop-up is shown
    And it has entered a valid email
    And it presses Next
    And the Microsoft log in pop-up switches to allow entering the password
    And it has entered a valid password
    And it presses Sign in
    And it has presses Verify
    And the Series Manager Page is displayed
    And it pressed the Create Series button
    And it completed all fields with the correct data
    Then it displays the Confirmation Window of Sucess
    And it displays the cross button
    And it displays the Sucess logo
    And it displays title Series Created Message
    And it displays the long title Series Created
    #And it displays the Sucess image
    And it displays the button Go to Series Manager
    And it displays the button Add Parents List