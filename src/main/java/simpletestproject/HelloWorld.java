package simpletestproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	static OrbitzPage oribtz;

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();

		oribtz = new OrbitzPage(driver);
		
		oribtz.clickAirRadioButton();
		oribtz.searchInWhereBox("Los Angeles");
		oribtz.waitForFourSeconds();
		oribtz.clearSearchInWhereBox();
		oribtz.searchInWhereBox("New York");
		
		oribtz.searchInToWhereBox("Los Angeles");
		
		
		oribtz.clickSearchButton();
		
		oribtz.waitForFourSeconds();
		System.out.println(oribtz.validateErrorMessage());
		oribtz.waitForFourSeconds();
		oribtz.waitForFourSeconds();
		oribtz.getDriver().quit();

	}

}
