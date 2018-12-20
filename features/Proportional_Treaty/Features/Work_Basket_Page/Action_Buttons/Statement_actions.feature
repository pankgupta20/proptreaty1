@sprint1 @sprint1 @JIRA-PTA-91 @Automated @sprint1
Feature: Statement actions
    # In order to apply appropriate actions to selected statements
    # As a Carrier
    # I want to have a list of action buttons

  @JIRA-PTA-111
  Scenario: List of actions are available
    Given I am on the statements landing page
    Then an action to agree statements is available
    And an action to agree statements subject to copy
    And an action to query statments is available
    And an action to view details is available
    And an action to hold auto-agreement of statements
