package com.Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Base.TestBase;

public class HomePage extends TestBase {
	   //Page factory object repository
 // for example about us 
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[1]/div/span/header/div/section[1]/div/a")
    WebElement Departments;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[1]/div/span/header/div/form/div/input")
	WebElement SearchBar;
	

    //INITIALIZATION
	public HomePage() throws IOException {
	PageFactory.initElements(driver,this);
		
	}

	public void pageTitle() {
		String title=driver.getTitle();
		System.out.println("The Page title is:"+title);	
	}
 
public void clickOnContactUs() {
	
	
}
}
