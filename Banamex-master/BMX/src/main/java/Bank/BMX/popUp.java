package Bank.BMX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class popUp {

	public popUp(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver driver;
	
	@FindBy (xpath="//*[@title='Close']")
	WebElement close;
	
	
	public WebElement Close() {
		
		return close;
	}
}
