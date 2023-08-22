package FullFlowScreenItDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPages;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScehuldeTest {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
			
		ScreenITConfigProperties prop = new ScreenITConfigProperties();
		
    	LoginPages.EnterUrl(driver, prop.GetUrl());
    	
    	LoginPages.EnterEmail(driver, prop.GetEmail());
    	
    	LoginPages.EnterPassword(driver, prop.GetPassword());
    	
    	LoginPages.ClickSignInButton(driver);
    	
    	Thread.sleep(5000);
    	
    	driver.findElement(By.xpath("//a[text()='Schedule']")).click();
    	
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//button[@class='btn connectbtn btn-sm pull-right']")).click();
		
	}
}
