package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage {

	public WebDriver driver;
	
	By user_email=By.id("user_email");
	By user_password=By.id("user_password");
	By commit=By.name("commit");
			
	
	public SigninPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;	
	}

	public WebElement getEmail() {
		return driver.findElement(user_email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(user_password);
	}
	
	public WebElement getSubmit() {
		return driver.findElement(commit);
	}
	
}
