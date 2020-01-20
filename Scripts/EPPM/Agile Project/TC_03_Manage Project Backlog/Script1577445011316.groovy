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

'Verify Update Project screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Update Project/header_Update Project'), 
    GlobalVariable.G_ShortTimeout)

'click on  Manage Project Backlog button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Update Project/button_Manage Project Backlog'))

'verify Manage Project Backlog WBS screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/header_Manage Project Backlog WBS'), 
    GlobalVariable.G_ShortTimeout)

'select PBI value from Add Network Element dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.SelectDD'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/dd_Add Network Element'), 
    AddNetworkElementDD_PBI)

'click on  Add button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/button_Add'))

'Verify Add Project Backlog Item popup opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/header_Add Project Backlog Item'), 
    GlobalVariable.G_ShortTimeout)

'enter PBI name on name txt box'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/input_Name_PBI'), 
    PBIName)

'click on  Create button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/button_Create'))

'select Task value from Add Network Element dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.SelectDD'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/dd_Add Network Element'), 
    AddNetworkElementDD_Task)

'click on  Add button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/button_Add'))

'Verify Create New PBI Task popup screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/header_Create New PBI Task'), 
    GlobalVariable.G_ShortTimeout)

'enter Taskt name on name txt box'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/input_Name_PBI'), 
    TaskName)

'click on  Work Category'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/dd_work catagory'))

'click on Work Category dd value'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/DD_Value_work catagory'))

'click on  Create button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/button_Create'))

'verify Manage Project Backlog WBS screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/header_Manage Project Backlog WBS'), 
    GlobalVariable.G_ShortTimeout)

'click on Initiate Finalise button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/button_Initiate Finalise'))

'verify Select PBI To Finalise screen must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/header_Select PBI To Finalise'), 
    GlobalVariable.G_ShortTimeout)

'select CheckBox'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/checkbox_list od PBI'))

'click on Finalise PBI button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/button_Finalise PBI'))

'Click on Proceed button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/button_Proceed'))

'click on  Back button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Project Backlog WBS_Page_Object/button_Back'))



