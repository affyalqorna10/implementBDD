package stepDef
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
import com.kms.katalon.core.configuration.RunConfiguration


class editProfile {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("The user navigates to My Info")
	def click_my_info() {
		WebUI.click(findTestObject('Object Repository/Edit Profile Picture/span_My Info'))
	}

	@And("User clicks on the Current Profile Picture")
	def click_Picture() {
		WebUI.click(findTestObject('Object Repository/Edit Profile Picture/img-employee-image'))
	}


	@And("User upload the (.*)")
	def upload_file(String file) {
		WebUI.uploadFile(findTestObject('Object Repository/Edit Profile Picture/uploadFile'), RunConfiguration.getProjectDir() + file)
	}

	@And("User click save")
	def save_button() {
		WebUI.click(findTestObject('Object Repository/Edit Profile Picture/button_Save'))
	}

	@Then("User success change picture profile")
	def validate_result() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Edit Profile Picture/p_Success'))

		WebUI.closeBrowser()
	}
}