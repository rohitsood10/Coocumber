package basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import managers.WebDriverManager;

public class tooltip {
	
	public static void main (String args[]) {
		
		WebDriver driver;
		WebDriverManager webDriverManager;
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		driver.get("http://demo.guru99.com/test/social-icon.html");
		String tooltip=driver.findElement(By.xpath("//a[@title='Github']//*[@class='icon']")).getAttribute("title");
		System.out.println("Tool tip value for GIT HUB" + tooltip);
	}

}
