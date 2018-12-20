package step_definitions;


import cucumber.api.java.en.*;

public class StepDefinitions {
	public Actionwords actionwords = new Actionwords();

    @Given("^I have constructed a valid GET request$")
    public void iHaveConstructedAValidGETRequest() {
        actionwords.iHaveConstructedAValidGETRequest();
    }

    @When("^I submit the request the proportional treaty api$")
    public void iSubmitTheRequestTheProportionalTreatyApi() {
        actionwords.iSubmitTheRequestTheProportionalTreatyApi();
    }

    @Then("^the correct information is returned$")
    public void theCorrectInformationIsReturned() {
        actionwords.theCorrectInformationIsReturned();
    }

    @Then("^the response conforms to the Richardson maturity model level 2$")
    public void theResponseConformsToTheRichardsonMaturityModelLevel2() {
        actionwords.theResponseConformsToTheRichardsonMaturityModelLevel2();
    }

    @Then("^a 200 OK response is returned$")
    public void a200OKResponseIsReturned() {
        actionwords.a200OKResponseIsReturned();
    }

    @Given("^I have constructed an invalid GET request$")
    public void iHaveConstructedAnInvalidGETRequest() {
        actionwords.iHaveConstructedAnInvalidGETRequest();
    }

    @Then("^a 400 bad request is returned$")
    public void a400BadRequestIsReturned() {
        actionwords.a400BadRequestIsReturned();
    }

    @Then("^a 500 server error is returned$")
    public void a500ServerErrorIsReturned() {
        actionwords.a500ServerErrorIsReturned();
    }

    @Then("^full details of the error are visible in the platform logging system$")
    public void fullDetailsOfTheErrorAreVisibleInThePlatformLoggingSystem() {
        actionwords.fullDetailsOfTheErrorAreVisibleInThePlatformLoggingSystem();
    }

    @Given("^I have created a request with an invalid http verb$")
    public void iHaveCreatedARequestWithAnInvalidHttpVerb() {
        actionwords.iHaveCreatedARequestWithAnInvalidHttpVerb();
    }

    @Then("^there is no information in the request body or headers that can compromise the security of the platform$")
    public void thereIsNoInformationInTheRequestBodyOrHeadersThatCanCompromiseTheSecurityOfThePlatform() {
        actionwords.thereIsNoInformationInTheRequestBodyOrHeadersThatCanCompromiseTheSecurityOfThePlatform();
    }

    @Given("^the endpoint is not a valid route on the api$")
    public void theEndpointIsNotAValidRouteOnTheApi() {
        actionwords.theEndpointIsNotAValidRouteOnTheApi();
    }

    @Then("^a 404 not found request is returned$")
    public void a404NotFoundRequestIsReturned() {
        actionwords.a404NotFoundRequestIsReturned();
    }

    @Given("^I have constructed a valid POST request$")
    public void iHaveConstructedAValidPOSTRequest() {
        actionwords.iHaveConstructedAValidPOSTRequest();
    }

    @Then("^something is persisted$")
    public void somethingIsPersisted() {
        actionwords.somethingIsPersisted();
    }

    @Given("^I have constructed an invalid POST request$")
    public void iHaveConstructedAnInvalidPOSTRequest() {
        actionwords.iHaveConstructedAnInvalidPOSTRequest();
    }

    @Then("^nothing is persisted$")
    public void nothingIsPersisted() {
        actionwords.nothingIsPersisted();
    }

    @Given("^I have constructed a valid POST request with invalid data$")
    public void iHaveConstructedAValidPOSTRequestWithInvalidData() {
        actionwords.iHaveConstructedAValidPOSTRequestWithInvalidData();
    }

    @Given("^I visited the PTA login page$")
    public void iVisitedThePTALoginPage() {
        actionwords.iVisitedThePTALoginPage();
    }

    @When("^I enter the correct credentials$")
    public void iEnterTheCorrectCredentials() {
        actionwords.iEnterTheCorrectCredentials();
    }

    @Then("^i am granted access to the application$")
    public void iAmGrantedAccessToTheApplication() {
        actionwords.iAmGrantedAccessToTheApplication();
    }

/*    @Given("^the Broker submits a Treaty Statement for Agreement and Central Processing$")
    public void theBrokerSubmitsATreatyStatementForAgreementAndCentralProcessing(DataTable datatable) {
        actionwords.theBrokerSubmitsATreatyStatementForAgreementAndCentralProcessing(datatable);
    }*/

    @Given("^the Treaty is placed with a single Bureau$")
    public void theTreatyIsPlacedWithASingleBureau() {
        actionwords.theTreatyIsPlacedWithASingleBureau();
    }

    @Given("^the Treaty is settled only in one currency$")
    public void theTreatyIsSettledOnlyInOneCurrency() {
        actionwords.theTreatyIsSettledOnlyInOneCurrency();
    }

    @Given("^the Treaty covers a single Risk Code$")
    public void theTreatyCoversASingleRiskCode() {
        actionwords.theTreatyCoversASingleRiskCode();
    }

    @Given("^the Account is for one underwriting year$")
    public void theAccountIsForOneUnderwritingYear() {
        actionwords.theAccountIsForOneUnderwritingYear();
    }

    @When("^Broker system generates an EBOT submission into DXC$")
    public void brokerSystemGeneratesAnEBOTSubmissionIntoDXC() {
        actionwords.brokerSystemGeneratesAnEBOTSubmissionIntoDXC();
    }

    @Given("^the Agreement Orchestration rules identify an Agreement Party$")
    public void theAgreementOrchestrationRulesIdentifyAnAgreementParty() {
        actionwords.theAgreementOrchestrationRulesIdentifyAnAgreementParty();
    }

    @When("^an Agreement Case is created in the PTA$")
    public void anAgreementCaseIsCreatedInThePTA() {
        actionwords.anAgreementCaseIsCreatedInThePTA();
    }

    @Given("^there is an FDO in place$")
    public void thereIsAnFDOInPlace() {
        actionwords.thereIsAnFDOInPlace();
    }

