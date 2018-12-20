package treatyportal_PageObjects;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import general_Methods.JavaScriptHelper;
import general_Methods.WaitHelper;
import junit.framework.Assert;

public class PTAWorkBasketPage {
	WebDriver driver;
	private final Logger logger = Logger.getLogger(PTAWorkBasketPage.class);
	public String Expworkbaskettext = "Work Basket";
	public String expAgreeBtntext = "Agree";
	public String expAgreeSubBtntext = "Agree subject to";
	public String expQueryBtntext = "Query";
	public String expViewDetailsBtntext = "View details";
	public String expholdBtntext = "Hold";
	public String wbtableheaderpath = "(//table[@class='jsgrid-table'])/tbody";
	public String wbtablepath = "(//table[@class='jsgrid-table'])[2]/tbody";
	JavaScriptHelper javascripthelper;
	WaitHelper waithelper;

	public PTAWorkBasketPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='container body-content']/h2")
	WebElement workbaskettext;

	@FindBy(xpath = "//*[contains(text(),'Search/Filters')]")
	WebElement searchSection;

	@FindBy(xpath = "//a[@href='/Dashboard']")
	WebElement dashboardLink;

	@FindBy(id = "agree-btn")
	WebElement agreeBtn;

	@FindBy(id = "agree-subject-to-btn")
	WebElement agreeSubjectBtn;

	@FindBy(id = "query-btn")
	WebElement queryBtn;

	@FindBy(id = "view-details-btn")
	WebElement viewDetailsBtn;

	@FindBy(id = "hold-btn")
	WebElement holdBtn;

	@FindBy(id = "currency-occ-btn")
	WebElement ccyOccBtn;

	@FindBy(id = "currency-scc-btn")
	WebElement ccySccBtn;

	@FindBy(id = "currency-nominated-btn")
	WebElement nominatedCcyBtn;

	@FindBy(id = "share-own-btn")
	WebElement ownShareBtn;

	@FindBy(id = "share-bureau-btn")
	WebElement bureauShareBtn;

	@FindBy(id = "share-100pct-btn")
	WebElement share100pctBtn;

	@FindBy(xpath = "//button[text()='Log out']")
	WebElement logoutButton;
	
	@FindBy(id="status-filter")
	WebElement statusFilter;
	
	@FindBy(name="UmrFilter")
	WebElement umrFilter;
	
	@FindBy(name="UnderWritingYearFilter")
	WebElement underWritingYearFilter;
	
	@FindBy(name="TreatyNumberFilter")
	WebElement treatyNumberFilter;
	
	@FindBy(name="SubmissionDateFilter")
	WebElement presentationDateFilter;
	
	@FindBy(id="apply-filters-btn")
	WebElement applyFiltersBtn;
	
	@FindBy(xpath="//a[@class='ui-datepicker-prev ui-corner-all']")
	WebElement calenderPrevBtn;
	
	@FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all']")
	WebElement calenderNextBtn;
	
	@FindBy(xpath="//span[@class='ui-datepicker-month']")
	WebElement calenderMonth;
	
	@FindBy(xpath="//span[@class='ui-datepicker-year']")
	WebElement calenderYear;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody")
	WebElement calenderDays;
	
