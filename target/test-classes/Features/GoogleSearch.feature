Feature: This feature for Google Search


  Scenario: Validate google searching is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to the search reasults website.

