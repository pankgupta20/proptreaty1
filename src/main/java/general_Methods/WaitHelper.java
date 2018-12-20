package general_Methods;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class WaitHelper {
	WebDriver driver;
	private final Logger logger = Logger.getLogger(WaitHelper.class);
	
	
	public WaitHelper(WebDriver driver){
		this.driver = driver;
	}

	
	public void waitForElementclickable(WebElement ele) throws NumberFormatException, Exception {
		long timeout = FileReaderManager.getInstance().getConfigReader().getExplicitWait();
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.withTimeout(timeout, TimeUnit.SECONDS);
		logger.info("Waiting until element: '"+ele+ "' is clickable");
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void waitForElementvisible(WebElement ele, String text) throws NumberFormatException, Exception {
		long timeout = FileReaderManager.getInstance().getConfigReader().getExplicitWait();
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.withTimeout(timeout, TimeUnit.SECONDS);
		logger.info("Waiting until element: '"+ele+ "' is visible");
		wait.until(ExpectedConditions.textToBePresentInElement(ele, text));
	}

	public void waitforelementvisiblejs(WebElement ele) {
		String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
		((JavascriptExecutor) driver).executeScript(js, ele);
	}

	public void waitforelementclickablejs(WebElement ele) {
		String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
		((JavascriptExecutor) driver).executeScript(js, ele);
		ele.click();
	}


	/*	@SuppressWarnings("unused")
	private static void waitForElementclickable(Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds, WebElement element){
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
		webDriverWait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
		try{
			System.out.println("waiting for pageload");
			webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
		}catch (Exception e){
			System.out.println(e.getMessage());
		}          
	}*/
	
/*	private static void waitForElementpresent(Function<WebDriver, WebElement> function = new function< WebElement element, String text>){
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
		webDriverWait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
		try{
			System.out.println("waiting for pageload");
			webDriverWait.until(ExpectedConditions.textToBePresentInElement(element, text));
		}catch (Exception e){
			System.out.println(e.getMessage());
		}          
	}
*/
}
	
