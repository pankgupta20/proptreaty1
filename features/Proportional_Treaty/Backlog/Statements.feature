Feature: Statements


  @JIRA-PTA-95
  Scenario: Statements exist for carrier and statements exist for other non-related carriers
    Given I am on the statements landing page
    And statements exist in the system
    And there are statements pending agreement assigned to other organisations
    Then the list contains only the statements pending agreement assigned to my organisation

  @JIRA-PTA-97
  Scenario: Statements pending agreement and statements not pending agreement exist for the carrier
    Given I am on the statements landing page
    And statements exist in the system
    And there are statements that are not pending agreement assigned to my organisation
    Then the list contains only the statements pending agreement assigned to my organisation

  @JIRA-PTA-98
  Scenario: Statements of different types exist for carrier
    Given I am on the statements landing page
    And statements exist in the system
    And there statements of different types assigned to my organisation
    And there are statements pending agreement assigned to other organisations
    And there are statements of different types assigned to other organisations
    Then the list contains only the statements pending agreement assigned to my organisation

  @JIRA-PTA-96
  Scenario: No statements exist for carrier but statements exists other non-related carriers
    Given I am on the statements landing page
    And there are no statements in the system
    And there are statements pending agreement assigned to other organisations
    Then the list of statements is empty
