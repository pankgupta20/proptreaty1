@JIRA-PTA-31
Feature: Carrier Login


  Background:
    Given the Broker submits a Treaty Statement for Agreement and Central Processing
    And the Treaty is settled only in one currency
    And the Treaty is placed with a single Bureau
    And the Treaty covers a single Risk Code
    And the Account is for one underwriting year
    And there is an FDO in place
    And the Agreement Orchestration rules identify an Agreement Party
    And a Case for Agreement is assigned to my organisation
    And I receive a notification I need to agree something
    When I visited the PTA login page
    Then I want to be able to login in the Application

  @JIRA-PTA-26 @JIRA-PTA-27 @sprint1
  Scenario: Carrier Login
    # Acceptance Criteria:
    # 
    # 1. User is successfully authenticated with their ECF2 SSO credentials
    # 2. User can enter credentials directly on the PTA login page
    Given I visited the PTA login page
    When I enter the correct credentials
    Then i am granted access to the application
