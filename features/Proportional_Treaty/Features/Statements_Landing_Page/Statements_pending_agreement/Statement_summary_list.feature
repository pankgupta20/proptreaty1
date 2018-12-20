@sprint1 @JIRA-PTA-91 
Feature: Statement summary list
    In order to manage my workload more effectively
    As a Carrier
    I want to see a list of summarised statements that are pending agreement

  @JIRA-PTA-93
  Scenario: Statements pending agreement exist for carrier
    Given I am on the statements pending agreement page
    And there are statements pending agreement assigned to my organisation
    Then a summary of each statement pending agreement are displayed in a list
    And the summarised statements contain the correct data elements

  @JIRA-PTA-94
  Scenario: No statements pending agreement exist for the carrier
    Given I am on the statements pending agreement page
    And there are no statements pending agreement assigned to the organisation
    Then the list of statements pending agreement is empty

  @JIRA-PTA-95
  Scenario: Statements exist for carrier and statements exist for other non-related carriers
    Given I am on the statements pending agreement page
    And there are statements pending agreement assigned to my organisation
    And there are statements pending agreement assigned to other organisations
    Then the list contains only the statements pending agreement assigned to my organisation

  @JIRA-PTA-96
  Scenario: No statements exist for carrier but statements exists other non-related carriers
    Given I am on the statements pending agreement page
    And there are no statements pending agreement assigned to the organisation
    And there are statements pending agreement assigned to other organisations
    Then the list of statements pending agreement is empty

  @JIRA-PTA-97
  Scenario: Statements pending agreement and statements not pending agreement exist for the carrier
    Given I am on the statements pending agreement page
    And there are statements pending agreement assigned to my organisation
    And there are statements that are not pending agreement assigned to my organisation
    Then the list contains only the statements pending agreement assigned to my organisation

  @JIRA-PTA-98
  Scenario: Statements of different types exist for carrier
    Given I am on the statements pending agreement page
    And there are statements pending agreement assigned to my organisation
    And there statements of different types assigned to my organisation
    And there are statements pending agreement assigned to other organisations
    And there are statements of different types assigned to other organisations
    Then the list contains only the statements pending agreement assigned to my organisation

  @JIRA-PTA-99
  Scenario: Large number of Statement pending agreement
    Given I am on the statements pending agreement page
    And there are statements pending agreement assigned to my organisation
    And the number of statements is over 100
    Then the list of statements pending agreement contains all statements
    And the statements pending agreement page renders correctly
