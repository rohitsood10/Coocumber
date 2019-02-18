package basic_locators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import managers.WebDriverManager;

public class scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager webDriverManager;
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		System.out.println("setup function: opened url");
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        
	}

}
