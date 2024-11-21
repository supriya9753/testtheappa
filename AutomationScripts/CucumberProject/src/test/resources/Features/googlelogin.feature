Feature: feature to check google search functionalty

  Scenario: Validate the google seacrh is working
    Given Browser is open
    And user is in google search page
    When user enter a text in search box
    And hits enter
    Then user is navigate to search results
