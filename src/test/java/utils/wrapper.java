package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class wrapper {
	
	public static boolean isAlertPresent(WebDriver driver){
		 try{
		  System.out.println("inside method alert if block");
		  driver.switchTo().alert();
		  return true;
		 }catch(NoAlertPresentException ex){
			 System.out.println("inside method alert catch block");
		  return false;
		 }
		}
	
	
	public static void click(WebDriver driver, By by) throws InterruptedException {
		System.out.println("Entered Wrapper class");
		//Thread.sleep(500);
		
		/*if(isAlertPresent(driver)){
			System.out.println("inside alert if block");
			  Alert alert = driver.switchTo().alert();
			  System.out.println(alert.getText());
			  System.out.println("Found a alert");
			  alert.accept();
			 }
		
		 try {
			 
		     // (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(homepage_searchbutton));
		      driver.findElement(by).click();
		      System.out.println("Clicked Element in try");
		 	}
		    catch (StaleElementReferenceException sere) {
		        // simply retry finding the element in the refreshed DOM
		    	driver.findElement(by).click();
		    	System.out.println("Clicked Element in catch");
		    }*/
		driver.findElement(by).click();
	}

}
