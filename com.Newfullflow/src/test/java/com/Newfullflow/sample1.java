package com.Newfullflow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		//https://demo.screenit.io/#/candidate_profiles/1616/selected
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("");

		
//		WebElement email = driver.findElement(By.xpath("//input[@id='user_email']"));
//
//		email.sendKeys("venkatesan.lavanya@gmail.com");
//
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//
//		password.sendKeys("Welcome@1");
//
//		WebElement signinbutton = driver.findElement(By.xpath("//button[text()='Sign In']"));
//
//		signinbutton.click(); 
//		
//		Thread.sleep(5000);
//		
//		//driver.findElement(By.xpath("//button[text()='Upload ID']")).click();
//		
//		driver.findElement(By.xpath("(//div[text()='Profiles'])[2]")).click();
//		
//		Thread.sleep(3000);
//		
//		//driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
//		
//	//	driver.findElement(By.id("file1")).sendKeys("C:\\Users\\TTS-USER\\workspace\\com.TrueTech.ScreenIT.NewFlow\\sample\\samplejd\\Sathish.docx \n C:\\Users\\TTS-USER\\workspace\\com.TrueTech.ScreenIT.NewFlow\\sample\\samplejd\\Automation Testing.docx \n C:\\Users\\TTS-USER\\workspace\\com.TrueTech.ScreenIT.NewFlow\\sample\\samplejd\\Java Developer.docx \n C:\\Users\\TTS-USER\\workspace\\com.TrueTech.ScreenIT.NewFlow\\sample\\samplejd\\Mrinalini V.docx ");
//		
//	
//	
//	  // driver.findElement(By.xpath("//button[text()=' Submit ']")).click();
//	   
//	   Thread.sleep(5000);
//	   
//	 List<WebElement> lists = driver.findElements(By.xpath("//div[@class='postArea1 col-mod-12']")) ;
//	   
//	   System.out.println(lists.size());
//	   
//	   
//	  driver.findElement(By.xpath("((//div[@class='postArea1 col-mod-12'])[1]//a)[3]")).click();
//		
	                                                                                                                                                                                                                                                                                                    
	}

}   
