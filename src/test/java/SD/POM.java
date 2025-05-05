package SD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	
	WebDriver d;

	POM(WebDriver d) {
		this.d = d;

		PageFactory.initElements(d, this);
	}

	@FindBy(name="user-name")
	WebElement usr;

	@FindBy(name="password")
	WebElement pwd;

	@FindBy(id="login-button")
	WebElement Btn;

	void sd(String username, String password) throws InterruptedException {
		usr.sendKeys(username);
		Thread.sleep(3000);
		pwd.sendKeys(password);
		Btn.click();
	}

	
	
	
	
	
	
	
	
	
}
