package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import org.apache.commons.lang3.RandomStringUtils



class Register {
	@Given("User already in registration page")
	public void user_already_in_registration_page() {
		Mobile.tap(findTestObject('button_akun'), 0)

		Mobile.tap(findTestObject('Akun Page Before Login/button_masuk'), 0)

		Mobile.tap(findTestObject('Login Page/A_Daftar'), 0)

		Mobile.verifyElementVisible(findTestObject('Register Page/text_Daftar'), 0)
	}

	@When("User input name")
	public void user_input_name() {
		Mobile.setText(findTestObject('Register Page/field_nama'), 'Dyko', 0)
	}

	@When("User input email")
	public void user_input_email() {
		Mobile.setText(findTestObject('Register Page/field_email'), RandomStringUtils.randomAlphanumeric(5)+'@gmail.com', 0)
	}

	@When("User input correct format password")
	public void user_input_correct_format_password() {
		Mobile.setText(findTestObject('Register Page/field_password'), '123123', 0)
	}

	@When("User input phone number")
	public void user_input_phone_number() {
		Mobile.setText(findTestObject('Register Page/field_hp'), '08123123123', 0)
	}

	@When("User input city")
	public void user_input_city() {
		Mobile.setText(findTestObject('Register Page/field_kota'), 'tangerang', 0)
	}

	@When("User input address")
	public void user_input_address() {
		Mobile.setText(findTestObject('Register Page/field_alamat'), 'pamulang', 0)
	}

	@When("User clicks daftar button")
	public void user_clicks_daftar_button() {
		Mobile.tap(findTestObject('Register Page/button_daftar'), 0)
	}

	@Then("User redirected to Akun Saya page")
	public void user_redirected_to_Akun_Saya_page() {
		Mobile.verifyElementVisible(findTestObject('Akun Page After Login/text_akun_saya'), 0)
	}
}