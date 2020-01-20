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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'click on EPPM Configurations menu'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Menu/Menu_EPPM Configurations/menu_EPPM Configurations'))

'click on Manage Endeavour Booking Masters submenu'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Menu/Menu_EPPM Configurations/submenu_Manage Endeavour Booking Masters'))

'click on Cost Centres submenu'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Menu/Menu_EPPM Configurations/submenu_Cost Centres'))

'verify Cost Centre header is present'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Cost_Centre_Page/header_Cost Centre'), 
    GlobalVariable.G_ShortTimeout)

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Cost_Centre_Page/button_Create New Cost Centre'))) {
    'click on Create New Cost Centre button'
    CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Cost_Centre_Page/button_Create New Cost Centre'))

    'Verify Create New Cost Centre new page opened'
    CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Cost_Centre_Page/header_Create New Cost Centre'), 
        GlobalVariable.G_ShortTimeout)

    'enter Cost Centre name on txt box'
    CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Cost_Centre_Page/input_NameTxtBox'), 
        Name_Create_Cost_Centre)

    'click on create Create button'
    CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Cost_Centre_Page/button_Create'))
} else {
    System.out.print('Create New Cost Centre button is not visible')
}

WebUI.waitForPageLoad(GlobalVariable.G_ShortTimeout)