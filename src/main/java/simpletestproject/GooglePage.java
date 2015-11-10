package simpletestproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

	@FindBy(name = "q")
	WebElement googleSearch;

	public GooglePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.get("http://google.com");

	}

	public GooglePage searchOnGoogle(String text) {
		googleSearch.sendKeys(text);
		return this;
	}

}
