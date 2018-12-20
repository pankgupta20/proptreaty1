Feature: Request forgotten password
    # In order to retrieve my forgotten password
    # As an authorised user 
    # I want to request that  my password is sent to my registered email address

  @JIRA-PTA-88
  Scenario: Forgot my password request with correct email address
    Given I am presented with the login form
    And I make a forgotten password request
    When I enter the email address associated with my account
    And submit the forgotten password form
    Then an email will be sent to my email address with instructions on next steps to retrieve my password

  @JIRA-PTA-89
  Scenario: Forgot my password request with unknown email address
    Given I am presented with the login form
    And I make a forgotten password request
    When I enter an email that is not associated with my account
    And submit the forgotten password form
    Then no email is received at the email address associated with the account

  @JIRA-PTA-90
  Scenario: Forgot my password request with invalid email address
    Given I am presented with the login form
    And I make a forgotten password request
    When I enter an email that is not associated with my account
    And submit the forgotten password form
    Then no email is received at the email address associated with the account
