package managers;

import org.openqa.selenium.WebDriver;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.SearchResultPage;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homepage;
	private ProductPage productpage;
	private SearchResultPage searchpage;
	private CartPage cartpage; 

	public PageObjectManager(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		
		return (homepage==null)? homepage = new HomePage(driver) : homepage;
			
	}
	
	public ProductPage getProductPage() {
		
		return (productpage==null)? productpage = new ProductPage(driver) : productpage;
			
	}
	
	public SearchResultPage getSearchResultPage() {
		
		return (searchpage==null)? searchpage = new SearchResultPage(driver) : searchpage;
			
	}

	public CartPage getcartpage() {
		
		return (cartpage==null)? cartpage = new CartPage(driver) : cartpage;
			
	}
}
