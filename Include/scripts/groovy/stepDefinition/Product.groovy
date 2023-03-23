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
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class Product {
	@When("User click icon of + button")
	public void user_click_icon_of_button() {
		Mobile.tap(findTestObject('Add product/btn_jual'), 0)
	}
	
	@When("User input product name")
	public void user_input_product_name() {
		Mobile.setText(findTestObject('Add product/input_nama_produk'), 'mesin cuci', 0)
	}
	
	@When("User input product price")
	public void user_input_product_price() {
		Mobile.setText(findTestObject('Add product/input_harga_produk'), '1000000', 0)
	}
	
	@When("User choose category")
	public void user_choose_category() {
		Mobile.tap(findTestObject('Add product/select_kategori'), 0)
		Mobile.tap(findTestObject('Add product/kategori_elektronik'), 0)
	}
	
	@When("User input location")
	public void user_input_location() {
		Mobile.setText(findTestObject('Add product/input_lokasi_produk'), 'Serang', 0)
	}
	
	@When("User input product description")
	public void user_input_product_description() {
		Mobile.setText(findTestObject('Add product/input_deskripsi_produk'), 'mesin cuci mini', 0)
	}
	
	@When("User upload product image")
	public void user_upload_product_image() {
		Mobile.tap(findTestObject('Add product/btn_image'), 0)
		Mobile.tap(findTestObject('Add product/btn_galeri'), 0)
		Mobile.tap(findTestObject('Add product/image'), 0)
	}
	
	@When("Click publish button")
	public void click_publish_button() {
		Mobile.tap(findTestObject('Add product/btn_terbitkan'), 0)
	}
	
	@Then("User will be redirected to daftar jual saya page")
	public void user_will_be_redirected_to_daftar_jual_saya_page() {
		Mobile.verifyElementVisible(findTestObject('Add product/daftarjualsaya_page'), 0)
	}
}
