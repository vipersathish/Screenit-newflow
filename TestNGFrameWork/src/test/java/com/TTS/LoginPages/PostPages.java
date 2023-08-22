package com.TTS.LoginPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PostPages {
	
	
	public static void VerifyCurrentUrl(WebDriver driver){
		
	String url=	driver.getCurrentUrl();
	
	System.out.println(url);
	}
	
	public static void ClickPostButton(WebDriver driver){
		try{
		 WebElement createbutton=  driver.findElement(By.xpath("//a[text()='Create Post']"));
		    
		    createbutton.click();
		}catch(Exception e ){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void JobTittle(WebDriver driver,String titlename){
		
		try{
		 WebElement title= driver.findElement(By.xpath("//input[@id='__BVID__56']"));
	        
		    title.sendKeys(titlename);
		} catch(Exception e ){
		    	System.out.println(e.getMessage());
		    }
	}
	
	public static void ChooseMonth(WebDriver driver,String monthname){
		
		try{
		WebElement months=driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		
		Select s = new Select(months);
		
		s.selectByVisibleText(monthname);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void chooseYear(WebDriver driver,String yearname){
		
		try{
		
	WebElement years=	driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s = new Select(years);
	
	s.selectByVisibleText(yearname);
	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void primarySkill(WebDriver driver,String skillname){
		
   
   
   
  
	}

}
