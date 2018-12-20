@sprint1 @JIRA-PTA-91 
Feature: Sorting statement summary list


  @JIRA-PTA-106
  Scenario: Multiple statements pending agreement exist - default sorting
    Given I am on the statements pending agreement page
    And there are statements pending agreement assigned to my organisation
    Then the results will be sorted by presentation date
    And the oldest case will be at the top of the list
    And the system should prioritise grouped submission where the whole group is ordered by the presentation date of the oldest member

  @JIRA-PTA-107
  Scenario: Sort statements by UMR
    Given I am on the statements pending agreement page
    And there are statements pending agreement assigned to my organisation
    When I choose to sort the list by UMR
    Then the list of statements is displayed in UMR order

  @JIRA-PTA-108
  Scenario: Sort statements by Treaty number
    Given I am on the statements pending agreement page
    And there are statements pending agreement assigned to my organisation
    When I choose to sort the list by Treaty Number
    Then the list of statements is displayed in Treaty Number order
