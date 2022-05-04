package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.TestBase;
import com.google.common.io.Files;

public class TestUtil extends TestBase {

	public static final long implicit_Wait_Time = 10;
	public static final long page_load_Wait_Time = 15;
	
		

	public TestUtil() throws IOException {
		super();

	}
	

	
	public static void takeScreenshoot() throws IOException{
		// Convert webdriver to TakeScreenshot
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Copy the file to a location and use try catch block to handle exception
		Files.copy(screenShot, new File("C:\\Users\\lamine\\eclipse-workspace\\Walmart/Snapshoot/Photos"+System.currentTimeMillis()+".jpeg"));
	}
	public static void expliciteWait(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, implicit_Wait_Time);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
		}
	public static void selectFunctions(WebElement locator) {
		Select select = new Select(locator);
		//select.selectByIndex(click);
		
	}

}