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

'Verify Update Project screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Update Project/header_Update Project'), 
    GlobalVariable.G_ShortTimeout)

'clicking Manage Project Sprint button on Update Project screen'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Update Project/button_Manage Project Sprint'))

'Verify warning popup screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Update Project/header_warning popup screen'), 
    GlobalVariable.G_ShortTimeout)

'click on Yes button on warning popup'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Update Project/button_Yes'))

'Verify Manage Project Sprint screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Project Sprint/header_Manage Project Sprint'), 
    GlobalVariable.G_ShortTimeout)

'Click on Set Approach button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Sprint/button_Set Approach'))

'Verify Set Approach popup screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Project Sprint/header_For Specification Of Sprint Duration'), 
    GlobalVariable.G_ShortTimeout)

'enter sprint duration'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Sprint/input_Sprint Duration'), 
    SprintDuration)

'click on set approch button on popup screen'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Sprint/button_Set Approach on Sprint Duration Page'))

'If Manage Sprints header is display then'
if (CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Project Sprint/header_Manage Sprints'), 
    GlobalVariable.G_ShortTimeout) == true) {
    'click on Create New Sprint button'
    CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Sprint/button_Create New Sprint'))

    'Verify Create New Sprint popup screen opened'
    CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Create New Sprint_Page_Object/header_Create New Sprint'), 
        GlobalVariable.G_ShortTimeout)

    'click on Create button'
    CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Create New Sprint_Page_Object/button_Create'))
} else {
}

'click on close button '
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Sprint/button_Close'))

'verify Update Project screen'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Update Project/header_Update Project'), 
    GlobalVariable.G_ShortTimeout)

WebUI.delay(10)

