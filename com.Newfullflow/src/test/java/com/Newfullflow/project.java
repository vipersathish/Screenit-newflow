package com.Newfullflow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver wd = new ChromeDriver();
		
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		wd.get("https://curtainmatrix.co.uk/testingsource/login");
		
		wd.findElement(By.xpath("//input[@id='companyname']")).sendKeys("BMDEMOTEST");
		
		wd.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		wd.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		
		wd.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		//WebDriverWait  wait = new WebDriverWait(wd,10);
		
		WebElement s= wd.findElement(By.xpath("//a[@class='mat-menu-trigger']"));
		

		((JavascriptExecutor) wd).executeScript("arguments[0].click();", s);

		
	WebElement st =	wd.findElement(By.xpath("//div[@id='cdk-overlay-0']//li[3]"));
		
	((JavascriptExecutor) wd).executeScript("arguments[0].click();", st);
	
		wd.findElement(By.xpath("//div[@id='mat-select-value-11']")).click();
		
		wd.findElement(By.xpath("//mat-option[@id='mat-option-28']//span[text()=' WEB ']")).click();
		
		
		
		
		
		
		
		
	
		
	}
	
}
