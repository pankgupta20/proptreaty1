Feature: Perform a GET request to retrieve information
    # In order to evaluate the end-to-end architecture and technologies
    # As a development team
    # We want to retrieve some information through the proportional treaty api

  Scenario: Valid request for Information
    Given I have constructed a valid GET request
    When I submit the request the proportional treaty api
    Then the correct information is returned
    And a 200 OK response is returned
    And the response conforms to the Richardson maturity model level 2
    And there is no information in the request body or headers that can compromise the security of the platform

  Scenario: Invalid request for information
    Given I have constructed an invalid GET request
    When I submit the request the proportional treaty api
    Then a 400 bad request is returned
    And the response conforms to the Richardson maturity model level 2
    And full details of the error are visible in the platform logging system
    And there is no information in the request body or headers that can compromise the security of the platform

  Scenario: Request fails with server error
    Given I have constructed a valid GET request
    When I submit the request the proportional treaty api
    Then a 500 server error is returned
    And the response conforms to the Richardson maturity model level 2
    And full details of the error are visible in the platform logging system
    And there is no information in the request body or headers that can compromise the security of the platform

  Scenario: Request using an unknown http verb
    Given I have created a request with an invalid http verb
    And I submit the request the proportional treaty api
    Then a 400 bad request is returned
    And the response conforms to the Richardson maturity model level 2
    And full details of the error are visible in the platform logging system
    And there is no information in the request body or headers that can compromise the security of the platform

  Scenario: Request to an unknown endpoint
    Given I have constructed a valid GET request
    And the endpoint is not a valid route on the api
    When I submit the request the proportional treaty api
    Then a 404 not found request is returned
    And the response conforms to the Richardson maturity model level 2
    And there is no information in the request body or headers that can compromise the security of the platform
