package Pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;





public class DashboardPage {
	
	WebDriver driver;
	
	By btn_uploadid = By.xpath("//button[text()='Upload ID']");
	
	By btn_uploadJD = By.xpath("//input[@id='file1']") ;
	
	By btn_submit = By.xpath("//button[text()='Submit']") ;
	
	By btn_submitresume = By.xpath("//button[text()=' Submit ']");

	By txt_years = By.xpath("(//select[@class='form-control'])[1]");
	
	By txt_months = By.xpath("//select[@id ='month']");
	
	By txt_selectprimaryskills = By.xpath("(//div[@class='multiselect__tags'])[1]");
	
	By txt_chooseprimaryskills = By.xpath("(//ul[@class='multiselect__content'])[1]//span");
	
	By txt_selectsecondaryskills = By.xpath("(//div[@class='multiselect__tags'])[2]");
	
	By txt_choosesecondaryskills = By.xpath("(//ul[@class='multiselect__content'])[2]//span");
	
	By txt_jobdescriptionskills = By.xpath("//textarea[@placeholder='Enter Job Description']");
	
	By txt_remark = By.xpath("//textarea[@placeholder='Enter Remarks']");
	
	By btn_post = By.xpath("//input[@id='submit']");
	
	By btn_profilecard = By.xpath("(//div[text()='Profiles'])[1]");
	
	By btn_selectInterviewerIcon = By.xpath("//span[text()='Select Interviewers']");
	
	By txt_searchinterviewer = By.xpath("//input[@placeholder='Search..']");
	
	By btn_Done = By.xpath("//button[text()='Done']");
	
	By btn_uploadResume = By.xpath("//span[text()='Upload Resume']");
	
	By btn_Resumeupload = By.xpath("//input[@id='file1']");
	
	By txt_status = By.xpath("//div[@class='statusName']");
	
	By btn_setavailability = By.xpath("//a[text()=' Set Availability ']");
	
	By btn_selectdata = By.xpath("//input[@class='vdatetime-input' and @placeholder = 'Select Date *']");
	
	By btn_selectcurrentdate = By.xpath("//div[@class='vdatetime-calendar__month__day']");
	
	By btn_okButton = By.xpath("//div[text()='Ok']");
	
	By btn_selecttime = By.xpath("//div[@class='vdatetime-time-picker__list vdatetime-time-picker__list--hours']//div");
	
	By btn_selectsec = By.xpath("//div[@class='vdatetime-time-picker__list vdatetime-time-picker__list--minutes']//div");
	
	By btn_selectsufix = By.xpath("//div[@class='vdatetime-time-picker__list vdatetime-time-picker__list--suffix']//div");
	
	public DashboardPage(WebDriver driver){
		
		this.driver = driver ;
		
	}
	
	
	
	public void clickUploadidButton(){
		
		driver.findElement(btn_uploadid).click();
		
	}
	
	public void UploadjdFile(String file){
		
		driver.findElement(btn_uploadJD).sendKeys(file);
	}

	public void clickSubmitButton() throws InterruptedException{
		
		Thread.sleep(3000);
		
		driver.findElement(btn_submit).click();
	}
	
	public void SelectYears(String text){
		
   WebElement years =	driver.findElement(txt_years);
	
	Select s = new Select(years);
	
	s.selectByVisibleText(text);
	
	}
	
	public void SelectMonths(String text){
		
		WebElement months = driver.findElement(txt_months);
		
		Select s = new Select(months);
		
		s.selectByVisibleText(text);
	}
	
	public void SelectPrimaryskill(){
		
		driver.findElement(txt_selectprimaryskills).click();
		
	}
	
	public void SelectSecondaryskill(){
		
		driver.findElement(txt_selectsecondaryskills).click();
	}
	
	public void Chooseprimaryskill(String Pskill){
		
	List<WebElement> skills =	driver.findElements(txt_chooseprimaryskills);
	
	for(int i=0;i<skills.size();i++){
		
		String data =	skills.get(i).getText();

			if(data.contains(Pskill)){
				
				skills.get(i).click();
			}
		}
	
	}
	
	public void ChooseSecondaryskill(String Sskill){
		
		 List<WebElement> skills =  driver.findElements(txt_choosesecondaryskills);
		 
		 for(int i=0;i<skills.size();i++){
				
				String data =	skills.get(i).getText();

					if(data.contains(Sskill)){
						
						skills.get(i).click();
					}
				}
		 
	}
	
    public void EnterJobdescription(String text){
    	
    	driver.findElement(txt_jobdescriptionskills).sendKeys(text);
    }
    
    public void EnterRemark(String text){
    	
    	driver.findElement(txt_remark).sendKeys(text);
    }
    
    public void ClickPostButton(){
    	
    	driver.findElement(btn_post).click();
    }
	
    public void ClickProfileCard(){
    	
    	driver.findElement(btn_profilecard).click();
    	
    }
    
    public void clickSelectInterviewerIcon(){
    	
    	driver.findElement(btn_selectInterviewerIcon).click();
    	
    }
    
    public void SearchInterviewer(String text){
    	
    	driver.findElement(txt_searchinterviewer).sendKeys(text);
    }
    
    public void clickDoneButton() throws InterruptedException{
    	
    	Thread.sleep(3000);
    	
    	driver.findElement(btn_Done).click();
    }
   
    public void ClickUploadResume() throws InterruptedException{
    	
    	Thread.sleep(3000);
    	
    	driver.findElement(btn_uploadResume).click();
    }
    
    public void UploadResume(String text){
    	
    	driver.findElement(btn_Resumeupload).sendKeys(text);
    }
    
    public void submitUploadResume(){
    	
    	driver.findElement(btn_submitresume).click();
    }
    
    public void checkStatus() throws InterruptedException{
    	
    	Thread.sleep(3000);
    	
    WebElement status =	driver.findElement(txt_status);
    
    System.out.println(status);
          
    }
    
    public void clickSetavailability(){
    	
    	driver.findElement(btn_setavailability).click();
    	
    }
    
   public void ClickSelectData(){
	   
	   driver.findElement(btn_selectdata).click();
   }
   
   public void ChooseCurrentDate(String date){
	   
	   List<WebElement> lists = driver.findElements(btn_selectcurrentdate);
		
		for(int i=0;i<lists.size();i++){
			
		String data =	lists.get(i).getText();
		
		if(data.equals(date)){
			
			lists.get(i).click();
		}
		}
	   
   }
   
   public void ClickOkButton(){
	   
	   driver.findElement(btn_okButton).click();
	   
   }
   
   public void chooseTime(String time){
	   
	   List<WebElement> lists = driver.findElements(btn_selecttime);
	   
		for(int i=0;i<lists.size();i++){
			
		String data= lists.get(i).getText();
		
		if(data.equals(time)){
			
			lists.get(i).click();
		}
		}
   }
   
   public void chooseSec(String sec){
	   
	   List<WebElement> lists1= driver.findElements(btn_selectsec);
		
		  for(int i=0;i<lists1.size();i++){
			  
		String data1= lists1.get(i).getText();
		
		if(data1.equals(sec)){
			
			lists1.get(i).click();
		}
		  }
   }
   
   public void chooseSuffix(String suffix){
	   
	   
	   List<WebElement> lists2=  driver.findElements(btn_selectsufix);
	     
	     for(int i=0;i<lists2.size();i++){
	    	 
	    	 String data2 = lists2.get(i).getText();
	    	 
	    	 if(data2.equals(suffix)){
	    		 
	    		 lists2.get(i).click();
	    	 }
	    			 
	     }
   }
    
}
