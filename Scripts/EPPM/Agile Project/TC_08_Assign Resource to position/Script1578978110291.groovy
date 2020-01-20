import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'click on Assign Resource button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Competency Matrix - Required Competency/button_Assign Resource'))

'verify Assign Resources to Positions screen must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/header_Assign Resources to Positions'), 
    GlobalVariable.G_ShortTimeout)

'select checkbox position 1 to Assign Resource'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/CheckBox_Position_1'))

'click on Assign Resource button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/button_Assign Resource'))

'verify Assign Resource popup screen must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/header_Assign Resource'), 
    GlobalVariable.G_ShortTimeout)

'click on dropdown select Resource name'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Assign Resources to Positions_Page/clickDD_Select Resource'))

String Resource1 = Resource_1

String xpath = ('//ul/li/span[contains(text(),"' + Resource1) + '")]'

TestObject to = new TestObject('objectName')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

'Select Resource name'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(to)

'click on Preview Assignment button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/button_Preview Assignment'))

'click on Assign Resource button on Assign resource popup screen'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/button Assign Resource on Assign Resource Page'))

//---------------------------------Select another resourc to assign---------------------//
'select checkbox position 2 to Assign Resource'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/checkbox_Position_2'))

'click on Assign Resource button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/button_Assign Resource'))

'verify Assign Resource popup screen must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/header_Assign Resource'), 
    GlobalVariable.G_ShortTimeout)

'click on dropdown select Resource name'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Assign Resources to Positions_Page/clickDD_Select Resource'))

String Resource2 = Resource_2

String xpath1 = ('//ul/li/span[contains(text(),"' + Resource2) + '")]'

TestObject to1 = new TestObject('objectName')

to1.addProperty('xpath', ConditionType.EQUALS, xpath1)

'Select Resource name'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(to1)

'click on Preview Assignment button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/button_Preview Assignment'))

'click on Assign Resource button on Assign resource popup screen'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/button Assign Resource on Assign Resource Page'))

/*'click on Manage button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/button_Manage'))

'verify Actionable Items popup screen must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/header_Actionable Items'), 
    GlobalVariable.G_ShortTimeout)

'select Filter button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/button_Filter'))

'enetr Resource name'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/input_Resource Name'), 'Rakhi Kopul')



*/
'click on Back button in Assign Resources to Positions page'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Assign Resources to Positions_Page/button_Back'))

'click on Back button in Competency Matrix - Required Competency page'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Competency Matrix - Required Competency/button_Back'))

'click on Back button in Manage Competency Requirements and Position Assignments page'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Manage Competency Requirements and Position Assignments_Page/button_Back'))

'click on Back button in Update Position Information on Project page'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Update Position Information on Project_Page/button_Back'))

'click on Compute schedule'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Update_Sprit_Page/button_Compute Schedule'))

'click on Compute schedule in Select Scheduling Scheme'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Update_Sprit_Page/button_Compute Schedule on Select Scheduling Scheme popup'))

'click on Finalise & Publish'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Update_Sprit_Page/button_Finalise and Publish'))

'verify Confirm Sprint Publication Request screen popup must be opened'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Create_New_Project/Update_Sprit_Page/header_Confirm Sprint Publication Request'), 
    GlobalVariable.G_ShortTimeout)

'click on Ok button on Confirm Sprint Publication Request popup screen'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Create_New_Project/Update_Sprit_Page/button _Ok'))

