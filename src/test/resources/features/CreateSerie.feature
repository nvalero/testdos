Feature: Login to GDM Headway
Background: Login to GDM Headway

  @Regression @CreateSerie
  @1077
  Scenario: [FE] Updates Series - Cycle Data (Location - Environment - Cycle Year) - "New Series" drawer
    Given it logins into headway
    And it pressed the Create Series button
    And the "company" drop-down is displayed
    And it displays the cross button
    And it displays title "Create New Series"
    And the "year" drop-down is displayed
    And the description field is displayed
    And the "trait" drop-down is displayed
    And the "breeding" drop-down is displayed
    #And a grey separator line is displayed
    And the "cycle" drop-down is displayed
    And the "location" drop-down is displayed
    And the "environment" drop-down is displayed
    And the "cycleyear" drop-down is displayed
    And a notification box is displayed
    And a notification box contains "Make sure the information is correct"
    And a notification box contains "An automatic series name will be generated based on this information."
    And the submit button is displayed

  @Regression @CreateSerie
  # HW-1078
  Scenario: New series form Layout - Test drop-down field Company
    Given it logins into headway
    And it pressed the Create Series button
    And the "company" drop-down is displayed
    And the "company" drop-down displays "GDM ARGENTINA,GDM BRAZIL,GDM CHINA,GDM EU,GDM USA"

  @Regression @CreateSerie
  # HW-1079
  Scenario: New series form Layout - Test drop-down field Company
    Given it logins into headway
    And it pressed the Create Series button
    And the "year" drop-down is displayed
    And the "year" drop-down displays "2023, 2024"

  @Regression @CreateSerie
  # HW-1468
  Scenario: Confirmation Window component - Confirmation Window components Test
    Given it logins into headway
    And it pressed the Create Series button
    And it completed all fields with the correct data
    #Then it displays the Confirmation Window of Success
    And it displays the cross button
    And it displays the Success logo
    And it displays title "The Series was successfully Created"
    And it displays the long title Series Created
    #And it displays the Sucess image
    And it displays the button Go to Series Manager
    And it displays the button Add Parents List
