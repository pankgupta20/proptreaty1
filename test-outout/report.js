$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium/Proportional Treaty/features/Proportional_Treaty/Features/Work_Basket_Page/Statements_summary/Statement_list.feature");
formatter.feature({
  "line": 2,
  "name": "Statement list",
  "description": "",
  "id": "statement-list",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sprint1"
    },
    {
      "line": 1,
      "name": "@JIRA-PTA-91"
    },
    {
      "line": 1,
      "name": "@sprint1"
    }
  ]
});
formatter.before({
  "duration": 7877539573,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# In order to manage my workload more effectively"
    },
    {
      "line": 4,
      "value": "# As a Carrier"
    },
    {
      "line": 5,
      "value": "# I want to see a list of summarised statements that are pending agreement"
    }
  ],
  "line": 8,
  "name": "Statements exist for carrier",
  "description": "",
  "id": "statement-list;statements-exist-for-carrier",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@JIRA-PTA-93"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the statements landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "statements exist in the system",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select a single statement",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "a summary of each statement is displayed in a list",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "the summarised statements contain the correct data elements",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_am_on_the_statements_landing_page()"
});
formatter.result({
  "duration": 5513279181,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.statements_exist_in_the_system()"
});
formatter.result({
  "duration": 98541361,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_select_a_single_statement()"
});
formatter.result({
  "duration": 567035402,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.a_summary_of_each_statement_is_displayed_in_a_list()"
});
formatter.result({
  "duration": 20471386768,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.theSummarisedStatementsContainTheCorrectDataElements()"
});
formatter.result({
  "duration": 24746644529,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027container body-content\u0027]/table/tbody[1]/tr[25]/td[4]\"}\n  (Session info: chrome\u003d65.0.3325.181)\n  (Driver info: chromedriver\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027INGUEUCLP000666\u0027, ip: \u002710.9.162.0\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7), userDataDir\u003dC:\\Users\\guptapa\\AppData\\Local\\Temp\\scoped_dir11336_31541}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d65.0.3325.181, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 04958c33066cf88152b2027854a1fc30\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027container body-content\u0027]/table/tbody[1]/tr[25]/td[4]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\r\n\tat step_definitions.Actionwords.theSummarisedStatementsContainTheCorrectDataElements(Actionwords.java:803)\r\n\tat step_definitions.StepDefinitions.theSummarisedStatementsContainTheCorrectDataElements(StepDefinitions.java:807)\r\n\tat ✽.And the summarised statements contain the correct data elements(C:/Selenium/Proportional Treaty/features/Proportional_Treaty/Features/Work_Basket_Page/Statements_summary/Statement_list.feature:13)\r\n",
  "status": "failed"
});
formatter.write("Scenario Completed :Statements exist for carrier");
formatter.after({
  "duration": 2269886008,
  "status": "passed"
});
});