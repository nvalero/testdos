@deleteSerieFeature @regression

Feature: Delete Serie

  Background: Login to GDM Headway
    Given it logins into headway
    And serie "AUTOMATIONDELETETEST" is already created

  @HW-1644
    Scenario: [FE] Delete a Series - Delete Series CTA
      When the Series Manager Page is displayed
      Then option delete for serie "AUTOMATIONDELETETEST" is displayed

    @HW-1645
    Scenario: [FE] Delete a Series - Confirmation window before deleting an Enabled Series
      When the Series Manager Page is displayed
      And it selects option delete for serie "AUTOMATIONDELETETEST"
      And the Delete Serie Page is displayed

    @HW-1646
    Scenario: [FE] Delete a Series - Confirmation window before deleting a Series with no Parents Assigned
      #TODO, where it selects serie with no Parents Assigned state
      #TODO is the same test than before
      When the Series Manager Page is displayed
      And it selects option delete for serie "AUTOMATIONDELETETEST"
      And the Delete Serie Page is displayed

    @HW-1647
    Scenario: [FE] Delete a Series - X icon on the confirmation window
      When the Series Manager Page is displayed
      And it selects option delete for serie "AUTOMATIONDELETETEST"
      And the Delete Serie Page is displayed
      Then it pressed the close button
      And the Series Manager Page is displayed

    @HW-1655
    Scenario: [FE] Delete a Series - Cancel Option in the confirmation window
      When the Series Manager Page is displayed
      And it selects option delete for serie "AUTOMATIONDELETETEST"
      And the Delete Serie Page is displayed
      Then it pressed the back button
      And the Series Manager Page is displayed

    @HW-1656 @HW-1658
    Scenario: [FE] Delete a Series - Removal of an Enabled Series
      #TODO, where it selects serie with enabled state
      When the Series Manager Page is displayed
      And it selects option delete for serie "AUTOMATIONDELETETEST"
      And the Delete Serie Page is displayed
      Then it pressed the accept button for delete
      And the delete window is not displayed
      And the Series Manager Page is displayed

    @HW-1657 @HW-1659
    Scenario: [FE] Delete a Series - Removal of a Series with no Parents Assigned
      #TODO, where it selects serie with no Parents Assigned state
      #TODO is the same test than before
      When the Series Manager Page is displayed
      And it selects option delete for serie "AUTOMATIONDELETETEST"
      And the Delete Serie Page is displayed
      Then it pressed the accept button for delete
      And the Series Manager Page is displayed
