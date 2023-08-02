@EnableDisableSerie @regression

Feature: Login to GDM Headway
Background: Login to GDM Headway

  Scenario:  [HW-1613] [FE] Enable/Disable a serie - Disable a Serie.
    Given it logins into headway
    And it sets serie "AUTOMATIONTESTENABLECASE" to status "ENABLED"
    And it selects option to disable serie "AUTOMATIONTESTENABLECASE"
    And the submit button is displayed
    And the cancel button is displayed
    And the disable window is displayed
    And the description field is displayed
    And it presses the submit button in enable modal
    Then the serie "AUTOMATIONTESTENABLECASE" has status "DISABLED"

  Scenario:  [HW-1616] [FE] Enable/Disable a serie - Enable a serie
    Given it logins into headway
    And it sets serie "AUTOMATIONTESTENABLECASE" to status "DISABLED"
    And it selects option to enable serie "AUTOMATIONTESTENABLECASE"
    And the submit button is displayed
    And the cancel button is displayed
    And the disable window is displayed
    And the description field is displayed
    And it presses the submit button in enable modal
    And the disable window is not displayed
    Then the serie "AUTOMATIONTESTENABLECASE" has status "ENABLED"

  Scenario:  [HW-1614] [FE] Enable/Disable a serie - Cancel the action of disabling a series
    Given it logins into headway
    And it sets serie "AUTOMATIONTESTENABLECASE" to status "ENABLED"
    When it selects option to disable serie "AUTOMATIONTESTENABLECASE"
    And the submit button is displayed
    And the cancel button is displayed
    And the disable window is displayed
    And the description field is displayed
    And the description field is edited with "AUTOMATIONTESTENABLECASE"
    And it presses the cancel button
    Then the disable window is not displayed
    And the Edit Series Button is not displayed for serie "AUTOMATIONTESTENABLECASE"
    And the Delete Series Button is not displayed for serie "AUTOMATIONTESTENABLECASE"

  Scenario:  [HW-1617] [FE] Enable/Disable a serie - Cancel the action of enabling a series
    Given it logins into headway
    And it sets serie "AUTOMATIONTESTENABLECASE" to status "DISABLED"
    And it selects option to enable serie "AUTOMATIONTESTENABLECASE"
    And the submit button is displayed
    And the cancel button is displayed
    And the disable window is displayed
    And the description field is displayed
    And it presses the cancel button
    And the disable window is not displayed
    Then the serie "AUTOMATIONTESTENABLECASE" has status "DISABLED"

  Scenario:  [HW-1617] [FE] Enable/Disable a serie - Enable a Serie with a Description
    Given it logins into headway
    And it sets serie "AUTOMATIONTESTENABLECASE" to status "DISABLED"
    And it selects option to enable serie "AUTOMATIONTESTENABLECASE"
    And the submit button is displayed
    And the cancel button is displayed
    And the disable window is displayed
    And the description field is displayed
    And the description field is edited with "AUTOMATIONTESTENABLECASE"
    And it presses the submit button in enable modal
    And the disable window is not displayed
    Then the serie "AUTOMATIONTESTENABLECASE" has status "ENABLED"

  Scenario:  [HW-1615] [FE] Enable/Disable a serie - Disable a Serie with a Description
    Given it logins into headway
    And it sets serie "AUTOMATIONTESTENABLECASE" to status "ENABLED"
    And it selects option to disable serie "AUTOMATIONTESTENABLECASE"
    And the submit button is displayed
    And the cancel button is displayed
    And the disable window is displayed
    And the description field is displayed
    And the description field is edited with "AUTOMATIONTESTENABLECASE"
    And it presses the submit button in enable modal
    And the disable window is not displayed
    Then the serie "AUTOMATIONTESTENABLECASE" has status "DISABLED"
