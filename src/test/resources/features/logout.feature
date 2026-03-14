Feature: Logout functionality

  @sanity @logout
  Scenario: User logs out successfully
    Given user is logged in
    When user clicks logout button
    Then user should be redirected to login page