    @Given("^that a valid e-mail exists on file for the Carrier$")
    public void thatAValidEmailExistsOnFileForTheCarrier() {
        actionwords.thatAValidEmailExistsOnFileForTheCarrier();
    }

    @When("^the Carrier is identified as an Agreement party$")
    public void theCarrierIsIdentifiedAsAnAgreementParty() {
        actionwords.theCarrierIsIdentifiedAsAnAgreementParty();
    }

    @Then("^the Carrier must receive e-mail notification with details of the assigned case$")
    public void theCarrierMustReceiveEmailNotificationWithDetailsOfTheAssignedCase() {
        actionwords.theCarrierMustReceiveEmailNotificationWithDetailsOfTheAssignedCase();
    }

    @When("^the system takes me to the home page$")
    public void theSystemTakesMeToTheHomePage() {
        actionwords.theSystemTakesMeToTheHomePage();
    }

    @Then("^I want to see a list of all pending tasks assigned to me$")
    public void iWantToSeeAListOfAllPendingTasksAssignedToMe() {
        actionwords.iWantToSeeAListOfAllPendingTasksAssignedToMe();
    }

    @Then("^a Search facility$")
    public void aSearchFacility() {
        actionwords.aSearchFacility();
    }

    @Then("^a Dash board area$")
    public void aDashBoardArea() {
        actionwords.aDashBoardArea();
    }

    @Then("^actions choice$")
    public void actionsChoice() {
        actionwords.actionsChoice();
    }

    @Given("^that my organisation has statements awaiting for agreement$")
    public void thatMyOrganisationHasStatementsAwaitingForAgreement() {
        actionwords.thatMyOrganisationHasStatementsAwaitingForAgreement();
    }

    @When("^I access the home page of the PTA$")
    public void iAccessTheHomePageOfThePTA() {
        actionwords.iAccessTheHomePageOfThePTA();
    }

    @Then("^I want to be presented with a list of all pending cases$")
    public void iWantToBePresentedWithAListOfAllPendingCases() {
        actionwords.iWantToBePresentedWithAListOfAllPendingCases();
    }

    @Then("^a summary of each statement$")
    public void aSummaryOfEachStatement() {
        actionwords.aSummaryOfEachStatement();
    }

    @Given("^I am logged on the PTA$")
    public void iAmLoggedOnThePTA() {
        actionwords.iAmLoggedOnThePTA();
    }

    @Given("^I am at the home page$")
    public void iAmAtTheHomePage() {
        actionwords.iAmAtTheHomePage();
    }

    @Then("^the system should prioritise grouped submission where the whole group is ordered by the presentation date of the oldest member$")
    public void theSystemShouldPrioritiseGroupedSubmissionWhereTheWholeGroupIsOrderedByThePresentationDateOfTheOldestMember() {
        actionwords.theSystemShouldPrioritiseGroupedSubmissionWhereTheWholeGroupIsOrderedByThePresentationDateOfTheOldestMember();
    }

    @When("^i specify some search criteria$")
    public void iSpecifySomeSearchCriteria() {
        actionwords.iSpecifySomeSearchCriteria();
    }

    @When("^press a search button$")
    public void pressASearchButton() {
        actionwords.pressASearchButton();
    }

    @Then("^I want to see the list of pending cases that match my search criteria$")
    public void iWantToSeeTheListOfPendingCasesThatMatchMySearchCriteria() {
        actionwords.iWantToSeeTheListOfPendingCasesThatMatchMySearchCriteria();
    }

    @When("^I navigate to the dashboard area$")
    public void iNavigateToTheDashboardArea() {
        actionwords.iNavigateToTheDashboardArea();
    }

    @Then("^the system must present the latest statistics for submissions where my organisation has signed lines$")
    public void theSystemMustPresentTheLatestStatisticsForSubmissionsWhereMyOrganisationHasSignedLines() {
        actionwords.theSystemMustPresentTheLatestStatisticsForSubmissionsWhereMyOrganisationHasSignedLines();
    }

    @Given("^that I am in the dashboard area of the PTA$")
    public void thatIAmInTheDashboardAreaOfThePTA() {
        actionwords.thatIAmInTheDashboardAreaOfThePTA();
    }

    @Given("^there are existing statistics for open submissions$")
    public void thereAreExistingStatisticsForOpenSubmissions() {
        actionwords.thereAreExistingStatisticsForOpenSubmissions();
    }

    @When("^click on any count different from zero$")
    public void clickOnAnyCountDifferentFromZero() {
        actionwords.clickOnAnyCountDifferentFromZero();
    }

    @Then("^the system must take me to the home screen$")
    public void theSystemMustTakeMeToTheHomeScreen() {
        actionwords.theSystemMustTakeMeToTheHomeScreen();
    }

    @Then("^present a summarised list of statements matching the respective criteria$")
    public void presentASummarisedListOfStatementsMatchingTheRespectiveCriteria() {
        actionwords.presentASummarisedListOfStatementsMatchingTheRespectiveCriteria();
    }

    @Then("^any statement that is currently not assigned to me will be presented in read-only mode$")
    public void anyStatementThatIsCurrentlyNotAssignedToMeWillBePresentedInReadonlyMode() {
        actionwords.anyStatementThatIsCurrentlyNotAssignedToMeWillBePresentedInReadonlyMode();
    }

    @Then("^any statement that is currently assigned to me will be presented in edit mode$")
    public void anyStatementThatIsCurrentlyAssignedToMeWillBePresentedInEditMode() {
        actionwords.anyStatementThatIsCurrentlyAssignedToMeWillBePresentedInEditMode();
    }

    @Given("^that I am logged on the PTA application$")
    public void thatIAmLoggedOnThePTAApplication() {
        actionwords.thatIAmLoggedOnThePTAApplication();
    }

    @Given("^there are one or more pending statements assigned to my organisation$")
    public void thereAreOneOrMorePendingStatementsAssignedToMyOrganisation() {
        actionwords.thereAreOneOrMorePendingStatementsAssignedToMyOrganisation();
    }