/*	@FindBy(xpath=tablepath + "/tr[" + i + "]"))
	WebElement checkBox;*/
	
	
	public WebElement getcalenderPrevBtn() {
		return calenderPrevBtn;
	}
	
	public WebElement getcalenderNextBtn() {
		return calenderNextBtn;
	}
	
	public WebElement getcalenderMonth() {
		return calenderMonth;
	}
	
	public WebElement getcalenderYear() {
		return calenderYear;
	}
	
	public WebElement getcalenderDays() {
		return calenderDays;
	}
	
	public WebElement getStatusFilter() {
		return statusFilter;
	}
	
	public WebElement getUmrFilter() {
		return umrFilter;
	}
	
	public WebElement getUnderWritingYearFilter() {
		return underWritingYearFilter;
	}
	
	public WebElement getTreatyNumberFilter() {
		return treatyNumberFilter;
	}
	
	public WebElement getPresentationDateFilter() {
		return presentationDateFilter;
	}
	
	public WebElement getApplyFiltersBtn() {
		return applyFiltersBtn;
	}

	public WebElement getWorkbaskettext() {
		return workbaskettext;
	}

	public WebElement getSearchElement() {
		return searchSection;
	}

	public WebElement getdashboardLink() {
		return dashboardLink;
	}

	public WebElement getAgreeBtn() {
		return agreeBtn;
	}

	public WebElement getAgreeSubjectBtn() {
		return agreeSubjectBtn;
	}

	public WebElement getQueryBtn() {
		return queryBtn;
	}

	public WebElement getViewDetailsBtn() {
		return viewDetailsBtn;
	}

	public WebElement getHoldBtn() {
		return holdBtn;
	}

	public WebElement getCcyOccBtn() {
		return ccyOccBtn;
	}

	public WebElement getCcySccBtn() {
		return ccySccBtn;
	}

	public WebElement getNominatedccybtn() {
		return nominatedCcyBtn;
	}

	public WebElement getOwnShareBtn() {
		return ownShareBtn;
	}

	public WebElement getBureauShareBtn() {
		return bureauShareBtn;
	}

	public WebElement get100pctccybtn() {
		return share100pctBtn;
	}

	public String getAllcheckboxlink() {
		String allcheckboxlink = wbtableheaderpath + "/tr[1]" + "/th[1]/input";
		return allcheckboxlink;
	}

	public WebElement getlogoutbtn() {
		return logoutButton;
	}
	
	
	

	public int getHeaderColCount(String tableheaderpath) {
		WebElement workbaskettableheader = driver.findElement(By.xpath(tableheaderpath));
		List<WebElement> rowheaderVals = workbaskettableheader.findElements(By.tagName("tr"));
		List<WebElement> colheaderVals = rowheaderVals.get(0).findElements(By.tagName("th"));
		int colheaderCount = colheaderVals.size();
		logger.info("No. of columns in the table header are: " + colheaderCount);
		return colheaderCount;
	}

	public void selectAllCheckBox() {
		String checkboxlinkpath = this.getAllcheckboxlink();
		WebElement chkbox = driver.findElement(By.xpath(checkboxlinkpath));
		chkbox.click();
		logger.info("All statement are checked in table");
		boolean b1 = chkbox.isSelected();
		Assert.assertTrue("All statement are not checked in table", b1);
	}

	public void deSelectAllCheckBox() {
		String checkboxlinkpath = this.getAllcheckboxlink();
		WebElement chkbox = driver.findElement(By.xpath(checkboxlinkpath));
		boolean b1 = chkbox.isSelected();
		if (b1) {
			chkbox.click();
			boolean b2 = chkbox.isSelected();
			Assert.assertFalse("All statement are not de-selected in table", b2);
		} else {
			logger.info("Required checkbox is not selected");
		}
	}

	public int colpositionheader(String colName, String tablepath, String tableheaderpath) {
		int colheadcount = getHeaderColCount(tableheaderpath);

		for (int k = 1; k <= colheadcount; k++) {
			String coltext = driver.findElement(By.xpath(tableheaderpath + "/tr[1]" + "/th[" + k + "]")).getText();
			if (coltext.equalsIgnoreCase(colName)) {
				logger.info("Required column is present in statement table at position: " + k);
				return k;
			}
		}
		return -1;
	}
	
