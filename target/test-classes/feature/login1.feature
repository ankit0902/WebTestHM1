Feature: Login

  Background:
Given user is on home page

@login
Scenario Outline: User should not able to login with invalid credential

  When user enters username as "<Username>" and password as "<Password>"
  And user clicks on Login
  Then user should see "<ErrorMessage>"

  Examples:
    | Username      | Password      | ErrorMessage                |
    | Admin         | admin1234     | Invalid credentials         |
    | admin         | admin1234     | Invalid credentials         |
    | Admin         | admin12       | Invalid credentials         |
    | admin         | Admin1234     | Invalid credentials         |
    |               | admin123      | Username cannot be empty    |
    | Admin         |               | Password cannot be empty    |
    |               |               | Username cannot be empty    |
    |               | Admin123      | Username cannot be empty    |
    |admin          |               | Password cannot be empty    |




