package com.TTS.LoginPages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPages {
	
	
	public static void EnterUrl(WebDriver driver,String Url){
	
		driver.get(Url);	
	}
	
	
	public static void EnterEmail(WebDriver driver, String Email){
		
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(Email);
	}
	
	public static void EnterPassword(WebDriver driver, String Password){
		
		driver.findElement(By.xpath("//input[@id='__BVID__26']")).sendKeys(Password);
	}
	
	public static void ClickSignInButton(WebDriver driver){
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}

}
