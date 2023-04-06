@Profile
Feature: [AND] Edit Profile

		Background: 
    Given User already open the app
    And User already in login page
    When User input registered email
    And User input correct password
    And User clicks login button
    Then User successfully logged in and redirected to akun saya

    @positive_case
    Scenario: [A11.1] User want to change profile picture
    When User tap pencil icon
    And User tap profile picture
    And User tap gallery button
    And User choose new picture from gallery
    Then User will be redirected to account page
    
    @positive_case
    Scenario Outline: User want to edit profile
    When User tap pencil icon
    And User tap <field> field
    And User edit <field>
    And User tap simpan button
    Then User successfully updated the profile
    And User can see message that profile has been updated
    Examples:
        | case_id   |  field           |
        | A11.2     |  name            |
        | A11.3     |  phone number    |
        | A11.4     |  city            |
        | A11.5     |  address         |
        | A11.6     |  email           |
        | A11.7     |  password        |
    
    @negative_case
    Scenario Outline: User can't edit profile
    When User tap pencil icon
    And User tap <field> field
    And User empty <field> field
    And User tap simpan button
    Then User can see message that field must be filled
    Examples:
        | case_id    |  field           |
        | A11.8      |  name            |
        | A11.9      |  phone number    |
        | A11.10     |  city            |
        | A11.11     |  address         |
        | A11.12     |  email           |
        | A11.13     |  password        |