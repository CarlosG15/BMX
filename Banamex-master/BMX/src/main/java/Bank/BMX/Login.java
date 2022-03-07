package Bank.BMX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;

	public Login(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[@name='username1']")
	WebElement user;
	
	@FindBy (xpath="//*[@id=\"loginCustomerBox\"]/div[4]/a")
	WebElement entrar;
	
	
	public WebElement User() {
		
		return user;
	}
	
	public WebElement Entrar() {
		
		return entrar;
	}
}
