Feature: Navigate to Mats Category and Filter by GoFit Brand

  Scenario: User navigates to Mats category and filters by GoFit brand
    Given the user is on the Walgreens homepage
    When the user hovers over the "Shop Products" dropdown
    And the user clicks on "Fitness & Exercise" from the dropdown
    And the user clicks on "Yoga & Pilates" from the subcategory dropdown
    And the user clicks on "Mats" from the filtered category
    Then the "Mats" category page should be displayed
    When the user expands the "Brand" filter
    And the user clicks on the "GoFit" brand
    Then the product list should be filtered to show only "GoFit" mats
