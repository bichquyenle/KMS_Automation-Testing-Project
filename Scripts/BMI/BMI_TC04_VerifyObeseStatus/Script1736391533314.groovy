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

'Step 1: Open the browser and navigate to the details video page'
WebUI.openBrowser(GlobalVariable.URL_HOMEPAGE)

'Step 2: Enter height: 160 cm into the textbox'
WebUI.setText(findTestObject('Object Repository/BMI_PAGE/txt_Height'), '160')

'Step 3: Enter weight: 95 kg into the textbox'
WebUI.setText(findTestObject('Object Repository/BMI_PAGE/txt_Weight'), '95')

'Step 4:Verify that the system displays the BMI is 37.11.'
String BMIResult = WebUI.getAttribute(findTestObject('Object Repository/BMI_PAGE/txt_BMI'), 'value')
WebUI.verifyMatch(BMIResult, '37.11', false)

'Step 5: Verify that the system displays the status is "Obese"'
String statusResult = WebUI.getAttribute(findTestObject('Object Repository/BMI_PAGE/txt_WeightStatus'), 'value')
WebUI.verifyMatch(statusResult, 'Obese', false)

'Step 6: Clean browser'
WebUI.closeBrowser()