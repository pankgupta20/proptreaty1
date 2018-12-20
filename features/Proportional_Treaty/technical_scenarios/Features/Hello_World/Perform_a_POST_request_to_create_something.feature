Feature: Perform a POST request to create something
    # In order to evaluate the end-to-end architecture and technologies
    # As a development team
    # We want to create something in the proportional treaty database

  Scenario: Valid request to create something
    Given I have constructed a valid POST request
    When I submit the request the proportional treaty api
    Then a 200 OK response is returned
    And the response conforms to the Richardson maturity model level 2
    And there is no information in the request body or headers that can compromise the security of the platform
    And something is persisted

  Scenario: Invalid request to create something
    Given I have constructed an invalid POST request
    When I submit the request the proportional treaty api
    Then a 400 bad request is returned
    And there is no information in the request body or headers that can compromise the security of the platform
    And the response conforms to the Richardson maturity model level 2
    And full details of the error are visible in the platform logging system
    And nothing is persisted

  Scenario: Valid request to create something with invalid data
    Given I have constructed a valid POST request with invalid data
    When I submit the request the proportional treaty api
    Then a 400 bad request is returned
    And there is no information in the request body or headers that can compromise the security of the platform
    And the response conforms to the Richardson maturity model level 2
    And full details of the error are visible in the platform logging system
    And nothing is persisted
