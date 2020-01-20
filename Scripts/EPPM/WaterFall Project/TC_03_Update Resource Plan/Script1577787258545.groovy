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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'verify Update Project screen must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Update Project/header_Update Project'), 
    GlobalVariable.G_ShortTimeout)

'click on Update Resource Plan button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Update Project/button_Update Resource Plan'))

//---------------Create Java Developer Position------------------//
'click on Create Position button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Update Position Information on Project_Page/button_Create Position'))

'verify Create New Position popup must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Create_New_Project/Update Position Information on Project_Page/header_Create New Position'), 
    GlobalVariable.G_ShortTimeout)

'select value from Generic Resource dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.SelectDD'(findTestObject('Create_New_Project/Update Position Information on Project_Page/dd_Generic Resource'), 
    GenericResourceDD_1)

'select value from Shift Calendar dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.SelectDD'(findTestObject('Create_New_Project/Update Position Information on Project_Page/dd_Shift Calendar'), 
    ShiftCalendarDD)

'click on Select Location dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Update Position Information on Project_Page/ddClick_Select Location'))

'click on Checkbox Select Location'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Update Position Information on Project_Page/checkBox_Select Location'))

'click on create button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Update Position Information on Project_Page/button_Create'))

//---------------Create Android Developer Position------------------//
'click on Create Position button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Update Position Information on Project_Page/button_Create Position'))

'verify Create New Position popup must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Create_New_Project/Update Position Information on Project_Page/header_Create New Position'),
	GlobalVariable.G_ShortTimeout)

'select value from Generic Resource dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.SelectDD'(findTestObject('Create_New_Project/Update Position Information on Project_Page/dd_Generic Resource'),
	GenericResourceDD_2)

'select value from Shift Calendar dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.SelectDD'(findTestObject('Create_New_Project/Update Position Information on Project_Page/dd_Shift Calendar'),
	ShiftCalendarDD)

'click on Select Location dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Update Position Information on Project_Page/ddClick_Select Location'))

'click on Checkbox Select Location'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Update Position Information on Project_Page/checkBox_Select Location'))

'click on create button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Update Position Information on Project_Page/button_Create'))

'click on Set Required Competency button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Update Position Information on Project_Page/button_Set Required Competency'))









