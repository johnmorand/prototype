package Merck;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.sql.Driver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.SigninPage;
import resources.base;

@Test(dataProvider="getData")

public class Homepage3 extends base{
	public void validateSignin(String user, String password) throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l = new LandingPage(driver);
		Thread.sleep(1000);
		assertEquals(l.getTitle().getText(),"FEATURED COURSES");
		assertTrue(l.getHome().isDisplayed());
		assertTrue(l.getNavigationbar().isDisplayed());		
		System.out.println("The title is " + l.getTitle().getText());
		l.getLogin().click();
		SigninPage s = new SigninPage(driver);
		s.getEmail().sendKeys(user);
		s.getPassword().sendKeys(password);
		s.getSubmit().click();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "user1";
		data[0][1] = "pw1";
		
		data[1][0] = "user2";
		data[1][1] = "pw2";
		
		return data;
	}
	
}
