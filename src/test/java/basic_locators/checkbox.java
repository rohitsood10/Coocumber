package basic_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import enums.fruits;
import managers.WebDriverManager;

public class checkbox {
	
	public static void selectradiobutton(List<WebElement> radiobutton, String name) {
		
		for(WebElement aa:radiobutton) {
			
			
			if (aa.getAttribute("value").equals(name)) {
				aa.click();
			}
			
			//System.out.println(aa.getAttribute("value"));
			
		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager webDriverManager;
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		System.out.println("setup function: opened url");
		
		List<WebElement> Radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(Radiobutton.size());
		String option="Option 3";
		selectradiobutton(Radiobutton,option);
		
		System.out.println("im done");
		driver.findElement(By.cssSelector("#vfb-6-0")).click();
		driver.findElement(By.cssSelector("#vfb-6-1")).click();
		driver.findElement(By.cssSelector("#vfb-6-2")).click();
		
		driver.findElement(By.cssSelector("#vfb-6-1")).click(); 
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select drpcountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		drpcountry.selectByVisibleText("GREECE");
		
		
		driver.get("http://output.jsbin.com/osebed/2");
		Select friuts = new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		System.out.println("is multiple select allowed "+friuts.isMultiple());
		
		friuts.selectByVisibleText(fruits.Apple.name());
		friuts.selectByVisibleText(fruits.Grape.name());
		friuts.deselectAll();
		friuts.selectByVisibleText(fruits.Orange.name());
		friuts.deselectAll();
		
		
		

	}

}
