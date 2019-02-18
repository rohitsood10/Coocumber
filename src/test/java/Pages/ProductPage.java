package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Paths;
import utils.wrapper;

public class ProductPage {
	WebDriver driver;
	//@FindBy(xpath=Paths.productpage_qtyfield) private WebElement productpage_qtyfield;
	//@FindBy(xpath=Paths.productpage_addtocartbtn) private WebElement productpage_addtocartbtn;
	//@FindBy(xpath=Paths.productpage_viewcart_checkoutbtn) private WebElement productpage_viewcart_checkoutbtn;
	
	By productpage_qtyfield= By.xpath(Paths.productpage_qtyfield);
	By productpage_addtocartbtn= By.xpath(Paths.productpage_addtocartbtn);
	By productpage_viewcart_checkoutbtn= By.xpath(Paths.productpage_viewcart_checkoutbtn);

	public ProductPage(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	
	public void addtocartbtn() throws InterruptedException {
			//productpage_addtocartbtn.click();
			//driver.findElement(productpage_addtocartbtn).click();
			wrapper.click(driver, productpage_addtocartbtn);

	}
	
	public void checkoutbtn() throws InterruptedException {
		try {
			//driver.findElement(productpage_viewcart_checkoutbtn).click();
			wrapper.click(driver, productpage_viewcart_checkoutbtn);

			//productpage_viewcart_checkoutbtn.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			Thread.sleep(5000);
			//productpage_viewcart_checkoutbtn.click();
			//driver.findElement(productpage_viewcart_checkoutbtn).click();
			wrapper.click(driver, productpage_viewcart_checkoutbtn);


		}
		
		
	}
	
	

}
