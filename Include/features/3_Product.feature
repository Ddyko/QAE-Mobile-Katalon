@Product
Feature: Product Android

  @positive_case
  Scenario: A6.1 - User want to add new product
    Given User already open the app
    And User already in login page
    And User input registered email
    And User input correct password
    And User clicks login button
    And User successfully logged in and redirected to akun saya
    When User click icon of + button
    And User input product name
    And User input product price
    And User choose category
    And User input location
    And User input product description
    And User upload product image
    And Click publish button
    Then User will be redirected to daftar jual saya page
    
	@positive_case
	Scenario: A8.1 - User want to delete product
    
    Given User already open the app
    And User already in login page
    And User input registered email
    And User input correct password
    And User clicks login button
    And User tap daftar jual saya button
    And User click trash icon
    And User click delete
    Then User successfully delete product
