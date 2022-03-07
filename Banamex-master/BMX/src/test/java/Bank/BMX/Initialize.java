package Bank.BMX;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class Initialize extends Base {

	@BeforeTest
	public void Initialize() throws IOException {
		
		driver = InitializeDriver();
	}
	
	@Test (priority=0)
	public void banamex() {
		
		driver.get(prop.getProperty("url"));
		
		popUp pu = new popUp(driver);
		pu.Close().click();
	}
	
	@Test (priority=1)
	public void credentials() throws Exception {
		
		Login l = new Login(driver);
		l.User().sendKeys(prop.getProperty("user"));
		l.Entrar().click();
		//Thread.sleep(2000);
	}
	
	@Test (priority=2)
	public void Login(){
		
		Login2 l2 = new Login2(driver);
		l2.Pass().sendKeys(prop.getProperty("id"));
		l2.Enter2().click();
	}
	
	
}
