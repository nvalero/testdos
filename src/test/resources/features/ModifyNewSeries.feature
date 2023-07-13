@loginFeature
Feature: [Epic HW-156] Modify New Series

  As Nursery Manager, I want to be able to modify a New Breeding Series to change the name and type if necessary according to business decision.

@1567
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

  Scenario: [HW-1568] Edit Series - Cross button in Edit Series confirmation window
    Given it logins into headway
    When it presses the Edit icon
    And edit Series drawer is displayed
    When it pushes the close icon button
    Then the Series Manager Page is displayed

  Scenario: Edit Series - Drop-down field Company Test
    Given it logins into headway
    And it presses the Edit icon
    When it pushes the dropdown company field
    Then the platform displays the drop-down with the options GDM ARGENTINA, GDM BRAZIL, GDM CHINA, GDM EUROPE UNION, GDM UNITED STATES