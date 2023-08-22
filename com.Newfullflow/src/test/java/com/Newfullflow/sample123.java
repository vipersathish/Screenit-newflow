package com.Newfullflow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample123 {
	
    	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://demo.screenit.io/#/Login");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='user_email']"));

		email.sendKeys("mrinalini.v@screenit.io");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

		password.sendKeys("Welcome@1234");

		WebElement signinbutton = driver.findElement(By.xpath("//button[text()='Sign In']"));

		signinbutton.click(); 
	
		Thread.sleep(3000);
		
		
		
		
		driver.findElement(By.xpath("(//div[text()='Profiles'])[1]")).click();
		
		Thread.sleep(3000);
		
	    List<WebElement>	lists =driver.findElements(By.xpath("(//div[@class='postArea1 col-mod-12'])[1]//a"));
		
		for(int i=0;i<lists.size();i++){
			
		String data =	lists.get(i).getText();
		
		System.out.println(data);
		
//		if(data.equals("Yuvashree Murugadoss")){
//			
//			driver.findElement(By.xpath("//a[text()=' Set Availability ']")).click();
//		}
		}
		
		
		
		
		
	}

}
