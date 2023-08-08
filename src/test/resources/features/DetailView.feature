@detailViewFeature

Feature: Detail View Serie

  Background: Login to GDM Headway
    Given it logins into headway
    Then the Series Manager Page is displayed
    When it pressed the Create Series button
    And it completed all fields with the correct data and create serie "AUTOMATIONDETAILTEST"
    Then it presses the button Go to Series Manager

  @HW-1997
    Scenario: [FE] Series detail view
      Given it selects serie "AUTOMATIONDETAILTEST"
      Then the Serie Detail Page is displayed
      And < Back to Series Manager option is displayed
      And a horizontal tabular navigation menu is displayed
      And a Series detail box is placed below the horizontal navigation
      And within that box, a Series Status is displayed using the Stepper component
      And within an Overflow menu component available Series actions are accessible Delete Series, Edit Series and Disable

    @HW-1998
    Scenario:[FE] Series detail view - "< Back to Series Manager" option
      Given it selects serie "AUTOMATIONDETAILTEST"
      Then the Serie Detail Page is displayed
      When it presses over < Back to Series Manager option
      Then the Series Manager Page is displayed

    @HW-1999
    Scenario: [FE] Series detail view - Series actions
      Given it selects serie "AUTOMATIONDETAILTEST"
      And the Serie Detail Page is displayed
      Then within an Overflow menu component available Series actions are accessible Delete Series, Edit Series and Disable

    @HW-2005
    Scenario: [FE] Series detail view - Delete option
      Given it selects serie "AUTOMATIONDETAILTEST"
      Then the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      When it presses "Delete series" option
      And the Delete Serie Page is displayed
      And the X icon is displayed
      And the 'No, go back' button is displayed
      And the 'Yes, delete' button is displayed

    @HW-2006
    Scenario: [FE] Series detail view - Delete option - Confirmation window - X icon
      Given it selects serie "AUTOMATIONDETAILTEST"
      Then the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      When it presses "Delete series" option
      And the Delete Serie Page is displayed
      Then it pressed the close button
      And the Series Manager Page is displayed

    @HW-2007
    Scenario: [FE] Series detail view - Delete option - Confirmation window - "No, go back" button
      Given it selects serie "AUTOMATIONDETAILTEST"
      Then the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      When it presses "Delete series" option
      And the Delete Serie Page is displayed
      Then it pressed the back button
      And the Series Manager Page is displayed

    @HW-2008
    Scenario: [FE] Series detail view - Delete option - Confirmation window - "Yes, delete" button
      Given it selects serie "AUTOMATIONDETAILTEST"
      Then the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      When it presses "Delete series" option
      And the Delete Serie Page is displayed
      Then it pressed the accept button for delete
      And the Series Manager Page is displayed

    @HW-2009
    Scenario: [FE] Series detail view - Disable option
      Given it selects serie "AUTOMATIONDETAILTEST"
      And the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      And it presses "Disable series" option
      And the submit button is displayed
      And the cancel button is displayed
      Then the disable window is displayed

    @HW-2010
    Scenario: [FE] Series detail view - Disable option - X icon
      Given it selects serie "AUTOMATIONDETAILTEST"
      And the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      And it presses "Disable series" option
      And it presses the X icon on disable series window
      Then the disable window is not displayed

    @HW-2011
    Scenario: [FE] Series detail view - Disable option - "No, cancel" button
      Given it selects serie "AUTOMATIONDETAILTEST"
      And the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      And it presses "Disable series" option
      And it presses the cancel button
      Then the disable window is not displayed

    @HW-2012
    Scenario: [FE] Series detail view - Disable option - "Yes, enable" button
      Given it selects serie "AUTOMATIONDETAILTEST"
      And the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      And it presses "Disable series" option
      And it presses the submit button in enable modal
      Then the disable window is not displayed


    @HW-2013
    Scenario: [FE] Series detail view - Enable option
      Given it sets serie "AUTOMATIONDETAILTEST" to status "DISABLED"
      And it selects serie "AUTOMATIONDETAILTEST"
      And the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      And it presses "Enable" option
      And the submit button is displayed
      And the cancel button is displayed
      Then the disable window is displayed

    @HW-2014
    Scenario: [FE] Series detail view - Enable option - X icon
      Given it sets serie "AUTOMATIONDETAILTEST" to status "DISABLED"
      And it selects serie "AUTOMATIONDETAILTEST"
      And the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      And it presses "Enable" option
      And it presses the X icon on disable series window
      Then the disable window is not displayed

    @HW-2015
    Scenario: [FE] Series detail view - Enable option - "No, cancel" button
      Given it sets serie "AUTOMATIONDETAILTEST" to status "DISABLED"
      And it selects serie "AUTOMATIONDETAILTEST"
      And the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      And it presses "Enable" option
      And it presses the cancel button
      Then the disable window is not displayed

    @HW-2016
    Scenario: [FE] Series detail view - Enable option - "Yes, enable" button
      Given it sets serie "AUTOMATIONDETAILTEST" to status "DISABLED"
      And it selects serie "AUTOMATIONDETAILTEST"
      And the Serie Detail Page is displayed
      And it has pressed over 3 dots icon in the series row
      And it presses "Enable" option
      And it presses the submit button in enable modal
      Then the disable window is not displayed





