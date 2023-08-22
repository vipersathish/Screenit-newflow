package com.Newfullflow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample3 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demo.screenit.io/#/Login");

		WebElement email = driver.findElement(By.xpath("//input[@id='user_email']"));

		email.sendKeys("venkatesan.lavanya@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

		password.sendKeys("Welcome@1");

		WebElement signinbutton = driver.findElement(By.xpath("//button[text()='Sign In']"));

		signinbutton.click();
		
		driver.get("https://demo.screenit.io/#/candidate_profiles/1221/all");
		
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		
		js.executeScript("window.open()");
		
	Set<String> lists =	driver.getWindowHandles();
	
	Iterator<String> it = lists.iterator();
	
	while(it.hasNext()){
		
	String wind1=	 it.next();
	String wind2=	 it.next();
	
	driver.switchTo().window(wind2);
		
	}
	
	driver.get("https://mail.google.com/mail/");
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("genie@truetechsolutions.in");
	
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Screenit@12345");
	
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//div[@class='aio UKr6le'])[4]")).click();
	
	
	
	
	}
}
