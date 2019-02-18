package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Paths;
import utils.wrapper;

public class SearchResultPage {
	
	WebDriver driver;
	
	By searchresultpage_selectproduct= By.xpath(Paths.searchresultpage_selectproduct);
	
	//@FindBy(xpath=Paths.searchresultpage_selectproduct) private WebElement searchresultpage_selectproduct;

	public SearchResultPage(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	
	public void clickproduct() throws InterruptedException {
		//searchresultpage_selectproduct.click();
		//driver.findElement(searchresultpage_selectproduct).click();	
		wrapper.click(driver, searchresultpage_selectproduct);

	}

}
