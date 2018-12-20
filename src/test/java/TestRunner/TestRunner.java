package TestRunner;

import java.io.File;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import general_Methods.DateTimeHelper;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			//features = {"C://Selenium//Proportional Treaty//features//Proportional_Treaty//Features//"},
			features = {"C:/Selenium/Proportional Treaty/features/Proportional_Treaty/Features/Work_Basket_Page/Statements_summary/Statement_list.feature"}, //the path of the feature files
			/*features = {"C:/Selenium/Proportional Treaty/features/Proportional_Treaty/Features/Statements_Landing_Page/Action_Buttons/Statement_actions.feature",
						"C:/Selenium/Proportional Treaty/features/Proportional_Treaty/Features/Carrier_Login/Login_to_the_application.feature",
					"C:/Selenium/Proportional Treaty/features/Proportional_Treaty/Features/Statements_Landing_Page/Landing_page_layout.feature"},*/
			glue={"step_definitions"}, //the path of the step definition files
			format= {"pretty","html:test-outout", "json:test-outout/json_output/cucumber.json", "junit:test-outout/junit_xml/cucumber.xml",
					"com.cucumber.listener.ExtentCucumberFormatter:test-outout/ExtentReport/Extentreport.html"
			}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false, //to check the mapping is proper between feature file and step def file
			tags = {"@JIRA-PTA-93"}			
			)
	 
	public class TestRunner{
		private static final Logger logger = Logger.getLogger(TestRunner.class.getName());
		static DateTimeHelper datetimehelper;
		@BeforeClass
			public static void testRunStart(){
				datetimehelper = new DateTimeHelper();
				logger.info("****************Test Run Started at" + DateTimeHelper.getCurrentDateTime() + "*******************");
		}
		
		
		@AfterClass
		    public static void reportSetup() 
		 	{
		        Reporter.loadXMLConfig(new File("src/main/resource/extent-config.xml"));
		        @SuppressWarnings("unused")
				Properties p = System.getProperties();
		      //  p.list(System.out);
		        
		        Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
		        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		        Reporter.setSystemInfo("64 Bit", 	"Windows 7");
		 	}
	 
		@AfterClass
		public static void testRunCompleted(){
			logger.info("****************Test Run Completed at" + DateTimeHelper.getCurrentDateTime() + "*******************");
	}
		
}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	

