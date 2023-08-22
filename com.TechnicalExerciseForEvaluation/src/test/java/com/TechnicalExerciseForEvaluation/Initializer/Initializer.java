package com.TechnicalExerciseForEvaluation.Initializer;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer {
	
	
	
	public static WebDriver driver ;
	
    public static FileInputStream envfis = null;
	
	public static Properties envprop= null;
	
    public static FileInputStream locatorfis = null;
	
	public static Properties locatorprop = null;
	
    public static FileInputStream sendkeysfis = null ;
	
	public static Properties sendkeysprop = null ;
	
	
	
	
	public static void initialize() throws IOException{
		
		
		 envfis = new FileInputStream(new File("Configure\\env.properties"));
			
		 envprop = new Properties();
		
		 envprop.load(envfis);
		 
		 locatorfis = new FileInputStream(new File("Configure\\locator.properties"));
			
		 locatorprop = new Properties();
		
		locatorprop.load(locatorfis);
		

		sendkeysfis = new FileInputStream(new File("Configure\\senkeys.properties"));
		
		sendkeysprop = new Properties();
		
		sendkeysprop.load(sendkeysfis);
		
		
		
		
		
	if(envprop.get("BROWSER").equals("chrome")){
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
	
		
	}else if(envprop.get("BROWSER").equals("firefox")){
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		
	}else if(envprop.get("BROWSER").equals("ie")){
		
		WebDriverManager.iedriver().setup();
	
		driver = new InternetExplorerDriver();
		
		
	}

	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}

}

	


