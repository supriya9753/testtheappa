Feature: Test login functionality

  Scenario: Check login is sucessfully with valid credatials
    Given browser is open
    And user is an login page
    When user enters username and password
    When user clicks on login
    Then user is navigated to home page
