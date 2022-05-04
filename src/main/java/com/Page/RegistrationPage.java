package com.Page;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;
import com.Utility.TestUtil;


public class RegistrationPage extends TestBase {
	// Page Factory / Object Repository
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/div[2]/div")
	WebElement Singin_button;
	
	@FindBy(xpath ="//*[@id=\"__next\"]/div[1]/div/span/header/div/div[2]/div/div/a[1]/button")
	WebElement Create_an_account_Box;
	
	@FindBy(xpath ="//*[@id=\"first-name-su\"]")
	WebElement First_name_Box ;
	
	@FindBy(xpath ="//*[@id=\"last-name-su\"]")
	WebElement Last_name_button;
	
	@FindBy(xpath ="//*[@id=\"email-su\"]")
	WebElement Email_adress_Box ;
	
	@FindBy(xpath ="//*[@id=\"password-su\"]")
	WebElement Create_a_password;
	
	@FindBy(xpath ="//*[@id=\"sign-up-form\"]/button[1]")
	WebElement Create_account;
	
	@CacheLookup
	@FindBy(xpath ="//*[@id=\"__next\"]/div[1]/div/span/header/div/div[2]/a/div/div[1]")
	WebElement current_User_Name;
	

	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public  String  pageTitle() {
		Singinbutton();
		String title = driver.getTitle();
		System.out.println("The Page Title is : "+title);
		return title;

	}
	public void Singinbutton() {
		Singin_button.click();
		Create_account.click();
		
	}

	public void registerNewUser(String email, String userName, String password,
			String firstName, String lastName) {
		
		Singinbutton();
		Singin_button.sendKeys();
		Create_an_account_Box.sendKeys();
		First_name_Box.sendKeys();
		Last_name_button.sendKeys();
		Email_adress_Box.sendKeys();
		Create_a_password.sendKeys();
		Create_account.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_Wait_Time, TimeUnit.MILLISECONDS);
		

	}

	public void validatCurrentUser() {

		String loggedUser = current_User_Name.getText();
		System.out.println("The Current User is : " + loggedUser);
	}

}