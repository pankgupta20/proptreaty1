@Automated @sprint1 @JIRA-PTA-58 
Feature: Login to the application
    In order to prevent unauthorised access to the Proportional Treaty application
    As a responsible software provider
    I want to protect access to the application with a login form

  @JIRA-PTA-81
  Scenario: Login with valid username and password
    Given I am presented with the login form
    And I enter a valid username
    And I enter a valid password
    When I submit the login form
    Then I am allowed to access the PTA

  @JIRA-PTA-82
  Scenario: Login with valid username and invalid password
    Given I am presented with the login form
    And I enter a valid username
    And I enter an invalid password
    When I submit the login form
    Then a message is displayed to inform me my credentials are not valid
    And I not allowed to access the PTA

  @JIRA-PTA-83
  Scenario: Login with invalid username and valid password
    Given I am presented with the login form
    And I enter an invalid username
    And I enter a valid password
    When I submit the login form
    Then a message is displayed to inform me my credentials are not valid
    And I am not allowed to access the PTA

  @JIRA-PTA-84
  Scenario: Login with empty username and password
    Given I am presented with the login form
    And I leave the username empty
    And I leave the password empty
    When I submit the login form
    Then a message is displayed to inform me my credentials are not valid
    And I am not allowed to access the PTA

  @JIRA-PTA-85
  Scenario: Login with valid username and empty password
    Given I am presented with the login form
    And I enter a valid username
    And I leave the password empty
    When I submit the login form
    Then a message is displayed to inform me my credentials are not valid
    And I am not allowed to access the PTA

  @JIRA-PTA-86
  Scenario: Login with empty username and valid password
    Given I am presented with the login form
    And I leave the username empty
    And I enter a valid password
    When I submit the login form
    Then a message is displayed to inform me my credentials are not valid
    And I am not allowed to access the PTA
