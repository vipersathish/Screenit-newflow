package com.Newfullflow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));

List<WebElement> rows =  table.findElements(By.xpath("//table[@id='customers']//tr[3]"));

   for(int i=0;i<rows.size();i++){
	   
	   
	  String data = rows.get(i).getText();
	  
	  System.out.println(data);
   }
		
		
		
		
	}
	
	
}
