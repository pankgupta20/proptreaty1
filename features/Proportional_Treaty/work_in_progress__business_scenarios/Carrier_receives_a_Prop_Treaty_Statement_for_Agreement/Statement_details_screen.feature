Feature: Statement details screen


  Background:
    Given I am logged on the PTA
    And I am at the home page
    And there are one or more pending statements assigned to my organisation
    And I have selected one or more statements
    And all selected statements are awaiting agreement
    And the <<View Details>> button is active
    When I press the <<View Details>> button
    Then the system should navigate me to a new screen where I can see the details of all selected statements

  Scenario: Action Choice - Agree, subject to copy (placeholder)
    # Acceptance Criteria:
    # 
    # 1#. User can select one or more statements from the summary list
    # 2#. User can de-select a previously selected row
    # 3#. User can select all statements presented in the list with a single action
    # 4#. User can agree all selected statements from the summary screen with a single action
    # 5#. User can add narrative to descripe the subjectivity
    # 6#. The subjectivity is associated with all selected statements
    # 7#. System generates notification to the Broker
    # 8#. All agreed statements are presented to DXC for technical processing
    Given I am logged on the PTA
    And I am at the home page
    And there are one or more pending statements assigned to my organisation
    And I have selected one or more statements
    And all selected statements are awaiting agreement
    And the <<Agree subject to>> button is active
    And I am the only agreement party or the last party to action the case
    When I press the <<Agree subject to>> button
    Then the system should open up a pop-up screen to capture the subjectivity in a narrative
    And the system should process my agreement for all selected statements
    And notify the broker
    And send the statement for processing to DXC

  Scenario: Action Choice - Query (placeholder)
    # Acceptance Criteria:
    # 
    # 1#. User can select one or more statements from the summary list
    # 2#. User can de-select a previously selected row
    # 3#. User can select all statements presented in the list with a single action
    # 4#. User can associate a query with all selected statements (one or more)
    # 5#. User see a new pop-up screen
    # 6#. User can close the query screen without entering any details and dismiss the query
    # 7#. User can close the query screen after entering some data without saving it and dismiss the query
    # 7.1#. User is prompt to confirm the choice to dismiss the query
    Given I am logged on the PTA
    And I am at the home page
    And there are one or more pending statements assigned to my organisation
    And I have selected one or more statements
    And all selected statements are awaiting agreement
    And the <<Query>> button is active
    When I press the <<Query>> button
    Then the system should open up a pop-up screen to capture the details of my query
