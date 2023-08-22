package com.TTS.LoginPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

      public class driverFunction{
	
	    public WebDriver driver;
	
  public  static WebDriver startBrowser(String browser){
	
	if(browser.equals("chrome")){
		
		WebDriverManager.chromedriver().setup();
		
		 return new ChromeDriver(); 
		
	}else if(browser.equals("firefox")){
		
		WebDriverManager.firefoxdriver().setup();
		
		return new FirefoxDriver();
		
	}else if(browser.equals("ie")){
		
		WebDriverManager.iedriver().setup();
		
		return new InternetExplorerDriver();
	}
	return null;
	
		
		
}
}
