Feature: Raise query
    # In order to gather additional information to support my decision
    # as a Lead Agreement party of a Proportional Treaty Statement assigned to my organisation for agreement
    # I want to be able to raise a query with the Broker
    # or to re-assign a query raised for a Second Agreement party with me to the Broker.
    # 
    # In order to gather additional information to support my decision
    # as a Second Agreement party of a Proportional Treaty Statement assigned to my organisation for agreement
    # I want to be able to raise a query with the Lead Agreement party within the Bureau

  Background:
    Given I am logged on the PTA
    And I am at the home page
    And there are one or more pending statements assigned to my organisation
    And I have selected one or more statements
    And all selected statements are awaiting agreement
    And the <<Query>> button is active
    When I press the <<Query>> button
    Then the system should open up a pop-up screen to capture the details of my query

  Scenario: Enter query details
    # Acceptance Criteria:
    # 
    # 1#. User can select any value from a drop-down list of preconfigured [Query categories] (https://hiptest.net/app/projects/72534/test-plan/folders/441642)
    # 2#. The list of query categories is sorted by alphabetic order
    # 3#. User can enter a free text narrative to desribed the details of the query.
    # 4#. The free text field allows for 3000 characters (inline with existing PbS Query functionality)
    # 5#. User must see an active button <Add documents>
    # 5.1# User must be able to attach multiple documents, one at a time, as per [Add document to query] (https://hiptest.net/app/projects/72534/test-plan/folders/441689/scenarios/1513653)
    # 5.2# User must be able to see a hyper link to each attached document
    # 6#. User must see an active button <Submit Query>
    # 7#. User must see an active buton <Cancel>
    Given that I am logged on the PTA application
    And I have selected one or more statements
    And i have pressed the <Query> button
    When the system opens up the Query details screen
    And I am offered with a choice of predefined query categories presented in a drop-down
    And I can enter the details of my query in a narrative field
    And I can see an active button to upload a document and associate it with my query
    And I can see an active button <Submit Query>
    And I can see an active button to cancel my entry

  Scenario: Add document to query
    # Acceptance Criteria:
    # 
    # 1#. User must see an active button <Select document>
    # 2#. <Select Document> button must allow the user to select document to load from their own computer / network folders.
    # 3#. User must be notified with a pop-up message on the result of the upload attempt (<successfully upload> or <operation failed, please try again>)
    # 4#. Upon seccessful upload the user must see the file name and the file type of the upload
    # 5#. User must be able to add document description in a free text narrative that holds up to 255 charecters
    # 5.1# Document description field must be disabled when no document has been attached
    # 6#. User must see an active buton <Upload document>
    # 6.1# <Upload document> button must be disabled when no document has been attached
    # 7#. <Upload document> must associate the uploaded document with the query for all submissions the query relates to
    # 8#. User must see an active buton <Cancel>
    # 9#. <Cancel> prompt the user to confirm the operation
    # 10#. Confirmation of the <Cancel Operation> must dismiss the entire operation, discard the document and close the <Add document> screen
    Given that I am logged on the PTA application
    And I have opened Query details screen
    And I can see an active button <Add Document>
    When I press the <Add document> buton
    Then the system must open a pop-screen to enable document upload
    And I must be able to browse for a document from my local machine
    And select the document to be upload
    And see the name of the uploaded document
    And see name and the type of the file in read-only field
    And add free text description of
    And see an active button <<Upload>>
    And see and active button <<Cancell>>

  Scenario: Submit query as Lead Agreement Party
    # Acceptance criteria:
    # 
    # 1#. A query is raised with the Broker
    # 2#. The status of the submission is changed to "query pending"
    # 3#. The status of the XIS workflow item is changed to "query pending"
    # 4#. The IMR work package status is changed to "query pending"
    # 5#. Any attached documents forming part of the query submission is stored on the IMR within the work package corresponding to the respective Bureua
    # 6#. A busness level ACORD TA Query Acknowledgement is generated and sent to the Broker
    # 7#. A new query is registered on the Query Portal 
    # 8#. The new query assigned to the correct Broker
    # 9#. The new query assigned to the correct UMR and broker reference
    # 10#. An e-mail notification is triggered to the Broker
    Given that I am logged on the PTA application
    And I am the Lead Agreement Party
    And I have entered query details in the designated area of the application
    And I have successfully uploaded one or more documents
    And the <Submit Query> button is active
    When I press the <Submit Query> button
    And change the status of the submission to "Queried with Broker"
    And register the query in PbS Query Portal
    And store any attached document on the IMR
    And trigger an ACORD L4 Business Query message to the Broker
    And send an e-mail notification to the Broker inline with existing PbS Query Portal functionality
