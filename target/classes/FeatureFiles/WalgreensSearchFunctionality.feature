@regression @smoke
Feature:  Walgreens Search Box Functionality

Scenario: Successful search with a valid product name
    Given I am on the Walgreens homepage
    When I enter "Sunscreen" in the search box
    And I click the search button
    Then I should see a list of products related to "Sunscreen"