    @Given("^I have selected one or more statements$")
    public void iHaveSelectedOneOrMoreStatements() {
        actionwords.iHaveSelectedOneOrMoreStatements();
    }

    @Given("^all selected statements are awaiting agreement$")
    public void allSelectedStatementsAreAwaitingAgreement() {
        actionwords.allSelectedStatementsAreAwaitingAgreement();
    }

    @Given("^the <<Agree>> button is active$")
    public void theAgreeButtonIsActive() {
        actionwords.theAgreeButtonIsActive();
    }

    @When("^I press the <<Agree>> button$")
    public void iPressTheAgreeButton() {
        actionwords.iPressTheAgreeButton();
    }

    @Then("^the system should process my agreement for all selected statements$")
    public void theSystemShouldProcessMyAgreementForAllSelectedStatements() {
        actionwords.theSystemShouldProcessMyAgreementForAllSelectedStatements();
    }

    @Then("^notify the broker$")
    public void notifyTheBroker() {
        actionwords.notifyTheBroker();
    }

    @Given("^I am the only agreement party or the last party to action the case$")
    public void iAmTheOnlyAgreementPartyOrTheLastPartyToActionTheCase() {
        actionwords.iAmTheOnlyAgreementPartyOrTheLastPartyToActionTheCase();
    }

    @Then("^send the statement for processing to DXC$")
    public void sendTheStatementForProcessingToDXC() {
        actionwords.sendTheStatementForProcessingToDXC();
    }

    @Given("^the <<Agree subject to>> button is active$")
    public void theAgreeSubjectToButtonIsActive() {
        actionwords.theAgreeSubjectToButtonIsActive();
    }

    @When("^I press the <<Agree subject to>> button$")
    public void iPressTheAgreeSubjectToButton() {
        actionwords.iPressTheAgreeSubjectToButton();
    }

    @Then("^the system should open up a pop-up screen to capture the subjectivity in a narrative$")
    public void theSystemShouldOpenUpAPopupScreenToCaptureTheSubjectivityInANarrative() {
        actionwords.theSystemShouldOpenUpAPopupScreenToCaptureTheSubjectivityInANarrative();
    }

    @Then("^I want the list order by presentation date with oldest item placed on top of the list$")
    public void iWantTheListOrderByPresentationDateWithOldestItemPlacedOnTopOfTheList() {
        actionwords.iWantTheListOrderByPresentationDateWithOldestItemPlacedOnTopOfTheList();
    }

    @Given("^the <<Query>> button is active$")
    public void theQueryButtonIsActive() {
        actionwords.theQueryButtonIsActive();
    }

    @When("^I press the <<Query>> button$")
    public void iPressTheQueryButton() {
        actionwords.iPressTheQueryButton();
    }

    @Then("^the system should open up a pop-up screen to capture the details of my query$")
    public void theSystemShouldOpenUpAPopupScreenToCaptureTheDetailsOfMyQuery() {
        actionwords.theSystemShouldOpenUpAPopupScreenToCaptureTheDetailsOfMyQuery();
    }

    @Given("^i have pressed the <Query> button$")
    public void iHavePressedTheQueryButton() {
        actionwords.iHavePressedTheQueryButton();
    }

    @When("^the system opens up the Query details screen$")
    public void theSystemOpensUpTheQueryDetailsScreen() {
        actionwords.theSystemOpensUpTheQueryDetailsScreen();
    }

    @When("^I am offered with a choice of predefined query categories presented in a drop-down$")
    public void iAmOfferedWithAChoiceOfPredefinedQueryCategoriesPresentedInADropdown() {
        actionwords.iAmOfferedWithAChoiceOfPredefinedQueryCategoriesPresentedInADropdown();
    }

    @When("^I can enter the details of my query in a narrative field$")
    public void iCanEnterTheDetailsOfMyQueryInANarrativeField() {
        actionwords.iCanEnterTheDetailsOfMyQueryInANarrativeField();
    }

    @When("^I can see an active button <Submit Query>$")
    public void iCanSeeAnActiveButtonSubmitQuery() {
        actionwords.iCanSeeAnActiveButtonSubmitQuery();
    }

    @When("^I can see an active button to cancel my entry$")
    public void iCanSeeAnActiveButtonToCancelMyEntry() {
        actionwords.iCanSeeAnActiveButtonToCancelMyEntry();
    }

    @When("^I can see an active button to upload a document and associate it with my query$")
    public void iCanSeeAnActiveButtonToUploadADocumentAndAssociateItWithMyQuery() {
        actionwords.iCanSeeAnActiveButtonToUploadADocumentAndAssociateItWithMyQuery();
    }

    @Given("^I am the Lead Agreement Party$")
    public void iAmTheLeadAgreementParty() {
        actionwords.iAmTheLeadAgreementParty();
    }

    @Given("^I have opened Query details screen$")
    public void iHaveOpenedQueryDetailsScreen() {
        actionwords.iHaveOpenedQueryDetailsScreen();
    }

    @Given("^I can see an active button <Add Document>$")
    public void iCanSeeAnActiveButtonAddDocument() {
        actionwords.iCanSeeAnActiveButtonAddDocument();
    }

    @When("^I press the <Add document> buton$")
    public void iPressTheAddDocumentButon() {
        actionwords.iPressTheAddDocumentButon();
    }

    @Then("^the system must open a pop-screen to enable document upload$")
    public void theSystemMustOpenAPopscreenToEnableDocumentUpload() {
        actionwords.theSystemMustOpenAPopscreenToEnableDocumentUpload();
    }

    @Then("^I must be able to browse for a document from my local machine$")
    public void iMustBeAbleToBrowseForADocumentFromMyLocalMachine() {
        actionwords.iMustBeAbleToBrowseForADocumentFromMyLocalMachine();
    }

    @Then("^select the document to be upload$")
    public void selectTheDocumentToBeUpload() {
        actionwords.selectTheDocumentToBeUpload();
    }

    @Then("^see the name of the uploaded document$")
    public void seeTheNameOfTheUploadedDocument() {
        actionwords.seeTheNameOfTheUploadedDocument();
    }

