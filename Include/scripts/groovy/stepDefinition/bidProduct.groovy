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

		Mobile.tap(findTestObject('Object Repository/Bid Product/icon_barangBid'), 0)
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
}
