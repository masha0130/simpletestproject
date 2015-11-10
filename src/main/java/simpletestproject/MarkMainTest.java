package simpletestproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MarkMainTest {

	static DuckDuckGoPage duckDuckGoPage;

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		duckDuckGoPage=new DuckDuckGoPage(driver);
		
		duckDuckGoPage.searchOnduckduckgo("mark");
		duckDuckGoPage.goBack();
		

		

	}

}
