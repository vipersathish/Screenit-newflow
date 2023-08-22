package com.TechnicalExerciseForEvaluation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import com.TechnicalExerciseForEvaluation.Initializer.DriverFunctions;

public class SecurianPage {
	
	
	public static void enterCurrentAge(String age){
		
		 DriverFunctions.getElementByXpath("ENTER_CURRENTAGE_XPATH").sendKeys(age);
	}

	
	public static void enterRetirementAge(String age){
		
		DriverFunctions.getElementByXpath("ENTER_RETIREMENTAGE_XPATH").sendKeys(age);
	}
	
	public static void currentAnnualIncome(String income) {
		
	WebElement web =	DriverFunctions.getElementByXpath("ENTER_CURRENTANNUALINCOME");
	
	 JavascriptExecutor ex = (JavascriptExecutor) DriverFunctions.driver;
	 
	    ex.executeScript("arguments[0].value='"+ income +"';", web);
	
	}
	
	public static void spouseAnnualIncome(String income){
		
		WebElement web =DriverFunctions.getElementByXpath("ENTER_SPOUSEANNUALINCOME");
		
		 JavascriptExecutor ex = (JavascriptExecutor) DriverFunctions.driver;
		 
		    ex.executeScript("arguments[0].value='"+ income +"';", web);
		
	}
	
	public static void currentRetirementSavings(String saving){
		
	WebElement web =	DriverFunctions.getElementByXpath("ENTER_CURRENTRETIREMENTSAVINGS");
		
		 JavascriptExecutor ex = (JavascriptExecutor) DriverFunctions.driver;
		 
		    ex.executeScript("arguments[0].value='"+ saving +"';", web);
		
	}
	
	public static void currentRetirementContribution(String perc){
		
    DriverFunctions.getElementByXpath("ENTER_CURRENTANNUALSAVING").sendKeys(perc);
  
 	
	}
	
	public static void annualRetirementContributionIncrease(String perc){
		
		DriverFunctions.getElementByXpath("ENTER_SAVINGINCREASERATE").sendKeys(perc);
	}
	
	public static void socialSecurityIncome(){
		
		DriverFunctions.getElementByXpath("CLICK_SOCIALSECURITYINCOME").click();
		
	}
	
	public static void relationshipStatus(){
		
		DriverFunctions.getElementByXpath("CLICK_RELATIONSHIPSTATUS").click();
	}
	
	public static void socialSecurityOverride(String amount){
		
	WebElement web =	DriverFunctions.getElementByXpath("ENTER_SOCIALSECURITYOVERRIDE");
	
	  JavascriptExecutor ex = (JavascriptExecutor) DriverFunctions.driver;
	 
           ex.executeScript("arguments[0].value='"+ amount +"';", web);
	}
	
	public static void adjustDefaultValue(){
	
		DriverFunctions.getElementByXpath("CLICK_ADJUSTDEFAULTVALUE").click();
	}
	
	public static void otherIncome(String income){
		
	WebElement web =	DriverFunctions.getElementByXpath("ENTER_OTHERINCOME");
		
		  JavascriptExecutor ex = (JavascriptExecutor) DriverFunctions.driver;
		 
	           ex.executeScript("arguments[0].value='"+ income +"';", web);
	}
	
	public static void numberOfYearsRetirementNeedsToLast(String amount){
		
		DriverFunctions.getElementByXpath("ENTER_NUMBEROFYEARRETIREMENT").sendKeys(amount);
	}
	

	
	public static void PercentOfFinalAnnualIncomeDesired(String perc){
		
		DriverFunctions.getElementByXpath("ENTER_FINALANNUALINCOME").sendKeys(perc);
	}
	
	public static void PreRetirementInvestmentReturn(String perc){
		
		DriverFunctions.getElementByXpath("ENTER_PRERETIREMENT").sendKeys(perc);
	}
	
	public static void postRetirementInvestmentRetrun(String perc){
		
		DriverFunctions.getElementByXpath("ENTER_POSTRETIREMENT").sendKeys(perc);
	}
	
	public static void clickSaveChangs(){
		
		DriverFunctions.getElementByXpath("CLICK_SAVECHANGES").click();
	}
	
	public static void clickCalculate(){
		
		DriverFunctions.getElementByXpath("CLICK_CALCULATE").click();
	}
}
