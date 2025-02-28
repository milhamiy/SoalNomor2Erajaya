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


WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com')
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Login'))
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')
//Cek apakah text field username bisa di input atau tidak
String enteredUsername = WebUI.getAttribute(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'value')
WebUI.verifyMatch(enteredUsername, 'John Doe', false)
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')
//Cek apakah text field password bisa di input atau tidak
String enteredPassword = WebUI.getAttribute(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'value')
WebUI.verifyMatch(enteredPassword, 'ThisIsNotAPassword', false)
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))
//Make sure beneran redirect ke appointment page
String currentUrl = WebUI.getUrl()
WebUI.verifyMatch(currentUrl, 'https://katalon-demo-cura.herokuapp.com/#appointment', false)


