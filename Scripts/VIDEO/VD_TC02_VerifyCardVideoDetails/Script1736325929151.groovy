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
import org.openqa.selenium.WebElement

'Step 1: Open the browser and navigate to the details video page'
WebUI.openBrowser(GlobalVariable.URL_VIDEO_DETAILSL)

'Step 2: Click on "View coach" of Arms category'
WebUI.waitForElementVisible(findTestObject('Object Repository/VIDEO_PAGE/btn_ViewCoachArms'), 10)
WebUI.click(findTestObject('Object Repository/VIDEO_PAGE/btn_ViewCoachArms'))

'Step 3: Verify the card title is "How to Do: FLOOR TRICEP DIPS"'
String expectedTitle = "How to Do：FLOOR TRICEP DIPS"
String levelTitle = WebUI.getText(findTestObject('Object Repository/VIDEO_PAGE/h5_CardTitle'))
WebUI.verifyMatch(expectedTitle, levelTitle, false);

'Step 4: Verify the level is "Level: beginner"'
String expectedLevel = "Level: beginner"
String actualLevel = WebUI.getText(findTestObject('Object Repository/VIDEO_PAGE/p_CardLevel'))
WebUI.verifyMatch(expectedLevel, actualLevel, false);

'Step 5: Verify the duration is "Duration: 45s"'
String expectedDuration = "Duration: 45s"
String actualDuration = WebUI.getText(findTestObject('Object Repository/VIDEO_PAGE/p_Duration'))
WebUI.verifyMatch(expectedDuration, actualDuration, false);

'Step 6: Verify the rep is "Rep : 20"'
String expectedRep = "Rep : 20"
String actualRep = WebUI.getText(findTestObject('Object Repository/VIDEO_PAGE/p_Rep'))
WebUI.verifyMatch(expectedRep, actualRep, false);

'Step 7: Verify the total calo is "Total calories: 20 calo"'
String expectedCalo = "Total calories: 20 calo"
String actualCalo = WebUI.getText(findTestObject('Object Repository/VIDEO_PAGE/p_TotalCalo'))
WebUI.verifyMatch(expectedCalo, actualCalo, false);

//clean the browser
WebUI.closeBrowser()
