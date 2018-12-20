package treatyportal_PageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PTAStatementDetailsPage {
	static WebDriver driver;
	private final static Logger logger = Logger.getLogger(PTAStatementDetailsPage.class);
	public  String ptastattable1 = "//div[@class='container body-content']/table/tbody[1]";
	static PTAWorkBasketPage ptawbpage;
	
	public PTAStatementDetailsPage(WebDriver driver) {
		PTAStatementDetailsPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="cash-account-header")
	WebElement cashAccountHeader;
	
	@FindBy(id="cash-account-rows")
	WebElement cashAccountRows;
	
	@FindBy(id="premium-breakdown-header")
	WebElement premiumBreakdownHeader;
	
	@FindBy(id="premium-breakdown-rows")
	WebElement premiumBreakdownRows;
	
	@FindBy(id="deferred-instalment-header")
	WebElement deferredInstalmentHeader;
	
	@FindBy(id="deferred-instalment-rows")
	WebElement deferredInstalmentRows;
	
	@FindBy(id="deferred-account-header")
	WebElement deferredAccountHeader;
	
	@FindBy(id="deferred-account-rows")
	WebElement deferredAccountRows;
	
	@FindBy(id="premium-reserve-header")
	WebElement premiumReserveHeader;
	
	@FindBy(id="premium-reserve-rows")
	WebElement premiumReserveRows;
	
	@FindBy(id="reserve-interest-header")
	WebElement reserveInterestHeader;
	
	@FindBy(id="reserve-interest-rows")
	WebElement reserveInterestRows;
	
	@FindBy(id="claims-breakdown-header")
	WebElement claimsBreakdownHeader;
	
	@FindBy(id="claims-breakdown-rows")
	WebElement claimsBreakdownRows;
	
	@FindBy(id = "share-own-btn")
	WebElement	ownShareBtn;

	@FindBy(id = "share-bureau-btn")
	WebElement bureauShareBtn;

	@FindBy(id = "share-100pct-btn")
	WebElement share100pctBtn;
	
	@FindBy(xpath = "//a[@href='/workbasket']")
	WebElement workbasketLink;
	
	@FindBy(xpath = "//button[contains(text(),'View Contract Details')]")
	WebElement viewContractDetailsBtn;
	
	@FindBy(xpath = "//button[contains(text(),'View Documents')]")
	WebElement viewDocumentsBtn;
	
	@FindBy(xpath = "//button[contains(text(),'View Previous Statements')]")
	WebElement viewPreviousStatementBtn;
	
	@FindBy(xpath = "//button[contains(text(),'View Large Loss History')]")
	WebElement viewLargeLossHistoryBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Agree All')]")
	WebElement agreeAllBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Agree All Subject To')]")
	WebElement agreeAllSubjectToBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Query All')]")
	WebElement queryAllBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Hold All')]")
	WebElement holdAllBtn;
	
	
	
	
	
	public WebElement getCashAccountHeader() {
		return cashAccountHeader;
	}
	
	public WebElement getcashAccountRows() {
		return cashAccountRows;
	}
	
	public WebElement getPremiumBreakdownHeader() {
		return premiumBreakdownHeader;
	}
	
	public WebElement getPremiumBreakdownRows() {
		return premiumBreakdownRows;
	}
	
	public WebElement getDeferredInstalmentHeader() {
		return deferredInstalmentHeader;
	}
	
	public WebElement getDeferredInstalmentRows() {
		return deferredInstalmentRows;
	}
	
	public WebElement getDeferredAccountHeader() {
		return deferredAccountHeader;
	}
	
	public WebElement getDeferredAccountRows() {
		return deferredAccountRows;
	}
	
	public WebElement getPremiumReserveHeader() {
		return premiumReserveHeader;
	}
	
	public WebElement getPremiumReserveRows() {
		return premiumReserveRows;
	}
	
	public WebElement getReserveInterestHeader() {
		return reserveInterestHeader;
	}

	public WebElement getReserveInterestRows() {
		return reserveInterestRows;
	}

	public WebElement getClaimsBreakdownHeader() {
		return claimsBreakdownHeader;
	}

	public WebElement getClaimsBreakdownRows() {
		return claimsBreakdownRows;
	}

	public WebElement getGetOwnShareBtn() {
		return ownShareBtn;
	}

	public WebElement getBureauShareBtn() {
		return bureauShareBtn;
	}

	public WebElement getShare100pctBtn() {
		return share100pctBtn;
	}

	public WebElement getWorkbasketLink() {
		return workbasketLink;
	}

	
	
	public static void getTableCol(String tablepath) {
		
		ptawbpage = new PTAWorkBasketPage(driver);
		
		
		int rcount = ptawbpage.getRowCount(tablepath);
		int ccount = ptawbpage.getColCount(tablepath);

		for (int i = 1; i <= rcount; i++) {
			for (int j = 1; j <= ccount; j++) {
				String getStatus = driver.findElement(By.xpath(tablepath + "/tr[" + i + "]" + "/td[" + j + "]"))
						.getText();
				logger.info("Number of statement present with required status of are- " + getStatus);
			}
		}
	}

	
/*	public static void main(String args[]){		
		getTableCol(ptastattable1);
	}*/
	
	}
