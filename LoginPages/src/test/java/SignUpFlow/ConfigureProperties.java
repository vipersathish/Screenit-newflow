package SignUpFlow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigureProperties {
	
	public WebDriver driver;
	
   public	File f ;
   public 	FileInputStream fis;
   public Properties p ;
	

	public ConfigureProperties() throws IOException{
		
		f = new File("C:\\Users\\TTS-USER\\workspace\\LoginPages\\signup.properties");
		
		 fis = new FileInputStream(f);
		
		 p = new Properties();
		
		p.load(fis);
		
	System.out.println(p.getProperty("Url"));
			
	}
	
	
	public String geturl(){
		
		return p.getProperty("Url");
		
	}
	
	
	public String getusername(){
		return p.getProperty("Username");
		
	}
	
	public String getpassword(){
		return p.getProperty("Password");
		
	}
}
