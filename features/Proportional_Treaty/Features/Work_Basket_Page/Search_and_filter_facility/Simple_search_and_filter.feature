@sprint1 @JIRA-PTA-91 @sprint2
Feature: Simple search and filter
    # In order to find specific statements quickly
    # As a Carrier
    # I want to have a simple search facility to help me filter the statements in the list
    #  

  @JIRA-PTA-134
  Scenario: Filter by UMR
    Given I am on the statements landing page
    And I enter an existing Umr into the filter
    When I apply the filter
    Then only statements with that Umr are displayed in the list

  @JIRA-PTA-135
  Scenario: Filter by Treaty Number
    Given I am on the statements landing page
    And I enter an existing Treaty Number into the filter
    When I apply the filter
    Then only statements with that Treaty Number are displayed in the list

  @JIRA-PTA-143
  Scenario: Filter by Underwriting Year
    Given I am on the statements landing page
    And I enter an existing Underwriting Year into the filter
    When I apply the filter
    Then only statements with that Underwriting Year are displayed in the list

  @JIRA-PTA-136
  Scenario: Status - Filter by Pending Statements
    Given I am on the statements landing page
    And I choose to filter by pending statements
    When I apply the filter
    Then the list only contains statements in the pending state

  @JIRA-PTA-137
  Scenario: Status - filter by Queried statements
    Given I am on the statements landing page
    And I choose to filter by queried statements
    When I apply the filter
    Then the list only contains statements in a queried state

  @JIRA-PTA-138
  Scenario: Status - filter by Agreed statements
    Given I am on the statements landing page
    And I choose to filter by agreed statements
    When I apply the filter
    Then the list only contains statements in the agreed state

  @JIRA-PTA-139
  Scenario: Status - filter by Referred statements
    Given I am on the statements landing page
    And I choose to filter by referred statements
    When I apply the filter
    Then the list only contains statements in the referred state

  @JIRA-PTA-144
  Scenario: Submission Date Filter
    Given I am on the statements landing page
    And I select a submission date filter
    When I apply the filter
    Then the list only contains statements with the selected submission date

  @JIRA-PTA-145
  Scenario: Filter by non-existent UMR
    Given I am on the statements landing page
    And I enter a non-existent UMR into the UMR filter
    When I apply the filter
    Then the list will contain no statements

  @JIRA-PTA-150
  Scenario: Filter by UMR and Treaty Number
    Given I am on the statements landing page
    And I enter an existing Umr into the filter
    And I enter an existing Treaty Number into the filter
    When I apply the filter
    Then only statements with that Umr are displayed in the list
    And only statements with that Treaty Number are displayed in the list

  @JIRA-PTA-151
  Scenario: Filter by UMR and Underwriting Year
    Given I am on the statements landing page
    And I enter an existing Umr into the filter
    And I enter an existing Underwriting Year into the filter
    When I apply the filter
    Then only statements with that Umr are displayed in the list
     And only statements with that Underwriting Year are displayed in the list

  @JIRA-PTA-152
  Scenario: Filter by UMR and  Submission Date
    Given I am on the statements landing page
    And I enter an existing Umr into the filter
    And I select a submission date filter
    When I apply the filter
    Then only statements with that Umr are displayed in the list
     And the list only contains statements with the selected submission date

  @JIRA-PTA-153
  Scenario: Filter by UMR and Status
    Given I am on the statements landing page
    And I choose to filter by pending statements
    And I enter an existing Umr into the filter
    When I apply the filter
    Then only statements with that Umr are displayed in the list
     And the list only contains statements in the pending state

  @JIRA-PTA-168
  Scenario: Filter by UMR and Status and Treaty Number and UW Year and Submission Date
    Given I am on the statements landing page
    And I choose to filter by pending statements
    And I enter an existing Umr into the filter
    And I enter an existing Treaty Number into the filter
    And I enter an existing Underwriting Year into the filter
    And I select a submission date filter
    When I apply the filter
    Then only statements with that Umr are displayed in the list
    And the list only contains statements in the pending state
    And only statements with that Treaty Number are displayed in the list
    And only statements with that Underwriting Year are displayed in the list
    And the list only contains statements with the selected submission date
