package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver ;
	
	By txt_EmailId = By.xpath("//input[@id='user_email']");
	
	By txt_Password = By.xpath("//input[@id='__BVID__32']");
	
	By btn_signin = By.xpath("//button[text()='Sign In']");
	
	
	public LoginPage(WebDriver driver){
		
		this.driver = driver ;
		
	}
	
	
	public void enterEmail(String Email){
		
		driver.findElement(txt_EmailId).sendKeys(Email);
	}
	
	public void enterPassword(String password){
		
		driver.findElement(txt_Password).sendKeys(password);
		
	}
	
	public void clickSigninButton(){
		
		driver.findElement(btn_signin).click();
	}

}
