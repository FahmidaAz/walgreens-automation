@regression
Feature: Walgreens Chat Now iFrame

  Scenario: User interacts with the Chat Now window on the Login Page
    Given User is on the Walgreens login page
    When User click on Chat Now  link
    And User switches to the Chat Now window
    And User type "Hi" in chat text field
    And User clicks on the send button
    Then User should be able to submit the message successfully