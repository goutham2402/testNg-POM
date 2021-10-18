package temp.product.cscart.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_autoSignIn {
	
	WebDriver driver;
	
	public PO_autoSignIn(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//h3[normalize-space()='Automation Practice']")
	private WebElement search_link;
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Sign in']")
	WebElement click_signin;
	
	//generic methods
	
	public void searchLinkClick()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		search_link.click();
		
	}
	
	public void signInClick()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_signin.click();
		
	}
	
	//Business Methods to use in generic way
	
	public void signInFunctionality()
	{
		searchLinkClick();
		signInClick();
		System.out.println("sign in click passed");
	}


}
