import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Day2/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_CURA Healthcare Service/select_Tokyo'), 'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Visit Date (Required)_input-group-addon'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_20'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment_comment'), 'abcd')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.closeBrowser()

