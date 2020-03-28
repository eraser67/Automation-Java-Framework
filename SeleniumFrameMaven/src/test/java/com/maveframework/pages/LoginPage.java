package com.maveframework.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.mavenframework.extensions.DriverExtension;

public class LoginPage extends DriverExtension {

	WebDriver driver;

	public LoginPage(WebDriver driverLogin)
	{
		super(driverLogin);

	}
	
	
	
	@FindBy(css = ".field:nth-child(1) input")  WebElement Email; 
	@FindBy(css = ".field:nth-child(2) input")  WebElement Password; 
	@FindBy(css = ".fluid")  WebElement LoginButton; 
	@FindBy(css = "#ui > div > div.ui.fluid.container > div.ui.fluid.container > div")  WebElement DashBoard; 
	
	
	public void LoginToCogmentoCRM(String email, String password)  {
		waitForPageLoaded();
		
		waitForElement(Email);
		HighLightElement(Email,1);
		HighLightElement(Password,1);
		HighLightElement(LoginButton,1);
		Email.sendKeys(email);
		Password.sendKeys(password);
		LoginButton.click();
		waitForElement(DashBoard);
		HighLightElement(DashBoard, 1);
		Assert.assertTrue(isElementExist(DashBoard), "");
		//Assert.assertTrue(CheckElementIfPresent(DashBoard));
			
	}

}
