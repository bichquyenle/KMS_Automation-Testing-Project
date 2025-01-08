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
WebUI.openBrowser(GlobalVariable.URL_VIDEO_DETAILSL)

'Step 2: Click on "View coach" of Arms category'
WebUI.waitForElementVisible(findTestObject('Object Repository/VIDEO_PAGE/btn_ViewCoachArms'), 10)
WebUI.click(findTestObject('Object Repository/VIDEO_PAGE/btn_ViewCoachArms'))

'Step 3: Click on "Watch" Button'
WebUI.click(findTestObject('Object Repository/VIDEO_PAGE/btn_Watch'))

'Step 4: Verify that the Practice Page includes: Video'
WebUI.verifyElementPresent(findTestObject('Object Repository/VIDEO_PAGE/vd_Video'), 10)

'Step 5: Verify that the Practice Page includes: practice board'
WebUI.verifyElementPresent(findTestObject('Object Repository/VIDEO_PAGE/div_PracticeBoard'), 10)
