@BidProduct
Feature: Bid Product

    Scenario: [A9.1] User can bid product price to seller
    Given User successfully login to homepage
    When User click product in homepage
    And User  click saya tertarik dan ingin nego button
    And User input bid price
    And User click Kirim button
    Then Message appear that biding price has sent to seller
    
    Scenario: [A10.4] User want to reject bid product price
    Given User successfully login to homepage seller
    When User tap daftar jual saya
    And User tap diminati page
    And User tap on selected product
    And User tap tolak
    Then Message appear that product bid rejected
    
    Scenario: [A9.1] User can bid product price to seller
    Given User successfully login to homepage buyer
    When User click product in homepage
    And User  click saya tertarik dan ingin nego button
    And User input bid price
    And User click Kirim button
    Then Message appear that biding price has sent to seller
    
    Scenario: [A10.1] User accept bid product price
    Given User successfully login to homepage seller
    When User tap daftar jual saya
    And User tap diminati page
    And User tap on selected product
    And User tap terima
    Then Message appear that bid is accepted