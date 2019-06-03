package pageclass;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageImplementation {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.09\\Desktop\\sid\\Selenium\\seleniumjars\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		pagefactory locateElements = PageFactory.initElements(driver, pagefactory.class);
		locateElements.loginMethod("hi@gmail.com","hi");
	}

}
