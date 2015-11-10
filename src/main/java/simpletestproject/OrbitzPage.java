package simpletestproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrbitzPage {

	@FindBy(id = "search.type.air")
	WebElement airRadioButton;

	@FindBy(name = "ar.rt.leaveSlice.orig.key")
	WebElement fromSearchField;
	
	@FindBy(name = "ar.rt.leaveSlice.dest.key")
	WebElement toSearchField;
	
	
	
	@FindBy(name = "search")
	WebElement searchButton;
	
	@FindBy(css = "#search > div.airFormMod > div > form > fieldset > p.error.message-1008 > span:nth-child(2)")
	WebElement errorMessage;
	
	
	
	
	
	
	private WebDriver driver;

	public OrbitzPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.get("http://www.orbitz.com/");
	}
	
	public void clickAirRadioButton() {
		airRadioButton.click();
	}

	public void searchInWhereBox(String text) {
		fromSearchField.sendKeys(text);
	}
	public void searchInToWhereBox(String text) {
		toSearchField.sendKeys(text);
	}
	
	public void clearSearchInWhereBox() {
		fromSearchField.clear();
	}
	
	
	public void clickSearchButton(){
		searchButton.click();
	}

	public void waitForFourSeconds() {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
	}

	
	public WebDriver getDriver(){
		return this.driver;
	}

	
	public String validateErrorMessage(){
		return errorMessage.getText();
	}
}
