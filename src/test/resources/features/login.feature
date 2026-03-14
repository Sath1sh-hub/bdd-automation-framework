Feature: Login functionality

  @smoke @login
  Scenario Outline: Login with different credentials
    Given user is on login page
    When user enters username "<username>" and password "<password>"
    And clicks login button
    Then user should see "<result>" message

    Examples:
      | username | password             | result  |
      | tomsmith | SuperSecretPassword! | success |
      | admin    | admin123             | failure |
      | user1    | pass123              | success |