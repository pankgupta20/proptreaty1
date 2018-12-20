package general_Methods;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.cucumber.listener.Reporter;

public class GenericHelper {
	private static final Logger log = Logger.getLogger(GenericHelper.class);

	public String readValueFromElement(WebElement element) {

		if (null == element) {
			log.info("weblement is null");
			return null;
		}

		boolean displayed = false;
		try {
			displayed = isDisplayed(element);
		} catch (Exception e) {
			log.error(e);
			Reporter.addStepLog(e.fillInStackTrace().toString());
			return null;
		}

		if (!displayed) {
			return null;
		}
		String text = element.getText();
		log.info("weblement valus is.." + text);
		return text;
	}

	public String readValueFromInput(WebElement element) {
		if (null == element) {
			return null;
		}
		if (!isDisplayed(element)) {
			return null;
		}
		String value = element.getAttribute("value");
		log.info("weblement valus is.." + value);
		return value;
	}

	public boolean isDisplayed(WebElement element) {
		boolean b1 = false;
		try {
			b1 = element.isDisplayed();
			Assert.assertTrue("Element is not displayed.." + element, b1);
			return b1;
		} catch (Exception e) {
			log.info(e);
			Reporter.addStepLog(e.fillInStackTrace().toString());
			return b1;
		}
	}

	public boolean isNotDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			log.info("element is displayed.." + element);
			return false;
		} catch (Exception e) {
			log.error(e);
			Reporter.addStepLog(e.fillInStackTrace().toString());
			return true;
		}
	}
	
	public boolean isElementSelected(WebElement element) {
		boolean b1 = false;
		try {
			b1 = element.isSelected();
			Assert.assertTrue("Element is not selected.." + element, b1);
			return b1;
		} catch (Exception e) {
			log.error(e);
			Reporter.addStepLog(e.fillInStackTrace().toString());
			return b1;
		}
	}

	public boolean isElementNotSelected(WebElement element) {
		boolean b1 = true;
		try {
			b1 = element.isSelected();
			Assert.assertFalse("Element is selected.." + element, b1);
			return b1;
		} catch (Exception e) {
			log.error(e);
			Reporter.addStepLog(e.fillInStackTrace().toString());
			return b1;
		}
	}
	
	
	public String getDisplayText(WebElement element) {
		if (null == element) {
			return null;
		}
		if (!isDisplayed(element)) {
			return null;
		}
		return element.getText();
	}

	public static synchronized String getElementText(WebElement element) {
		if (null == element) {
			log.info("weblement is null");
			return null;
		}
		String elementText = null;
		try {
			elementText = element.getText();
		} catch (Exception ex) {
			log.info("Element not found " + ex);
			Reporter.addStepLog(ex.fillInStackTrace().toString());
		}
		return elementText;
	}
}
