package Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class PostPages {
	
	
	public static void VerifyCurrentUrl(WebDriver driver){
		
	String url=	driver.getCurrentUrl();
	
	System.out.println(url);
	}
	
	public static void ClickPostButton(WebDriver driver) throws InterruptedException{
		
		Thread.sleep(3000);
		try{
		 WebElement createbutton=  driver.findElement(By.xpath("//a[@data-toggle='modal' and text()='Create Post']"));
		    
		    createbutton.click();
		}catch(Exception e ){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void JobTittle(WebDriver driver,String titlename){
		
		try{
		 WebElement title= driver.findElement(By.xpath("//input[@placeholder='Job Title*']"));
	        
		    title.sendKeys(titlename);
		} catch(Exception e ){
		    	System.out.println(e.getMessage());
		    }
	}
	
	public static void ChooseYears(WebDriver driver,String yearname){
		
		try{
		WebElement years=driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		
		Select s = new Select(years);
		
		s.selectByVisibleText(yearname);
		}catch(Exception e){
			
			
			System.out.println(e.getMessage());
		}
	}
	
	public static void ChooseMonths(WebDriver driver,String monthname) throws IOException{
		
		try{
		
	WebElement months=	driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s = new Select(months);
	
	s.selectByVisibleText(monthname);
	
		}catch(Exception e){
			
	File src = (((TakesScreenshot)driver)).getScreenshotAs(OutputType.FILE);
	   
	FileHandler.copy(src, new File("C:\\Users\\TTS-USER\\workspace\\LoginPages\\screenshot\\month.png"));
	
			
			System.out.println(e.getMessage());
		}
	}
	
	public static void primarySkill(WebDriver driver,String skillname){
		
		try{
	WebElement skill=	driver.findElement(By.xpath("(//span[@class='multiselect__placeholder'])[1]"));
          
	skill.click();
	
WebElement skills=	driver.findElement(By.xpath("(//input[@name='skills'])[1]"));
	
	skills.sendKeys(skillname);
	
	skills.sendKeys(Keys.ENTER);
	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void SecondarySkill(WebDriver driver,String secskillname) throws InterruptedException{
		
		
		Thread.sleep(3000);
		try{
		WebElement secskill=	driver.findElement(By.xpath("(//span[@class='multiselect__placeholder'])[2]"));
        
		secskill.click();
		
		WebElement secskills=	driver.findElement(By.xpath("(//input[@name='skills'])[2]"));
		
		secskills.sendKeys(secskillname);
		
		secskills.sendKeys(Keys.ENTER);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
   
   
   
  
	

}
