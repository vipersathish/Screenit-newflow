package com.TTS.LoginPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class initializer {
	
	
	public static void setUp(WebDriver driver){
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
	}

}
