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

public class Login {
	@Given("User already open the app")
	public void user_already_open_the_app() {
		Mobile.startApplication('APK/app-release.apk', true)
	}

	@Given("User already in login page")
	public void user_already_in_login_page() {
		Mobile.tap(findTestObject('button_akun'), 0)

		Mobile.tap(findTestObject('Akun Page Before Login/button_masuk'), 0)

		Mobile.verifyElementVisible(findTestObject('Login Page/text_masuk'), 0)
	}

	@When("User input registered email")
	public void user_input_registered_email() {
		Mobile.setText(findTestObject('Login Page/field_email'), 'andiko2@gmail.com', 0)
	}

	@When("User input unregistered email")
	public void user_input_unregistered_email() {
		Mobile.setText(findTestObject('Login Page/field_email'), 'bukanandiko@gmail.com', 0)
	}

	@When("User input empty email")
	public void user_input_empty_email() {
		Mobile.setText(findTestObject('Login Page/field_email'), '', 0)
	}

	@When("User input correct password")
	public void user_input_correct_password() {
		Mobile.setText(findTestObject('Login Page/field_password'), '123123', 0)
	}

	@When("User input incorrect password")
	public void user_input_incorrect_password() {
		Mobile.setText(findTestObject('Login Page/field_password'), '123456789', 0)
	}

	@When("User input empty password")
	public void user_input_empty_password() {
		Mobile.setText(findTestObject('Login Page/field_password'), '', 0)
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		Mobile.tap(findTestObject('Login Page/button_login'), 0)
	}

	@Then("User successfully logged in and redirected to akun saya")
	public void user_successfully_logged_in_and_redirected_to_akun_saya() {
		Mobile.verifyElementVisible(findTestObject('Akun Page After Login/text_akun_saya'), 0)
	}

	@Then("User remain in login page")
	public void user_remain_in_login_page() {
		Mobile.verifyElementVisible(findTestObject('Login Page/text_masuk'), 0)
	}
}
