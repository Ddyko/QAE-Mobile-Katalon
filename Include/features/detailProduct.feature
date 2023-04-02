Feature: Homepage Product

@positive_case
    Scenario: A3.1-User want to see detail of products in homepage
        Given User successfully login to homepage 
            When User tap product carousel
            Then User can see detail of product information

@positive_case
    Scenario: A3.2-User want to see detail of products in homepage without login
        Given User already in landing page
            When User tap product carousel
            Then User can see detail of product information
