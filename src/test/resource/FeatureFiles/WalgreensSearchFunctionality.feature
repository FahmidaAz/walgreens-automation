@regression @smoke
Feature: Walgreens Search Box Functionality

  Scenario: Successful search with a valid product name
    Given I am on the Walgreens homepage
    When I enter "Sunscreen" in the search box
    And I click the search button
    Then I should see a list of products related to "Sunscreen"

  Scenario: User searches for an item from Excel in the Walgreens search box
    Given the user is on the Walgreens homepage
    When the user enters the item from Excel in the search box
    And the user clicks the search button
    Then the search results should display products related to the item
