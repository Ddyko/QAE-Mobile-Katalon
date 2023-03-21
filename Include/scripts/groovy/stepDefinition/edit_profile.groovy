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
import cucumber.api.java.en.When
import cucumber.api.java.en.Then
import org.apache.commons.lang3.RandomStringUtils
import internal.GlobalVariable

public class edit_profile {
	@When("User tap pencil icon")
	public void user_tap_pencil_icon() {
		Mobile.tap(findTestObject('Object Repository/Akun Page After Login/pencil_icon'), 0)
	}

	@When("User tap name field")
	public void user_tap_name_field() {
		Mobile.tap(findTestObject('Object Repository/Edit Profile Page/name_viewgroup'), 0)
	}

	@When("User edit name")
	public void user_edit_name() {
		Mobile.setText(findTestObject('Object Repository/Edit Profile Page/nama_field'), RandomStringUtils.randomAlphabetic(7), 0)
	}

	@When("User tap simpan button")
	public void user_tap_simpan_button() {
		Mobile.tap(findTestObject('Object Repository/Edit Profile Page/btn_simpan'), 0)
	}

	@Then("User successfully updated the profile")
	public void user_successfully_updated_the_profile() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Edit Profile Page/success_message'), 0)
	}

	@Then("User can see message that profile has been updated")
	public void user_can_see_message_that_profile_has_been_updated() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Edit Profile Page/success_message'), 0)
	}

	@When("User tap phone number field")
	public void user_tap_phone_number_field() {
		Mobile.tap(findTestObject('Object Repository/Edit Profile Page/phone_viewgroup'), 0)
	}

	@When("User edit phone number")
	public void user_edit_phone_number() {
		Mobile.setText(findTestObject('Object Repository/Edit Profile Page/phone_field'), RandomStringUtils.randomNumeric(12), 0)
	}

	@When("User tap city field")
	public void user_tap_city_field() {
		Mobile.tap(findTestObject('Object Repository/Edit Profile Page/city_viewgroup'), 0)
	}

	@When("User edit city")
	public void user_edit_city() {
		Mobile.setText(findTestObject('Object Repository/Edit Profile Page/city_field'), 'Bandar Lampung', 0)
	}

	@When("User tap address field")
	public void user_tap_address_field() {
		Mobile.tap(findTestObject('Object Repository/Edit Profile Page/address_viewgroup'), 0)
	}

	@When("User edit address")
	public void user_edit_address() {
		Mobile.setText(findTestObject('Object Repository/Edit Profile Page/address_field'), 'Bandar Lampung', 0)
	}

	//	@When("User tap email field")
	//	public void user_tap_email_field() {
	//		Mobile.tap(findTestObject('Object Repository/Edit Profile Page/email_viewgroup'), 0)
	//	}
	//
	//	@When("User edit email")
	//	public void user_edit_email() {
	//		Mobile.setText(findTestObject('Object Repository/Edit Profile Page/email_field'), 'contoh1@gmail.com', 0)
	//	}
	//
	//	@When("User tap password field")
	//	public void user_tap_password_field() {
	//		Mobile.tap(findTestObject('Object Repository/Edit Profile Page/password_viewgroup'), 0)
	//	}
	//
	//	@When("User edit password")
	//	public void user_edit_password() {
	//		Mobile.setText(findTestObject('Object Repository/Edit Profile Page/password_field'), 'contoh1234', 0)
	//	}
}
