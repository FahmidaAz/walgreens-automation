@regression @api
Feature: User API testing
Scenario: User CRUD API

 Given Create User
 When Update User
 Then Get User
 And Delete User