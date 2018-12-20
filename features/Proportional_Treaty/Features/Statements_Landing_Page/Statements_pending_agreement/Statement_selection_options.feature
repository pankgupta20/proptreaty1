@sprint1 @JIRA-PTA-91 @sprint1
Feature: Statement selection options

  @Ignore
  @JIRA-PTA-100
  Scenario: Select single statement pending agreement
    Given I am on the statements pending agreement page
    And there are statements pending agreement assigned to my organisation
    When I select a single statement pending agreement
    And a statement action is applied
    Then the action is applied to the single selected statement
