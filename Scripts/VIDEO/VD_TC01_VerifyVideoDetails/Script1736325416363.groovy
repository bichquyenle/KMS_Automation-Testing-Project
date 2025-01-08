import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

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
import org.openqa.selenium.WebElement

'Step 1: Open the browser and navigate to the details video page'
WebUI.openBrowser(GlobalVariable.URL_VIDEO_DETAILSL)

'Step 2: Click on "View coach" of Arms category'
WebUI.waitForElementVisible(findTestObject('Object Repository/VIDEO_PAGE/btn_ViewCoachArms'), 10)
WebUI.click(findTestObject('Object Repository/VIDEO_PAGE/btn_ViewCoachArms'))

'Step 3: Verify the text level is displayed as expected'
String expectedText = "Level1-Arms"
WebUI.waitForElementVisible(findTestObject('Object Repository/VIDEO_PAGE/lbl_Level'), 10)
String levelText = WebUI.getText(findTestObject('Object Repository/VIDEO_PAGE/lbl_Level'))
WebUI.verifyMatch(expectedText, levelText, false)

'Step 4: Verify the Note title is displayed'
String expectedTitle = "Note"
WebUI.waitForElementVisible(findTestObject('Object Repository/VIDEO_PAGE/h6_Note'), 10)
String noteText = WebUI.getText(findTestObject('Object Repository/VIDEO_PAGE/h6_Note'))
WebUI.verifyMatch(expectedTitle, noteText, false)

// Get the number of videos on the corresponding "Videos" page after pressing View Coach
List<WebElement> videosOnVideoPage = WebUI.findWebElements(findTestObject('Object Repository/VIDEO_PAGE/dri_VideoContainer'), 0)
int videoCountOnVideoPage = videosOnVideoPage.size()

int expectedVideos = Integer.parseInt(WebUI.getText(findTestObject('Object Repository/VIDEO_PAGE/span_VideoNumber')))

'Step 5: Check if the number of videos on two pages is equal'
if (expectedVideos == videoCountOnVideoPage) {
	WebUI.comment("Test Passed: The number of videos is the same on both pages.")
} else {
	WebUI.comment("Test Failed: The number of videos is not the same.")
}
