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
WebUI.openBrowser('')
WebUI.navigateToMaskedUrl('https://happyminds.onrender.com/')

'Step 2: Click on the "Blog" in the navbar'
WebUI.click( findTestObject('Object Repository/BLOG_PAGE/a_Blog'))

'Step 3: Verify the title "BLOGS & ARTICLES" is displayed '
WebUI.verifyTextPresent("BLOGS & ARTICLES", false, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.scrollToPosition(0, 500)

'Step 4: Create Blog: Click on the "New Post" button '
WebUI.click(findTestObject('Object Repository/BLOG_PAGE/btn_NewPost') )

'Step 5: Verify the form title is displayed '
WebUI.verifyTextPresent("What's your mind ?", false, FailureHandling.CONTINUE_ON_FAILURE)

'Step 6: Set "Nhi" to the your name text box'
WebUI.setText(findTestObject('Object Repository/BLOG_PAGE/txt_YourName') , 'Nhi')

'Step 7: Set "Hello" to the title text box '
WebUI.setText( findTestObject('Object Repository/BLOG_PAGE/txt_Title'), 'Hello')

'Step 8: Set "This is content" to the content text box'
WebUI.setText(findTestObject('Object Repository/BLOG_PAGE/txt_Content') , 'This is content')

'Step 9: "Click on "Choose File" button and upload a png file'
WebUI.uploadFile( findTestObject('Object Repository/BLOG_PAGE/lbl_UploadImage'), 'C:\\Users\\admin\\Pictures\\Screenshots\\meo.png')
WebUI.scrollToPosition(0, 500)

'Step 10: Click on the "Post" button '
WebUI.click(findTestObject('Object Repository/BLOG_PAGE/btn_Post') )

'Step 11" Clean-step '
WebUI.closeBrowser()
