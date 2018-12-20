@sprint1 @JIRA-PTA-91 
Feature: Toggle currency
    In order to switch between currency options in the displayed statement summaries
    As a Carrier
    I want a toggle mechanism to change the currency option

  @JIRA-PTA-110
  Scenario: toggle currency
    Given I am on the statements pending agreement page
    Then a currency toggle will be available to allow the currency option to be changed
    And the currency toggle will be disabled
