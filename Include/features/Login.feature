@Login
Feature: Login Android

  @positive_case
  Scenario: A2.1-User want to login using registered email and correct password
    Given User already open the app
    And User already in login page
    When User input registered email
    And User input correct password
    And User clicks login button
    Then User successfully logged in and redirected to akun saya

  @negative_case
  Scenario Outline: User unable to login
    Given User already open the app
    And User already in login page
    When User input <email>
    And User input <password>
    And User clicks login button
    Then User remain in login page

    Examples: 
      | case_id | email              | password           |
      | A2.2    | unregistered email | correct password   |
      | A2.3    | registered email   | incorrect password |
      | A2.4    | empty email        | correct password   |
      | A2.5    | registered email   | empty password     |
