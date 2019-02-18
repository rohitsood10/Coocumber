package utils;


public class Paths {
	
	//Home_page
	
	//public static final String homepage_searchfield = "//input[@title='Search Box']";
	public static final String homepage_searchfield = "#searchbox > span > input";
	//public static final String homepage_searchbutton = "//*[@id=\"searchbox\"]/span/button";
	public static final String homepage_searchbutton = "#searchbox > span > button";
	
	
	//SearchResultPage
	public static final String searchresultpage_selectproduct = "//div[@class='mz-productlisting-image']//a";
	
	//ProductPage
	public static final String productpage_qtyfield = "//div[@class='mz-productlisting-image']//a";
	public static final String productpage_addtocartbtn = "//button[@id='add-to-cart']";
	public static final String productpage_viewcart_checkoutbtn = "//button[@class='checkout modal-button']";
	
	//CartPage
		public static final String cartpage_shiptohomebtn = "//tbody[@class='mz-table-cart-items']/tr[1]/td[3]/div[3]/input[1]";
		public static final String cartpage_checkoutbtn = "//div[@class='buttons']//button[contains(text(),'Checkout')]";
  
	
}
