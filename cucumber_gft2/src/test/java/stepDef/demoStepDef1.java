package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demoStepDef1 {
	WebDriver driver=null;

@Given("the login page is opened")
public void the_login_page_is_opened() {
	String chromePath="C:\\sid\\Selenium\\seleniumjars\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromePath);
	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	//driver.manage().window().maximize();
	driver.findElement(By.linkText("SignIn")).click();
	System.out.println("the title of the page is"+driver.getTitle());

    throw new cucumber.api.PendingException();
}

@When("user enters lalitha as username")
public void user_enters_lalitha_as_username() {
    driver.findElement(By.id("userName")).sendKeys("lalitha");
    throw new cucumber.api.PendingException();
}

@When("user enters oassword{int} as password")
public void user_enters_oassword_as_password(Integer int1) {
 driver.findElement(By.id("password")).sendKeys("password123");
    throw new cucumber.api.PendingException();
}

@Then("user will Finds a testmeapp homepage")
public void user_will_Finds_a_testmeapp_homepage() {
    driver.findElement(By.name("Login")).click();
   // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
    throw new cucumber.api.PendingException();
}

}
