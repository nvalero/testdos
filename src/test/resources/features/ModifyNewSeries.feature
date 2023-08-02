@ModifyNewSeries @regression
Feature: [Epic HW-156] Modify New Series

  As Nursery Manager, I want to be able to modify a New Breeding Series to change the name and type if necessary according to business decision.

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

  Scenario: [HW-1569] Edit Series - Drop-down field Company Test
    Given it logins into headway
    And it presses the Edit icon
    When it pushes the dropdown company field
    Then the "company" drop-down is displayed
    And the "company" drop-down displays "GDM ARGENTINA,GDM BRAZIL,GDM CHINA,GDM EU,GDM USA"

  Scenario: [HW-1570] Edit Series - Filter field Company Test
    Given it logins into headway
    And it presses the Edit icon
    And edit Series drawer is displayed
    Then it types INA in the field Company
    And the "company" drop-down is displayed
    And the "company" drop-down displays "GDM ARGENTINA,GDM CHINA"

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
    Then the "year" drop-down displays "2023, 2024"

  Scenario: [HW-1574] Edit Series - Filter field Year No-Options Test
    Given it logins into headway
    And it presses the Edit icon
    And edit Series drawer is displayed
    When it types "AA" in drop-down "year"
    Then the platform performs a sequential search and displays the message No Options in the dropdown for year field

  Scenario: [HW-1575] Edit Series - Drop-down field Breeding Method Test
    Given it logins into headway
    And it presses the Edit icon
    And edit Series drawer is displayed
    When it pushes the dropdown field Breeding Method
    Then the platform displays the dropdown with the FWS - FWB Simple cross message

  Scenario: [HW-1576] Edit Series - Filter field Breeding Method Test
    Given it logins into headway
    And it presses the Edit icon
    And edit Series drawer is displayed
    When it types "CROSS" in drop-down "breed"
    Then the "trait" drop-down displays "FWS - FWB Simple cross"

  Scenario: [HW-1578] Edit Series - Drop-down field Trait Test
    Given it logins into headway
    And it presses the Edit icon
    And edit Series drawer is displayed
    Then the "trait" drop-down is displayed
    And the "trait" drop-down displays "CONVENTIONAL,ROUNDUP READY,ENLIST,CONKESTA,INTACTA,XTEND FLEX,INTACTA2XTEND,HAB4xRR1,GGT,GGTxGIR3,XTEND,LIBERTY LINK GT27,GIR PLUS,LLXRR,RUST,SCN,PROTEIN,RKN,KUNITZ,LIPOX,PHY25,LOW RAFF, HIGH YIELD AND STRESS TOLERANCE,AREB AND GOLS,GENERAL PLANT PATHOLOGY,RACK"

  Scenario: [HW-1580] Edit Series - Filter field Trait No-Options Test
    Given it logins into headway
    And it presses the Edit icon
    And edit Series drawer is displayed
    When it types "SS" in drop-down "trait"
    And the "trait" drop-down displays "HIGH YIELD AND STRESS TOLERANCE"

    Scenario: [HW-1581] Edit Series - Drop-down field Cycle Test
      Given it logins into headway
      When it presses the Edit icon
      And edit Series drawer is displayed
      When the "cycle" drop-down is displayed
      And the "cycle" drop-down displays "AxB - Initial cross,F1,F2,F3,F4,F5,F6,F7,F8"

    Scenario: [HW-1582] Edit Series - Filter field Cycle Test
      Given it logins into headway
      And it presses the Edit icon
      And edit Series drawer is displayed
      And it pushes the dropdown field Cycle
      When it types "CR" in drop-down "cycle"
      Then the "cycle" drop-down is displayed
      And the "cycle" drop-down displays "AxB - Initial cross"

    Scenario: [HW-1583] Edit Series - Filter field Cycle No-Options Test
      Given it logins into headway
      And it presses the Edit icon
      And edit Series drawer is displayed
      And it pushes the dropdown field Cycle
      When it types "11" in drop-down "cycle"
      Then the platform performs a sequential search and displays the message No Options in the dropdown for year field


    Scenario: [HW-1585] Edit Series - Cancel button test
      Given it logins into headway
      And it presses the Edit icon
      And edit Series drawer is displayed
      When it pushes the cancel button
      Then the Series Manager Page is displayed
      And the Series will not be modified

    @1586
    Scenario: [HW-1586] Edit Series - Edit Series with a blank field
      Given it logins into headway
      And it presses the Edit icon
      And edit Series drawer is displayed


