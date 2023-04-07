Feature: [AND] Homepage Category

@positive_case
    Scenario Outline: User want to browse product by <category> filter
        Given User successfully login to homepage 
        When User tap <category> button
        Then User can see product with selected <category>
        Examples:
            |case_id |   category                  |
            |A4.1.1  |   Semua                     |
            |A4.1.2  |   Elektronik                | 
            |A4.1.3  |   Komputer							     | 
    
            

@positive_case
    Scenario Outline: User want to browse product without login by <category> filter
        Given User already at homepage
        When User tap <category> button
        Then User can see product with selected <category>
        Examples:
            |case_id |   category                  |
            |A4.2.1  |   Semua                     |
            |A4.2.2  |   Elektronik                | 
            |A4.2.3  |   Komputer 						     | 