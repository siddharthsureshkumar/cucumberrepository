package pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageclass {
WebDriver driver;
By lnc=By.linkText("Log in");
By uname=By.name("Email");
By pwd=By.name("Password");
By lin=By.xpath("//input[@value='Log in']");

public Pageclass(WebDriver driver) {
	this.driver =driver;
}
public void clicklink() {
	driver.findElement(lnc).click();
}
public void typeuname(String username) {
	driver.findElement(uname).sendKeys("hi@gmail.com");
	
}
public void typepassword(String password) {
	driver.findElement(pwd).sendKeys("hi");
	
}
public void clickonloginlyn() {
	driver.findElement(lin).click();
}

}
