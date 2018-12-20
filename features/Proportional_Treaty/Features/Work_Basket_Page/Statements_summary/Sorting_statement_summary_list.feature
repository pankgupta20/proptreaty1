@sprint1 @JIRA-PTA-91 @sprint1
Feature: Sorting statement summary list


  @JIRA-PTA-106 @manual
  Scenario: Multiple statements exist - default sorting
    Given I am on the statements landing page
    And statements exist in the system
    Then the results will be sorted by submission date
    And the oldest case will be at the top of the list
    And the system should prioritise grouped submission where the whole group is ordered by the submission date of the oldest member

  @JIRA-PTA-107 @sprint1 @manual
  Scenario: Sort statements by all columns
    Given I am on the statements landing page
    And statements exist in the system
    When I choose to sort the list by selecting the column headers
    Then the list of statements is displayed in correct order
    And can be sorted in both ascending and descending order

  Scenario: Group by broker group reference and Sort by Submission date
    Given I am on the statements landing page
    Then the list of statements are sorted by submission date oldest first
    And related statements are grouped by broker group reference
    And the related statements within the broker group reference group are sorted by submission date oldest first
