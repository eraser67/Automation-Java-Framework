package com.mavenframework.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.maveframework.pages.BaseClass;
import com.maveframework.pages.LoginPage;
import com.mavenframework.utility.BrowserFactory;
import com.mavenframework.utility.ExcelDataProvider;
import com.mavenframework.utility.Helper;

public class LoginTestCase extends BaseClass{

	
	
	@Test(priority = 1)
	public void Login() {
		
		
	logger=	report.createTest("Login to the Page");
		
		
		System.out.println(driver.getTitle());

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");
		
		login.LoginToCogmentoCRM(excel.GetStringData(0, 0,0), excel.GetStringData(0, 0, 1));
		
		logger.pass("Login Successfully");
	}
	
	
	@Test(priority = 2)
	public void LoginSampleFailed() {
		
		
	logger=	report.createTest("Login to the Page");
		
		
		System.out.println(driver.getTitle());

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");
		
		login.LoginToCogmentoCRM(excel.GetStringData(0, 0,0), excel.GetStringData(0, 0, 1));
		
		logger.pass("Failed");
	}


}
