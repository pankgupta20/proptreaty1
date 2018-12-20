@Automated @sprint1 @JIRA-PTA-91 @sprint1
Feature: Statement selection options


  @JIRA-PTA-100
  Scenario: Select single statement
    Given I am on the statements landing page
    And statements exist in the system
    When I select a single statement
    And a statement action is applied
    Then the action is applied to the single selected statement

  @JIRA-PTA-101
  Scenario: Select multiple statements
    Given I am on the statements landing page
    And statements exist in the system
    When I select multiple statements
    And a statement action is applied
    Then the action is only applied to the selected statements

  @JIRA-PTA-102
  Scenario: Select all statements
    Given I am on the statements landing page
    And statements exist in the system
    When the option to select all the statements is used
    And a statement action is applied
    Then the action is only applied to the selected statements

  @JIRA-PTA-103
  Scenario: Deselect single statement
    Given I am on the statements landing page
    And statements exist in the system
    And I have selected a single statement
    When I deselect the statement
    And a statement action is applied
    Then no action is applied to the statements

  @JIRA-PTA-104
  Scenario: Deselect multiple statements
    Given I am on the statements landing page
    And statements exist in the system
    And I select multiple statements
    When I deselect some of statements
    And a statement action is applied
    Then the action is only applied to the selected statements

  @JIRA-PTA-105
  Scenario: Deselect all statements
    Given I am on the statements landing page
    And I have selected all statements
    When I deselect all statements
    Then no statements are selected
