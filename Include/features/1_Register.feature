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
