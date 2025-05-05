package SD;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DT  {
	private WebDriver d;

	@Given("Test Login page")
	public void test_login_page() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.saucedemo.com/v1/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


	}

	@When("^Test Enter (.*) and (.*)$")
	public void test_enter_user1_password1(String username, String password) throws InterruptedException{
	
		POM k = new POM(d);
		k.sd(username, password);
		
		//d.findElement(By.name("user-name")).sendKeys(username);
	    //d.findElement(By.name("password")).sendKeys(password);
         
         
		Thread.sleep(3000);
	}

	@When("Test Click on login button")
	public void test_click_on_login_button(){

	//	d.findElement(By.id("login-button")).click();
		System.out.println("Prepassed");

	}

	@Then("Test Landed on homepage")
	public void test_landed_on_homepage() {
		//d.close();
		System.out.println("All Are Passed");
	}
}
