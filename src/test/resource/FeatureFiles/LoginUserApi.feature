@regression @api
Feature: User Authentication

  Scenario: Login with valid credentials
    Given A registered user exists
    When The user logs in with correct username and password
    Then The response should contain a valid session token