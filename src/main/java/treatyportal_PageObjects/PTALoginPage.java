package treatyportal_PageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;


public class PTALoginPage {
	WebDriver driver;
	private final Logger logger = Logger.getLogger(PTALoginPage.class);
	public String StatepageExptitle="WorkBasket - DXC.Technology";
	
		public PTALoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(id="Email")
	WebElement loginuname;
	
	@FindBy(id="Password")
	WebElement loginpwd;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement loginbtn;
	
	@FindBy(xpath="//div[@class='text-danger validation-summary-errors']/ul/li")
	WebElement geterrortext;
	
		public void login() throws Exception {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		}
	
		public void enterEmailAddress(String Username){
			logger.info("entering loginuname...."+loginuname);
			loginuname.sendKeys(Username);
		}
		
		public void enterPassword(String password){
			logger.info("entering loginpwd....");
			loginpwd.sendKeys(password);
		}
		
		public WebElement clickOnLoginButton(){	
			logger.info("clicking on login button...");
			return loginbtn;
		}

		public String getActErrorText(){
			String gettext = geterrortext.getText();
			logger.info("Error text retrieved from screen: "+ gettext);
			return gettext;
		}
		
}
