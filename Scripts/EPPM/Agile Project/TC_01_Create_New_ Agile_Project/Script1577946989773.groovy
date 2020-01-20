import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'select Endevour menu'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Menu/Menu_Endeavour/menu_Endeavour'))

'select submenu "Manage Projects" from Endevour'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Menu/Menu_Endeavour/submenu_Manage Projects'))

'click on Create New Project button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Object Repository/Manage_Project_object/button_Create New Project'))

'Verify header as Create New Project'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Create_New_Project/Create_New_Project_Page_Object/header_Create New Project'), 
    GlobalVariable.G_ShortTimeout)

'enter project name'
CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Create_New_Project/Create_New_Project_Page_Object/input_Name'), 
    ProejctName)

//Select start date frome date picker
//CustomKeywords.'com.eppm.keywords.TestBase.datePicker'(findTestObject('Create_New_Project/Create_New_Project_Page_Object/input_Start Date Picker'), findTestObject('Object Repository/Create_New_Project/Create_New_Project_Page_Object/clear_Date_Picker'), findTestObject('Object Repository/Create_New_Project/Create_New_Project_Page_Object/date_picker_calender'), findTestObject('Create_New_Project/Create_New_Project_Page_Object/txt_DatePicker'), '13 Jan 2021', findTestObject('Object Repository/Create_New_Project/Create_New_Project_Page_Object/input_Start Date Picker'))
/*
'click on date picker'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Create_New_Project_Page_Object/input_Start Date Picker'))

'clear date picker'
WebUI.click(findTestObject('Create_New_Project/Create_New_Project_Page_Object/clear_Date_Picker'))


WebUI.focus(findTestObject('Create_New_Project/Create_New_Project_Page_Object/date_picker_calender'))

WebUI.executeJavaScript('$(\':input\').removeAttr(\'readonly\')', [])



WebUI.sendKeys(findTestObject('Create_New_Project/Create_New_Project_Page_Object/txt_DatePicker'), '13 Jan 2021')

//WebUI.sendKeys(findTestObject('Create_New_Project/Create_New_Project_Page_Object/txt_DatePicker'), Keys.chord(Keys.ENTER))

CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Create_New_Project_Page_Object/input_Start Date Picker'))

*/
//-----------------manual select date---------------//

'click on start date'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Create_New_Project_Page_Object/input_Start Date Picker'))

'Select Today button  on start date picker'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Create_New_Project_Page_Object/button_Today date'))

'Select Project Methodology as Agile'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Create_New_Project_Page_Object/radiobutton_Agile_Project_Methodology'))

'click on Project Organisation button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Create_New_Project_Page_Object/button_Project Organisation'))

'Verify header as Project Organisation Information'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Create_New_Project/Project_Organisation_Information_Page_Object/header_Project Organisation Information'), 
    GlobalVariable.G_ShortTimeout)

'Select value from client dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.SelectDD'(findTestObject('Create_New_Project/Project_Organisation_Information_Page_Object/dd_Client'), 
    ClientDD)

'Select value from Project Category dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.SelectDD'(findTestObject('Create_New_Project/Project_Organisation_Information_Page_Object/dd_Project Category'), 
    ProjectCategoryDD)

'Verify header as Manager Organisation Information'
CustomKeywords.'com.eppm.keywords.TestBase.isElementPresent'(findTestObject('Create_New_Project/Project_Organisation_Information_Page_Object/header_Manager Organisation Information'), 
    GlobalVariable.G_ShortTimeout)

'Select value from Manager dropdown'
CustomKeywords.'com.eppm.keywords.TestBase.SelectDD'(findTestObject('Create_New_Project/Project_Organisation_Information_Page_Object/dd_Manager'), 
    ManagerDD)

'enter Max Allocation hrs per day'

//CustomKeywords.'com.eppm.keywords.TestBase.sendkeyElement'(findTestObject('Create_New_Project/Project_Organisation_Information_Page_Object/input_Max Allocation'), "8")
'click on Create Project Organisation Information button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Project_Organisation_Information_Page_Object/button_Create Project Organisation Information'))

'click on Close button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Project_Organisation_Information_Page_Object/button_Close on Project Organisation Information page'))

'click on Create button'
CustomKeywords.'com.eppm.keywords.TestBase.clickElement'(findTestObject('Create_New_Project/Create_New_Project_Page_Object/button_Create'))