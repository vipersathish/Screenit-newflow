package FullFlowScreenItDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ScreenITConfigProperties {
	
	public WebDriver driver;
	
	   public	File f ;
	   public 	FileInputStream fis;
	   public Properties p ;
	  
   public ScreenITConfigProperties() throws IOException{
    	
    	   f = new File("C:\\Users\\TTS-USER\\workspace\\LoginPages\\src\\test\\java\\FullFlowScreenItDemo\\ScreenITFlow.properties");
   		
  		 fis = new FileInputStream(f);
  		
  		 p = new Properties();
  		
  		p.load(fis);
    	
  		
    }
   
   public String GetBrowser(){
	   
	   return p.getProperty("TTS_Browser");
   }
   
   
   
   public String GetUrl(){
	   
	  return p.getProperty("TTS_Url");
   }
   
   public String GetEmail(){
	   
	   return p.getProperty("TTS_Email");
   }
   
   public String GetPassword(){
	   
	   return p.getProperty("TTS_Password");
   }
   
   public String GetTittle(){
	   
	   return p.getProperty("TTS_Tittle");
   }
   
   public String GetYears(){
	   
	   return p.getProperty("TTS_Years");
   }
   
   public String GetMonths(){
	   
	   return p.getProperty("TTS_Months");
   }
   
   
   
   public String GetPrimarySkills(){
	   
	   return p.getProperty("TTS_PrimarySkills");
   }
   
   public String GetSecondarySkill(){
	   
	   return p.getProperty("TTS_SecondarySkill");
   }
   
   public String JobDescription(){
	   
	   return p.getProperty("TTS_JobDescripition");
   }
   
  public String Remark(){
	  
	  return p.getProperty("TTS_Remark");
  }
  
  public String CanditateName(){
	  
	  return p.getProperty("TTS_CanditateName");
  }
  
  public String CanditateEmail(){
	  
	  return p.getProperty("TTS_CanditateEmail");
  }
  
  public String CanditateYear(){
	  
	  return p.getProperty("TTS_CanditateYear ");
  }
  
  public String CanditateMonth(){
	  
	  return p.getProperty("TTS_CanditateMonth");
  }
  
  public String CanditateRemark(){
	  
	  return p.getProperty("TTS_CanditateRemark");
  }
   
}
