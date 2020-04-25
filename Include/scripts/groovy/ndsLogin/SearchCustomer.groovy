package ndsLogin
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



class SearchCustomer {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user klik non monitory")
	def user_klik_non_monitory() {
		WebUI.click(findTestObject('Object Repository/SearchCustomer/Page_listData/div_Non Monetary'))
	}

	@When("user klik CIF")
	def user_klik_CIF() {
		WebUI.click(findTestObject('Object Repository/SearchCustomer/SearchByCIF/Page_New Delivery System/div_CIF'))
	}

	@Then("user klik inquiry")
	def user_klik_inquiry() {
		WebUI.click(findTestObject('Object Repository/SearchCustomer/SearchByCIF/Page_New Delivery System/div_Inquiry'))
	}
	@And("user input cifnum (.*)")
	def user_input_cifnum(String cifnum){
		WebUI.setText(findTestObject('Object Repository/SearchCustomer/SearchByCIF/Page_New Delivery System/input_No Rekening_f_ce64f599-d86c-4a54-a76d-4eb33462fec1'), cifnum)
	}
	@And("user input account (.*)")
	def user_input_account(String account){
		WebUI.setText(findTestObject('Object Repository/SearchCustomer/SearchByNorek/Page_New Delivery System/input_Search CIF_f_57612b1a-2b3f-4c21-a6a4-09fd12418857'), account)
	}
	@And("user input idnum (.*)")
	def user_input_idnum(String idnum){
		WebUI.setText(findTestObject('Object Repository/SearchCustomer/SearchByNoID/Page_New Delivery System/input_CIF_f_eba5984b-0326-4ed3-906b-b66fb0b4da27'),idnum)
	}
	@And("user input nama (.*)")
	def user_input_nama(String nama){
		WebUI.setText(findTestObject('Object Repository/SearchCustomer/SearchByName_TglLahir/Page_New Delivery System/input_No ID_f_4e2e57ba-799f-4808-80bf-7bc073b9b956'), nama)
	}
	@And("user input tgl_lahir (.*)")
	def user_input_tgl_lahir(String tgl_lahir){
		WebUI.setText(findTestObject('Object Repository/SearchCustomer/SearchByName_TglLahir/Page_New Delivery System/input_Nama Lengkap_f_d0029c16-0d10-4648-bf4d-4ed8580c0b62'), tgl_lahir)
	}

	@And("user klik button search")
	def user_klik_button_search(){
		WebUI.click(findTestObject('Object Repository/SearchCustomer/Page_listData/div_Search'))
		WebUI.delay(2)
	}

	@Then("verify (.*)")
	def verify(String result){
		WebUI.verifyTextPresent(result, false, FailureHandling.OPTIONAL)
	}
	@And("wait for minutes")
	def wait_for(){
		WebUI.delay(5)
	}
	@And("verify DataDebitur")
	def verify_DataDebitur(){
		WebUI.verifyElementPresent(findTestObject('Object Repository/SearchCustomer/Page_listData/div_Data Debitur'), 0)
	}
	@And("user klik checkbox")
	def user_klik_checkbox() {
		WebUI.click(findTestObject('Object Repository/SearchCustomer/Page_listData/div_Action_q-checkbox cursor-pointer no-out_aeafe2'))
	}
	@And("user scrool continue")
	def user_scrool_continue(){
		WebUI.scrollToElement(findTestObject('Object Repository/SearchCustomer/Page_listData/div_Continue'), 0)
	}
	@And("user klik continue")
	def user_klik_continue(){
		WebUI.click(findTestObject('Object Repository/SearchCustomer/Page_listData/div_Continue'))
		WebUI.delay(2)
	}
	@And("user klik finish")
	def user_klik_finish(){
		WebUI.click(findTestObject('Object Repository/SearchCustomer/Page_listData/div_Finish'))
		WebUI.delay(2)
	}
	@And("user scrool finish")
	def user_scrool_finish(){
		WebUI.scrollToElement(findTestObject('Object Repository/SearchCustomer/Page_listData/div_Finish'), 0)
	}
	@And("verify action")
	def verify_action(){
		WebUI.verifyElementPresent(findTestObject('Object Repository/SearchCustomer/Page_listData/div_Action_q-checkbox cursor-pointer no-out_aeafe2'), 0)
	}
}