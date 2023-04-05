Feature: Bid Product

    Scenario: [A9.1] User can bid product price to seller
    Given User successfully login to homepage
    When User click product in homepage
    And User  click saya tertarik dan ingin nego button
    And User input bid price
    And User click Kirim button
    Then Message appear that biding price has sent to seller