    @Then("^see name and the type of the file in read-only field$")
    public void seeNameAndTheTypeOfTheFileInReadonlyField() {
        actionwords.seeNameAndTheTypeOfTheFileInReadonlyField();
    }

    @Then("^add free text description of$")
    public void addFreeTextDescriptionOf() {
        actionwords.addFreeTextDescriptionOf();
    }

    @Then("^see an active button <<Upload>>$")
    public void seeAnActiveButtonUpload() {
        actionwords.seeAnActiveButtonUpload();
    }

    @Then("^see and active button <<Cancell>>$")
    public void seeAndActiveButtonCancell() {
        actionwords.seeAndActiveButtonCancell();
    }

    @Given("^I have entered query details in the designated area of the application$")
    public void iHaveEnteredQueryDetailsInTheDesignatedAreaOfTheApplication() {
        actionwords.iHaveEnteredQueryDetailsInTheDesignatedAreaOfTheApplication();
    }

    @Given("^I have successfully uploaded one or more documents$")
    public void iHaveSuccessfullyUploadedOneOrMoreDocuments() {
        actionwords.iHaveSuccessfullyUploadedOneOrMoreDocuments();
    }

    @Given("^the <Submit Query> button is active$")
    public void theSubmitQueryButtonIsActive() {
        actionwords.theSubmitQueryButtonIsActive();
    }

    @When("^I press the <Submit Query> button$")
    public void iPressTheSubmitQueryButton() {
        actionwords.iPressTheSubmitQueryButton();
    }

    @When("^store any attached document on the IMR$")
    public void storeAnyAttachedDocumentOnTheIMR() {
        actionwords.storeAnyAttachedDocumentOnTheIMR();
    }

    @When("^change the status of the submission to \"(.*)\"$")
    public void changeTheStatusOfTheSubmissionToP1(String p1) {
        actionwords.changeTheStatusOfTheSubmissionToP1(p1);
    }

    @When("^register the query in PbS Query Portal$")
    public void registerTheQueryInPbSQueryPortal() {
        actionwords.registerTheQueryInPbSQueryPortal();
    }

    @When("^trigger an ACORD L4 Business Query message to the Broker$")
    public void triggerAnACORDL4BusinessQueryMessageToTheBroker() {
        actionwords.triggerAnACORDL4BusinessQueryMessageToTheBroker();
    }

    @When("^send an e-mail notification to the Broker inline with existing PbS Query Portal functionality$")
    public void sendAnEmailNotificationToTheBrokerInlineWithExistingPbSQueryPortalFunctionality() {
        actionwords.sendAnEmailNotificationToTheBrokerInlineWithExistingPbSQueryPortalFunctionality();
    }

    @Given("^the <<View Details>> button is active$")
    public void theViewDetailsButtonIsActive() {
        actionwords.theViewDetailsButtonIsActive();
    }

    @When("^I press the <<View Details>> button$")
    public void iPressTheViewDetailsButton() {
        actionwords.iPressTheViewDetailsButton();
    }

    @Then("^the system should navigate me to a new screen where I can see the details of all selected statements$")
    public void theSystemShouldNavigateMeToANewScreenWhereICanSeeTheDetailsOfAllSelectedStatements() {
        actionwords.theSystemShouldNavigateMeToANewScreenWhereICanSeeTheDetailsOfAllSelectedStatements();
    }

    @Given("^a Case for Agreement is assigned to my organisation$")
    public void aCaseForAgreementIsAssignedToMyOrganisation() {
        actionwords.aCaseForAgreementIsAssignedToMyOrganisation();
    }

    @Given("^I receive a notification I need to agree something$")
    public void iReceiveANotificationINeedToAgreeSomething() {
        actionwords.iReceiveANotificationINeedToAgreeSomething();
    }

    @Then("^I want to be able to login in the Application$")
    public void iWantToBeAbleToLoginInTheApplication() {
        actionwords.iWantToBeAbleToLoginInTheApplication();
    }

    @Given("^that I access the Home page of the PTA$")
    public void thatIAccessTheHomePageOfThePTA() {
        actionwords.thatIAccessTheHomePageOfThePTA();
    }

    @Then("^I want the table to include a column for the Treaty Number$")
    public void iWantTheTableToIncludeAColumnForTheTreatyNumber() {
        actionwords.iWantTheTableToIncludeAColumnForTheTreatyNumber();
    }

    @Then("^I want to see a list of all pending tasks assigned to me presented in a table$")
    public void iWantToSeeAListOfAllPendingTasksAssignedToMePresentedInATable() {
        actionwords.iWantToSeeAListOfAllPendingTasksAssignedToMePresentedInATable();
    }

    @When("^I see the list of pending cases on the home page$")
    public void iSeeTheListOfPendingCasesOnTheHomePage() {
        actionwords.iSeeTheListOfPendingCasesOnTheHomePage();
    }

    @Then("^I want the system to display the financial element to the Order of my organisation by default$")
    public void iWantTheSystemToDisplayTheFinancialElementToTheOrderOfMyOrganisationByDefault() {
        actionwords.iWantTheSystemToDisplayTheFinancialElementToTheOrderOfMyOrganisationByDefault();
    }

    @Then("^to allow me to change the presentation to display the financial elements to the Bureua order$")
    public void toAllowMeToChangeThePresentationToDisplayTheFinancialElementsToTheBureuaOrder() {
        actionwords.toAllowMeToChangeThePresentationToDisplayTheFinancialElementsToTheBureuaOrder();
    }

    @Then("^to allow me to change the presentation to the display the financial elements for 100% Treaty Share$")
    public void toAllowMeToChangeThePresentationToTheDisplayTheFinancialElementsFor100TreatyShare() {
        actionwords.toAllowMeToChangeThePresentationToTheDisplayTheFinancialElementsFor100TreatyShare();
    }

    @Then("^update the values based on my selection$")
    public void updateTheValuesBasedOnMySelection() {
        actionwords.updateTheValuesBasedOnMySelection();
    }

