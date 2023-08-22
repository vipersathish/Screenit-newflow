Package com.Newfullflow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewerFlow {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://demo.screenit.io/#/LoginPage");

		driver.findElement(By.xpath("//button[@class='btn btn-dark target active']")).click();

		WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));

		emailid.sendKeys("mrinalini.vishnupriya90@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@id='user_password']"));

		pass.sendKeys("Welcome@1");

		driver.findElement(By.xpath("//button[text()='Sign In']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='Schedule']")).click();

		Thread.sleep(3000);
		WebElement status1 = driver.findElement(By.xpath("(//p[@class='mystatus'])[1]"));

		String data1 = status1.getText();

		System.out.println(data1);

		// if(data1.equals("Open")){

		driver.findElement(By.xpath("(//strong[text()='DemoOrg'])[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()=' Reschedule ']")).click();

		Thread.sleep(3000);

		WebElement candreason = driver.findElement(By.xpath("(//select[@id='orgtype'])[2]"));

		candreason.click();

		Select s = new Select(candreason);

		Thread.sleep(2000);

		s.selectByValue("Personal emergency");

		WebElement comment = driver.findElement(By.xpath("(//textarea[@placeholder='Enter your comments*'])[2]"));

		comment.sendKeys("iam not available");

		driver.findElement(By.xpath("(//button[text()=' Submit '])[2]")).click();

	}

}
