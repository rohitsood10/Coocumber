package basic_locators;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import managers.WebDriverManager;

public class Tables {

	public static double getpricevalue(WebElement basetable) throws ParseException {
		
		List<WebElement> rows = basetable.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[*]"));
		System.out.println("total rows = "+rows.size());
		
		List<WebElement> col = basetable.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("total col = "+col.size());
		
		//To find third row of table
		WebElement tablerow = basetable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]"));
		String rowtext = tablerow.getText();
		System.out.println("Third row of table : "+rowtext);
		double maxprice=0;
		for (int i=1;i<=rows.size();i++) {
			String pvalue = basetable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[4]")).getText();
			NumberFormat f = NumberFormat.getIntegerInstance();
			Number num = f.parse(pvalue);
			pvalue = num.toString();
			double price = Double.parseDouble(pvalue);
			
			if(price>maxprice)
				maxprice=price;
			
			
		}
		
		return maxprice;
		
	}
	
	
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager webDriverManager;
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		System.out.println("setup function: opened url");
		
		
		
		WebElement basetable = driver.findElement(By.xpath("//table[@class='dataTable']"));
		double maxprice = getpricevalue(basetable);

		System.out.println("MAx share price in the table is == "+ maxprice);
		
	}

	

}
