import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

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


class LoginSteps {
	
	@Given("user is on login page")
	def navigateToLoginPage(){
		println "  I am inside navigateToLoginPage"
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/auth/login')
		
	}
	
	@When("user enters (.*) and (.*)")
	def enterCredentials(String username, String password){
		println "  I am inside enterCredentials"
		WebUI.setText(findTestObject('WEB/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), username)
		WebUI.setEncryptedText(findTestObject('WEB/Page_OrangeHRM/input_Username_txtPassword'), password)
		
	}
	
	@And("clicks on login button")
	def clickLogin(){
		println "  I am inside clickLogin"
		WebUI.click(findTestObject('WEB/Page_OrangeHRM/input_Password_Submit'))
	}
	
	@Then("user is navigated to home page")
	def verifyHomePage(){
		println "  I m inside verifyHomePage"
		WebUI.click(findTestObject('WEB/Page_OrangeHRM/b_Leave'))
		WebUI.closeBrowser()
	}
}