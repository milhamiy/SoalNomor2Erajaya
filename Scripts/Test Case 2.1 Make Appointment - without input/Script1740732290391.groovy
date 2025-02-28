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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Call TC 1.2 (Login with valid credentials)
WebUI.callTestCase(findTestCase('Test Cases/Test Case 1.2 Login with Valid Data'), [:])

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_CURA Healthcare Service/OptionSelectorFacilityMakeAppointment'), 'Hongkong CURA Healthcare Center', false)


// Klik checkbox Apply for hospital readmission
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/CheckboxApplyForHospitalReadmission'))

// Pilih Healthcare Program (contoh: Medicare)
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/OptionRadioButtonMedicaid'))


// Input comment (optional)
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/TextAreaComment'), 'Test Adding Comment')

// Klik "Make Appointment"
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_BookAppointment'))

//Check seharusnya akan tetap berada pada link/page appointment karna tidak mengisi mandatory field
String currentUrl = WebUI.getUrl()
WebUI.verifyMatch(currentUrl, 'https://katalon-demo-cura.herokuapp.com/#appointment', false)

//markicek (mari kita cek) apakah datepicker show ketika tidak mengisi mandatory field date
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/verifyelementdatepicker'), 5)

//markicek (mari kita cek) apakah error message html5 muncul atau tidak
TestObject dateField = findTestObject('Object Repository/Page_CURA Healthcare Service/inputvisitdaterequired')
WebUI.click(dateField)
WebUI.sendKeys(dateField, Keys.chord(Keys.TAB)) 

String validationMessage = WebUI.executeJavaScript("return arguments[0].validationMessage;", Arrays.asList(WebUI.findWebElement(dateField)))

// Verifikasi hasil
WebUI.verifyMatch(validationMessage, "Please fill out this field.", false)
// Close browser
WebUI.closeBrowser()

