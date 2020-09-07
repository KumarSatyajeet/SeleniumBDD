Feature: Test Login
  Scenario Outline: Check login is successful with valid data
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    Then User navigated to home page

    Examples:
    |username | password|
    |k.satyajeet50@gmail.com | Laltu@1991|