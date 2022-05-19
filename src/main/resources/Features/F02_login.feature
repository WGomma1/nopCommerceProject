@smoke
Feature: guest user could Login with valid credentials
  Scenario: user login with valid Email and password
    When user click on login page
    Then login page opened

  Scenario: user insert valid Email and Password
    When user click on login page
    Then login page opened
    And user insert valid Email and password
    And user click on login tab
    Then user back to home page with his account
    And my account tab is displayed


