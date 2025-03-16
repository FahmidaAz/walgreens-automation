@regression 
Feature: Walgreens Checkbox functionality for shopNow button

Background: 
      Given Open Walgreens Homepage
   Scenario: BB cream checkbox functionality
     Given Open Walgreens Homepage
     When Click on "Shop Now" button
     And From shop page select "BB Cream" checkbox
     Then "BB Cream" related product will be showed