package TestNG_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.SearchResultPage;
import managers.PageObjectManager;
import managers.WebDriverManager;

@Listeners(listeners.Listener.class)
public class SanityTest extends BaseTest {
	
/*	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "7694250" },
//	   { "8925497"},
	 };
	} */

	
	
	@Parameters({ "product_id" })
	@Test(priority = 1,enabled = true,groups = { "functest" })
	public void Sanitytest1(String product_id) throws InterruptedException {
		//logger=extent.createTest("TC02");
		pageObjectManager = new PageObjectManager(driver);
		homepage = pageObjectManager.getHomePage();
		homepage.setsearchfieldtxt(product_id);
		logger.log(Status.INFO, "Product ID entered");
		homepage.clickSearchbtn();
		logger.log(Status.INFO, "search button clicked");
		searchpage = pageObjectManager.getSearchResultPage();
		logger.log(Status.INFO, "searched results");
		searchpage.clickproduct();
		logger.log(Status.INFO, "clicked product");
		productpage = pageObjectManager.getProductPage();
		Thread.sleep(5000);
		productpage.addtocartbtn();
		logger.log(Status.INFO, "clicked add to cart button");
		productpage.checkoutbtn();
		logger.log(Status.INFO, "click checkout button");
		//cartpage = pageObjectManager.getcartpage();
		Thread.sleep(5);
		//cartpage.selectshiptohome();
		//cartpage.clickcheckoutbtn();
        //Assert.assertEquals("HardAssert", "HardAssertion");
		System.out.println("finished test1");
		//logger.pass("Test case Passed");		
	}

	@Test(priority = 1,enabled = true,groups = { "functest" })
	public void Sanitytest3() throws InterruptedException {
		//logger=extent.createTest("TC03");
		pageObjectManager = new PageObjectManager(driver);
		homepage = pageObjectManager.getHomePage();
		homepage.setsearchfieldtxt("7694250");
		logger.log(Status.INFO, "Product ID entered");
		homepage.clickSearchbtn();
		logger.log(Status.INFO, "search button clicked");
		searchpage = pageObjectManager.getSearchResultPage();
		logger.log(Status.INFO, "searched results");
		searchpage.clickproduct();
		logger.log(Status.INFO, "clicked product");
		productpage = pageObjectManager.getProductPage();
		Thread.sleep(5000);
		productpage.addtocartbtn();
		logger.log(Status.INFO, "clicked add to cart button");
		productpage.checkoutbtn();
		logger.log(Status.INFO, "click checkout button");
		//cartpage = pageObjectManager.getcartpage();
		Thread.sleep(5);
		//cartpage.selectshiptohome();
		//cartpage.clickcheckoutbtn();
        //Assert.assertEquals("HardAssert", "HardAssertion");
		System.out.println("finished test1");
		//logger.pass("Test case Passed");		
	}
}
