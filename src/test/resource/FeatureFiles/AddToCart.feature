@regression
Feature: Add Product to Cart

  Scenario: Add a product to the cart and verify it
  Given User is on the Walgreens home page
  When User searches for "vitamins"
  And User clicks the search button
  And User adds the product to the cart
  And User selects "Shipping" from the popup
  And User clicks on "View Cart"
  Then The product should be displayed in the shopping cart
