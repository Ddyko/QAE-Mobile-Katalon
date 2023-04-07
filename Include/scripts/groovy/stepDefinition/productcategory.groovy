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

public class productcategory {


		@Given("User already at homepage")
		public void User_already_at_homepage() {
			Mobile.startApplication('APK/app-release.apk', true)
			Mobile.tap(findTestObject('Object Repository/Product_Detail_Page/btn_Beranda'), 0)
		}

		@When("User tap Semua button")
		public void User_tap_Semua_button() {
			Mobile.tap(findTestObject('Object Repository/Product_Category_Page/btn-semua'), 0)
		}

		@When("User tap Elektronik button")
		public void User_tap_Elektronik_button() {
			Mobile.tap(findTestObject('Object Repository/Product_Category_Page/btn_Elektronik'), 0)
		}

		@When("User tap Komputer button")
		public void User_tap_Komputer_button() {
			Mobile.tap(findTestObject('Object Repository/Product_Category_Page/btn-kom'), 0)
		}
		@Then("User can see product with selected Semua")
		public void User_can_see_product_with_selected_Semua() {
		}
		@Then("User can see product with selected Elektronik")
		public void User_can_see_product_with_selected_Elektronik() {
		}
		@Then("User can see product with selected Komputer")
		public void User_can_see_product_with_selected_Komputer() {
		}
	}


