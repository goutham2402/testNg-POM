package temp.product.cscart.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

public class PO_search {

	WebDriver driver;

	public PO_search(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.XPATH,using = "//input[@title='Search']")
	private WebElement txtbox_search;

	@FindBy(how=How.XPATH, using ="//div[@jsname='VlcLAe']//input[@name='btnK']")
	private WebElement button_click;

	//Generic Methods
	public void setSearchBox(String input)
	{
		txtbox_search.sendKeys(input);
		Reporter.log("Search input entered", true);
	}

	public void clickSearch()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		button_click.click();

	}
	
	//Business Methods
	public void searchFunctionality(String input)
	{
		setSearchBox(input);
		clickSearch();
		String title = driver.getTitle();
		System.out.println("Title of the Searched Page is: "+ title);
		String expected = "automation practice - Google Search";
		Assert.assertEquals(title, expected, expected);
		Reporter.log("Able to search : " + input, true);

	}
}
