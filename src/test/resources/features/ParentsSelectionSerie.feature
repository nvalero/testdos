@AssignParentsSerie @regression
Feature: Login to GDM Headway
Background: Login to GDM Headway

  Scenario:  [HW-1948] Add Parents List drawer - Select a file to the list
    Given it logins into headway
    When it selects serie with status "NEW"
    And it presses Parent Selection option
    And it presses Add Parents Lists Button in Detail View
    And it displays a list of files
    And it selects a file from the list of files
    And it displays "You have selected 1 files"
    And it presses Add Parents List Button in Modal
    Then it displays title "The Parents Lists were Successfully Added" in Assign Parents windows

  Scenario:  [HW-1949] Add Parents List drawer - Select more than one file to the list
    Given it logins into headway
    When it selects serie with status "NEW"
    And it presses Parent Selection option
    And it presses Add Parents Lists Button in Detail View
    And it displays a list of files
    And it selects two files from the list of files
    And it displays "You have selected 2 files"
    And it presses Add Parents List Button in Modal
    Then it displays title "The Parents Lists were Successfully Added" in Assign Parents windows

  Scenario:  [HW-1950] Add Parents List drawer - Without selecting files from the list
    Given it logins into headway
    When it selects serie "AUTOMATIONTESTENABLECASE"
    And it presses Parent Selection option
    And it presses Add Parents Lists Button in Detail View
    And it displays a list of files
    And it presses Add Parents List Button in Modal
    Then the Add Parents Lists Button in Modal is disabled

  Scenario:  [HW-1964] Parent Selection View - Empty State Test
    Given it logins into headway
    When it selects serie with status "NEW"
    And it presses Parent Selection option
    And it displays status "NEW"
    And it displays informative text "You still have not registered any Parents Lists for this series."
    And the Add Parents Lists Button in Detail View is enabled

  Scenario:  [HW-1968] [FE] Parent Selection View - with Parents - Check the informative text
    Given it logins into headway
    When it selects serie with status "PARENT ASSIGNED"
    And it presses Parent Selection option
    And it displays informative text "You have already added a List of Parents. Is you want to change it o add new Parents, the current one will be replaced"
