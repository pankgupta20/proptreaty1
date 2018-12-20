package dataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;

public class ConfigFileReader {
	private Properties properties;
	private final String configFilePath = System.getProperty("user.dir") + "/src/main/resource/" + "config.properties";
	private final String loginFilePath = System.getProperty("user.dir") + "/src/main/resource/" + "login.properties";
	private File f1;
	private FileInputStream file;

	public ConfigFileReader(){
			f1 = new File(configFilePath);
			properties = new Properties();
			try {
				file = new FileInputStream(f1);
				properties.load(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}			
			

			f1 = new File(loginFilePath);
			try {
				file = new FileInputStream(f1);
					properties.load(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	public long getImplicitlyWait() {
		String implicitWait = properties.getProperty("ImplcitWait");
		if (implicitWait != null)
			return Long.parseLong(implicitWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}
	
	
	public long getPageLoadTimeOut() {
		String PageLoadTimeOut = properties.getProperty("PageLoadTimeOut");
		if (PageLoadTimeOut != null)
			return Long.parseLong(PageLoadTimeOut);
		else
			throw new RuntimeException("PageLoadTimeOut not specified in the Configuration.properties file.");
	}
	
	public long getExplicitWait() {
		String ExplicitWait = properties.getProperty("PageLoadTimeOut");
		if (ExplicitWait != null)
			return Long.parseLong(ExplicitWait);
		else
			throw new RuntimeException("ExplicitWait not specified in the Configuration.properties file.");
	}

/*	public String getBrowserName() {
		String BrowserName = properties.getProperty("Browser");
		if (BrowserName != null)
			return BrowserName;
		else
			throw new RuntimeException("BrowserName not specified in the Configuration.properties file.");
	}*/
	
	public DriverType getBrowser() {
		String browserName = properties.getProperty("Browser");
		if(browserName == null || browserName.equalsIgnoreCase("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equalsIgnoreCase("ie")) return DriverType.IE;
		else throw new RuntimeException("Browser Name Key value in config.properties is not matched : " + browserName);
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("treatyportalUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("treatyportalUrl not specified in the login.properties file.");
	}
	
	public String getLoginUname() {
		String loginuname = properties.getProperty("loginuname");
		if (loginuname != null)
			return loginuname;
		else
			throw new RuntimeException("loginuname not specified in the login.properties file.");
	}
	
	public String getLoginPwd() {
		String loginupwd = properties.getProperty("loginpwd");
		if (loginupwd != null)
			return loginupwd;
		else
			throw new RuntimeException("loginupwd not specified in the login.properties file.");
	}
	
	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if(windowSize != null) return Boolean.valueOf(windowSize);
		return true;
	}

}
