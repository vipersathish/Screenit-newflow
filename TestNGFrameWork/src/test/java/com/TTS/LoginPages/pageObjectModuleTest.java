package com.TTS.LoginPages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.TTS.LoginPages.driverFunction;

public class pageObjectModuleTest {
	
	public WebDriver driver;


	@Parameters({"browser","Url","Email","Password","titlename","monthname","yearname","skillname"})
	@Test
	
	public void LoginPageTests(String browser,String url,String Email,String Password,String titlename,
   String monthname,String yearname,String skillname){
		
		driver = driverFunction.startBrowser(browser);
		
		initializer.setUp(driver);
			
		LoginPages.EnterUrl(driver, url);
		
		LoginPages.EnterEmail(driver, Email);
		
		LoginPages.EnterPassword(driver, Password);
		
		LoginPages.ClickSignInButton(driver);	
		
		PostPages.VerifyCurrentUrl(driver);
		
		PostPages.ClickPostButton(driver);
		
		PostPages.JobTittle(driver, titlename);
		
		PostPages.ChooseMonth(driver, monthname);
		
		PostPages.chooseYear(driver, yearname);
		
		PostPages.primarySkill(driver, skillname);
		
	}
	


}
