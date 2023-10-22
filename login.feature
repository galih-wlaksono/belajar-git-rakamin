Feature: Login page Saucedemo.com

  Scenario Outline: Success login number 1
    Given User is on login page
    When User input username
    And User input password
    And User click login/submit button
    Then User verify login result
    Examples:

  Scenario: Success login number 2
    Given User is on login page
    When User input locked username
    And User input password 2
    And User click login/submit button 2
    Then User verify login result 2

  Scenario: Success login number 3
    Given User is on login page
    When User input problem username
    And User input password 3
    And User click login/submit button 3
    Then User verify login result 3

  Scenario: Failed login
    Given User is on login page
    When User fill invalid username
    And User input invalid password
    And User click submit button
    Then User get error message
