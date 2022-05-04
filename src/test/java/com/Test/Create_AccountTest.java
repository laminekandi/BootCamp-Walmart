package com.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.Page.CreateAccountPage;
import com.Page.HomePage;

public class Create_AccountTest extends TestBase {
	CreateAccountPage createPage ;

	public Create_AccountTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		createPage = new CreateAccountPage();
	
	}
	
	@Test
	public void clickOnSognButtonTest() {
		createPage.clickOnSignIn();
	}


	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	

}

