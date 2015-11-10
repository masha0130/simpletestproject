package simpletestproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuckDuckGoPage {

	@FindBy(name = "q")
	WebElement duckDuckGoSearch;
	@FindBy(id= "search_button_homepage")
	WebElement duckDuckGoSearchButton;
	WebDriver driverInstance;


	public DuckDuckGoPage(WebDriver driverConstructor) {
		this.driverInstance=driverConstructor;
		PageFactory.initElements(driverConstructor, this);
		driverConstructor.get("https://duckduckgo.com");
		

	}

	public DuckDuckGoPage searchOnduckduckgo(String text) {
		duckDuckGoSearch.sendKeys(text);
		duckDuckGoSearchButton.click();

		return this;
		
		
	}

	public void goBack(){
		driverInstance.navigate().back();
	}
	
}
