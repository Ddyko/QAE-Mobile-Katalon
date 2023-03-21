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
import cucumber.api.java.en.When
import cucumber.api.java.en.Then
import internal.GlobalVariable

public class detailProduct {
	
	@Given("User successfully login to homepage")
	public void user_successfully_login_to_homepage() {
		Mobile.startApplication('APK/app-release.apk', true)
		Mobile.tap(findTestObject('button_akun'), 0)
		Mobile.tap(findTestObject('Akun Page Before Login/button_masuk'), 0)
		Mobile.setText(findTestObject('Login Page/field_email'), 'andiko2@gmail.com', 0)
		Mobile.setText(findTestObject('Login Page/field_password'), '123123', 0)
		Mobile.tap(findTestObject('Login Page/button_login'), 0)
		Mobile.tap(findTestObject('Object Repository/Product_Detail_Page/btn_Beranda'), 0)
	}
	
	@When("User tap product carousel")
	public void user_tap_product_carousel() {
		Mobile.tap(findTestObject('Object Repository/Product_Detail_Page/btn_productIcon'), 0)
	}
	
	@Then("User can see detail of product information")
	public void user_can_see_detail_of_product_information() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Product_Detail_Page/btn_bid'), 0)
	}
	@Given("User already in landing page")
	public void User_already_in_landing_page() {
		Mobile.startApplication('APK/app-release.apk', true)
	}
	
}
