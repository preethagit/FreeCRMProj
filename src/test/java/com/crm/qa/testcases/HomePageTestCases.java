package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTestCases extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTestCases() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		Initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("Password"));
	}

	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.homePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO","Home Page title not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		String userName = homePage.userName();
		
		Assert.assertEquals(userName, "User: "+prop.getProperty("userNameLabel"),"User Name not matched");
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
