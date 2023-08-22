package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;



public class EmailPage {
	

	WebDriver driver ;
	
	
	By txt_email = By.xpath("//input[@type='email']");
	
	By btn_next = By.xpath("//input[@id='idSIButton9']");
	
	By txt_password = By.xpath("//input[@type='password']");
	
	By btn_signin = By.xpath("//input[@id='idSIButton9']");
	
	
	
	
	
	public EmailPage(WebDriver driver) {
	
		this.driver = driver;
	}


	public void OpenTab(){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
		
	
	Set<String>	windows = driver.getWindowHandles();
	
	  List<String> lists = new ArrayList<String>(windows);
	  
     String data =	  lists.get(1);
     
     driver.switchTo().window(data);
		
	}
	
	public void enterGmail(String text){
		
		driver.findElement(txt_email).sendKeys(text);
	}
	
	public void enterPassword(String text){
		
		driver.findElement(txt_password).sendKeys(text);
	}
	
	public void clickNext(){
		
		driver.findElement(btn_next).click();
	}
	
	public void clickSignin(){
		
		driver.findElement(btn_signin).click();
	}
}
