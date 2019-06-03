package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class callPageClass {
public static void main(String[] args)
{
	//without using pageFactory
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.09\\Desktop\\sid\\Selenium\\seleniumjars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Pageclass PObject=new Pageclass(driver);
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	PObject.clicklink();
	String username=null;
	PObject.typeuname(username);
	String password=null;
	PObject.typepassword(password);
	PObject.clickonloginlyn();
	System.out.println("title of the page is "+driver.getTitle());
			
}
}
