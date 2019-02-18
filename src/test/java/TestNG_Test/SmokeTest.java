package TestNG_Test;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import listeners.RetryAnalyzer;
import listeners.RetryCountIfFailed;
import managers.PageObjectManager;
import com.aventstack.extentreports.Status;

@Listeners(listeners.Listener.class)

public class SmokeTest extends BaseTest{
	

/*	@Test(retryAnalyzer = RetryAnalyzer.class)
	@RetryCountIfFailed(2)
	public void tc04() throws InterruptedException {
		
		System.out.println("Test Started");
		System.out.println(System.getProperty("user.dir"));
		//Assert.assertEquals("HardAssert", "HardAssertion");
		System.out.println("Test Finished");
		
	}*/
	
	@Test(priority = 1,enabled = true,retryAnalyzer = RetryAnalyzer.class,groups = { "functest" })
	@RetryCountIfFailed(2)
	public void SmokeTest1() throws InterruptedException {
		//logger=extent.createTest("TC01");
		pageObjectManager = new PageObjectManager(driver);
		homepage = pageObjectManager.getHomePage();
		homepage.setsearchfieldtxt("8925497");
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
        Assert.assertEquals("HardAssert", "HardAssert");
		System.out.println("finished test1");
		logger.pass("Test case Passed");		
	}
	
	@Test (enabled = true,priority = -2,groups = { "functest" })
	public void Smoketest2() throws InterruptedException {
		System.out.println("entered test2");
		pageObjectManager = new PageObjectManager(driver);
		homepage = pageObjectManager.getHomePage();
		homepage.setsearchfieldtxt("8925497");
		homepage.clickSearchbtn();
		System.out.println(4/0);
		searchpage = pageObjectManager.getSearchResultPage();
		searchpage.clickproduct();
		System.out.println("finished test2");
	}
	
	@Test(enabled = true,groups = { "functest" })
	public void Smoketest3() throws InterruptedException {
		pageObjectManager = new PageObjectManager(driver);
		homepage = pageObjectManager.getHomePage();
		homepage.setsearchfieldtxt("8925497");
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
        Assert.assertEquals("HardAssert", "HardAssert");
		System.out.println("finished test1");
		logger.pass("Test case Passed");
	}

}
