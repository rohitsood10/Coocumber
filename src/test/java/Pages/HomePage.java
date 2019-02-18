package Pages;

import org.openqa.selenium.By;
import utils.wrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Paths;

public class HomePage {
	WebDriver driver;
	By homepage_searchfield= By.cssSelector(Paths.homepage_searchfield);
	By homepage_searchbutton= By.cssSelector(Paths.homepage_searchbutton);
	//FindBy(css=Paths.homepage_searchfield) private WebElement homepage_searchfield;
	//@FindBy(css=Paths.homepage_searchbutton) private WebElement homepage_searchbutton;
	
	//click wrapper
	
			
	//constructor for the class
	public HomePage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	//enter product id in search field
	public  void setsearchfieldtxt(String Productid) {
		driver.findElement(homepage_searchfield).sendKeys(Productid);
		//homepage_searchfield.sendKeys(Productid);
		
	}
	
	//enter product id in search field
		public  void clickSearchbtn() throws InterruptedException {
			//driver.findElement(homepage_searchbutton).click();
			//driver.findElement(homepage_searchbutton).click();
			//wrapper.click(driver.findElement(homepage_searchbutton));
			wrapper.click(driver, homepage_searchbutton);
			//homepage_searchbutton.click();
			
		}
		
	//enter product id in search field
		public  void SearchProduct(String ProductID) throws InterruptedException {
			setsearchfieldtxt(ProductID);
			clickSearchbtn();
					
		}
	
	

}
