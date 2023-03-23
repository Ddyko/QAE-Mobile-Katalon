import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('APK/app-release.apk', false)

Mobile.tap(findTestObject('Add product/btn_jual'), 0)

Mobile.tap(findTestObject('Akun Page Before Login/button_masuk'), 0)

Mobile.setText(findTestObject('Login Page/field_email'), 'andiko2@gmail.com', 0)

Mobile.setText(findTestObject('Login Page/field_password'), '123123', 0)

Mobile.tap(findTestObject('Login Page/button_login'), 0)

Mobile.setText(findTestObject('Add product/input_nama_produk'), 'mesin cuci', 0)

Mobile.setText(findTestObject('Add product/input_harga_produk'), '1000000', 0)

Mobile.tap(findTestObject('Add product/select_kategori'), 0)

Mobile.tap(findTestObject('Add product/kategori_elektronik'), 0)

Mobile.setText(findTestObject('Add product/input_lokasi_produk'), 'Serang', 0)

Mobile.setText(findTestObject('Add product/input_deskripsi_produk'), 'mesin cuci mini', 0)

Mobile.tap(findTestObject('Add product/btn_image'), 0)

Mobile.tap(findTestObject('Add product/btn_galeri'), 0)

Mobile.tap(findTestObject('Add product/image'), 0)

Mobile.tap(findTestObject('Add product/btn_terbitkan'), 0)

Mobile.verifyElementVisible(findTestObject('Add product/daftarjualsaya_page'), 0)

