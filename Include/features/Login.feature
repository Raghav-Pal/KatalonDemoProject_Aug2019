Feature: feature to test login functionality

  Scenario Outline: 
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Admin123 |     1234 |
      | Admin432 |     4567 |
