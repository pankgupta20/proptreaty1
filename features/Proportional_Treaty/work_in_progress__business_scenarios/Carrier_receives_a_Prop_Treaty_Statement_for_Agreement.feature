Feature: Carrier receives a Prop Treaty Statement for Agreement
    # In order to agree a Prop Treaty Statement submitted by a Broker
    # as a Carrier
    # I want to:
    # - be notified for a submission I need to agree;
    # - be able to login on an electronic platform;
    # - see a list of all cases awaiting agreement that are assigned to my organisation as my home page;
    # - be able to search through the list of open cases by one or more parameters;
    # - choose one or more statements and drill into their detail financials; 
    # - be able to agree one or more individual statements;
    # - be able to query one or more individual statements to the Broker;
    # - be able to refer one or more individual statements to other Carriers on risk within the same Market

  Background:
    Given the Broker submits a Treaty Statement for Agreement and Central Processing
    And the Treaty is placed with a single Bureau
    And the Treaty is settled only in one currency
    And the Treaty covers a single Risk Code
    And the Account is for one underwriting year
    And there is an FDO in place
    When Broker system generates an EBOT submission into DXC
    And the Agreement Orchestration rules identify an Agreement Party
    Then an Agreement Case is created in the PTA

  @JIRA-PTA-32 @sprint1
  Scenario: Notification to Carrier
    # Acceptance Criteria:
    # 
    # 1. An e-mail is generated based on a template that allows the Carrier to identify:
    # - The associated UMR
    # - The Broker and the Broker Reference 
    # - The type of the statement - periodic account, cash loss, profit/sliding scale commission adjustment
    # - The Carrier Slip position
    # - Carrier Reference
    Given that a valid e-mail exists on file for the Carrier
    When the Carrier is identified as an Agreement party
    And an Agreement Case is created in the PTA
    Then the Carrier must receive e-mail notification with details of the assigned case

  @OK @JIRA-PTA-34 @sprint1
  Scenario: Home page
    # Acceptance Criteria:
    # 
    # The home page screen has:
    # 1. A Search facility
    # 2. A pre-populated list of pending agreement requests
    # 
    # The home screen provides navigation options to:
    # 1. A dashboard facility
    # 2. Actions list
    Given i am granted access to the application
    When the system takes me to the home page
    Then I want to see a list of all pending tasks assigned to me
    And a Search facility
    And a Dash board area
    And actions choice

  @EPIC @JIRA-PTA-33
  Scenario: Review the list of pending tasks epic
    # As detailed in [Review List of Pending Tasks Subfolder] (https://hiptest.net/app/projects/72534/test-plan/folders/444759)
    Given that my organisation has statements awaiting action
    When I access the home page of the PTA
    Then I want to be presented with a list of all pending cases
    And a summary of each statement
    And I want the list order by submission date with oldest item placed on top of the list

  @OK @JIRA-PTA-40
  Scenario: Search facility
    # Acceptance Criteria:
    # 
    # 1#. The user can perform a quick search by one or more of the following parameters:
    # - UMR
    # - Broker Reference
    # - Carrier Reference
    # - The type of the statement - periodic account, cash loss, profit/sliding scale commission adjustment
    # 
    # 2#. The user can perform an advance search (expandable pane) by one or more of the following parameters:
    # - Treaty number
    # - Broker Code and/or Name
    # - Underwriting Year
    # - Original Currency
    # - Settlement Currency
    # - Statement Date from
    # - Statement Date to
    # - Cedant name
    # - Payment means (Cash, "De-linked", Out of CS)
    # 
    # 3#. User should be able to apply a combination of the quick and advancede search criteria to retrieve results
    Given I am logged on the PTA
    And I am at the home page
    When i specify some search criteria
    And press a search button
    Then I want to see the list of pending cases that match my search criteria

  @EPIC
  Scenario: Review statement details epic
    # As detailed in [Statement details screen] (https://hiptest.net/app/projects/72534/test-plan/folders/442225)
    Given I am logged on the PTA
    And I am at the home page
    And there are one or more pending statements assigned to my organisation
    And I have selected one or more statements
    And all selected statements are awaiting agreement
    And the <<View Details>> button is active
    When I press the <<View Details>> button
    Then the system should navigate me to a new screen where I can see the details of all selected statements

  Scenario: Action Choice - Agree (from home page)
    # Acceptance Criteria:
    # 
    # 1#. User can select one or more statements from the summary list
    # 2#. User can de-select a previously selected row
    # 3#. User can select all statements presented in the list with a single action
    # 4#. User can agree all selected statements from the summary screen with a single action
    # 5#. System generates notification to the Broker
    # 6#. All agreed statements are presented to DXC for technical processing
    Given I am logged on the PTA
    And I am at the home page
    And there are one or more pending statements assigned to my organisation
    And I have selected one or more statements
    And all selected statements are awaiting agreement
    And the <<Agree>> button is active
    And I am the only agreement party or the last party to action the case
    When I press the <<Agree>> button
    Then the system should process my agreement for all selected statements
    And notify the broker
    And send the statement for processing to DXC

  Scenario: Action Choice - Agree, subject to (from home page)
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

  Scenario: Action Choice - Query (from home page)
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

  Scenario: Action Choice - View details
    # Acceptance Criteria:
    # 
    # 1#. User can select one or more statements from the summary list
    # 2#. User can de-select a previously selected row
    # 3#. User can select all statements presented in the list with a single action
    # 4#. User is navigated to a new screen where details for all selected statements are presented
    Given I am logged on the PTA
    And I am at the home page
    And there are one or more pending statements assigned to my organisation
    And I have selected one or more statements
    And all selected statements are awaiting agreement
    And the <<View Details>> button is active
    When I press the <<View Details>> button
    Then the system should navigate me to a new screen where I can see the details of all selected statements

  Scenario: Dashboards
    # Acceptance Criteria:
    # 
    # 1#. The user must be presented with a count of the open cases* classified as:
    # Slip position: Lead
    # - Queried with the Broker by my organisation
    # - Queried with the Broker by DXC
    # - Pending Agreement
    # - Pending second Agreement Party responce
    # - Queried with my organisation by second Agreement Party
    # - Queried with my organisation by DXC
    # - Pending DXC processing
    # 
    # Slip position: Follower
    # - Queried with the Broker by Lead Agreement Party
    # - Queried with the Broker by DXC
    # - Pending Lead Agreement party responce
    # - Pending agreement by my organisation as a Second Agreement Party
    # - Queried with the Lead Agreement  party by my organisation
    # - Queried with the my organisation by DXC
    # - Pending DXC processing
    # 
    # ---
    # *An open case is identified as a broker submission that has been received by DXC systems and acknowledged as a valid submission but has not yet been released for settlement
    Given I am logged on the PTA
    When I navigate to the dashboard area
    Then the system must present the latest statistics for submissions where my organisation has signed lines

  Scenario: Dashboard Details
    # Acceptance Criteria
    # 
    # 1. When no statements belong to a certain category the system display 0
    # 2. When the system displays 0 drill-down option is disabled
    # 3. When there are statements that the belong to a certain category, the system displays the correct count
    # 4. When the count is different from 0 the correct number is displayed
    # 5. When the user drill downs into a category different from 
    #            Slip position: Lead
    #                    - Pending Agreement
    #            Slip position: Follower
    #                     - Pending agreement by my organisation as a Second Agreement Party
    # all displayed results must be in read-only mode
    # 6. When the user drill downs into one of these categories
    #            Slip position: Lead
    #                    - Pending Agreement
    #            Slip position: Follower
    #                     - Pending agreement by my organisation as a Second Agreement Party
    # all displayed results must be in edit mode
    Given that I am in the dashboard area of the PTA
    And there are existing statistics for open submissions
    When click on any count different from zero
    Then the system must take me to the home screen
    And present a summarised list of statements matching the respective criteria
    And any statement that is currently not assigned to me will be presented in read-only mode
    And any statement that is currently assigned to me will be presented in edit mode
