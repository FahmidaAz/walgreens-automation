@regression
Feature: Walgreens Login Fuanctionality

Scenario: Successfull login with valid credentials
	Given Users is in the login page
	When Users logged in with valid credential "mahfuz1471@gmail.com" and Password "Jashore@0421"
	And Users click on Sign in button
	Then Users should redirect to Your Account page 