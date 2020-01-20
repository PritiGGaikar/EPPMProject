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

'verify Cost Centre header is present'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Cost_Centre_Page/header_Cost Centre'), 
    GlobalVariable.G_ShortTimeout)

//WebUI.delay(GlobalVariable.G_ShortTimeout)

'click on filter button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Cost_Centre_Page/button_Filter'))

'enter name on search name txt box'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Cost_Centre_Page/Input_Search_NameTxtBox'), 
    Name_Update_Cost_Centre)

'select Check Box'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Cost_Centre_Page/CheckBox_on Cost Centre Page'))

'click on Delete Selected CostCentre'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Cost_Centre_Page/button_Delete Selected CostCentre'))

'verify Delete popup screen must be open'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Cost_Centre_Page/header_Delete Cost Center Confirmation Prompt'), 
    GlobalVariable.G_ShortTimeout)

'click on ok button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Cost_Centre_Page/button_Ok'))

//WebUI.delay(GlobalVariable.G_ShortTimeout)

'click on filter button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Cost_Centre_Page/button_Filter'))

'click on filter button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Cost_Centre_Page/button_Filter'))

'enter name on search name txt box'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Cost_Centre_Page/Input_Search_NameTxtBox'), 
    Name_Update_Cost_Centre)

'verify no records found msg'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Cost_Centre_Page/No records found_msg'), 
    GlobalVariable.G_ShortTimeout)

WebUI.delay(10)