    @Then("^I want the table to include a column for the Underwirting Year$")
    public void iWantTheTableToIncludeAColumnForTheUnderwirtingYear() {
        actionwords.iWantTheTableToIncludeAColumnForTheUnderwirtingYear();
    }

    @Then("^I want the table to include a column for the UMR$")
    public void iWantTheTableToIncludeAColumnForTheUMR() {
        actionwords.iWantTheTableToIncludeAColumnForTheUMR();
    }

    @Then("^I want the table to include a column for the Reinsured Name$")
    public void iWantTheTableToIncludeAColumnForTheReinsuredName() {
        actionwords.iWantTheTableToIncludeAColumnForTheReinsuredName();
    }

    @Then("^I want the table to include a column for the Contract Section Reference$")
    public void iWantTheTableToIncludeAColumnForTheContractSectionReference() {
        actionwords.iWantTheTableToIncludeAColumnForTheContractSectionReference();
    }

    @Then("^I want the table to include a column for the original \\(reference\\) currency$")
    public void iWantTheTableToIncludeAColumnForTheOriginalReferenceCurrency() {
        actionwords.iWantTheTableToIncludeAColumnForTheOriginalReferenceCurrency();
    }

    @Then("^I want the table to include a column for the Net Premium Balance$")
    public void iWantTheTableToIncludeAColumnForTheNetPremiumBalance() {
        actionwords.iWantTheTableToIncludeAColumnForTheNetPremiumBalance();
    }

    @Then("^I want the table to include a column for the Net Claim Balance$")
    public void iWantTheTableToIncludeAColumnForTheNetClaimBalance() {
        actionwords.iWantTheTableToIncludeAColumnForTheNetClaimBalance();
    }

    @Then("^I want the table to include a column for the Statement Balance$")
    public void iWantTheTableToIncludeAColumnForTheStatementBalance() {
        actionwords.iWantTheTableToIncludeAColumnForTheStatementBalance();
    }

    @Then("^I want the table to include a column for the Outstanding Loss amount$")
    public void iWantTheTableToIncludeAColumnForTheOutstandingLossAmount() {
        actionwords.iWantTheTableToIncludeAColumnForTheOutstandingLossAmount();
    }

    @Then("^I want the table to include a column for the Presentation date$")
    public void iWantTheTableToIncludeAColumnForThePresentationDate() {
        actionwords.iWantTheTableToIncludeAColumnForThePresentationDate();
    }

    @Then("^I want the table to include a column for the number of days until the statement is auto-agreed$")
    public void iWantTheTableToIncludeAColumnForTheNumberOfDaysUntilTheStatementIsAutoagreed() {
        actionwords.iWantTheTableToIncludeAColumnForTheNumberOfDaysUntilTheStatementIsAutoagreed();
    }

    @Then("^I want the system to display the financial element in original currency by default$")
    public void iWantTheSystemToDisplayTheFinancialElementInOriginalCurrencyByDefault() {
        actionwords.iWantTheSystemToDisplayTheFinancialElementInOriginalCurrencyByDefault();
    }

    @Then("^to allow me to change the presentation to display the financial elements in settlement currency$")
    public void toAllowMeToChangeThePresentationToDisplayTheFinancialElementsInSettlementCurrency() {
        actionwords.toAllowMeToChangeThePresentationToDisplayTheFinancialElementsInSettlementCurrency();
    }

    @Then("^to allow me to change the presentation to the display the financial elements in a nominated currency  where I can manually specify the FX rate$")
    public void toAllowMeToChangeThePresentationToTheDisplayTheFinancialElementsInANominatedCurrencyWhereICanManuallySpecifyTheFXRate() {
        actionwords.toAllowMeToChangeThePresentationToTheDisplayTheFinancialElementsInANominatedCurrencyWhereICanManuallySpecifyTheFXRate();
    }

    @Then("^display a warning message \"(.*)\" if the user selection is different from the default value$")
    public void displayAWarningMessageP1IfTheUserSelectionIsDifferentFromTheDefaultValue(String p1) {
        actionwords.displayAWarningMessageP1IfTheUserSelectionIsDifferentFromTheDefaultValue(p1);
    }

    @Then("^the results will be sorted by presentation date$")
    public void theResultsWillBeSortedByPresentationDate() {
        actionwords.theResultsWillBeSortedByPresentationDate();
    }

    @Then("^I can then sort the list by any of the columns$")
    public void iCanThenSortTheListByAnyOfTheColumns() {
        actionwords.iCanThenSortTheListByAnyOfTheColumns();
    }

    @Then("^I want to be able to select one or more statements$")
    public void iWantToBeAbleToSelectOneOrMoreStatements() {
        actionwords.iWantToBeAbleToSelectOneOrMoreStatements();
    }

    @Then("^be able to deselect one or more preselcted statements$")
    public void beAbleToDeselectOneOrMorePreselctedStatements() {
        actionwords.beAbleToDeselectOneOrMorePreselctedStatements();
    }

    @Then("^be able to select all statements in the list with one action$")
    public void beAbleToSelectAllStatementsInTheListWithOneAction() {
        actionwords.beAbleToSelectAllStatementsInTheListWithOneAction();
    }

    @Then("^be able to deselect all previously selected statements with one action$")
    public void beAbleToDeselectAllPreviouslySelectedStatementsWithOneAction() {
        actionwords.beAbleToDeselectAllPreviouslySelectedStatementsWithOneAction();
    }

    @Given("^I am presented with the login form$")
    public void iAmPresentedWithTheLoginForm() {
        actionwords.iAmPresentedWithTheLoginForm();
    }

    @Then("^I am allowed to access the PTA$")
    public void iAmAllowedToAccessThePTA() {
        actionwords.iAmAllowedToAccessThePTA();
    }

    @Given("^I enter an invalid username$")
    public void iEnterAnInvalidUsername() {
        actionwords.iEnterAnInvalidUsername();
    }

    @Given("^I enter an invalid password$")
    public void iEnterAnInvalidPassword() {
        actionwords.iEnterAnInvalidPassword();
    }

