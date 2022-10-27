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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.virginvoyages.com/')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Caribbean  European Cruise Vacations  _6c6cce/button_Check out our cookie policy_onetrust_6e19e0'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Caribbean  European Cruise Vacations  _6c6cce/button_Check out our cookie policy_onetrust_6e19e0'))

WebUI.click(findTestObject('Object Repository/Page_Caribbean  European Cruise Vacations  _6c6cce/svg'))

WebUI.click(findTestObject('Object Repository/Page_Caribbean  European Cruise Vacations  _6c6cce/svg'))

WebUI.click(findTestObject('Object Repository/Page_Caribbean  European Cruise Vacations  _6c6cce/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Caribbean  European Cruise Vacations  _6c6cce/button_Nov'))

WebUI.click(findTestObject('Object Repository/Page_Caribbean  European Cruise Vacations  _6c6cce/button_Dec'))

WebUI.click(findTestObject('Object Repository/Page_Caribbean  European Cruise Vacations  _6c6cce/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Caribbean  European Cruise Vacations  _6c6cce/a_PLAN VOYAGE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Book a Cruise  Virgin Voyages/div_Fire  Sunset SoiresMiami Key West Beach_c5d2b4'), 
    0)

WebUI.closeBrowser()

