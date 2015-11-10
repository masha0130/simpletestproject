package simpletestproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class BingMainTest {

	static BingPage bing;

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		bing =new BingPage(driver);
		bing.searchOnBing("selenium");
		
		
		

 
		

	}

}
