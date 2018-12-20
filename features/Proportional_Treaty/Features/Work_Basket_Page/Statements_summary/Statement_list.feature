@sprint1 @JIRA-PTA-91 @sprint1
Feature: Statement list
    # In order to manage my workload more effectively
    # As a Carrier
    # I want to see a list of summarised statements that are pending agreement

  @JIRA-PTA-93
  Scenario: Statements exist for carrier
    Given I am on the statements landing page
    And statements exist in the system
    When I select a single statement
    Then a summary of each statement is displayed in a list
    And the summarised statements contain the correct data elements

  @JIRA-PTA-94
  Scenario: No statements exist for the carrier
    Given I am on the statements landing page
    And there are no statements in the system
    Then the list of statements is empty

  @JIRA-PTA-99
  Scenario: Large number of Statement pending agreement
    Given I am on the statements landing page
    And statements exist in the system
    And the number of statements is over 100
    Then the list of statements pending agreement contains all statements
    And the statements pending agreement page renders correctly
