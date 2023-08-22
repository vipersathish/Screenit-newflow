package com.Newfullflow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample2 {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
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
	
		Thread.sleep(3000);
		
		WebElement uploadidbutton = driver.findElement(By.xpath("//button[text()='Upload ID']"));

		uploadidbutton.click();

		WebElement uploadfile = driver.findElement(By.xpath("//label[@for='file1']"));

		uploadfile.click();
		Runtime.getRuntime().exec("C:"+File.separator+"Users"+File.separator+"TTS-USER"+File.separator+"OneDrive"+File.separator+"Desktop"+File.separator+"sendkeysFile.exe");

//		 uploadfile.sendKeys("C:\\Users\\TTS-USER\\workspace\\com.Newfullflow\\src\\samplejd\\Java Developer.docx");

		 
//		StringSelection ss = new StringSelection(
//				"C:\\Users\\TTS-USER\\workspace\\com.Newfullflow\\src\\samplejd\\Java Developer.docx");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//		Robot robot = new Robot();
//		robot.delay(250);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.delay(90);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		WebElement canditemonth = driver.findElement(By.xpath("//select[@id ='month']"));

		Select s = new Select(canditemonth);

		s.selectByVisibleText("4 months");
		
		driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[1]")).click();
		
		Thread.sleep(3000);
   List<WebElement>	lists =	driver.findElements(By.xpath("(//ul[@class='multiselect__content'])[1]//li"));

   for(int i=0;i<lists.size();i++){
	
	 //  Thread.sleep(3000);
	  String data = lists.get(i).getText();
	  
	  if(data.equals("Spring Boot")){
		  
	
		  lists.get(i).click();
	  }
}
   
		
	}

}
