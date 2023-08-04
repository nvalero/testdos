@CreateSerie @regression
Feature: Login to GDM Headway
Background: Login to GDM Headway
  Given it logins into headway

  Scenario:  [HW-1077] [FE] Updates Series - Cycle Data (Location - Environment - Cycle Year) - "New Series" drawer
    When it pressed the Create Series button
    And it displays title "Create New Series"
    Then the "company" drop-down is displayed
    And it displays the cross button
    And the "year" drop-down is displayed
    And the description field is displayed
    And the "trait" drop-down is displayed
    And the "breed" drop-down is displayed
    And the grey separator line is displayed
    And the "cycle" drop-down is displayed
    And the "location" drop-down is displayed
    And the "environment" drop-down is displayed
    And the "cycleyear" drop-down is displayed
    And a notification box is displayed
    And a notification box contains "Make sure the information is correct"
    And a notification box contains "An automatic series name will be generated based on this information."
    And the submit button is displayed

  Scenario:  [HW-1078] New series form Layout - Test drop-down field Company
    When it pressed the Create Series button
    Then the "company" drop-down is displayed
    And the "company" drop-down displays "GDM ARGENTINA,GDM BRAZIL,GDM CHINA,GDM EU,GDM USA"

  Scenario:  [HW-1079] New series form Layout - Test drop-down field Company
    When it pressed the Create Series button
    And the "year" drop-down is displayed
    Then the "year" drop-down displays "2023, 2024"

  Scenario:  [HW-1080] New series form Layout - Test drop-down field Cross
    When it pressed the Create Series button
    Then the "breed" drop-down is displayed
    And the "breed" drop-down displays "FWS - FWB Simple cross"

  Scenario:  [HW-1081] New series form Layout - Test drop-down field Trait
    When it pressed the Create Series button
    Then the "trait" drop-down is displayed
    And the "trait" drop-down displays "CONVENTIONAL,ROUNDUP READY,ENLIST,CONKESTA,INTACTA,XTEND FLEX,INTACTA2XTEND,HAB4xRR1,GGT,GGTxGIR3,XTEND,LIBERTY LINK GT27,GIR PLUS,LLXRR,RUST,SCN,PROTEIN,RKN,KUNITZ,LIPOX,PHY25,LOW RAFF, HIGH YIELD AND STRESS TOLERANCE,AREB AND GOLS,GENERAL PLANT PATHOLOGY,RACK"

  Scenario:  [HW-1082] New series form Layout - Test drop-down field Trait
    When it pressed the Create Series button
    Then the "cycle" drop-down is displayed
    And the "cycle" drop-down displays "AxB - Initial cross,F1,F2,F3,F4,F5,F6,F7,F8"

  Scenario:  [HW-1511] Confirmation Window component - Cross button Test
    When it pressed the Create Series button
    And it presses the cross button
    Then the Series Manager Page is displayed

  Scenario:  [HW-1512] Confirmation Window component - Go to Series Manager button Test
    When it pressed the Create Series button
    And it completed all fields with the correct data and create serie "AUTOMATIONCREATETEST"
    Then it presses the button Go to Series Manager

  Scenario:  [HW-1513] Confirmation Window component - Add Parents List button Test
    When it pressed the Create Series button
    And it completed all fields with the correct data and create serie "AUTOMATIONCREATETEST"
    And it presses Add Parents List button
    Then the "parents/assign" page is displayed

  Scenario: [HW-3650] [FE] Updates Series - Cycle Data (Location - Environment - Cycle Year) - "New Series" drawer - "Location" drop-down
    When it pressed the Create Series button
    Then the "location" drop-down is displayed
    And the "location" drop-down displays "CHACABUCO,PETRONILA"

  Scenario: [HW-3651] [FE] Updates Series - Cycle Data (Location - Environment - Cycle Year) - "New Series" drawer - "Location" drop-down
    When it pressed the Create Series button
    Then the "environment" drop-down is displayed
    And the "environment" drop-down displays "GREENHOUSE,FIELD BR,FIELD USA"

  Scenario: [3652] [FE] Updates Series - Cycle Data (Location - Environment - Cycle Year) - "New Series" drawer - "Cycle Year" drop-down if Cycle = AxB
    When it pressed the Create Series button
    And it selects item 0 in drop-down "year"
    And it selects item 0 in drop-down "cycle"
    Then the cycleyear has value "2023"

  Scenario: [3653] [FE] Updates Series - Cycle Data (Location - Environment - Cycle Year) - "New Series" drawer - "Cycle Year" drop-down if Cycle is distinct of AxB
    When it pressed the Create Series button
    And it selects item 1 in drop-down "cycle"
    Then the "cycleyear" drop-down displays "2023, 2024"

  Scenario: [3654] [FE] Updates Series - Cycle Data (Location - Environment - Cycle Year) - Series Manager - New columns on the grid
    When it pressed the Create Series button
    And it selects item 0 in drop-down "company"
    And it selects item 0 in drop-down "year"
    And it selects item 0 in drop-down "breed"
    And it selects item 0 in drop-down "trait"
    And it selects item 0 in drop-down "cycle"
    And it selects item 0 in drop-down "environment"
    And it selects item 0 in drop-down "location"
    And the description field is edited with "Automation test"
    And it presses the submit button in create modal
    And it presses the button Go to Series Manager
    Then it has value "CH" in field "location" in serie "Automation test"
    And it has value "GH" in field "environment" in serie "Automation test"
    And it has value "2023" in field "cycleyear" in serie "Automation test"

  Scenario:  [HW-1468] Confirmation Window component - Confirmation Window components Test
    When it pressed the Create Series button
    And it completed all fields with the correct data and create serie "AUTOMATIONCREATETEST"
    Then it displays the cross button
    And it displays the Success logo
    And it displays title "The Series was successfully Created"
    And it displays the long title Series Created
    #And it displays the Sucess image
    And it displays the button Go to Series Manager
    And it displays the button Add Parents List
