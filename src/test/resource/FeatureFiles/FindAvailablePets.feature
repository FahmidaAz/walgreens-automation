@regression @api
Feature: Search pets by status

  Scenario: Retrieve pets with status 'available'
    Given the Petstore API is available
    When I search for pets with status "available"
    Then the response status code should be 200
    And each pet in the response should have status "available"
