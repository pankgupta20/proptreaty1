@sprint1 @JIRA-PTA-91 @sprint1 @Automated
Feature: Toggle between Own, Bureau and 100% Share,
    # In order to switch between the share options in the displayed statement summaries
    # As a Carrier
    # I want a toggle mechanism to change the share options view

  @JIRA-PTA-109
  Scenario: toggle share options
    Given I am on the statements landing page
    Then a shares toggle will be available to change the share options
    And the shares toggle will be disabled
