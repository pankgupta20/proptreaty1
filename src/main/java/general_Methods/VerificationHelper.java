package general_Methods;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class VerificationHelper {
	private static final Logger log = Logger.getLogger(VerificationHelper.class);

	public synchronized boolean verifyElementPresent(WebElement element) {
		boolean isDispalyed = false;
		try {
			isDispalyed = element.isDisplayed();
			Assert.assertTrue(element.getText() + " is not dispalyed", isDispalyed);
		} catch (Exception ex) {
			log.error("Element not found " + ex);
		}
		return isDispalyed;
	}

	public synchronized boolean verifyElementNotPresent(WebElement element) {
		boolean isDispalyed = false;
		try {
			element.isDisplayed();
			log.info(element.getText() + " is dispalyed");
		} catch (Exception ex) {
			log.error("Element not found " + ex);
			isDispalyed = true;
		}

		return isDispalyed;
	}

	public static synchronized boolean verifyTextEquals(WebElement element, String expectedText) {
		boolean flag = false;
		try {
			String actualText = element.getText();
			if (actualText.equals(expectedText)) {
				log.info("actualText is :" + actualText + " expected text is: " + expectedText);
				return flag = true;
			} else {
				log.error("actualText is :" + actualText + " expected text is: " + expectedText);
				return flag;
			}
		} catch (Exception ex) {
			log.error("actualText is :" + element.getText() + " expected text is: " + expectedText);
			log.info("text not matching" + ex);
			return flag;
		}
	}
	
	
	public synchronized boolean AssertTextEquals(WebElement element, String expectedText) {
		boolean flag = false;
		try {
			String actualText = element.getText();
			flag = actualText.equalsIgnoreCase(expectedText);
			Assert.assertTrue("actualText is :" + element.getText() + " expected text is: " + expectedText, flag);
			return flag;
		} catch (Exception ex) {
			log.error("actualText is :" + element.getText() + " expected text is: " + expectedText);
			log.info("text not matching" + ex);
			return flag;
		}
	}
	
	
	public synchronized boolean AssertTextEquals(String actualText, String expectedText) {
		boolean flag = false;
		try {
			//String actualText = element.getText();
			flag = actualText.equalsIgnoreCase(expectedText);
			Assert.assertTrue("actualText is :" + actualText + " expected text is: " + expectedText, flag);
			return flag;
		} catch (Exception ex) {
			log.error("actualText is :" + actualText + " expected text is: " + expectedText);
			log.info("text not matching" + ex);
			return flag;
		}
	}
	
	
	public synchronized boolean AssertTextNotEquals(String actualText, String expectedText) {
		boolean flag = false;
		try {
			flag = actualText.equalsIgnoreCase(expectedText);
			Assert.assertFalse("actualText is :" + actualText + " expected text is: " + expectedText, flag);
			return flag;
		} catch (Exception ex) {
			log.error("actualText is :" + actualText + " expected text is: " + expectedText);
			log.info("text not matching" + ex);
			return flag;
		}
	}
	
}
