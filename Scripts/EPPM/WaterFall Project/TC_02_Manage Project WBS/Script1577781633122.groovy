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

'select Endevour menu'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Menu/Menu_Endeavour/menu_Endeavour'))

'select submenu "Manage Projects" from Endevour'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Menu/Menu_Endeavour/submenu_Manage Projects'))

'click on filter button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Manage_Project_object/button_Filter'))

'enter Created Project name on name txt box'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Manage_Project_object/input_Name'), 
    ProejctName)

'click on Update button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Manage_Project_object/button_Update'))

'click on proceed button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Manage_Project_object/button_Proceed'))

'Verify Update Project screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Update Project/header_Update Project'), 
    GlobalVariable.G_ShortTimeout)

'click on Update Project WBS button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Update Project/button_Update Project WBS'))

'Verify Manage Project WBS screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Project WBS Page_Object/header_Manage Project WBS'), 
    GlobalVariable.G_ShortTimeout)

'select value from Add Network Element dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.SelectDD'(findTestObject('Object Repository/Create_New_Project/Manage Project WBS Page_Object/dd_Add Network Element'), 
    AddNetworkElementDD_Task)

'click on Add button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project WBS Page_Object/button_Add'))

'Verify Create Task popup screen must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Project WBS Page_Object/header_Create Task'), 
    GlobalVariable.G_ShortTimeout)

'enter task name on name txtbox'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Create_New_Project/Manage Project WBS Page_Object/input_Name'), 
    TaskName)

'click on Deliverable Name dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project WBS Page_Object/dd_Deliverable Name'))

'select Value from Deliverable Name dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project WBS Page_Object/valueDD_Deliverable Name'))

'click on Work Category dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project WBS Page_Object/dd_Work Category'))

'select Value from Work Category dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/DD_Value_work catagory'))


'click on create button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/button_Create'))

'click on Back button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/button_Back'))

WebUI.delay(10)

