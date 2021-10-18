package temp.product.cscart.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import temp.product.cscart.po.PO_autoSignIn;
import temp.product.cscart.po.PO_search;
import temp.product.cscart.util.BrowserManager;

public class GenericClass {


	@Test(priority = 1)

	@Parameters({"browser", "url"}) 
	public void tc01_cart_search(String browser,String url)  { 
		WebDriver driver = BrowserManager.getDriver(browser, url);
		PO_search obj = PageFactory.initElements(driver, PO_search.class);
		obj.searchFunctionality("automation practice"); 
		driver.close(); }


	@Test (priority = 2)
	@Parameters({"browser", "url"})
	public void tc02_autoSignIn( String browser, String url) {
		WebDriver driver = BrowserManager.getDriver(browser, url);
		PO_search obj1 = PageFactory.initElements(driver, PO_search.class);
		obj1.searchFunctionality("automation practice");
		PO_autoSignIn obj2 = PageFactory.initElements(driver, PO_autoSignIn.class);
		obj2.signInFunctionality();
		driver.close();
	}

}
