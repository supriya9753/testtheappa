Feature: Facebook login

  Scenario: Facebook login is sucessfully with valid credatials
    Given Chrome browser is open
    And user is an facebook login page
    Then user enters the username and password
    When user click on login button
    Then user is navigated to facebook authenticaton page
