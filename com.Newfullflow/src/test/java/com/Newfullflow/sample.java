package com.Newfullflow;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo.screenit.io/#/select_interviewer/1180");
		
//		List<WebElement> lists = driver.findElements(By.xpath("//ul[@class='products-list product-list-in-box postArea']//a"));
//		
//		
//		
//		for(int i=0;i<lists.size();i++){
//			
//		String data =	lists.get(i).getText();
//		
//		
//	//	System.out.println(data);
//		
//		
//		
//		if(data.equals("Smiriti Mandana")){
//			
//			driver.findElement(By.xpath("//button[text()='Select']")).click();
//		}
//		String start="/html/body/div/div/div/section/div/div[2]/div[3]/ul/li[";
//		String end="]/div[1]/div/div[1]/div[2]/a";
//		int i=6;
//		String start1="/html/body/div/div/div/section/div/div[2]/div[3]/ul/li[";
//		String end1="]/div[2]/div[2]/button";
//		int j=6;
//		String name="Srini Balamurugan";
//		while(true){
//			
//			String path=start+i+end;
//			String path1=start1+j+end1;
//			List<WebElement> list=driver.findElements(By.xpath(path));
//			List<WebElement> list1=driver.findElements(By.xpath(path1));
//			for(int a=0;a<list.size();a++){
//				for(int b=0;b<list1.size();b++){
//					String data=list.get(a).getText();
//					if(data.equals(name)){
//						list1.get(b).click();
//						
//					}
//				
//				}
//				
//				
//				
//			}
//			
//			
//			break;
//			}
//		
//		
		
		List<WebElement> interviwerlists = driver.findElements(By.xpath("//button[text()='Select']"));
		
			for(int i=0;i<interviwerlists.size();i++){
				
				if(i==2){
					interviwerlists.get(i).click();
					
					
				}
				
				if(i==3){
					
					interviwerlists.get(i).click();
				}
				
				if(i==6){
					
					interviwerlists.get(i).click();
				}
				
			}
		}
		
	}


//EmailPage.openNewwindow();
//
//driver.get(envprop.getProperty("EmailURL"));
//
//EmailPage.typemail("genie@truetechsolutions.in");
//
//EmailPage.clickNextButton();
//
//EmailPage.typePassword("Screenit@12345");
//
//EmailPage.clickNextButton();
//
//EmailPage.clickSentButton();


