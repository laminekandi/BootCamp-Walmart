package com.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;

//import sun.lwawt.macosx.CImage;

public class LoginPage extends TestBase {
	
	//Page Factory / Object Repository
	@FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/div[2]/a/div/div[1]")
	WebElement Signin_button;
	
	@FindBy(xpath ="//*[@id=\"email-split-screen\"]")
	WebElement Email_adress;
	
	@FindBy(xpath ="//*[@id=\"sign-in-password-change\"]")
	WebElement password_button;
	
	@FindBy(xpath ="//*[@id=\"sign-in-with-pwd-form\"]/div[5]/button")
	WebElement Singin_button;
	

	@FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/div[2]/a/div/div[1]")
	WebElement current_user_name;
	
	
	public LoginPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle() {
		String title = driver.getTitle();
		System.out.println(" A Page title is : " + title);
		return title;
	}
	
	public HomePage validateLogin(String userName, String pas) throws IOException {
		
		Singin_button.click();
		Email_adress.sendKeys(userName);
		password_button.sendKeys(pas);
		Singin_button.click();
		return new HomePage();	
	}
	
	public String validateCurrentUserName() {
		String visible_User_name = current_user_name.getText();
		System.out.println("Current User Name is : "+visible_User_name);
		return visible_User_name;
	}
	
	
	
	}
	