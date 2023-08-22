package com.TechnicalExerciseForEvaluation.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.TechnicalExerciseForEvaluation.Initializer.Initializer;
import com.TechnicalExerciseForEvaluation.pages.SecurianPage;

public class PreRetirementCalculator extends Initializer{
	
	@BeforeMethod
	
	public void setUp() throws IOException{
		
		 initialize();
		
	}
	
	@Test
	
	public void retirementCalcultor()  {	
		
		driver.get(envprop.getProperty("LOGINURL"));
		
		SecurianPage.enterCurrentAge(sendkeysprop.getProperty("Enter_CurrentAge"));
		
		SecurianPage.enterRetirementAge(sendkeysprop.getProperty("Enter_RetirementAge"));
		
		SecurianPage.currentAnnualIncome(sendkeysprop.getProperty("Enter_CurrentAnnualIncome"));
		
		SecurianPage.spouseAnnualIncome(sendkeysprop.getProperty("Enter_SpouseAnnualIncome"));
		
		SecurianPage.currentRetirementSavings(sendkeysprop.getProperty("Enter_CurrentRequirementSaving"));
		
	    SecurianPage.currentRetirementContribution(sendkeysprop.getProperty("Enter_CurrentAnnualSaving"));	
	    
	    SecurianPage.annualRetirementContributionIncrease(sendkeysprop.getProperty("Enter_SavingIncreaseRate"));
	    
	    SecurianPage.socialSecurityIncome();
	    
	    SecurianPage.relationshipStatus();
	    
	    SecurianPage.socialSecurityOverride(sendkeysprop.getProperty("Enter_SocialSecurityOverride"));
	    
	    SecurianPage.adjustDefaultValue();
	    
	    SecurianPage.otherIncome(sendkeysprop.getProperty("Enter_OtherIncome"));
	    
	    SecurianPage.numberOfYearsRetirementNeedsToLast(sendkeysprop.getProperty("Enter_NumberOfYearRetirement"));
	    	    
	    SecurianPage.PercentOfFinalAnnualIncomeDesired(sendkeysprop.getProperty("Enter_FinalAnnualIncome"));
	    
	    SecurianPage.PreRetirementInvestmentReturn(sendkeysprop.getProperty("Enter_PreRetirement"));
	    
	    SecurianPage.postRetirementInvestmentRetrun(sendkeysprop.getProperty("Enter_PostRetirement"));
	    
	    SecurianPage.clickSaveChangs();
	    
	    SecurianPage.clickCalculate();
	    
	}
	
	@AfterMethod


	public void tearDown(){
		
		driver.quit();
	}
}
