package com.maveframework.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driverLogin)
	{

		this.driver = driverLogin;

	}
	
	@FindBy(css = ".field:nth-child(1) input")  WebElement Email; 
	@FindBy(css = ".field:nth-child(2) input")  WebElement Password; 
	@FindBy(css = ".fluid")  WebElement LoginButton; 
	
	public void LoginToCogmentoCRM(String email, String password)  {
		
		Email.sendKeys(email);
		Password.sendKeys(password);
		LoginButton.click();
		
		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
