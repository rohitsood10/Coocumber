package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Paths;

public class CartPage {
	WebDriver driver;
	By cartpage_shiptohomebtn= By.xpath(Paths.cartpage_shiptohomebtn);
	By cartpage_checkoutbtn= By.xpath(Paths.cartpage_checkoutbtn);

	//@FindBy(xpath=Paths.cartpage_shiptohomebtn) private WebElement cartpage_shiptohomebtn;
	//@FindBy(xpath=Paths.cartpage_checkoutbtn) private WebElement cartpage_checkoutbtn;
 
	public CartPage(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	
	}
	
	public void selectshiptohome()  {
	//driver.findElement(cartpage_shiptohomebtn)				
		driver.findElement(cartpage_shiptohomebtn).click();
		System.out.println("Entered ship radio function");
		//String xpathExpression = "/";
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		System.out.println("number of elements = "+ elements.size());
		for(WebElement element : elements) {
			//System.out.println("Entered loop");
		    if(element.getAttribute("type").equals("radio")) {
		    	if(element.getAttribute("value").equals("Ship"))
			    	{
			    		//element.click();
			    		System.out.println("Success: found Pickup");
			    		driver.findElement(cartpage_shiptohomebtn).click();
			    		break;
			    	}
		    }
		}
		
		
		
	}
	
	public void clickcheckoutbtn() throws InterruptedException {
		try {
			driver.findElement(cartpage_checkoutbtn).click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			Thread.sleep(5000);
			driver.findElement(cartpage_checkoutbtn).click();		}
		
	}

}
