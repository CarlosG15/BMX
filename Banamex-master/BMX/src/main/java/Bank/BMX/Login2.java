package Bank.BMX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 {

	public WebDriver driver;

	public Login2(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="textFirma")
	WebElement pass;
	
	@FindBy (id="enterId")
	WebElement id;
	
	
	public WebElement Pass() {
		
		return pass;
	}
	
	public WebElement Enter2() {
		
		return id;
	}
	
	
}
