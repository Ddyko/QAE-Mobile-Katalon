@Register
Feature: Register Android

  @positive_case
  Scenario: A1.1-User want to register an account
    Given User already open the app
    And User already in registration page
    When User input name
    And User input email
    And User input correct format password
    And User input phone number
    And User input city
    And User input address
    And User clicks daftar button
    Then User redirected to Akun Saya page

  @negative_case
  Scenario Outline: User unable to register an account
    Given User already open the app
    And User already in registration page
    When User input <name>
    And User input <email>
    And User input <password>
    And User input phone number
    And User input city
    And User input address
    And User clicks daftar button
    Then User remain in register page
    Examples: 
      | case_id | name       | email                    | password                       |
      | A1.2    | name       | already registered email | correct format password        |
      | A1.3    | name       | invalid format email     | correct format password        |
      | A1.4    | name       | email                    | less than 6 character password |
      | A1.5    | empty name | email                    | correct format password        |
