package FullFlowScreenItDemo;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import Pages.LoginPages;
import Pages.PostPages;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenITFlow{
	
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			
	     
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
		
	  
    	PostPages.VerifyCurrentUrl(driver);
    	
    	PostPages.ClickPostButton(driver);
    	
    	PostPages.JobTittle(driver, prop.GetTittle());
    	
    	PostPages.ChooseYears(driver, prop.GetYears());
    	
    	PostPages.ChooseMonths(driver, prop.GetMonths());
    	
    	PostPages.primarySkill(driver, prop.GetPrimarySkills());
    	
    //	PostPages.SecondarySkill(driver, prop.GetSecondarySkill());
    	
    
    	
    	

    
       WebElement switchbutton= driver.findElement(By.xpath("//div[@class='v-switch-button']"));
    
   WebElement datesection = driver.findElement(By.xpath("//input[@placeholder='Select Validity *']"));
      
     datesection.click();
      
      driver.findElement(By.xpath("//span[text()='19']")).click();
             
     driver.findElement(By.xpath("//div[text()='Ok']")).click();
               
       
//     WebElement primary= driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[1]"));
//    
//     primary.click();
//    
//     primary.findElement(By.xpath("(//span[text()='Core Java'])[1]")).click();
//    
    WebElement secondary=driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[2]"));
     
     secondary.click();
     
     secondary.findElement(By.xpath("(//span[text()='Selenium API'])[2]")).click();
     
     
     WebElement jobdescription=   driver.findElement(By.xpath("//textarea[@placeholder='Enter Job Description']"));
     
     jobdescription.sendKeys(prop.JobDescription());
    
    
     WebElement remark = driver.findElement(By.xpath("//textarea[@placeholder='Enter Remarks']"));
    
     remark.sendKeys("Not Bad");
        
   driver.findElement(By.xpath("//input[@id='submit']")).click();
     
     System.out.println(driver.getCurrentUrl());
     
     //driver.navigate().refresh();
     
 // driver.navigate().refresh();
     
     Thread.sleep(5000);
     
   WebElement post= driver.findElement(By.xpath("//div[@id='navbar-collapse']//a[text()='Post']"));
    
    post.click();
    
    System.out.println(driver.getCurrentUrl());
    
    
    
    Thread.sleep(5000);
    
   
    driver.findElement(By.xpath("//a[text()='Relevant Profiles']")).click();
    
    
//  driver.navigate().refresh();
    
    
   WebElement rp=driver.findElement(By.xpath("(//button[@class='btn btn-success btn-sm pull-right'])[2]"));
  
  String data=rp.getText();
 
   System.out.println(data);
  rp.click();
    
    driver.findElement(By.xpath("//a[text()='Interested']")).click();
    
    WebElement bnt = driver.findElement(By.xpath("(//button[@class='btn btn-success btn-sm pull-right'])[1]"));
       String data1 = bnt.getText();
       
    System.out.println(data1);
    
 //   WebDriverWait wait = new WebDriverWait(driver,30);
  // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-success btn-sm pull-right'])[1]")));
   
    
   // Thread.sleep(30000);

 // driver.navigate().refresh();
    
  //  driver.findElement(By.xpath("//a[text()='Interested']")).click();
    
    Thread.sleep(30000);
    
    
    driver.findElement(By.xpath("//a[text()='Relevant Profiles']")).click();
    driver.findElement(By.xpath("//a[text()='Interested']")).click();
    
   Thread.sleep(3000);
   WebElement status= driver.findElement(By.xpath("//span[@class='pull-right']"));
   
   String value=status.getText();
   
   System.out.println(value);
   
  
    
    driver.findElement(By.xpath("//a[text()='To-be Schedule']")).click();
    
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//button[text()=' Schedule']")).click();
    
    driver.findElement(By.xpath("//span[text()='Select Time ']")).click();
    
    driver.findElement(By.xpath("(//label[text()='05:00 pm - 06:00 pm'])[1]")).click();
    
   WebElement canditename= driver.findElement(By.xpath("//input[@placeholder='Candidate Name *']"));
   
   canditename.sendKeys("sathish");
   
   WebElement canditemail = driver.findElement(By.xpath("//input[@id='candidate_email']"));
   
   canditemail.sendKeys("sathish123@gmail.com");

   WebElement canditeyears = driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
   
   Select s1 = new Select(canditeyears);
   
   s1.selectByVisibleText("3 years");
   
   WebElement canditemonth = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
   
   Select s2 = new Select(canditemonth);
   
   s2.selectByVisibleText("4 months");
   
   
   WebElement primary1= driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[3]"));
   
   primary1.click();
 
   primary1.findElement(By.xpath("(//span[text()='Complete Automation'])[3]")).click();
  
   WebElement secondary1=driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[4]"));
   
   secondary1.click();
   
   secondary1.findElement(By.xpath("(//span[text()='Test Driven Development (TDD)'])[4]")).click();
   
  
   WebElement files = driver.findElement(By.xpath("//label[@for='files']"));
   
   files.click();
   
   StringSelection ss = new StringSelection("C:\\Users\\TTS-USER\\workspace\\LoginPages\\src\\sathisresume.docx");
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
   
   Robot robot = new Robot();
   robot.delay(250);
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.delay(90);
   robot.keyRelease(KeyEvent.VK_ENTER);
   
 
    WebElement remarks = driver.findElement(By.xpath("//textarea[@placeholder='Enter your comments']"));
   
    remarks.sendKeys("concentrate on java");
   
    driver.findElement(By.xpath("(//input[@id='submit'])[3]")).click();
    
    
    Thread.sleep(3000);
    
    
    driver.findElement(By.xpath("//a[text()='Schedule']")).click();
    
    
//   WebElement schltext= driver.findElement(By.xpath("//span[@class='direct-chat-timestamp pull-left requested-l']"));
//    
//      String values =schltext.getText();
//      
//      System.out.println(values);
    
  WebElement connectbtn=  driver.findElement(By.xpath("//button[@class='btn connectbtn btn-sm pull-right']"));
  
    String contbutton=   connectbtn.getText();
    
    connectbtn.click();
    
    System.out.println(contbutton);
    
    
  WebElement result=  driver.findElement(By.xpath("(//span[@class='result-status-p pull-right'])[1]"));
    
    String resu =   result.getText();
    
    System.out.println(resu);
    
    driver.findElement(By.xpath("(//button[text()='View Result ' and @type = 'button'])[1]")).click();
   

    WebElement jobdes = driver.findElement(By.xpath("//textarea[@placeholder='Enter Job Description']"));
    
    
    
}
}
