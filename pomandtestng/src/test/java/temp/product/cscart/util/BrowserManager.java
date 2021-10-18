package temp.product.cscart.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserManager {
	public static WebDriver getDriver(String type, String url){
		WebDriver driver = null;
		if(type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/goutham/Downloads/Drivers/chromedriver");
			driver = new ChromeDriver();
		}
		else
		{
			Assert.assertTrue(false,"No Browser found");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
