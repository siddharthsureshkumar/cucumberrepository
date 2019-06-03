package stepDef;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver=null;
	@Given("user login page is opened")
	public void user_login_page_is_opened() {
		String chromePath="C:\\sid\\Selenium\\seleniumjars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
	 driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");

	}

	@When("user enters {string} as a username and {string} as a password")
	public void user_enters_as_a_username_and_as_a_password(String string, String string2) {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
		driver.findElement(By.id("password")).sendKeys("password123");
	   
	}

	@When("user click on Login button")
	public void user_click_on_Login_button() {
	    driver.findElement(By.xpath("//input[@name='Login']")).click();
	 
	}

	@Then("will Finds a testmeapp homepage")
	public void will_Finds_a_testmeapp_homepage() {
	    
	    
	}
}

