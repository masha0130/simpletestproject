package simpletestproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingPage {
	
	@FindBy(name = "q")
	WebElement bingSearch;
	
	@FindBy(id = "sb_form_q")
	
    WebElement searchBox;
	
	public BingPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

		driver.get("http://bing.com");

	}

	
	public void searchOnBing(String text){
	
	bingSearch.sendKeys(text);	
	searchBox.click();
	}

	
}

