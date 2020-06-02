package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;

public class ContactsPageTestCase extends TestBase{

	HomePage homePage;
	
	public ContactsPageTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setUP() {
		Initialization();
	}
	
}
