@smoke
Feature: guest user could switch between currencies [$, €]
  Scenario: user select Euro currency
    When user select Euro Currency
    Then item Prices displayed with Euro Currency

  Scenario: user select Dollar currency
    When user select Dollar Currency
    Then item Prices displayed with Dollar Currency