@Product
Feature: Product Android

  #@positive_case
  #Scenario: A6.1 - User want to add new product
    #Given User already open the app
    #And User already in login page
    #And User input registered email
    #And User input correct password
    #And User clicks login button
    #And User successfully logged in and redirected to akun saya
    #When User click icon of + button
    #And User input product name
    #And User input product price
    #And User choose category
    #And User input location
    #And User input product description
    #And User upload product image
    #And Click publish button
    #Then User will be redirected to daftar jual saya page
#
  #@negative_case
  #Scenario Outline: User can't add new product
    #Given User already open the app
    #And User already in login page
    #And User input registered email
    #And User input correct password
    #And User clicks login button
    #And User successfully logged in and redirected to akun saya
    #When User click icon of + button
    #And User leave product <field>
    #And Click publish button
    #Then Remain in add product page
#
    #Examples: 
      #| case_id | field                   |
      #| A6.2    | name field empty        |
      #| A6.3    | price field empty       |
      #| A6.4    | category field empty    |
      #| A6.5    | location field empty    |
      #| A6.6    | description field empty |
      #| A6.7    | image field empty       |
#
  #@negative_case
  #Scenario: A6.8 - User can't add product without register and login
    #Given User already in homepage without register and login
    #When User click icon of + button
    #Then User will be redirected to login page
#
  #@positive_case
  #Scenario: A7.1 - User want to edit product
    #Given User already open the app
    #And User already in login page
    #And User input registered email
    #And User input correct password
    #And User clicks login button
    #And User successfully logged in and redirected to akun saya
    #When User click daftar jual saya button
    #And User click product page
    #And User edit product name
    #And User edit product price
    #And User edit category
    #And User edit location
    #And User edit product description
    #And User edit product image
    #And Click update button
    #Then User will be redirected to daftar jual saya page
#
  #@negative_case
  #Scenario Outline: User can't edit product
    #Given User already open the app
    #And User already in login page
    #And User input registered email
    #And User input correct password
    #And User clicks login button
    #And User successfully logged in and redirected to akun saya
    #When User click daftar jual saya button
    #And User click product page
    #And User edit <field>
    #And Click update button
    #Then Remain in ubah product page
#
    #Examples: 
      #| case_id | field		                        |
      #| A7.2    | product name field empty        |
      #| A7.3    | product price field empty       |
      #| A7.4    | location field empty            |
      #| A7.5    | product description field empty |

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
