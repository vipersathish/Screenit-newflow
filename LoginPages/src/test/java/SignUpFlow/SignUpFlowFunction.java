package SignUpFlow;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpFlowFunction {
	

	public static void main(String[] args) throws IOException {
		
//	File f = new File("C:\\Users\\TTS-USER\\workspace\\LoginPages\\signup.properties");
//			
//	FileInputStream	 fis = new FileInputStream(f);
//			
//	Properties p = new Properties();
//			
//	p.load(fis);
				
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.manage().deleteAllCookies();
	
	ConfigureProperties cf = new ConfigureProperties();
	
    driver.get(cf.geturl());

  WebElement email=	driver.findElement(By.xpath("//input[@placeholder='Email']"));
  
  email.sendKeys(cf.getusername());
  
  WebElement mobileno=driver.findElement(By.xpath("//input[@name='telephone']"));
   
  mobileno.sendKeys(cf.getpassword());
	
  WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	
  button.click();
	
	
}
}
