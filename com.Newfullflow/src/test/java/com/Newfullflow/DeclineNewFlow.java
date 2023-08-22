package com.Newfullflow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeclineNewFlow {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

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

		// uploadfile.sendKeys("C:\\Users\\TTS-USER\\workspace\\com.Newfullflow\\src\\samplejd\\Java
		// Developer.docx");

		StringSelection ss = new StringSelection(
				"C:\\Users\\TTS-USER\\workspace\\com.Newfullflow\\src\\samplejd\\Java Developer.docx");

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

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		WebElement canditemonth = driver.findElement(By.xpath("//select[@id ='month']"));

		Select s = new Select(canditemonth);

		s.selectByVisibleText("4 months");

		WebElement primaryskill = driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[1]"));

		primaryskill.click();

		primaryskill.findElement(By.xpath("(//span[text()='Core Java'])[1]")).click();

		WebElement secondaryskill = driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[2]"));

		secondaryskill.click();

		secondaryskill.findElement(By.xpath("(//span[text()='Spring Boot'])[2]")).click();

		WebElement jobdescription = driver.findElement(By.xpath("//textarea[@placeholder='Enter Job Description']"));

		jobdescription.sendKeys("design the frameworks using java and spring boot");

		driver.findElement(By.xpath("//input[@id='submit']")).click();

		Thread.sleep(10000);

		// WebElement cards =
		// driver.findElement(By.xpath("//ul[@class='products-list
		// product-list-in-box mypostlist']//li[1]"));

		WebElement profile = driver.findElement(By.xpath("(//div[text()='Profiles'])[1]"));

		profile.click();

		WebElement selectinterviewer = driver.findElement(By.xpath("//span[text()='Select Interviewers']"));

		selectinterviewer.click();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");

		WebElement interviwerlists = driver.findElement(By.xpath("(//button[text()='Select'])[6]"));

		interviwerlists.click();

		Thread.sleep(5000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-600)", "");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Done']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();

		WebElement uploadresum = driver.findElement(By.xpath("//label[@for='file1']"));

		uploadresum.click();

		StringSelection ss1 = new StringSelection(
				"C:\\Users\\TTS-USER\\workspace\\com.Newfullflow\\src\\samplejd\\M Azhageswari_UI Developer_TTS.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

		Robot robot1 = new Robot();
		robot1.delay(250);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.delay(90);
		robot1.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()=' Submit ']")).click();

		Thread.sleep(5000);

		WebElement status1 = driver.findElement(By.xpath("//div[@class='statusName']"));

		String data1 = status1.getText();

		System.out.println("status----" + data1);

		WebElement highstatus1 = driver.findElement(By.xpath("//div[@class='statusName']"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", highstatus1);

		WebElement setavailability = driver.findElement(By.xpath("//a[text()=' Set Availability ']"));

		setavailability.click();

		driver.findElement(By.xpath("//input[@placeholder='Select Date *']")).click();

		driver.findElement(By.xpath("//span[text()='23']")).click();

		driver.findElement(By.xpath("//div[text()='Ok']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()='Ok']")).click();

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		Thread.sleep(5000);

		WebElement status2 = driver.findElement(By.xpath("//div[@class='statusName']"));

		String data2 = status2.getText();

		System.out.println("status---" + data2);

		WebElement highstatus2 = driver.findElement(By.xpath("//div[@class='statusName']"));
		JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
		jsExecutor1.executeScript("arguments[0].style.border='2px solid red'", highstatus2);

		Thread.sleep(35000);

		System.out.println("----canditate details-----");

		WebElement candlists = driver.findElement(By.xpath("//a[@class='candidateDetails overflow']"));

		String candlis = candlists.getText();

		System.out.println(candlis);

		System.out.println("---------------------");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//img[@class='resume']")).click();

		driver.findElement(By.xpath("//span[text()='M Azhageswari_UI Developer_TTS']")).click();

		driver.findElement(By.xpath("//button[text()='Edit']")).click();

		WebElement clearname = driver.findElement(By.xpath("//input[@placeholder='Name*']"));

		clearname.clear();

		clearname.sendKeys("Azhageswari");

		WebElement endname = driver.findElement(By.xpath("//input[@placeholder='Lastname']"));

		endname.sendKeys("M");

		driver.findElement(By.xpath("//input[@id='submit']")).click();

		Thread.sleep(5000);

		WebElement status3 = driver.findElement(By.xpath("//div[@class='statusName']"));

		String data3 = status3.getText();

		System.out.println("Status----" + data3);

		if (data3.equals("Declined")) {

			WebElement selectinterviewer1 = driver.findElement(By.xpath("//span[text()='Select Interviewers']"));

			selectinterviewer1.click();

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,600)", "");

			WebElement interviwerlistss = driver
					.findElement(By.xpath("//button[@class='fa fa-check-circle fa-2x isSelected pull-right']"));

			interviwerlistss.click();

			Thread.sleep(5000);

			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy(0,-600)", "");

			Thread.sleep(3000);

			WebElement interviwerlists1 = driver.findElement(By.xpath("(//button[text()='Select'])[2]"));

			interviwerlists1.click();

			Thread.sleep(5000);

			driver.findElement(By.xpath("//button[text()='Done']")).click();

			Thread.sleep(5000);

			driver.findElement(By.xpath("//a[text()=' Schedule ']")).click();

			Thread.sleep(3000);

			WebElement status4 = driver.findElement(By.xpath("//div[@class='statusName']"));

			String data4 = status4.getText();

			System.out.println("Status----" + data4);

			Thread.sleep(5000);

		

			try {
				
				driver.navigate().refresh();
				
				WebElement status5 = driver.findElement(By.xpath("//div[@class='statusName']"));

				String data5 = status5.getText();

				System.out.println("Status----" + data5);

			} catch (StaleElementReferenceException e) {

				System.out.println(e);

			}
		}
	}
}
