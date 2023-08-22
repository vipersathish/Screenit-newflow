package com.TrueTech.ScreenIT.Pages;

import com.TrueTech.ScreenIT.initializer.DriverFunctions;

public class EmailPage  {

			
	
	
			
	      public static void typemail(String email){
			
	    	  DriverFunctions.getElementByXpath("EMAILPAGE_TYPE_EMAIL_XPATH").sendKeys(email);
			
		}
	      
	      public static void clickNextButton(){
	    	  
	    	  DriverFunctions.getElementByXpath("EMAILPAGE_CLICK_NEXTBUTTON_XPATH").click();
	      }	
	      
	      public static void typePassword(String pass) throws InterruptedException{
	    	  
	    	  Thread.sleep(3000);
	    	  DriverFunctions.getElementByXpath("EMAILPAGE_TYPE_PASSWORD_XPATH").sendKeys(pass);
	    	  
	      }
	      
	      public static void clickSentButton() throws InterruptedException{
	    	  
	    	  Thread.sleep(3000);
	    	  
	    	  DriverFunctions.getElementByXpath("EMAILPAGE_CLICK_SENTLINK_XPATH").click();
	      }


}
