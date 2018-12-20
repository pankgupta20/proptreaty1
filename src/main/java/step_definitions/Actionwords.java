package step_definitions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import Data_Reader.ExcelReader;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import general_Methods.BrowserHelper;
import general_Methods.DateTimeHelper;
import general_Methods.DropDownHelper;
import general_Methods.GenericHelper;
import general_Methods.JavaScriptHelper;
import general_Methods.ResourceHelper;
import general_Methods.VerificationHelper;
import general_Methods.WaitHelper;
import junit.framework.Assert;
import managers.FileReaderManager;
import managers.WebDriverManager;
import treaty_constants.ConstantParameters;
import treatyportal_PageObjects.PTAStatementDetailsPage;
import treatyportal_PageObjects.PTALoginPage;
import treatyportal_PageObjects.PTAWorkBasketPage;

public class Actionwords {
	static WebDriver driver;
	public Scenario scenario;
	private static final Logger logger = Logger.getLogger(Actionwords.class.getName());
	public static String scenarioName;

	WebDriverManager webDriverManager;
	PTALoginPage ptalogin = new PTALoginPage(driver);
	PTAWorkBasketPage ptawbpage = new PTAWorkBasketPage(driver);
	WaitHelper waithelper = new WaitHelper(driver);
	BrowserHelper browserhelper = new BrowserHelper(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	ConstantParameters constparam;
	VerificationHelper verifyhelper;
	GenericHelper generichelper;
	DateTimeHelper datetimehelper;
	ResourceHelper resourcehelper;
	JavaScriptHelper javascripthelper;
	ConstantParameters constantparam = new ConstantParameters();
	PTAStatementDetailsPage ptastatpage = new PTAStatementDetailsPage(driver);
	
	
	public Actionwords() {
		
	}

	public void iHaveConstructedAValidGETRequest() {

	}

	public void iSubmitTheRequestTheProportionalTreatyApi() {

	}

	public void theCorrectInformationIsReturned() {

	}

	public void theResponseConformsToTheRichardsonMaturityModelLevel2() {

	}

	public void a200OKResponseIsReturned() {

	}

	public void iHaveConstructedAnInvalidGETRequest() {

	}

	public void a400BadRequestIsReturned() {

	}

	public void a500ServerErrorIsReturned() {

	}

	public void fullDetailsOfTheErrorAreVisibleInThePlatformLoggingSystem() {

	}

	public void iHaveCreatedARequestWithAnInvalidHttpVerb() {

	}

	public void thereIsNoInformationInTheRequestBodyOrHeadersThatCanCompromiseTheSecurityOfThePlatform() {

	}

	public void theEndpointIsNotAValidRouteOnTheApi() {

	}

	public void a404NotFoundRequestIsReturned() {

	}

	public void iHaveConstructedAValidPOSTRequest() {

	}

	public void somethingIsPersisted() {

	}

	public void iHaveConstructedAnInvalidPOSTRequest() {

	}

	public void nothingIsPersisted() {

	}

	public void iHaveConstructedAValidPOSTRequestWithInvalidData() {

	}

	public void iVisitedThePTALoginPage() {

	}

	public void iEnterTheCorrectCredentials() {

	}

	public void iAmGrantedAccessToTheApplication() {

	}

	/*
	 * public void
	 * theBrokerSubmitsATreatyStatementForAgreementAndCentralProcessing(
	 * DataTable datatable) {
	 * 
	 * }
	 */

	public void theTreatyIsPlacedWithASingleBureau() {

	}

	public void theTreatyIsSettledOnlyInOneCurrency() {

	}

	public void theTreatyCoversASingleRiskCode() {

	}

	public void theAccountIsForOneUnderwritingYear() {

	}

	public void brokerSystemGeneratesAnEBOTSubmissionIntoDXC() {

	}

	public void theAgreementOrchestrationRulesIdentifyAnAgreementParty() {

	}

	public void anAgreementCaseIsCreatedInThePTA() {

	}

	public void thereIsAnFDOInPlace() {

	}

	public void thatAValidEmailExistsOnFileForTheCarrier() {

	}

	public void theCarrierIsIdentifiedAsAnAgreementParty() {

	}

	public void theCarrierMustReceiveEmailNotificationWithDetailsOfTheAssignedCase() {

	}

	public void theSystemTakesMeToTheHomePage() {

	}

	public void iWantToSeeAListOfAllPendingTasksAssignedToMe() {

	}

	public void aSearchFacility() {

	}

	public void aDashBoardArea() {

	}

	public void actionsChoice() {

	}

	public void thatMyOrganisationHasStatementsAwaitingForAgreement() {

	}

	public void iAccessTheHomePageOfThePTA() {

	}

	public void iWantToBePresentedWithAListOfAllPendingCases() {

	}

	public void aSummaryOfEachStatement() {

	}

	public void iAmLoggedOnThePTA() {

	}

	public void iAmAtTheHomePage() {

	}

	public void theSystemShouldPrioritiseGroupedSubmissionWhereTheWholeGroupIsOrderedByThePresentationDateOfTheOldestMember() {

	}

	public void iSpecifySomeSearchCriteria() {

	}

	public void pressASearchButton() {

	}

	public void iWantToSeeTheListOfPendingCasesThatMatchMySearchCriteria() {

	}

	public void iNavigateToTheDashboardArea() {

	}

	public void theSystemMustPresentTheLatestStatisticsForSubmissionsWhereMyOrganisationHasSignedLines() {

	}

	public void thatIAmInTheDashboardAreaOfThePTA() {

	}

	public void thereAreExistingStatisticsForOpenSubmissions() {

	}

	public void clickOnAnyCountDifferentFromZero() {

	}

	public void theSystemMustTakeMeToTheHomeScreen() {

	}

	public void presentASummarisedListOfStatementsMatchingTheRespectiveCriteria() {

	}

	public void anyStatementThatIsCurrentlyNotAssignedToMeWillBePresentedInReadonlyMode() {

	}

	public void anyStatementThatIsCurrentlyAssignedToMeWillBePresentedInEditMode() {

	}

	public void thatIAmLoggedOnThePTAApplication() {

	}

	public void thereAreOneOrMorePendingStatementsAssignedToMyOrganisation() {

	}

	public void iHaveSelectedOneOrMoreStatements() {

	}

	public void allSelectedStatementsAreAwaitingAgreement() {

	}

	public void theAgreeButtonIsActive() {

	}

	public void iPressTheAgreeButton() {

	}

	public void theSystemShouldProcessMyAgreementForAllSelectedStatements() {

	}

	public void notifyTheBroker() {

	}

	public void iAmTheOnlyAgreementPartyOrTheLastPartyToActionTheCase() {

	}

	public void sendTheStatementForProcessingToDXC() {

	}

	public void theAgreeSubjectToButtonIsActive() {

	}

	public void iPressTheAgreeSubjectToButton() {

	}

	public void theSystemShouldOpenUpAPopupScreenToCaptureTheSubjectivityInANarrative() {

	}

	public void iWantTheListOrderByPresentationDateWithOldestItemPlacedOnTopOfTheList() {

	}

	public void theQueryButtonIsActive() {

	}

	public void iPressTheQueryButton() {

	}

	public void theSystemShouldOpenUpAPopupScreenToCaptureTheDetailsOfMyQuery() {

	}

	public void iHavePressedTheQueryButton() {

	}

	public void theSystemOpensUpTheQueryDetailsScreen() {

	}

	public void iAmOfferedWithAChoiceOfPredefinedQueryCategoriesPresentedInADropdown() {

	}

	public void iCanEnterTheDetailsOfMyQueryInANarrativeField() {

	}

	public void iCanSeeAnActiveButtonSubmitQuery() {

	}

	public void iCanSeeAnActiveButtonToCancelMyEntry() {

	}

	public void iCanSeeAnActiveButtonToUploadADocumentAndAssociateItWithMyQuery() {

	}

	public void iAmTheLeadAgreementParty() {

	}

	public void iHaveOpenedQueryDetailsScreen() {

	}

	public void iCanSeeAnActiveButtonAddDocument() {

	}

	public void iPressTheAddDocumentButon() {

	}

	public void theSystemMustOpenAPopscreenToEnableDocumentUpload() {

	}

	public void iMustBeAbleToBrowseForADocumentFromMyLocalMachine() {

	}

	public void selectTheDocumentToBeUpload() {

	}

	public void seeTheNameOfTheUploadedDocument() {

	}

	public void seeNameAndTheTypeOfTheFileInReadonlyField() {

	}

	public void addFreeTextDescriptionOf() {

	}

	public void seeAnActiveButtonUpload() {

	}

	public void seeAndActiveButtonCancell() {

	}

	public void iHaveEnteredQueryDetailsInTheDesignatedAreaOfTheApplication() {

	}

	public void iHaveSuccessfullyUploadedOneOrMoreDocuments() {

	}

	public void theSubmitQueryButtonIsActive() {

	}

	public void iPressTheSubmitQueryButton() {

	}

	public void storeAnyAttachedDocumentOnTheIMR() {

	}

	public void changeTheStatusOfTheSubmissionToP1(String p1) {

	}

	public void registerTheQueryInPbSQueryPortal() {

	}

	public void triggerAnACORDL4BusinessQueryMessageToTheBroker() {

	}

	public void sendAnEmailNotificationToTheBrokerInlineWithExistingPbSQueryPortalFunctionality() {

	}

	public void theViewDetailsButtonIsActive() {

	}

	public void iPressTheViewDetailsButton() {

	}

	public void theSystemShouldNavigateMeToANewScreenWhereICanSeeTheDetailsOfAllSelectedStatements() {

	}

	public void aCaseForAgreementIsAssignedToMyOrganisation() {

	}

	public void iReceiveANotificationINeedToAgreeSomething() {

	}

	public void iWantToBeAbleToLoginInTheApplication() {

	}

	public void thatIAccessTheHomePageOfThePTA() {

	}

	public void iWantTheTableToIncludeAColumnForTheTreatyNumber() {

	}

	public void iWantToSeeAListOfAllPendingTasksAssignedToMePresentedInATable() {

	}

	public void iSeeTheListOfPendingCasesOnTheHomePage() {

	}

	public void iWantTheSystemToDisplayTheFinancialElementToTheOrderOfMyOrganisationByDefault() {

	}

	public void toAllowMeToChangeThePresentationToDisplayTheFinancialElementsToTheBureuaOrder() {

	}

	public void toAllowMeToChangeThePresentationToTheDisplayTheFinancialElementsFor100TreatyShare() {

	}

	public void updateTheValuesBasedOnMySelection() {

	}

	public void iWantTheTableToIncludeAColumnForTheUnderwirtingYear() {

	}

	public void iWantTheTableToIncludeAColumnForTheUMR() {

	}

	public void iWantTheTableToIncludeAColumnForTheReinsuredName() {

	}

	public void iWantTheTableToIncludeAColumnForTheContractSectionReference() {

	}

	public void iWantTheTableToIncludeAColumnForTheOriginalReferenceCurrency() {

	}

	public void iWantTheTableToIncludeAColumnForTheNetPremiumBalance() {

	}

	public void iWantTheTableToIncludeAColumnForTheNetClaimBalance() {

	}

	public void iWantTheTableToIncludeAColumnForTheStatementBalance() {

	}

	public void iWantTheTableToIncludeAColumnForTheOutstandingLossAmount() {

	}

	public void iWantTheTableToIncludeAColumnForThePresentationDate() {

	}

	public void iWantTheTableToIncludeAColumnForTheNumberOfDaysUntilTheStatementIsAutoagreed() {

	}

	public void iWantTheSystemToDisplayTheFinancialElementInOriginalCurrencyByDefault() {

	}

	public void toAllowMeToChangeThePresentationToDisplayTheFinancialElementsInSettlementCurrency() {

	}

	public void toAllowMeToChangeThePresentationToTheDisplayTheFinancialElementsInANominatedCurrencyWhereICanManuallySpecifyTheFXRate() {

	}

	public void displayAWarningMessageP1IfTheUserSelectionIsDifferentFromTheDefaultValue(String p1) {

	}

	public void theResultsWillBeSortedByPresentationDate() {

	}

	public void iCanThenSortTheListByAnyOfTheColumns() {

	}

	public void iWantToBeAbleToSelectOneOrMoreStatements() {

	}

	public void beAbleToDeselectOneOrMorePreselctedStatements() {

	}

	public void beAbleToSelectAllStatementsInTheListWithOneAction() {

	}

	public void beAbleToDeselectAllPreviouslySelectedStatementsWithOneAction() {

	}

	public void iAmPresentedWithTheLoginForm() {
		try {
			ptalogin.login();
			browserhelper.browserGeneralSettings();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void iAmAllowedToAccessThePTA() {
		WebElement logoutbtn = ptawbpage.getlogoutbtn();
		try {
			waithelper.waitForElementclickable(logoutbtn);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String Acttitle = driver.getTitle();
		String Exptitle = ptalogin.StatepageExptitle;
		logger.info(verifyhelper.AssertTextEquals(Acttitle, Exptitle));
	}

	public void iEnterAnInvalidUsername() {
		try {
			ptalogin.enterEmailAddress("pank@xchanging.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void iEnterAnInvalidPassword() {
		try {
			ptalogin.enterPassword("password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void aMessageIsDisplayedToInformMeMyCredentialsAreNotValid() {
		String geterrortext = ptalogin.getActErrorText();
		boolean chktext = geterrortext.length() > 0;
		Assert.assertTrue("Error message is not shown for user", chktext);
	}

	public void iNotAllowedToAccessThePTA() {
		String Acttitle = driver.getTitle();
		try {
			boolean b1 = Acttitle.equalsIgnoreCase(ptalogin.StatepageExptitle);
			Assert.assertFalse("Carrier is not allowed to login, check credentials", b1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void iEnterAValidUsername1() {
		try {
			ptalogin.enterEmailAddress(FileReaderManager.getInstance().getConfigReader().getLoginUname());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void iEnterAValidPassword() {
		try {
			ptalogin.enterPassword(FileReaderManager.getInstance().getConfigReader().getLoginPwd());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void iLeaveTheUsernameEmpty() {
		ptalogin.enterEmailAddress("");
	}

	public void iLeaveThePasswordEmpty() {
		ptalogin.enterPassword("");
	}

	public void iAmNotAllowedToAccessThePTA() {
		String Acttitle = driver.getTitle();
		String Exptitle;
		try {
			Exptitle = ptawbpage.Expworkbaskettext;
			boolean b1 = Acttitle.equalsIgnoreCase(Exptitle);
			Assert.assertFalse("Carrier is not allowed to login, check credentials", b1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void iEnterAValidUsername() {
		try {
			ptalogin.enterEmailAddress(FileReaderManager.getInstance().getConfigReader().getLoginUname());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void iSubmitTheLoginForm() {
		try {
			WebElement subbtn = ptalogin.clickOnLoginButton();
			waithelper.waitForElementclickable(subbtn);
			subbtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void iMakeAForgottenPasswordRequest() {

	}

	public void iEnterTheEmailAddressAssociatedWithMyAccount() {

	}

	public void submitTheForgottenPasswordForm() {

	}

	public void anEmailWillBeSentToMyEmailAddressWithInstructionsOnNextStepsToRetrieveMyPassword() {

	}

	public void iEnterAnEmailThatIsNotAssociatedWithMyAccount() {

	}

	public void noEmailIsReceivedAtTheEmailAddressAssociatedWithTheAccount() {

	}

	public void iAmOnTheStatementsPendingAgreementPage() {
		this.iAmPresentedWithTheLoginForm();
		this.iEnterAValidUsername();
		this.iEnterAValidPassword();
		this.iSubmitTheLoginForm();

		WebElement stateElement = ptawbpage.getWorkbaskettext();
		String Exptext = ptawbpage.Expworkbaskettext;

		try {
			waithelper.waitForElementvisible(stateElement, Exptext);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		verifyhelper = new VerificationHelper();
		logger.info(verifyhelper.AssertTextEquals(stateElement, Exptext));
	}

	public void thereAreStatementsPendingAgreementAssignedToMyOrganisation() {
		try {
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			String colName = ExcelReader.getColName(constantparam.Status_Table);
			String rowStatementStatus = (String) ExcelReader.getTestData(scenarioRowExcel, constantparam.Status_Table);
			int colposonscreen = ptawbpage.colpositionheader(colName,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);
			int count = ptawbpage.getcountRequiredStatus(rowStatementStatus, colposonscreen,ptawbpage.wbtablepath);
			boolean b1 = count > 0;
			Assert.assertTrue("There is no record present with required status of: " + rowStatementStatus, b1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void aSummaryOfEachStatementPendingAgreementAreDisplayedInAList() {

	}

	public void theSummarisedStatementsContainTheCorrectDataElements() {
		int rcount = ptawbpage.getRowCount(ptastatpage.ptastattable1);
		int ccount = ptawbpage.getColCount(ptastatpage.ptastattable1);
		
		for (int i = 2; i <= rcount; i++) {
			int tempcountsize = 1;
			List<WebElement> tempccount = driver.findElements(By.xpath(ptastatpage.ptastattable1 + "/tr[" + i + "]/td"));
			tempcountsize = tempccount.size();
			if(tempcountsize>ccount){
				ccount = tempcountsize;
			}
			
			for (int j = 1; j <= ccount; j++) {
				String getStatus = driver.findElement(By.xpath(ptastatpage.ptastattable1 + "/tr[" + i + "]" + "/td[" + j + "]"))
						.getText();
				//logger.info("Value of element at row: "+i+ "and column: " + j + "is- " + getStatus);
				System.out.print("Value of element at row: "+i+ " and column: " + j + " is- " + getStatus+"||");
			}
			System.out.println("");
		}
	}

	public void iCanSeeAStatementSearchSection() {
		try {
			WebElement searchElement = ptawbpage.getSearchElement();
			logger.info(verifyhelper.verifyElementPresent(searchElement));
		} catch (Exception e) {
			logger.fatal(e);
		}
	}

	public void iCanSeeAListOfStatementsPendingAgreement() {

	}

	public void iCanSeeALinkToTheDashboardPage() {
		try {
			WebElement dashboardLink = ptawbpage.getdashboardLink();
			logger.info(verifyhelper.verifyElementPresent(dashboardLink));
		} catch (Exception e) {
			logger.fatal(e);
		}
	}

	public void thereAreNoStatementsPendingAgreementAssignedToTheOrganisation() {

	}

	public void theListOfStatementsPendingAgreementIsEmpty() {

	}

	public void thereAreStatementsPendingAgreementAssignedToOtherOrganisations() {

	}

	public void theListContainsOnlyTheStatementsPendingAgreementAssignedToMyOrganisation() {

	}

	public void thereAreStatementsThatAreNotPendingAgreementAssignedToMyOrganisation() {

	}

	public void thereStatementsOfDifferentTypesAssignedToMyOrganisation() {

	}

	public void thereAreStatementsOfDifferentTypesAssignedToOtherOrganisations() {

	}

	public void iSelectASingleStatementPendingAgreement() {
		String colName;
		try {
			colName = ExcelReader.getColName(constantparam.Status_Table);
			int colposonscreen = ptawbpage.colpositionheader(colName,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);
			if (colposonscreen > 0) {
				// String Scenario_Desc = this.getScenarioName(scenario);
				int rowNum = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);

				if (rowNum > 0) {
					String rowStatementStatus = (String) ExcelReader.getTestData(rowNum, constantparam.Status_Table);
					int getcount = ptawbpage.getcountRequiredStatus((String) rowStatementStatus, colposonscreen,ptawbpage.wbtablepath);
					if (getcount > 0) {
						ptawbpage.clickSingleRequiredStatus((String) rowStatementStatus, colName,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);
					} else {
						System.out.println("No row present with in statement table with required status");
					}
				}
			} else {
				System.out.println("No column present with required status");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void aStatementActionIsApplied() {
		WebElement viewDetailsBtn = ptawbpage.getViewDetailsBtn();
		if(viewDetailsBtn.isEnabled()){
			viewDetailsBtn.click();
			logger.info(viewDetailsBtn+ " button is clicking");
		} else{
			logger.info(viewDetailsBtn+ " button is not enabled");
		}		
	}

	public void theActionIsAppliedToTheSingleSelectedStatement() {

	}

	public void iSelectMultipleStatements() {
		int colpos = ptawbpage.colpositionheader("status",ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);
		if (colpos > 0) {
			int getcount = ptawbpage.getcountRequiredStatus("Pending", colpos,ptawbpage.wbtablepath);
			if (getcount > 0) {
				ptawbpage.clickMultipleRequiredStatus("Pending", "Status",ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);
			} else {
				System.out.println("No row present with in statement table with required status");
			}
		} else {
			System.out.println("No column present with required status");
		}
	}

	public void theActionIsOnlyAppliedToTheSelectedStatements() {

	}

	public void theOptionToSelectAllTheStatementsIsUsed() {
		ptawbpage.selectAllCheckBox();
	}

	public void iHaveSelectedASingleStatement() {
		int colpos = ptawbpage.colpositionheader("status",ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);
		if (colpos > 0) {
			int getcount = ptawbpage.getcountRequiredStatus("Pending", colpos,ptawbpage.wbtablepath);
			if (getcount > 0) {
				ptawbpage.clickSingleRequiredStatus("Pending", "Status",ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);
			} else {
				System.out.println("No row present with in statement table with required status");
			}
		} else {
			System.out.println("No column present with required status");
		}
	}

	public void iDeselectTheStatement() {
		ptawbpage.deSelectSingleRequiredStatus("Pending",ptawbpage.wbtablepath);
	}

	public void noActionIsAppliedToTheStatements() {

	}

	public void iHaveSelectedMultipleStatements() {

	}

	public void iDeselectSomeOfStatements() {
		ptawbpage.deSelectMultipleRequiredStatus("Pending", "status",ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);
	}

	public void theOldestCaseWillBeAtTheTopOfTheList() {

	}

	public void iChooseToSortTheListByUMR() {

	}

	public void theListOfStatementsIsDisplayedInUMROrder() {

	}

	public void iChooseToSortTheListByTreatyNumber() {

	}

	public void theListOfStatementsIsDisplayedInTreatyNumberOrder() {

	}

	public void aListOfAvailableActions() {
		this.anActionToAgreeStatementsIsAvailable();
		this.anActionToAgreeStatementsSubjectToCopy();
		this.anActionToQueryStatmentsIsAvailable();
		this.anActionToHoldAutoagreementOfStatements();
		this.anActionToViewDetailsIsAvailable();
	}

	public void theNumberOfStatementsIsOver100() {

	}

	public void theListOfStatementsPendingAgreementContainsAllStatements() {

	}

	public void theStatementsPendingAgreementPageRendersCorrectly() {

	}

	public void anActionToAgreeStatementsIsAvailable() {
		String Exptext = "";
		try {
			WebElement getagreebtntext = ptawbpage.getAgreeBtn();
			Exptext = ptawbpage.expAgreeBtntext;
			logger.info(verifyhelper.AssertTextEquals(getagreebtntext, Exptext));
		} catch (Exception e) {
			logger.fatal(e);
		}
	}

	public void anActionToAgreeStatementsSubjectToCopy() {
		String Exptext = "";
		try {
			WebElement getagreesubbtntext = ptawbpage.getAgreeSubjectBtn();
			Exptext = ptawbpage.expAgreeSubBtntext;
			logger.info(verifyhelper.AssertTextEquals(getagreesubbtntext, Exptext));
		} catch (Exception e) {
			logger.fatal(e);
		}
	}

	public void anActionToQueryStatmentsIsAvailable() {
		String Exptext = "";
		try {
			WebElement getquerybtntext = ptawbpage.getQueryBtn();
			Exptext = ptawbpage.expQueryBtntext;
			logger.info(verifyhelper.AssertTextEquals(getquerybtntext, Exptext));
		} catch (Exception e) {
			logger.fatal(e);
		}
	}

	public void anActionToViewDetailsIsAvailable() {
		String Exptext = "";
		try {
			WebElement getviewdetailsbtntext = ptawbpage.getViewDetailsBtn();
			Exptext = ptawbpage.expViewDetailsBtntext;
			logger.info(verifyhelper.AssertTextEquals(getviewdetailsbtntext, Exptext));
		} catch (Exception e) {
			logger.fatal(e);
		}
	}

	public void anActionToHoldAutoagreementOfStatements() {
		String Exptext = "";
		try {
			WebElement getholdbtntext = ptawbpage.getHoldBtn();
			Exptext = ptawbpage.expholdBtntext;
			logger.info(verifyhelper.AssertTextEquals(getholdbtntext, Exptext));
		} catch (Exception e) {
			logger.fatal(e);
		}
	}

	public void aCurrencyToggleWillBeAvailableToAllowTheCurrencyOptionToBeChanged() {
		WebElement OCCbutton = ptawbpage.getCcyOccBtn();
		WebElement SCCbutton = ptawbpage.getCcySccBtn();
		WebElement Nomccybutton = ptawbpage.getNominatedccybtn();
		generichelper = new GenericHelper();
		generichelper.isDisplayed(OCCbutton);
		generichelper.isDisplayed(SCCbutton);
		generichelper.isDisplayed(Nomccybutton);
	}

	public void theCurrencyToggleWillBeDisabled() {
		WebElement OCCbutton = ptawbpage.getCcyOccBtn();
		WebElement SCCbutton = ptawbpage.getCcySccBtn();

		try {
			waithelper.waitforelementvisiblejs(OCCbutton);
			generichelper.isElementSelected(OCCbutton);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			waithelper.waitforelementclickablejs(SCCbutton);
			generichelper.isElementSelected(SCCbutton);
			generichelper.isElementNotSelected(OCCbutton);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void aSharesToggleWillBeAvailableToChangeTheShareOptions() {
		WebElement ownbutton = ptawbpage.getOwnShareBtn();
		WebElement bureaubutton = ptawbpage.getBureauShareBtn();
		WebElement Nomccybutton = ptawbpage.get100pctccybtn();
		generichelper.isDisplayed(ownbutton);
		generichelper.isDisplayed(bureaubutton);
		generichelper.isDisplayed(Nomccybutton);
	}

	public void theSharesToggleWillBeDisabled() {

	}

	public void relatedStatementsAreGroupedByBrokerGroupReference() {

	}

	public void theListOfStatementsAreSortedByPresentationDateOldestFirst() {

	}

	public void theRelatedStatementsWithinTheBrokerGroupReferenceGroupAreSortedByPresentationDateOldestFirst() {

	}

	public void canBeSortedInBothAscendingAndDescendingOrder() {

	}

	public void i_enter_an_existing_Umr_into_the_filter() {
		try {
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.UMR);
			ptawbpage.getUmrFilter().sendKeys(testDataExcel.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void i_am_on_the_statements_landing_page() {
		this.iAmPresentedWithTheLoginForm();
		this.iEnterAValidUsername();
		this.iEnterAValidPassword();
		this.iSubmitTheLoginForm();

		WebElement stateElement = ptawbpage.getWorkbaskettext();
		String Exptext = ptawbpage.Expworkbaskettext;

		try {
			waithelper.waitForElementvisible(stateElement, Exptext);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		verifyhelper = new VerificationHelper();
		logger.info(verifyhelper.AssertTextEquals(stateElement, Exptext));
	}

	public void i_apply_the_filter() {
		ptawbpage.getApplyFiltersBtn().click();
	}

	public void only_statements_with_that_Umr_are_displayed_in_the_list() {
		String colNameExcel;
		try {
			colNameExcel = ExcelReader.getColName(constantparam.UMR);
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.UMR);
			int colPositionScreen = ptawbpage.colpositionheader(colNameExcel,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);

			if (colPositionScreen > 0 && testDataExcel.toString().length() > 0) {
				int getRowCountScreen = ptawbpage.getRowCount(ptawbpage.wbtablepath);
				if (getRowCountScreen > 0) {
					for (int i = 1; i < getRowCountScreen + 1; i++) {
						String getUMRonScreen = driver
								.findElement(By.xpath(
										ptawbpage.wbtablepath + "/tr[" + i + "]" + "/td[" + colPositionScreen + "]"))
								.getText();
						logger.info(verifyhelper.AssertTextEquals(getUMRonScreen, testDataExcel.toString().trim()));
					}
				} else {
					logger.info("No row present with in statement table with required filter");
				}
			} else {
				System.out.println("Either column: " + colNameExcel
						+ " is not present on Workbasket page or no data is present in excel for that field");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void i_enter_an_existing_Treaty_Number_into_the_filter() {
		try {
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Treaty_Number);
			ptawbpage.getTreatyNumberFilter().sendKeys(testDataExcel.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void only_statements_with_that_Treaty_Number_are_displayed_in_the_list() {
		String colNameExcel;
		try {
			colNameExcel = ExcelReader.getColName(constantparam.Treaty_Number);
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Treaty_Number);
			int colPositionScreen = ptawbpage.colpositionheader(colNameExcel,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);

			if (colPositionScreen > 0 && testDataExcel.toString().length() > 0) {
				int getRowCountScreen = ptawbpage.getRowCount(ptawbpage.wbtablepath);
				if (getRowCountScreen > 0) {
					for (int i = 1; i < getRowCountScreen + 1; i++) {
						String getTreatyNumberonScreen = driver
								.findElement(By.xpath(
										ptawbpage.wbtablepath + "/tr[" + i + "]" + "/td[" + colPositionScreen + "]"))
								.getText();
						logger.info(verifyhelper.AssertTextEquals(getTreatyNumberonScreen,
								testDataExcel.toString().trim()));
					}
				} else {
					logger.info("No row present with in statement table with required filter");
				}
			} else {
				System.out.println("Either column: " + colNameExcel
						+ " is not present on Workbasket page or no data is present in excel for that field");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void i_enter_an_existing_Underwriting_Year_into_the_filter() {
		try {
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.UW_Year);
			ptawbpage.getUnderWritingYearFilter().sendKeys(testDataExcel.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void only_statements_with_that_Underwriting_Year_are_displayed_in_the_list() {
		String colNameExcel;
		try {
			colNameExcel = ExcelReader.getColName(constantparam.UW_Year);
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.UW_Year);
			int colPositionScreen = ptawbpage.colpositionheader(colNameExcel,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);

			if (colPositionScreen > 0 && testDataExcel.toString().length() > 0) {
				int getRowCountScreen = ptawbpage.getRowCount(ptawbpage.wbtablepath);
				if (getRowCountScreen > 0) {
					for (int i = 1; i < getRowCountScreen + 1; i++) {
						String getUWYearonScreen = driver
								.findElement(By.xpath(
										ptawbpage.wbtablepath + "/tr[" + i + "]" + "/td[" + colPositionScreen + "]"))
								.getText();
						logger.info(
								verifyhelper.AssertTextEquals(getUWYearonScreen, testDataExcel.toString().trim()));
					}
				} else {
					logger.info("No row present with in statement table with required filter");
				}
			} else {
				System.out.println("Either column: " + colNameExcel
						+ " is not present on Workbasket page or no data is present in excel for that field");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void i_choose_to_filter_by_pending_statements() {
		try {
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Status_Filter);
			WebElement statusFilter = ptawbpage.getStatusFilter();
			dropdownhelper.SelectUsingVisibleValue(statusFilter, testDataExcel.toString().trim());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void the_list_only_contains_statements_in_the_pending_state() {
		String colNameExcel;
		try {
			colNameExcel = ExcelReader.getColName(constantparam.Status_Table);
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Status_Table);
			int colPositionScreen = ptawbpage.colpositionheader(colNameExcel,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);

			if (colPositionScreen > 0 && testDataExcel.toString().length() > 0) {
				int getRowCountScreen = ptawbpage.getRowCount(ptawbpage.wbtablepath);
				if (getRowCountScreen > 0) {
					for (int i = 1; i < getRowCountScreen + 1; i++) {
						String getStatusonScreen = driver
								.findElement(By.xpath(
										ptawbpage.wbtablepath + "/tr[" + i + "]" + "/td[" + colPositionScreen + "]"))
								.getText();
						logger.info(verifyhelper.AssertTextEquals(getStatusonScreen, testDataExcel.toString().trim()));
					}
				} else {
					logger.info("No row present with in statement table with required filter");
				}
			} else {
				System.out.println("Either column: " + colNameExcel
						+ " is not present on Workbasket page or no data is present in excel for that field");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void i_choose_to_filter_by_queried_statements() {
		try {
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Status_Filter);
			WebElement statusFilter = ptawbpage.getStatusFilter();
			dropdownhelper.SelectUsingVisibleValue(statusFilter, testDataExcel.toString().trim());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void the_list_only_contains_statements_in_a_queried_state() {
		String colNameExcel;
		try {
			colNameExcel = ExcelReader.getColName(constantparam.Status_Table);
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Status_Table);
			int colPositionScreen = ptawbpage.colpositionheader(colNameExcel,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);

			if (colPositionScreen > 0 && testDataExcel.toString().length() > 0) {
				int getRowCountScreen = ptawbpage.getRowCount(ptawbpage.wbtablepath);
				if (getRowCountScreen > 0) {
					for (int i = 1; i < getRowCountScreen + 1; i++) {
						String getStatusonScreen = driver
								.findElement(By.xpath(
										ptawbpage.wbtablepath + "/tr[" + i + "]" + "/td[" + colPositionScreen + "]"))
								.getText();
						logger.info(verifyhelper.AssertTextEquals(getStatusonScreen, testDataExcel.toString().trim()));
					}
				} else {
					logger.info("No row present with in statement table with required filter");
				}
			} else {
				System.out.println("Either column: " + colNameExcel
						+ " is not present on Workbasket page or no data is present in excel for that field");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void i_choose_to_filter_by_agreed_statements() {
		try {
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Status_Filter);
			WebElement statusFilter = ptawbpage.getStatusFilter();
			dropdownhelper.SelectUsingVisibleValue(statusFilter, testDataExcel.toString().trim());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void the_list_only_contains_statements_in_the_agreed_state() {
		String colNameExcel;
		try {
			colNameExcel = ExcelReader.getColName(constantparam.Status_Table);
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Status_Table);
			int colPositionScreen = ptawbpage.colpositionheader(colNameExcel,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);

			if (colPositionScreen > 0 && testDataExcel.toString().length() > 0) {
				int getRowCountScreen = ptawbpage.getRowCount(ptawbpage.wbtablepath);
				if (getRowCountScreen > 0) {
					for (int i = 1; i < getRowCountScreen + 1; i++) {
						String getStatusonScreen = driver
								.findElement(By.xpath(
										ptawbpage.wbtablepath + "/tr[" + i + "]" + "/td[" + colPositionScreen + "]"))
								.getText();
						logger.info(verifyhelper.AssertTextEquals(getStatusonScreen, testDataExcel.toString().trim()));
					}
				} else {
					logger.info("No row present with in statement table with required filter");
				}
			} else {
				System.out.println("Either column: " + colNameExcel
						+ " is not present on Workbasket page or no data is present in excel for that field");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void i_choose_to_filter_by_referred_statements() {
		try {
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Status_Filter);
			WebElement statusFilter = ptawbpage.getStatusFilter();
			dropdownhelper.SelectUsingVisibleValue(statusFilter, testDataExcel.toString().trim());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void the_list_only_contains_statements_in_the_referred_state() {
		String colNameExcel;
		try {
			colNameExcel = ExcelReader.getColName(constantparam.Status_Table);
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Status_Table);
			int colPositionScreen = ptawbpage.colpositionheader(colNameExcel,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);

			if (colPositionScreen > 0 && testDataExcel.toString().length() > 0) {
				int getRowCountScreen = ptawbpage.getRowCount(ptawbpage.wbtablepath);
				if (getRowCountScreen > 0) {
					for (int i = 1; i < getRowCountScreen + 1; i++) {
						String getStatusonScreen = driver
								.findElement(By.xpath(
										ptawbpage.wbtablepath + "/tr[" + i + "]" + "/td[" + colPositionScreen + "]"))
								.getText();
						logger.info(verifyhelper.AssertTextEquals(getStatusonScreen, testDataExcel.toString().trim()));
					}
				} else {
					logger.info("No row present with in statement table with required filter");
				}
			} else {
				System.out.println("Either column: " + colNameExcel
						+ " is not present on Workbasket page or no data is present in excel for that field");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void i_select_a_submission_date_filter() {
		try {
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object PresentationDateExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Presentation_Date);
			ptawbpage.getPresentationDateFilter().sendKeys(PresentationDateExcel.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void the_list_only_contains_statements_with_the_selected_submission_date() {
		String colNameExcel;
		try {
			colNameExcel = ExcelReader.getColName(constantparam.Treaty_Number);
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object PresentationDateExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Presentation_Date);
			int colPositionScreen = ptawbpage.colpositionheader(colNameExcel,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);

			if (colPositionScreen > 0 && PresentationDateExcel.toString().length() > 0) {
				int getRowCountScreen = ptawbpage.getRowCount(ptawbpage.wbtablepath);
				if (getRowCountScreen > 0) {
					for (int i = 1; i < getRowCountScreen + 1; i++) {
						String getPresentationDateonScreen = driver
								.findElement(By.xpath(
										ptawbpage.wbtablepath + "/tr[" + i + "]" + "/td[" + colPositionScreen + "]"))
								.getText();
						logger.info(verifyhelper.AssertTextEquals(getPresentationDateonScreen,
								PresentationDateExcel.toString().trim()));
					}
				} else {
					logger.info("No row present with in statement table with required filter");
				}
			} else {
				System.out.println("Either column: " + colNameExcel
						+ " is not present on Workbasket page or no data is present in excel for that field");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void i_enter_a_non_existent_UMR_into_the_UMR_filter() {
		try {
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.UMR);
			ptawbpage.getUmrFilter().sendKeys(testDataExcel.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void the_list_will_contain_no_statements() {
		boolean flag = false;
			int getRowCountScreen = ptawbpage.getRowCount(ptawbpage.wbtablepath);
			if (getRowCountScreen == 1) {
				String getNoDataFoundText = ptawbpage.getNoDataFoundElement(ptawbpage.wbtablepath).getText();
				verifyhelper.AssertTextEquals(getNoDataFoundText, "Not found");
				flag = true;
			} else {
				Assert.assertTrue("More number of rows are present then expected: "+getRowCountScreen,flag);
			}
	}



	public void only_statements_with_that_Filtered_values_are_displayed_in_the_list() {
		String colNameExcel;
		try {
			colNameExcel = ExcelReader.getColName(constantparam.Treaty_Number);
			int scenarioRowExcel = ExcelReader.getRowNum(constantparam.Scenario_Desc, scenarioName);
			Object testDataExcel = ExcelReader.getTestData(scenarioRowExcel, constantparam.Treaty_Number);
			int colPositionScreen = ptawbpage.colpositionheader(colNameExcel,ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);

			if (colPositionScreen > 0 && testDataExcel.toString().length() > 0) {
				int getRowCountScreen = ptawbpage.getRowCount(ptawbpage.wbtablepath);
				if (getRowCountScreen > 0) {
					for (int i = 1; i < getRowCountScreen + 1; i++) {
						String getTreatyNumberonScreen = driver
								.findElement(By.xpath(
										ptawbpage.wbtablepath + "/tr[" + i + "]" + "/td[" + colPositionScreen + "]"))
								.getText();
						logger.info(verifyhelper.AssertTextEquals(getTreatyNumberonScreen,
								testDataExcel.toString().trim()));
					}
				} else {
					logger.info("No row present with in statement table with required filter");
				}
			} else {
				System.out.println("Either column: " + colNameExcel
						+ " is not present on Workbasket page or no data is present in excel for that field");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	public void statements_exist_in_the_system() {
		int getRowCountScreen = ptawbpage.getRowCount(ptawbpage.wbtablepath);
		if (getRowCountScreen > 0) {
			if (getRowCountScreen == 1) {
				try {
					String getNoDataFoundText = ptawbpage.getNoDataFoundElement(ptawbpage.wbtablepath).getText();
					verifyhelper.AssertTextNotEquals(getNoDataFoundText, "Not found");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else{
				logger.info("Total number of rows present in workbasket table: "+getRowCountScreen);
			}
		}
	}

 
    public void i_select_a_single_statement(){
    	ptawbpage.clickSingleRequiredStatus("For Agreement", "Status",ptawbpage.wbtablepath,ptawbpage.wbtableheaderpath);
    }


    public void i_have_selected_all_statements(){

    }


    public void i_deselect_all_statements(){

    }


    public void no_statements_are_selected(){

    }

	public void a_summary_of_each_statement_is_displayed_in_a_list() {
		this.aStatementActionIsApplied();
		
	}

	public void there_are_no_statements_in_the_system() {
		
	}

	public void the_list_of_statements_is_empty() {
		
	}
    
	public String getScenarioName(Scenario scenario) {
		scenarioName = scenario.getName();
		return scenarioName;
	}

	@Before
	public void BrowserSetup(Scenario scenario) throws Exception {
		try {
			webDriverManager = new WebDriverManager();
			driver = webDriverManager.getDriver();
			resourcehelper = new ResourceHelper();

		} catch (Exception e) {
			e.printStackTrace();
		}
		String log4jConfPath = resourcehelper.getResourcePath("log4j.properties");
		PropertyConfigurator.configure(log4jConfPath);
		logger.info("<----------Scenario Started: " + this.getScenarioName(scenario) + "--------------->");
	}

	@After
	public void tearDown(Scenario scenario) throws NullPointerException {
		scenario.write("Scenario Completed :" + scenario.getName());
		logger.info("<----------Scenario Completed: " + scenario.getName() + "--------------->");
		constparam = new ConstantParameters();
		if (scenario.isFailed()) {
			try {
				datetimehelper = new DateTimeHelper();
				String screenshotName = scenario.getName().replaceAll(" ", "_");
				File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File destinationPath = new File(resourcehelper.getBaseResourcePath() + "/test-outout/screenshots/"
						+ screenshotName + DateTimeHelper.getCurrentDateTime() + ".png");
				Files.copy(sourcePath, destinationPath);
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		logger.info("<<<<<------------------------------------------------------------------------------->>>>>");
		webDriverManager.closeDriver();
	}



	
	  /*public static void main(String args[]){
	  Actionwords act = new Actionwords(); 
	  act.iAmPresentedWithTheLoginForm(); act.iEnterAValidUsername();
	  act.iEnterAValidPassword(); act.iSubmitTheLoginForm();	  
	  act.i_am_on_the_statements_landing_page();
	  act.iSelectASingleStatementPendingAgreement();
	  //ptastatpage.getTableCol(ptastatpage.ptastattable1);	  
	  int rcount = ptawbpage.getRowCount(PTAStatementDetailsPage.ptastattable1);
		int ccount = ptawbpage.getColCount(PTAStatementDetailsPage.ptastattable1);

		for (int i = 1; i <= rcount; i++) {
			for (int j = 1; j <= ccount; j++) {
				String getStatus = driver.findElement(By.xpath(PTAStatementDetailsPage.ptastattable1 + "/tr[" + i + "]" + "/td[" + j + "]"))
						.getText();
				logger.info("Number of statement present with required status of are- " + getStatus);
			}
		}
	}*/
	  
	 

}