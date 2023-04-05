Feature: [AND] Receive Product Bid

		Background: 
		    Given User already open the app
		    And User already in login page
		    When User input registered email
		    And User input correct password
		    And User clicks login button
		    Then User successfully logged in and redirected to akun saya
    
    @positive_case
    Scenario: [A10.1] User accept bid product price
    When User tap daftar jual saya
    And User tap diminati page
    And User tap on selected product
    And User tap terima
    Then Message appear that bid is accepted

    #@positive_case
    #Scenario: [A10.2] User want to update product status to sold
    #And User tap daftar jual saya
    #And User tap diminati page
    #And User tap on selected product
    #And User tap status
    #And User tap berhasil terjual
    #And User tap simpan
    #Then Message appear that product status successfully updated

    #@positive_case
    #Scenario: [A10.3] User want to update product status to cancelled
    #And User tap daftar jual saya
    #And User tap diminati page
    #And User tap on selected product
    #And User tap status
    #And User tap batalkan transaksi
    #And User tap simpan
    #Then Message appear that product status successfully updated

    @positive_case
    Scenario: [A10.4] User want to reject bid product price
    When User tap daftar jual saya
    And User tap diminati page
    And User tap on selected product
    And User tap tolak
    Then Message appear that product bid rejected