    @Then("^a message is displayed to inform me my credentials are not valid$")
    public void aMessageIsDisplayedToInformMeMyCredentialsAreNotValid() {
        actionwords.aMessageIsDisplayedToInformMeMyCredentialsAreNotValid();
    }

    @Then("^I not allowed to access the PTA$")
    public void iNotAllowedToAccessThePTA() {
        actionwords.iNotAllowedToAccessThePTA();
    }

    @Given("^I enter a valid username$")
    public void iEnterAValidUsername() {
        actionwords.iEnterAValidUsername();
    }

    @Given("^I enter a valid password$")
    public void iEnterAValidPassword() {
        actionwords.iEnterAValidPassword();
    }

    @Given("^I leave the username empty$")
    public void iLeaveTheUsernameEmpty() {
        actionwords.iLeaveTheUsernameEmpty();
    }

    @Given("^I leave the password empty$")
    public void iLeaveThePasswordEmpty() {
        actionwords.iLeaveThePasswordEmpty();
    }

    @Then("^I am not allowed to access the PTA$")
    public void iAmNotAllowedToAccessThePTA() {
        actionwords.iAmNotAllowedToAccessThePTA();
    }

/*    @Given("^I enter a valid username$")
    public void iEnterAValidUsername1() {
        actionwords.iEnterAValidUsername();
    }*/

    @When("^I submit the login form$")
    public void iSubmitTheLoginForm() {
        actionwords.iSubmitTheLoginForm();
    }

    @Given("^I make a forgotten password request$")
    public void iMakeAForgottenPasswordRequest() {
        actionwords.iMakeAForgottenPasswordRequest();
    }

    @When("^I enter the email address associated with my account$")
    public void iEnterTheEmailAddressAssociatedWithMyAccount() {
        actionwords.iEnterTheEmailAddressAssociatedWithMyAccount();
    }

    @When("^submit the forgotten password form$")
    public void submitTheForgottenPasswordForm() {
        actionwords.submitTheForgottenPasswordForm();
    }

    @Then("^an email will be sent to my email address with instructions on next steps to retrieve my password$")
    public void anEmailWillBeSentToMyEmailAddressWithInstructionsOnNextStepsToRetrieveMyPassword() {
        actionwords.anEmailWillBeSentToMyEmailAddressWithInstructionsOnNextStepsToRetrieveMyPassword();
    }

    @When("^I enter an email that is not associated with my account$")
    public void iEnterAnEmailThatIsNotAssociatedWithMyAccount() {
        actionwords.iEnterAnEmailThatIsNotAssociatedWithMyAccount();
    }

    @Then("^no email is received at the email address associated with the account$")
    public void noEmailIsReceivedAtTheEmailAddressAssociatedWithTheAccount() {
        actionwords.noEmailIsReceivedAtTheEmailAddressAssociatedWithTheAccount();
    }

    @Given("^I am on the statements pending agreement page$")
    public void iAmOnTheStatementsPendingAgreementPage() {
			actionwords.iAmOnTheStatementsPendingAgreementPage();
    }

    @Given("^there are statements pending agreement assigned to my organisation$")
    public void thereAreStatementsPendingAgreementAssignedToMyOrganisation() {
        actionwords.thereAreStatementsPendingAgreementAssignedToMyOrganisation();
    }

    @Then("^a summary of each statement pending agreement are displayed in a list$")
    public void aSummaryOfEachStatementPendingAgreementAreDisplayedInAList() {
        actionwords.aSummaryOfEachStatementPendingAgreementAreDisplayedInAList();
    }

    @Then("^the summarised statements contain the correct data elements$")
    public void theSummarisedStatementsContainTheCorrectDataElements() {
        actionwords.theSummarisedStatementsContainTheCorrectDataElements();
    }

    @Then("^I can see a statement search section$")
    public void iCanSeeAStatementSearchSection() {
        actionwords.iCanSeeAStatementSearchSection();
    }

    @Then("^I can see a list of statements pending agreement$")
    public void iCanSeeAListOfStatementsPendingAgreement() {
        actionwords.iCanSeeAListOfStatementsPendingAgreement();
    }

    @Then("^I can see a link to the dashboard page$")
    public void iCanSeeALinkToTheDashboardPage() {
        actionwords.iCanSeeALinkToTheDashboardPage();
    }

    @Given("^there are no statements pending agreement assigned to the organisation$")
    public void thereAreNoStatementsPendingAgreementAssignedToTheOrganisation() {
        actionwords.thereAreNoStatementsPendingAgreementAssignedToTheOrganisation();
    }

    @Then("^the list of statements pending agreement is empty$")
    public void theListOfStatementsPendingAgreementIsEmpty() {
        actionwords.theListOfStatementsPendingAgreementIsEmpty();
    }

    @Given("^there are statements pending agreement assigned to other organisations$")
    public void thereAreStatementsPendingAgreementAssignedToOtherOrganisations() {
        actionwords.thereAreStatementsPendingAgreementAssignedToOtherOrganisations();
    }

    @Then("^the list contains only the statements pending agreement assigned to my organisation$")
    public void theListContainsOnlyTheStatementsPendingAgreementAssignedToMyOrganisation() {
        actionwords.theListContainsOnlyTheStatementsPendingAgreementAssignedToMyOrganisation();
    }

    @Given("^there are statements that are not pending agreement assigned to my organisation$")
    public void thereAreStatementsThatAreNotPendingAgreementAssignedToMyOrganisation() {
        actionwords.thereAreStatementsThatAreNotPendingAgreementAssignedToMyOrganisation();
    }

    @Given("^there statements of different types assigned to my organisation$")
    public void thereStatementsOfDifferentTypesAssignedToMyOrganisation() {
        actionwords.thereStatementsOfDifferentTypesAssignedToMyOrganisation();
    }

    @Given("^there are statements of different types assigned to other organisations$")
    public void thereAreStatementsOfDifferentTypesAssignedToOtherOrganisations() {
        actionwords.thereAreStatementsOfDifferentTypesAssignedToOtherOrganisations();
    }

