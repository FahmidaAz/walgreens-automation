@regression
Feature: Walgreens product search Scenerio Outline

	Scenario Outline: User searches for products 
	
	Given User is on the Walgreens Home Page
	When  User search for "<Products>"
	And  User select specific "<Brands>"
	Then The "<Brands>" related product should be displayed

Examples:
|Products		|Brands		|
|Toothpaste		|Colgate	|
|Shampoo		|Dove		|
|Pain Reliever	|Advil		|
