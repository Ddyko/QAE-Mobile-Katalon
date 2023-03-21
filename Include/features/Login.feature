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
