package com.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Base.TestBase;

public class CreateAccountPage extends TestBase {
	
	public CreateAccountPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/div[2]/div/div/button")
	WebElement Sign_button;

	// Initialization Page Factory
		public void RegistrationPage() {
			PageFactory.initElements(driver, this);
			
		}
		
		public void clickOnSignIn() {
			Sign_button.click();
		}
}
