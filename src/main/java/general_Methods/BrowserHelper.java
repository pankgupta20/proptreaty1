package general_Methods;

import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import managers.FileReaderManager;

public class BrowserHelper {
	WebDriver driver;
	private Logger logger = Logger.getLogger(BrowserHelper.class);

	public BrowserHelper(WebDriver driver) {
		this.driver = driver;
		//logger.info("BrowserHelper : " + this.driver.hashCode());
	}

	public void goBack() {
		driver.navigate().back();
		logger.info("");
	}

	public void goForward() {
		driver.navigate().forward();
		logger.info("");
	}

	public void refresh() {
		driver.navigate().refresh();
		logger.info("");
	}

	public Set<String> getWindowHandlens() {
		logger.info("");
		return driver.getWindowHandles();
	}

	public void SwitchToWindow(int index) {

		LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());

		if (index < 0 || index > windowsId.size()) {
			throw new IllegalArgumentException("Invalid Index : " + index);
		}
		driver.switchTo().window(windowsId.get(index));
		logger.info(index);
	}

	public void switchToParentWindow() {
		LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());
		driver.switchTo().window(windowsId.get(0));
		logger.info("");
	}

	public void switchToParentWithChildClose() {
		LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());

		for (int i = 1; i < windowsId.size(); i++) {
			logger.info(windowsId.get(i));
			driver.switchTo().window(windowsId.get(i));
			driver.close();
		}
		switchToParentWindow();
	}

	public void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
		logger.info(nameOrId);
	}
	
	public void browserGeneralSettings() throws NumberFormatException, Exception {
		//FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize();
		//driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(FileReaderManager.getInstance().getConfigReader().getPageLoadTimeOut(), TimeUnit.SECONDS);
	}
}
