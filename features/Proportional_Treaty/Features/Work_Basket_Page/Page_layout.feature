@sprint1 @JIRA-PTA-91 @sprint1 @Automated
Feature: Page layout
    # In order to get straight to work when the PT application loads
    # As a Carrier
    # I want the landing page to display statements that require action and related functionality

  @JIRA-PTA-92
  Scenario: Landing page renders correctly
    Given I am on the statements landing page
    Then I can see a statement search section
    And I can see a list of statements
    And I can see a link to the dashboard page
    And a list of available actions
