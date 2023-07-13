@dashboardFeature


Feature: Dashboard Home Page

   Background: Login to GDM Headway
      Given it logins into headway

  @HW-1052
  Scenario: [FE] App Layout - Verify the main screen on the Nursery app
      When the Series Manager Page is displayed

  @HW-1053
  Scenario: [FE] App Layout - Verify the navigation region on the left in the screen
    When the Hamburger Menu is displayed

  @HW-1054
  Scenario: [FE] App Layout - Verify the Header region on the top in the screen
    When the Header Menu is displayed

  @HW-1055
  Scenario: [FE] App Layout - Verify the main region on the middle in the screen
    When the Middle Section Menu is displayed

