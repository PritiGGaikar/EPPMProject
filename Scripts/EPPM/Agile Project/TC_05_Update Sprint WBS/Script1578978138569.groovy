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

'Verify Update Project screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Update_Sprit_Page/header_Update Sprint'), 
    GlobalVariable.G_ShortTimeout)

'click on Update Sprint WBS button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Update_Sprit_Page/button_Update Sprint WBS'))

'Verify Manage Sprint WBS screen opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/header_Manage Sprint WBS'), 
    GlobalVariable.G_ShortTimeout)

'click on Add button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/button_Add'))

'verify Manage Sprint WBS popup screen open'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/header_Manage Sprint WBS'), 
    GlobalVariable.G_ShortTimeout)

'select checkbox'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/checkBox_tree'))

'click on Add PBI Task'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/button_Add PBI Task'))

'verify Add PBI Task To Sprint popup screen open'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/header_Add PBI Task To Sprint'), 
    GlobalVariable.G_ShortTimeout)

'click on selected work icon'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/edit_Selected work'))

'enter  selected work in percent'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/input_selected work'), 
    WorkinPercent)

'click on right tick'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/select_tick'))

'click on Add Tasks button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/button_Add Tasks'))

'verify Manage Sprint WBS screen has been opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/header_Manage Sprint WBS'), 
    GlobalVariable.G_ShortTimeout)

'click on Back button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage_Sprint_WBS_Page/button_Back'))