    @When("^I select a single statement pending agreement$")
    public void iSelectASingleStatementPendingAgreement() {
        actionwords.iSelectASingleStatementPendingAgreement();
    }

    @When("^a statement action is applied$")
    public void aStatementActionIsApplied() {
        actionwords.aStatementActionIsApplied();
    }

    @Then("^the action is applied to the single selected statement$")
    public void theActionIsAppliedToTheSingleSelectedStatement() {
        actionwords.theActionIsAppliedToTheSingleSelectedStatement();
    }

    @When("^I select multiple statements$")
    public void iSelectMultipleStatements() {
        actionwords.iSelectMultipleStatements();
    }

    @Then("^the action is only applied to the selected statements$")
    public void theActionIsOnlyAppliedToTheSelectedStatements() {
        actionwords.theActionIsOnlyAppliedToTheSelectedStatements();
    }

    @When("^the option to select all the statements is used$")
    public void theOptionToSelectAllTheStatementsIsUsed() {
        actionwords.theOptionToSelectAllTheStatementsIsUsed();
    }

    @Given("^I have selected a single statement$")
    public void iHaveSelectedASingleStatement() {
        actionwords.iHaveSelectedASingleStatement();
    }

    @When("^I deselect the statement$")
    public void iDeselectTheStatement() {
        actionwords.iDeselectTheStatement();
    }

    @Then("^no action is applied to the statements$")
    public void noActionIsAppliedToTheStatements() {
        actionwords.noActionIsAppliedToTheStatements();
    }



    @When("^I deselect some of statements$")
    public void iDeselectSomeOfStatements() {
        actionwords.iDeselectSomeOfStatements();
    }

    @Then("^the oldest case will be at the top of the list$")
    public void theOldestCaseWillBeAtTheTopOfTheList() {
        actionwords.theOldestCaseWillBeAtTheTopOfTheList();
    }

    @When("^I choose to sort the list by UMR$")
    public void iChooseToSortTheListByUMR() {
        actionwords.iChooseToSortTheListByUMR();
    }

    @Then("^the list of statements is displayed in UMR order$")
    public void theListOfStatementsIsDisplayedInUMROrder() {
        actionwords.theListOfStatementsIsDisplayedInUMROrder();
    }

    @When("^I choose to sort the list by Treaty Number$")
    public void iChooseToSortTheListByTreatyNumber() {
        actionwords.iChooseToSortTheListByTreatyNumber();
    }

    @Then("^the list of statements is displayed in Treaty Number order$")
    public void theListOfStatementsIsDisplayedInTreatyNumberOrder() {
        actionwords.theListOfStatementsIsDisplayedInTreatyNumberOrder();
    }

    @Then("^a list of available actions$")
    public void aListOfAvailableActions() {
        actionwords.aListOfAvailableActions();
    }

    @Given("^the number of statements is over 100$")
    public void theNumberOfStatementsIsOver100() {
        actionwords.theNumberOfStatementsIsOver100();
    }

    @Then("^the list of statements pending agreement contains all statements$")
    public void theListOfStatementsPendingAgreementContainsAllStatements() {
        actionwords.theListOfStatementsPendingAgreementContainsAllStatements();
    }

    @Then("^the statements pending agreement page renders correctly$")
    public void theStatementsPendingAgreementPageRendersCorrectly() {
        actionwords.theStatementsPendingAgreementPageRendersCorrectly();
    }

    @Then("^an action to agree statements is available$")
    public void anActionToAgreeStatementsIsAvailable() {
        actionwords.anActionToAgreeStatementsIsAvailable();
    }

    @Then("^an action to query statments is available$")
    public void anActionToQueryStatmentsIsAvailable() {
        actionwords.anActionToQueryStatmentsIsAvailable();
    }

    @Then("^an action to hold auto-agreement of statements$")
    public void anActionToHoldAutoagreementOfStatements() {
        actionwords.anActionToHoldAutoagreementOfStatements();
    }

    @Then("^an action to agree statements subject to copy$")
    public void anActionToAgreeStatementsSubjectToCopy() {
        actionwords.anActionToAgreeStatementsSubjectToCopy();
    }

    @Then("^a currency toggle will be available to allow the currency option to be changed$")
    public void aCurrencyToggleWillBeAvailableToAllowTheCurrencyOptionToBeChanged() {
        actionwords.aCurrencyToggleWillBeAvailableToAllowTheCurrencyOptionToBeChanged();
    }

    @Then("^the currency toggle will be disabled$")
    public void theCurrencyToggleWillBeDisabled() {
        actionwords.theCurrencyToggleWillBeDisabled();
    }

    @Then("^a shares toggle will be available to change the share options$")
    public void aSharesToggleWillBeAvailableToChangeTheShareOptions() {
        actionwords.aSharesToggleWillBeAvailableToChangeTheShareOptions();
    }

    @Then("^the shares toggle will be disabled$")
    public void theSharesToggleWillBeDisabled() {
        actionwords.theSharesToggleWillBeDisabled();
    }

    @Then("^related statements are grouped by broker group reference$")
    public void relatedStatementsAreGroupedByBrokerGroupReference() {
        actionwords.relatedStatementsAreGroupedByBrokerGroupReference();
    }

    @Then("^the list of statements are sorted by presentation date oldest first$")
    public void theListOfStatementsAreSortedByPresentationDateOldestFirst() {
        actionwords.theListOfStatementsAreSortedByPresentationDateOldestFirst();
    }

    @Then("^the related statements within the broker group reference group are sorted by presentation date oldest first$")
    public void theRelatedStatementsWithinTheBrokerGroupReferenceGroupAreSortedByPresentationDateOldestFirst() {
        actionwords.theRelatedStatementsWithinTheBrokerGroupReferenceGroupAreSortedByPresentationDateOldestFirst();
    }

    @Then("^an action to view details is available$")
    public void anActionToViewDetailsIsAvailable() {
        actionwords.anActionToViewDetailsIsAvailable();
    }

    @Then("^an action to  view details is available$")
    public void an_action_to_view_details_is_available() {
    	 actionwords.anActionToViewDetailsIsAvailable();
    }
    
/*    @Given("^I leave the username empty$")
    public void iLeaveTheUsernameEmpty() {
        actionwords.iLeaveTheUsernameEmpty();
    }*/

