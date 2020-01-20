package com.eppm.keywords
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select
import org.testng.Assert

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords




class TestBase {
	/**
	 * Refresh browser
	 */
	static WebDriver driver = DriverFactory.getWebDriver()
	public static WebDriver webDriver = DriverFactory.getWebDriver()
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		//WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);

			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			Assert.fail(e.getMessage());
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {

			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	/**
	 * Sendkey element
	 * @param to Katalon test object
	 */
	@Keyword
	def sendkeyElement(TestObject to ,String value){
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			element.clear()

			KeywordUtil.markPassed("Element has been cleared")
			element.sendKeys(value)

			KeywordUtil.markPassed("Sendkey value has been send")
		}
		catch (WebElementNotFoundException e) {
			Assert.fail(e.getMessage());
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {

			KeywordUtil.markFailed("Fail to send on elementvalue")
		}
	}


	@Keyword
	def SelectDD(TestObject to ,String value){
		try {

			Select dd = new Select(WebUiBuiltInKeywords.findWebElement(to));
			KeywordUtil.markPassed("Dropdown has been selected")


			dd.selectByVisibleText(value);

			KeywordUtil.markPassed("Dropdown value has been selected")
		}
		catch (WebElementNotFoundException e) {
			Assert.fail(e.getMessage());
			KeywordUtil.markFailed("Dropdown not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to select on elementvalue")
		}
	}

	@Keyword
	def isElementPresent(TestObject to, int timeout){
		try {


			WebElement element = WebUiBuiltInKeywords.findWebElement(to, timeout);

			if (element != null) {
				KeywordUtil.markPassed("Element has been present")
			}

			return true
		} catch (Exception e) {
			KeywordUtil.markFailed("Element is not present")
		}
		return false;
	}

	@Keyword
	def rightclickElement(TestObject to) {
		try {

			Actions actions = new Actions(webDriver);
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			actions.contextClick(element).perform();

			KeywordUtil.logInfo("Clicking element")
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			Assert.fail(e.getMessage());
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {

			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	@Keyword
	def datePicker(TestObject to1, TestObject to2 , TestObject to3, TestObject to4, String value , TestObject to5) {
		try {

			//click on date picker
			WebElement element1 = WebUiBuiltInKeywords.findWebElement(to1);
			element1.click()
			//select clear button
			WebElement element2 = WebUiBuiltInKeywords.findWebElement(to2);
			element2.click()

			//select javascript for dat3 picker
			WebElement element3 = WebUiBuiltInKeywords.focus(to3)
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript('$(\':input\').removeAttr(\'readonly\')', [])

			//enter date
			WebElement element4 = WebUiBuiltInKeywords.findWebElement(to4);
			element4.sendKeys(value)
			/*WebElement element5 = WebUiBuiltInKeywords.findWebElement(to5);
			 element5.sendKeys(Keys.chord(Keys.ENTER))*/

			//click on date picker
			WebElement element5 = WebUiBuiltInKeywords.findWebElement(to5);
			element5.click()

			KeywordUtil.logInfo("Clicking element")
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			Assert.fail(e.getMessage());
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {

			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
}