/*	public String colnameheader(int colPosExcel) throws IOException {
		ExcelReader.setExcelFile("Sheet1");
		String colName = ExcelReader.getColName(colPosExcel);
		return colName;
	}*/

	public int getRowCount(String tablepath) {
		WebElement workbaskettable = driver.findElement(By.xpath(tablepath));
		List<WebElement> rowVals = workbaskettable.findElements(By.tagName("tr"));
		int rowCount = rowVals.size();
		logger.info("Row present in statement table are: " + rowCount);
		return rowCount;
	}

	public int getColCount(String tablepath) {
		WebElement workbaskettable = driver.findElement(By.xpath(tablepath));
		List<WebElement> rowVals = workbaskettable.findElements(By.tagName("tr"));

		List<WebElement> colVals = rowVals.get(0).findElements(By.tagName("td"));
		int colCount = colVals.size();
		logger.info("Column present in statement table are: " + colCount);
		return colCount;
	}

	public void clickSingleRequiredStatus(String reqstatus, String colName,String tablepath, String tableheaderpath) {
		int rcount = getRowCount(tablepath);
		int colpos = colpositionheader(colName,tablepath, tableheaderpath);
		rowloop: for (int i = 1; i <= rcount; i++) {
			String getStatus = driver.findElement(By.xpath(tablepath + "/tr[" + i + "]" + "/td[" + colpos + "]"))
					.getText();

			if (getStatus.equalsIgnoreCase(reqstatus)) {
				WebElement chkbox = driver.findElement(By.xpath(tablepath + "/tr[" + i + "]"));
				chkbox.click();
				/*boolean b1 = chkbox.isSelected();
				Assert.assertTrue("Checkbox for a given " + reqstatus + " statement is not selected", b1);*/
				logger.info("Statement checked with required status of: " + reqstatus);
				break rowloop;
			}
		}
	}

	public void deSelectSingleRequiredStatus(String reqstatus,String tablepath) {
		int rcount = getRowCount(tablepath);
		rowloop: for (int i = 1; i <= rcount; i++) {
			WebElement chkbox = driver.findElement(By.xpath(tablepath + "/tr[" + i + "]" + "/td[1]/input"));
			boolean b1 = chkbox.isSelected();
			if (b1) {
				chkbox.click();
				boolean b2 = chkbox.isSelected();
				Assert.assertFalse("Checkbox for a given " + reqstatus + " statement is still selected", b2);
				logger.info("Statement deselected with required status of: " + reqstatus);
				break rowloop;
			} else {
				logger.info("Required checkbox is not selected");
			}
		}
	}

	public void clickMultipleRequiredStatus(String reqstatus, String colName,String tablepath, String tableheaderpath) {
		int rcount = getRowCount(tablepath);
		int colpos = colpositionheader(colName,tablepath,tableheaderpath);
		int getcount = getcountRequiredStatus(reqstatus, colpos,tablepath);
		int k = 0;

		rowloop: for (int i = 1; i <= rcount; i++) {
			String getStatus = driver.findElement(By.xpath(tablepath + "/tr[" + i + "]" + "/td[" + colpos + "]"))
					.getText();

			if (getStatus.equalsIgnoreCase(reqstatus)) {
				WebElement chkbox = driver.findElement(By.xpath(tablepath + "/tr[" + i + "]" + "/td[1]/input"));
				chkbox.click();
				boolean b1 = chkbox.isSelected();
				Assert.assertTrue("Checkbox for a given " + reqstatus + " statement is not selected", b1);

				if (k == getcount) {
					logger.info("Number of statement checked with required status of: " + reqstatus + " are- " + k);
					break rowloop;
				}
				k = k + 1;
			}
		}
	}

	public int getcountRequiredStatus(Object rowStatementStatus, int colnum,String tablepath) {
		int rcount = getRowCount(tablepath);
		int k = 0;

		for (int i = 1; i <= rcount; i++) {
			String getStatus = driver.findElement(By.xpath(tablepath + "/tr[" + i + "]" + "/td[" + colnum + "]"))
					.getText();
			if (getStatus.equalsIgnoreCase((String) rowStatementStatus.toString().trim())) {
				k = k + 1;
			}
		}
		logger.info("Number of statement present with required status of: " + rowStatementStatus + " are- " + k);
		return k;
	}

	public void deSelectMultipleRequiredStatus(String reqstatus, String colName, String tablepath, String tableheaderpath) {
		javascripthelper = new JavaScriptHelper(driver);
		waithelper = new WaitHelper(driver);
		int rcount = getRowCount(tablepath);
		int colpos = colpositionheader(colName,tablepath,tableheaderpath);
		int getcount = getcountRequiredStatus(reqstatus, colpos,tablepath);
		int k = 0;
		boolean b3 = false;
		rowloop: for (int i = 1; i <= rcount; i++) {
			String getStatus = driver.findElement(By.xpath(tablepath + "/tr[" + i + "]" + "/td[" + colpos + "]"))
					.getText();

			if (getStatus.equalsIgnoreCase(reqstatus)) {
				WebElement chkbox = driver.findElement(By.xpath(tablepath + "/tr[" + i + "]" + "/td[1]/input"));
				boolean b1 = chkbox.isSelected();
				if (b1) {
					if (!b3) {
						b3 = javascripthelper.scrollUpVerticallyBoolean();
					}
					waithelper.waitforelementvisiblejs(logoutButton);
					chkbox.click();
					boolean b2 = chkbox.isSelected();
					Assert.assertFalse("Checkbox for a given " + reqstatus + " statement is not selected", b2);
				} else {
					System.out.println("Required checkbox is not selected");
				}

				if (k == getcount) {
					logger.info("Number of statement un-checked with required status of: " + reqstatus + " are- " + k);
					break rowloop;
				}
				k = k + 1;
			}
		}
	}

	
	public void enterDate(String Date) {
		presentationDateFilter.sendKeys(Date);
		presentationDateFilter.sendKeys(Keys.TAB);
	}

	public WebElement getNoDataFoundElement(String tablepath){
		WebElement noDataFoundElement = driver.findElement(By.xpath(tablepath + "/tr[1]/td[1]"));
		return noDataFoundElement;
	}
/*	 public static void main(String args[]){ 
		 
	  }*/


}
