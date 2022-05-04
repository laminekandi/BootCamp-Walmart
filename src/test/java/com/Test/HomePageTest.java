package com.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.Page.HomePage;

public class HomePageTest extends TestBase{
	 
	HomePage homePage;
	TestBase tesTbase = new TestBase();
	public HomePageTest() throws IOException {
		super();	
	}
	
	@BeforeMethod
public void setUP() throws IOException {
	tesTbase.initialization();
	homePage= new HomePage ();
}
    @Test
public void pageTitleTest() {
	homePage.pageTitle();
}
    @Test(enabled = false)
 public void clickContactUsTest() {
	 homePage.clickOnContactUs();
 }
    @AfterMethod
 public void tearDown () {
	 driver.close();
 }
}
