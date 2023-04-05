package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.Then
import internal.GlobalVariable

public class Status {
	@When("User tap daftar jual saya")
	public void user_tap_daftar_jual_saya() {
		Mobile.tap(findTestObject('Object Repository/Akun Page After Login/daftar_jual'), 0)
	}
	
	@When("User tap diminati page")
	public void user_tap_diminati_page() {
		Mobile.tap(findTestObject('Object Repository/Daftar Jual/Tab_Diminati'), 0)
	}
	
	@When("User tap on selected product")
	public void user_tap_on_selected_product() {
	}
	
	@When("User tap terima")
	public void user_tap_terima() {
		Mobile.tap(findTestObject('Object Repository/Receive_Bid_Page/btn_terima'), 0)
	}
	
	@Then("Message appear that bid is accepted")
	public void message_appear_that_bid_is_accepted() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Receive_Bid_Page/btn_hubungi'), 0)
	}
	
	@When("User tap tolak")
	public void user_tap_tolak() {
		Mobile.tap(findTestObject('Object Repository/Receive_Bid_Page/btn_tolak'), 0)
	}
	
	@Then("Message appear that product bid rejected")
	public void message_appear_that_product_bid_rejected() {
		Mobile.tap(findTestObject('Object Repository/Receive_Bid_Page/info_penawar'), 0)
	}
	
	@When("User tap status")
	public void user_tap_status() {
		Mobile.tap(findTestObject('Object Repository/Receive_Bid_Page/btn_status'), 0)
	}
	
	@When("User tap berhasil terjual")
	public void user_tap_berhasil_terjual() {
		Mobile.tap(findTestObject('Object Repository/Receive_Bid_Page/Radio_sold'), 0)
	}
	
	@When("User tap batalkan transaksi")
	public void user_tap_batalkan_transaksi() {
		Mobile.tap(findTestObject('Object Repository/Receive_Bid_Page/Radio_cancel'), 0)
	}
	
	@When("User tap simpan")
	public void user_tap_simpan() {
		Mobile.tap(findTestObject('Object Repository/Receive_Bid_Page/btn_set_status'), 0)
	}
}
