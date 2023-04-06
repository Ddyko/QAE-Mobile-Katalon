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
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import internal.GlobalVariable

public class bidProduct {

	@Given("User successfully login to homepage")
	public void user_successfully_login_to_homepage() {
		Mobile.startApplication('APK/app-release.apk', true)
		Mobile.tap(findTestObject('button_akun'), 0)
		Mobile.tap(findTestObject('Akun Page Before Login/button_masuk'), 0)
		Mobile.verifyElementVisible(findTestObject('Login Page/text_masuk'), 0)
		Mobile.setText(findTestObject('Login Page/field_email'), 'andiko2@gmail.com', 0)
		Mobile.setText(findTestObject('Login Page/field_password'), '123123', 0)
		Mobile.tap(findTestObject('Login Page/button_login'), 0)
		Mobile.tap(findTestObject('Object Repository/Bid Product/btn_Beranda'), 0)
	}

	@When("User click product in homepage")
	public void user_click_product_in_homepage() {
		Mobile.tap(findTestObject('Object Repository/Bid Product/input_caritext'), 0)
		Mobile.setText(findTestObject('Object Repository/Bid Product/android.widget.EditText - Cari di Second Chance'), 'fender', 0)

		Mobile.tap(findTestObject('Object Repository/Bid Product/icon_barang'), 0)
	}

	@When("User  click saya tertarik dan ingin nego button")
	public void user_click_saya_tertarik_dan_ingin_nego_button() {
		Mobile.tap(findTestObject('Object Repository/Bid Product/btn_Tertarik2'), 0)
	}

	@When("User input bid price")
	public void user_input_bid_price() {
		Mobile.setText(findTestObject('Object Repository/Bid Product/input_hargaBid'), '12000000', 0)
	}

	@When("User click Kirim button")
	public void user_click_Kirim_button() {
		Mobile.tap(findTestObject('Object Repository/Bid Product/btn_kirimBid'), 0)
	}

	@Then("Message appear that biding price has sent to seller")
	public void message_appear_that_biding_price_has_sent_to_seller() {
	}
	
	@Given("User successfully login to homepage seller")
	public void user_successfully_login_to_homepage_seller() {
		Mobile.startApplication('APK/app-release.apk', true)
		Mobile.tap(findTestObject('button_akun'), 0)
		Mobile.tap(findTestObject('Akun Page Before Login/button_masuk'), 0)
		Mobile.verifyElementVisible(findTestObject('Login Page/text_masuk'), 0)
		Mobile.setText(findTestObject('Login Page/field_email'), 'pandastepsmusic@gmail.com', 0)
		Mobile.setText(findTestObject('Login Page/field_password'), '123123123', 0)
		Mobile.tap(findTestObject('Login Page/button_login'), 0)
	}
	
	@Given("User successfully login to homepage buyer")
	public void user_successfully_login_to_homepage_buyer() {
		Mobile.startApplication('APK/app-release.apk', true)
		Mobile.tap(findTestObject('button_akun'), 0)
		Mobile.tap(findTestObject('Akun Page Before Login/button_masuk'), 0)
		Mobile.verifyElementVisible(findTestObject('Login Page/text_masuk'), 0)
		Mobile.setText(findTestObject('Login Page/field_email'), 'contoh@gmail.com', 0)
		Mobile.setText(findTestObject('Login Page/field_password'), 'contoh123', 0)
		Mobile.tap(findTestObject('Login Page/button_login'), 0)
		Mobile.tap(findTestObject('Object Repository/Bid Product/btn_Beranda'), 0)
	}
	
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
		Mobile.tap(findTestObject('Object Repository/Bid Product/icon_bidbarang'), 0)
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
		Mobile.verifyElementVisible(findTestObject('Object Repository/Receive_Bid_Page/info_penawar'), 0)
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
