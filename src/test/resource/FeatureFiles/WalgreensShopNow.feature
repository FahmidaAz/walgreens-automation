@regression 
Feature: Walgreens Checkbox functionality for shopNow button

Background: 
      Given Open Walgreens Homepage
   Scenario: BB cream checkbox functionality
     Given Open Walgreens Homepage
     When Click on "Shop Now" button
     And From shop page select "Air Freshener Sprays" checkbox
     Then "Air Freshener Sprays" related product will be showed