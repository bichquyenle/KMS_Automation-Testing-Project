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

'Step 2: Click on the "Login" button'
WebUI.click(findTestObject('Object Repository/LOGIN_PAGE/btn_Login'))

'Step 3: Click on the "Login with google"'
WebUI.click(findTestObject('Object Repository/LOGIN_PAGE/span_GoogleLogin'))

'Step 4: Enter email: kenraynguyen@gmail.com'
WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/txt_Email'), 'kenraynguyen@gmail.com')

// Kiểm tra sự hiện diện của đối tượng 'lnk_TryAgain'
TestObject lnkTryAgain = findTestObject('Object Repository/LOGIN_PAGE/lnk_TryAgain')

// Nếu đối tượng tồn tại, click vào nó
if (WebUI.verifyElementPresent(lnkTryAgain, 5, FailureHandling.OPTIONAL)) {
	WebUI.click(lnkTryAgain)

	'Step 4: Enter email: kenraynguyen@gmail.com'
	WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/txt_Email'), 'kenraynguyen@gmail.com')
	'Step 5: Click next button'
	WebUI.click(findTestObject('Object Repository/LOGIN_PAGE/span_Next1'))
	
	'Step 6: Enter password: 0396139324asd'
	WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/txt_Password'), '0396139324asd')
	
	'Step 7: Click next button'
	WebUI.click(findTestObject('Object Repository/LOGIN_PAGE/span_Next2'))
	
	'Step 8: Verify title Profile is displayed'
	WebUI.verifyElementPresent(findTestObject('Object Repository/LOGIN_PAGE/h2_Profile'), 0)
} else {
	'Step 5: Click next button'
	WebUI.click(findTestObject('Object Repository/LOGIN_PAGE/span_Next1'))
	
	'Step 6: Enter password: 0396139324asd'
	WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/txt_Password'), '0396139324asd')
	
	'Step 7: Click next button'
	WebUI.click(findTestObject('Object Repository/LOGIN_PAGE/span_Next2'))
	
	'Step 8: Verify title Profile is displayed'
	WebUI.verifyElementPresent(findTestObject('Object Repository/LOGIN_PAGE/h2_Profile'), 0)
}

