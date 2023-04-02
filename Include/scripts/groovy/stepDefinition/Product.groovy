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
import com.kms.katalon.core.testobject.MobileTestObject.MobileLocatorStrategy
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


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
			Mobile.tap(findTestObject('Add product/image_washingmachine'), 0)
		}
	
		@When("Click publish button")
		public void click_publish_button() {
			Mobile.tap(findTestObject('Add product/btn_terbitkan'), 0)
		}
	
		@Then("User will be redirected to daftar jual saya page")
		public void user_will_be_redirected_to_daftar_jual_saya_page() {
			Mobile.delay(2)
			Mobile.verifyElementVisible(findTestObject('Add product/daftarjualsaya_page'), 0)
		}
	
		@When("User leave product name field empty")
		public void user_leave_product_name_field_empty() {
			Mobile.tap(findTestObject('Object Repository/Add product/input_nama_produk'), 0)
		}
	
		@Then("Remain in add product page")
		public void remain_in_add_product_page() {
			Mobile.verifyElementVisible(findTestObject('Object Repository/Add product/add_product_page'), 0)
		}
	
		@When("User leave product price field empty")
		public void user_leave_product_price_field_empty() {
			Mobile.tap(findTestObject('Object Repository/Add product/input_harga_produk'), 0)
		}
	
		@When("User leave product category field empty")
		public void user_leave_product_category_field_empty() {
			Mobile.tap(findTestObject('Object Repository/Add product/select_kategori'), 0)
			Mobile.tap(findTestObject('Object Repository/Add product/select_kategori'), 0)
		}
	
		@When("User leave product location field empty")
		public void user_leave_product_location_field_empty() {
			Mobile.tap(findTestObject('Object Repository/Add product/input_lokasi_produk'), 0)
		}
	
		@When("User leave product description field empty")
		public void user_leave_product_description_field_empty() {
			Mobile.tap(findTestObject('Object Repository/Add product/input_deskripsi_produk'), 0)
		}
	
		@When("User leave product image field empty")
		public void user_leave_product_image_field_empty() {
			Mobile.tap(findTestObject('Object Repository/Add product/btn_image'), 0)
			Mobile.tap(findTestObject('Object Repository/Add product/view_addproduk_page'), 0)
		}
	
		@Given("User already in homepage without register and login")
		public void user_already_in_homepage_without_register_and_login() {
				Mobile.startApplication('APK/app-release.apk', true)
		}
	
		@Then("User will be redirected to login page")
		public void user_will_be_redirected_to_login_page() {
			Mobile.verifyElementVisible(findTestObject('Object Repository/Akun Page Before Login/button_masuk'), 0)
		}

		@When("User click daftar jual saya button")
		public void user_click_daftar_jual_saya_button() {
			Mobile.tap(findTestObject('Object Repository/Edit product/daftar_jual_saya'), 0)
	}

		@When("User click product page")
		public void user_click_product_page() {
			Mobile.tap(findTestObject('Object Repository/Edit product/product_ke2'), 0)
	}

		@When("User edit product name")
		public void user_edit_product_name() {
			Mobile.setText(findTestObject('Object Repository/Edit product/edit_nama_produk'), 'Mouse', 0)
	}

		@When("User edit product price")
		public void user_edit_product_price() {
			Mobile.setText(findTestObject('Object Repository/Edit product/edit_harga_produk'), '150000', 0)
	}

		@When("User edit category")
		public void user_edit_category() {
			Mobile.tap(findTestObject('Object Repository/Edit product/pilih_kategori'), 0)
			Mobile.tap(findTestObject('Object Repository/Edit product/kategori_komputeraksesoris'), 0)
	}

		@When("User edit location")
		public void user_edit_location() {
			Mobile.setText(findTestObject('Object Repository/Edit product/edit_lokasi_produk'), 'Jakarta', 0)
	}

		@When("User edit product description")
		public void user_edit_product_description() {
			Mobile.setText(findTestObject('Object Repository/Edit product/edit_deskripsi_produk'), 'Mouse bluetooth warna pink', 0)
	}

		@When("User edit product image")
		public void user_edit_product_image() {
			Mobile.tap(findTestObject('Object Repository/Edit product/btn_image'), 0)
			Mobile.tap(findTestObject('Object Repository/Edit product/btn_galeri'), 0)
			Mobile.tap(findTestObject('Object Repository/Edit product/image_ke3'), 0)
			Mobile.verifyElementVisible(findTestObject('Object Repository/Add product/add_product_page'), 0)
	}
	
		@When("Click update button")
		public void click_update_button() {
				Mobile.tap(findTestObject('Object Repository/Edit product/btn_perbarui_produk'), 0)
	}
		
		@When("User edit product name field empty")
		public void user_edit_product_name_field_empty() {
				Mobile.tap(findTestObject('Object Repository/Edit product/edit_nama_produk'), 0)
				Mobile.clearText(findTestObject('Object Repository/Edit product/edit_nama_produk'), 0)
			
		}
		
		@Then("Remain in ubah product page")
		public void remain_in_ubah_product_page() {
			Mobile.delay(4)
			Mobile.verifyElementVisible(findTestObject('Object Repository/Edit product/ubah_produk_page'), 0)
		}
		
		@When("User edit product price field empty")
		public void user_edit_product_price_field_empty() {
			Mobile.tap(findTestObject('Object Repository/Edit product/edit_harga_produk'), 0)
			Mobile.clearText(findTestObject('Object Repository/Edit product/edit_harga_produk'), 0)
		}
		
		@When("User edit location field empty")
		public void user_edit_location_field_empty() {
			Mobile.tap(findTestObject('Object Repository/Edit product/edit_lokasi_produk'), 0)
			Mobile.clearText(findTestObject('Object Repository/Edit product/edit_lokasi_produk'), 0)
		}
		
		@When("User edit product description field empty")
		public void user_edit_product_description_field_empty() {
			Mobile.tap(findTestObject('Object Repository/Edit product/edit_deskripsi_produk'), 0)
			Mobile.clearText(findTestObject('Object Repository/Edit product/edit_deskripsi_produk'), 0)
		}

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
		Mobile.tap(findTestObject('Add product/image_washingmachine'), 0)
	}

	@When("Click publish button")
	public void click_publish_button() {
		Mobile.tap(findTestObject('Add product/btn_terbitkan'), 0)
	}

	@Then("User will be redirected to daftar jual saya page")
	public void user_will_be_redirected_to_daftar_jual_saya_page() {
		Mobile.verifyElementVisible(findTestObject('Add product/daftarjualsaya_page'), 0)
	}

	@Then("User tap daftar jual saya button")
	public void User_tap_daftar_jual_saya_button() {
		Mobile.tap(findTestObject('Object Repository/Akun Page After Login/daftar_jual'), 0)
	}
	@When("User click product")
	public void User_click_product() {
		Mobile.tap(findTestObject('Object Repository/Add product/btn_Product'), 0)
	}
	@When("User click trash icon")
	public void User_click_trash_icon() {
		Mobile.tap(findTestObject('Object Repository/Add product/btn_hapusProduct'), 0)
	}
	@When("User click delete")
	public void User_click_delete() {
		Mobile.tap(findTestObject('Object Repository/Add product/btn_ConfirmHapus'), 0)
	}
	@Then("User successfully delete product")
	public void User_successfully_delete_product() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Add product/card_berhasilHapus'), 0)
	}
}
