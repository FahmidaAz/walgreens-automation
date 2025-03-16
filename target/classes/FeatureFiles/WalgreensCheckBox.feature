@regression
Feature: Walgreens Checkbox functionality for shop dropdown

  Background: 
    Given Open Walgreens Homepage

  Scenario: Walgreens filter items through Checkbox
    Given Open Walgreens Homepage
    When Click on "Shop" dropdown
    And Select and click on "Vitamins & Suppliments"
    And Select and click on "Multivitamins"
    And Select and click on "Women's Multivitamins"
    Then "Women's multivitamin" related product will showed up
