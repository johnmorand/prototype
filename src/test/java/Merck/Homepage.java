package Merck;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.SigninPage;
import resources.base;

//@Test(dataProvider="getData", groups = { "functest", "smoketest" })

public class Homepage extends base{
	@Test(groups = { "functest", "smoketest" })
	public void basePageNavigation() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l = new LandingPage(driver);
		Thread.sleep(1000);
		assertEquals(l.getTitle().getText(),"FEATURED COURSES");
		assertTrue(l.getHome().isDisplayed());
		assertTrue(l.getNavigationbar().isDisplayed());		
		System.out.println("The title is " + l.getTitle().getText());
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(groups = { "functest", "smoketest", "unittest" })
	public void basePageNavigation2() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l = new LandingPage(driver);
		Thread.sleep(1000);
		assertEquals(l.getTitle().getText(),"FEATURED COURSES");
		assertTrue(l.getHome().isDisplayed());
		assertTrue(l.getNavigationbar().isDisplayed());		
		System.out.println("The title is " + l.getTitle().getText());
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