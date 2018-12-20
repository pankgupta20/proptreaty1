Feature: Review List of Pending Tasks


  Background:
    Given that my organisation has statements awaiting action
    When I access the home page of the PTA
    Then I want to be presented with a list of all pending cases
    And a summary of each statement
    And I want the list order by submission date with oldest item placed on top of the list

  @JIRA-PTA-35 @sprint1
  Scenario: List of pending agreement cases with statement summary
    # 1#. The user is presented with a summary view of all statements
    Given that I access the Home page of the PTA
    When there are one or more pending statements assigned to my organisation
    Then I want to see a list of all pending tasks assigned to me presented in a table
    And I want the table to include a column for the Treaty Number
    And I want the table to include a column for the Underwirting Year
    And I want the table to include a column for the UMR
    And I want the table to include a column for the Reinsured Name
    And I want the table to include a column for the Contract Section Reference
    And I want the table to include a column for the original (reference) currency
    And I want the table to include a column for the Net Premium Balance
    And I want the table to include a column for the Net Claim Balance
    And I want the table to include a column for the Statement Balance
    And I want the table to include a column for the Outstanding Loss amount
    And I want the table to include a column for the submission date
    And I want the table to include a column for the number of days until the statement is auto-agreed

  @JIRA-PTA-36
  Scenario: Toggle Share values
    # User can toggle the values between:
    # - To order (Own Share) <default>
    # - To bureau order
    # - 100 % to Treaty
    # And the financial elements presented in the summary reflect the user selection
    Given that my organisation has statements awaiting action
    When I see the list of pending cases on the home page
    Then I want the system to display the financial element to the Order of my organisation by default
    And to allow me to change the display to show the financial elements to the Bureua order
    And to allow me to change the display to show the financial elements for 100% Treaty Share
    And update the values based on my selection

  @JIRA-PTA-37
  Scenario: Toggle between currencies
    # User can toggle the values between:
    # - Original Currency <default>
    # - Settlement Currency (with a note: for illustration purpose only)
    # - A nominated currency with a manually entered FX rate
    # 
    #  And the financial elements presented in the summary reflect the user selection
    Given that my organisation has statements awaiting action
    When I see the list of pending cases on the home page
    Then I want the system to display the financial element in original currency by default
    And to allow me to change the display to show the financial elements in settlement currency
    And to allow me to change the display to show the financial elements in a nominated currency  where I can manually specify the FX rate
    And update the values based on my selection
    And display a warning message "For illustation purposes only" if the user selection is different from the default value

  @JIRA-PTA-38 @sprint1
  Scenario: Sorting the list
    # 1#. user must see result order by presentation date, oldest on top
    # 2#. system should prioritise grouped submission where the whole group is ordered by the presentation date of the oldest member
    # 3#. User can sort the list by each column
    Given that my organisation has statements awaiting action
    When I see the list of pending cases on the home page
    Then the results will be sorted by submission date
    And the system should prioritise grouped submission where the whole group is ordered by the submission date of the oldest member
    And I can then sort the list by any of the columns

  @JIRA-PTA-39 @sprint1
  Scenario: Apply user selection
    # 1#. User can select one or more statements to action
    # 2#. User can deselect one or more previously selected statements
    # 3#. User can select all statements in the list with single action 
    # 4#. User can deselect all previously selected statements in the list with single action 
    Given that my organisation has statements awaiting action
    When I see the list of pending cases on the home page
    Then I want to be able to select one or more statements
    And be able to deselect one or more preselcted statements
    And be able to select all statements in the list with one action
    And be able to deselect all previously selected statements with one action
