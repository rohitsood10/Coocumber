package basic_locators;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import managers.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager webDriverManager;
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		
		/* -- handle Alerts
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		System.out.println("setup function: opened url");
		
		 driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Rohit");
		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();		 
		 System.out.println("clicked on second alert"); */
		
		//handle pop up windows
		
		driver.get("http://demo.guru99.com/popup.php");
		System.out.println("setup function: opened url");
		driver.findElement(By.linkText("Click Here")).click();
		
		String MainWindow=driver.getWindowHandle();	
		
		Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                                 
			// Closing the Child Window.
                        driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);
		
	}

}
