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
import java.text.SimpleDateFormat
import java.util.Date

// Mari kita define Buat Date today untuk isi di date picker
Date today = new Date()
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy")
String todayDate = sdf.format(today)
//End Of define todays date for date picker bruh

valueFacility = "Hongkong CURA Healthcare Center"
valuefieldcomment = "Test Adding Comment"

// Call TC 1.2 (Login with valid credentials)
WebUI.callTestCase(findTestCase('Test Cases/Test Case 1.2 Login with Valid Data'), [:])

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_CURA Healthcare Service/OptionSelectorFacilityMakeAppointment'), valueFacility, false)


// Klik checkbox Apply for hospital readmission
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/CheckboxApplyForHospitalReadmission'))

// Pilih Healthcare Program (contoh: Medicare)
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/OptionRadioButtonMedicaid'))

// Klik field tanggal untuk membuka date picker
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

// Set tanggal hari ini
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), todayDate)

// (Opsional) Klik di luar field untuk menutup date picker
WebUI.sendKeys(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), Keys.chord(Keys.TAB))

// Input comment (optional)
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/TextAreaComment'), valuefieldcomment)

// Klik "Make Appointment"
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_BookAppointment'))

//Markicek buat redirect url-nya apakah sudah benar akan redirect ke summary
String currentUrl = WebUI.getUrl()
WebUI.verifyMatch(currentUrl, 'https://katalon-demo-cura.herokuapp.com/appointment.php#summary', false)

//Check Wording title "Appointment Confirmation"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/h2_Appointment Confirmation'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/h2_Appointment Confirmation'), 'Appointment Confirmation')

//Verify Wording description "Please be informed that your appointment has been booked as following:"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/p_Please be informed that your appointment has been booked as following'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/p_Please be informed that your appointment has been booked as following'), 'Please be informed that your appointment has been booked as following:')

//Verify Divider Shown untuk pemisah
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/hr_Appointment Confirmation_small'), 3)

//Wording label "facility"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/label_Facility'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/label_Facility'), 'Facility')

//Value dari field => "facility"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/p_Hongkong CURA Healthcare Center'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/p_Hongkong CURA Healthcare Center'), valueFacility)

//Wording label "Apply for hospital readmission"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/label_Apply for hospital readmission'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/label_Apply for hospital readmission'), 'Apply for hospital readmission')

//Value dari field => "Apply for hospital readmission"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/value_Apply for hospital readmission_Yes'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/value_Apply for hospital readmission_Yes'), 'Yes')

//Wording label "Healthcare Program"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/label_Healthcare Program'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/label_Healthcare Program'), 'Healthcare Program')

//Value dari field => "Healthcare Program"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/p_Medicaid'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/p_Medicaid'), 'Medicaid')

//Wording label "Visit Date"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/label_Visit Date'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/label_Visit Date'), 'Visit Date')

//Value dari field => "Visit Date"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/valuefromvisitdate'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/valuefromvisitdate'), todayDate)

//Wording label "Comment"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/label_Comment'),3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/label_Comment'), 'Comment')

//Value dari field => "Comment"
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/ValueFromCommentField'),3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/ValueFromCommentField'), valuefieldcomment)

//Check Button Back To Homepage
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/a_Go to Homepage'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/SummaryComponent/a_Go to Homepage'), 'Go to Homepage')

// Close browser
//WebUI.closeBrowser()

