package basic_locators;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import enums.DriverType;
import enums.EnvironmentType;
import managers.FileReaderManager;

public class my {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	private Properties properties;
	//	private final String propertyFilePath= "C:\\Users\\rohitsoo\\eclipse-workspace\\Cucumber\\src\\test\\java\\configs\\configuration.properties";

		//private WebDriver driver;
		DriverType driverType;
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		EnvironmentType environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
		System.out.println("driver type " + driverType);
		System.out.println("Env type " + environmentType);
		//String browserName = properties.getProperty("browser");
		
	}

}
