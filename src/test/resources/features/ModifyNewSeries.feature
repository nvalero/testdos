
Feature: [Epic HW-156] Modify New Series

  As Nursery Manager, I want to be able to modify a New Breeding Series to change the name and type if necessary according to business decision.

 @1567 @ModifyNewSeries
  Scenario: [HW-1567] Updates Series - Edit Series drawer
    Given it logins into headway
    When it presses the Edit icon
    Then edit Series drawer is displayed
    And close icon is displayed
    And the name of the series is displayed
    And the Company drop-down is displayed
    And the Year drop-down is displayed
    And the Description field is displayed
    And the Trait dropdown is displayed
    And the Breading Method dropdown is displayed
    And a grey separator line is displayed
    And the Cycle dropdown is displayed
    And the Location dropdown is displayed
    And the Environment dropdown is displayed
    And the Cycle Year dropdown is displayed
    And the message Make sure the information is correct is displayed
    Then the Create Series button is displayed

  @ModifyNewSeries
  Scenario: [HW-1568] Edit Series - Cross button in Edit Series confirmation window
    Given it logins into headway
    When it presses the Edit icon
    And edit Series drawer is displayed
    When it pushes the close icon button
    Then the Series Manager Page is displayed


  Scenario: [HW-1569] Edit Series - Drop-down field Company Test
    Given it logins into headway
    And it presses the Edit icon
    When it pushes the dropdown company field
    Then the platform displays the drop-down with the options GDM ARGENTINA, GDM BRAZIL, GDM CHINA, GDM EUROPE UNION, GDM UNITED STATES

  @ModifyNewSeries
  Scenario: [HW-1570] Edit Series - Filter field Company Test
    Given it logins into headway
    And it presses the Edit icon
    And edit Series drawer is displayed
    Then it types INA in the field Company
    And the platform performs a sequential search and displays the following options in the drop-down list: GDM ARGENTINA, GDM CHINA

  Scenario: [HW-1571] Edit Series - Filter field Company No-Options Test
    Given it logins into headway
    And it presses the Edit icon
    And edit Series drawer is displayed
    When it types ZZ in the field Company
    Then the platform performs a sequential search and displays the message No Options in the dropdown

  Scenario: [HW-1572] Edit Series - Drop-down field Year Test
    Given it logins into headway
    And it presses the Edit icon
    And edit Series drawer is displayed
    When it pushes the dropdown field Year
    Then the platform displays a dropdown with the actual year and the next

  Scenario: [HW-1573] Edit Series - Filter field Year Test
    Given it logins into headway
    And it presses the Edit icon
    And edit Series drawer is displayed
    When it types 0 in the field Year
    Then the platform displays a dropdown with the actual year and the next

  Scenario: [HW-1574] Edit Series - Filter field Year No-Options Test
    Given it logins into headway
    And it presses the Edit icon
    And edit Series drawer is displayed
    When it types AA in the field Year
    Then the platform performs a sequential search and displays the message No Options in the dropdown for year field