    @Given("^I enter the valid password$")
    public void iEnterTheValidPassword() {
        actionwords.iEnterAValidPassword();
    }

    @Then("^can be sorted in both ascending and descending order$")
    public void canBeSortedInBothAscendingAndDescendingOrder() {
        actionwords.canBeSortedInBothAscendingAndDescendingOrder();
    }
    
    @Given("^I am on the statements landing page$")
    public void i_am_on_the_statements_landing_page()  {
    	actionwords.i_am_on_the_statements_landing_page();
    }

    @Given("^I enter an existing Umr into the filter$")
    public void i_enter_an_existing_Umr_into_the_filter() {
    	actionwords.i_enter_an_existing_Umr_into_the_filter();
    }

    @When("^I apply the filter$")
    public void i_apply_the_filter()  {    
        actionwords.i_apply_the_filter();
    }

    @Then("^only statements with that Umr are displayed in the list$")
    public void only_statements_with_that_Umr_are_displayed_in_the_list()  {
    	actionwords.only_statements_with_that_Umr_are_displayed_in_the_list();
    }

    @Given("^I enter an existing Treaty Number into the filter$")
    public void i_enter_an_existing_Treaty_Number_into_the_filter()  { 
    	actionwords.i_enter_an_existing_Treaty_Number_into_the_filter();
    }

    @Then("^only statements with that Treaty Number are displayed in the list$")
    public void only_statements_with_that_Treaty_Number_are_displayed_in_the_list()  {
    	actionwords.only_statements_with_that_Treaty_Number_are_displayed_in_the_list();
    }

    @Given("^I enter an existing Underwriting Year into the filter$")
    public void i_enter_an_existing_Underwriting_Year_into_the_filter()  {
    	actionwords.i_enter_an_existing_Underwriting_Year_into_the_filter();
    }

    @Then("^only statements with that Underwriting Year are displayed in the list$")
    public void only_statements_with_that_Underwriting_Year_are_displayed_in_the_list()  {
    	actionwords.only_statements_with_that_Underwriting_Year_are_displayed_in_the_list();
        
    }

    @Given("^I choose to filter by pending statements$")
    public void i_choose_to_filter_by_pending_statements()  {
    	actionwords.i_choose_to_filter_by_pending_statements();
        
    }

    @Then("^the list only contains statements in the pending state$")
    public void the_list_only_contains_statements_in_the_pending_state()  {
    	actionwords.the_list_only_contains_statements_in_the_pending_state();
        
    }

    @Given("^I choose to filter by queried statements$")
    public void i_choose_to_filter_by_queried_statements()  {
    	actionwords.i_choose_to_filter_by_queried_statements();
        
    }

    @Then("^the list only contains statements in a queried state$")
    public void the_list_only_contains_statements_in_a_queried_state()  {
    	actionwords.the_list_only_contains_statements_in_a_queried_state();
        
    }

    @Given("^I choose to filter by agreed statements$")
    public void i_choose_to_filter_by_agreed_statements()  {
    	actionwords.i_choose_to_filter_by_agreed_statements();
        
    }

    @Then("^the list only contains statements in the agreed state$")
    public void the_list_only_contains_statements_in_the_agreed_state()  {
    	actionwords.the_list_only_contains_statements_in_the_agreed_state();
        
    }

    @Given("^I choose to filter by referred statements$")
    public void i_choose_to_filter_by_referred_statements()  {
    	actionwords.i_choose_to_filter_by_referred_statements();
        
    }

    @Then("^the list only contains statements in the referred state$")
    public void the_list_only_contains_statements_in_the_referred_state()  {
    	actionwords.the_list_only_contains_statements_in_the_referred_state();
        
    }

    @Given("^I select a submission date filter$")
    public void i_select_a_submission_date_filter()  {    
    	actionwords.i_select_a_submission_date_filter();
    }

    @Then("^the list only contains statements with the selected submission date$")
    public void the_list_only_contains_statements_with_the_selected_submission_date()  {
    	actionwords.the_list_only_contains_statements_with_the_selected_submission_date();      
    }

    @Given("^I enter a non-existent UMR into the UMR filter$")
    public void i_enter_a_non_existent_UMR_into_the_UMR_filter()  {
    	actionwords.i_enter_a_non_existent_UMR_into_the_UMR_filter();      
    }

    @Then("^the list will contain no statements$")
    public void the_list_will_contain_no_statements()  {
    	actionwords.the_list_will_contain_no_statements();      
    }

    @Then("^only statements with that Filtered values are displayed in the list$")
    public void only_statements_with_that_Filtered_values_are_displayed_in_the_list() {
    	actionwords.only_statements_with_that_Filtered_values_are_displayed_in_the_list();       
    }
    
    @Given("^statements exist in the system$")
    public void statements_exist_in_the_system(){
    	actionwords.statements_exist_in_the_system();
    }

    @When("^I select a single statement$")
    public void i_select_a_single_statement(){
    	actionwords.i_select_a_single_statement();
    }

    @Given("^I have selected all statements$")
    public void i_have_selected_all_statements(){
    	actionwords.i_have_selected_all_statements();
    }

    @When("^I deselect all statements$")
    public void i_deselect_all_statements(){
    	actionwords.i_deselect_all_statements();
    }

    @Then("^no statements are selected$")
    public void no_statements_are_selected(){
    	actionwords.no_statements_are_selected();
    }
    
    @Then("^a summary of each statement is displayed in a list$")
    public void a_summary_of_each_statement_is_displayed_in_a_list() {
    	actionwords.a_summary_of_each_statement_is_displayed_in_a_list();
    }

    @Given("^there are no statements in the system$")
    public void there_are_no_statements_in_the_system() {
    	actionwords.there_are_no_statements_in_the_system();
    }

    @Then("^the list of statements is empty$")
    public void the_list_of_statements_is_empty() {
    	actionwords.the_list_of_statements_is_empty();
    }
}