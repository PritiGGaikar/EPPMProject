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


'verify Manage Competency Requirements and Position Assignments screen must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/header_Manage Competency Requirements and Position Assignments'),
	GlobalVariable.G_ShortTimeout)

'click on Task'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/click_Task'))

'verify View Required Competencies and Positions on Task popup screen must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/header_View Required Competencies and Positions on Task'),
	GlobalVariable.G_ShortTimeout)

'click on Manage Positions tab'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/tab_Manage Positions'))

'click on Update Competency And Position button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/button_Update Competency And Position'))

'click on select'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/dd_select'))

'enter name on search txtbox'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/input_Assign Position search Box'),
	GenericResourceDD_1)

'click on checkbox assign position'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/checkBox_Assign Positions'))

'click on Add button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/button_Add'))

'click on select'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/dd_select'))

'enter name on search txtbox'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/input_Assign Position search Box'),
	GenericResourceDD_2)

'click on checkbox assign position'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/checkBox_Assign Positions'))

'click on Add button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/button_Add'))

WebUI.dragAndDropByOffset(findTestObject('Create_New_Project/Manage Competency Requirements and Position Assignments_Page/slider'),
	-160, 0)

'click on Update Details button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/button_Update Details'))

'click on close button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/button_Close'))

'click on Compute Required Competency button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/button_Compute Required Competency'))



