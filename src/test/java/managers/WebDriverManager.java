package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



import enums.*;


public class WebDriverManager {

	private WebDriver driver;
	private static DriverType driverType;
	private static EnvironmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	 
	public WebDriverManager() {
		// TODO Auto-generated constructor stub
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
		System.out.println("driver type " + driverType);
		System.out.println("Env type " + environmentType);
	}

	
	public WebDriver getDriver() {
		 if(driver == null) driver = createDriver();
		 return driver;
		 }
	
	private WebDriver createDriver() {
	    switch (environmentType) {     
	         case LOCAL : driver = createLocalDriver();
	          break;
	         case REMOTE : driver = createRemoteDriver();
	          break;
	    }
	    return driver;
	 }
	
	 private WebDriver createRemoteDriver() {
		 throw new RuntimeException("RemoteWebDriver is not yet implemented");
		 }
		 
	
	 
	 	private WebDriver createLocalDriver() {
	 		
		        switch (driverType) {     
		       /* case FIREFOX : 
		        	driver = new FirefoxDriver();
		        break;
		        case HTML: 
			        //driver = new HtmlUnitDriver();
			        driver = new HtmlUnitDriver(BrowserVersion.CHROME);
			        //setJavascriptEnabled(true);
			     break;
		        
		        case CHROMEHEADLESS : 
		        System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
		         ChromeOptions options = new ChromeOptions();
			     options.addArguments("headless");
			     options.addArguments("window-size=1200x600");	
		         driver = new ChromeDriver(options);
		         break;*/
		         case CHROME : 
		        	 System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
		        	 driver = new ChromeDriver();
		        	 
    		        
			     break;
		        case INTERNETEXPLORER : driver = new InternetExplorerDriver();
		        break;
		        }
		 
		        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize())driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		 return driver;
		 } 
		 
		 public void closeDriver() {
		 driver.close();
		 driver.quit();
		 }
}
