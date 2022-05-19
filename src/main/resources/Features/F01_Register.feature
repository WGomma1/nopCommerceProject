@smoke
Feature: guest user could register with valid data successfully
  Scenario: user open register page
    When user click on register tab
    Then register page should open

  Scenario: user fill personal details
    When user click on register tab
    Then register page should open
    And user fill personal details
    And user fill password field
    And user click on register complete tab
    Then success massage displayed
