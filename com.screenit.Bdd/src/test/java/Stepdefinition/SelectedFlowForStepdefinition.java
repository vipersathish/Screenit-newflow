package Stepdefinition;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.DashboardPage;
import Pages.EmailPage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectedFlowForStepdefinition {
	
  
	
	WebDriver driver ;
	
	LoginPage login ;
	
	DashboardPage dashboard ;
	
	EmailPage emailpage ;
	
	
	
	@Given("Open browser as {string}")
	
	public void open_browser_as(String BROWSER ) {
	    
		if(BROWSER.equals("chrome")){
	
		WebDriverManager.chromedriver().setup();
		
	 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		}
		
	}

	@And("User enter the Url as {string}")
	public void user_enter_the_url_as(String URL) {
	   
		driver.get(URL);
	}

	@When("user enter the email as {string} and password as {string}")
	public void user_enter_the_email_as_and_password_as(String EMAIL, String PASSWORD) {
	 
		 login = new LoginPage(driver);
		
		login.enterEmail(EMAIL);
		
		login.enterPassword(PASSWORD);
		
	}

	@When("click the login button")
	public void click_the_login_button() {
	    
		login.clickSigninButton();
	}

	@Then("navigate to the homepage")
	public void navigate_to_the_homepage() throws InterruptedException {
		
		Thread.sleep(3000);
	   
	String data = 	driver.getCurrentUrl();
		
		System.out.println(data);
		
		Assert.assertEquals(data, "https://demo.screenit.io/#/dashboardOrg");
	}
	
	@When("click the uploadID button")
	public void click_the_upload_id_button() {
	   	
		dashboard = new DashboardPage(driver);
		
		dashboard.clickUploadidButton();
	
	}
	
	@And("upload job description as {string}")
	public void upload_job_description_as(String FILE) {
	   	
		dashboard = new DashboardPage(driver);
		
		dashboard.UploadjdFile(FILE);
	}

	@Then("click the submit button")
	
	public void click_the_submit_button() throws InterruptedException{
		
		dashboard = new DashboardPage(driver);
		
		dashboard.clickSubmitButton();
		
	}
	
	@Then("select the candidate year as {string}")
	public void select_the_candidate_year_as(String YEARS) {
	   
		dashboard = new DashboardPage(driver);
		
		dashboard.SelectYears(YEARS);
		
		
	}

	@Then("select the candidate month as {string}")
	public void select_the_candidate_month_as(String MONTHS) {
	    
		dashboard = new DashboardPage(driver);
		
		dashboard.SelectMonths(MONTHS);
		
	}
		
	@When("select the primary skills as {string}")
	public void select_the_primary_skills_as(String PRISKILLS) throws InterruptedException {
	    
		dashboard = new DashboardPage(driver);
		
		Thread.sleep(3000);
		
		dashboard.SelectPrimaryskill();
		
		dashboard.Chooseprimaryskill(PRISKILLS);
		
	}

	@When("select the secondary skill as {string}")
	public void select_the_secondary_skill_as(String SECSKILLS) throws InterruptedException {
	
		dashboard = new DashboardPage(driver);
		
		Thread.sleep(3000);
		
		dashboard.SelectSecondaryskill();
		
		dashboard.ChooseSecondaryskill(SECSKILLS);
		
	}

	@When("user enter the jobdescription as {string}")
	public void user_enter_the_jobdescription_as(String JD) {
	   
		dashboard = new DashboardPage(driver);
		
		dashboard.EnterJobdescription(JD);
	}

	@Then("user enter the Remark as {string}")
	public void user_enter_the_remark_as(String REMARK) {
		
		dashboard = new DashboardPage(driver);
	   
		dashboard.EnterRemark(REMARK);
	}

	@Then("click the post button")
	public void click_the_post_button_as()   {
	    
		dashboard = new DashboardPage(driver);
		
		dashboard.ClickPostButton();
		
	}
	
	@When("click the profile button")
	public void click_the_profile_button() throws InterruptedException {
	   
		dashboard= new DashboardPage(driver);
		
		Thread.sleep(3000);
		
		dashboard.ClickProfileCard();
		
	}

	@Then("navigate to the candidateprofilepage")
	public void navigate_to_the_candidateprofilepage() throws InterruptedException {
	    
		dashboard = new DashboardPage(driver);
		
		Thread.sleep(3000);
		
	String data = 	driver.getCurrentUrl() ;
	
	System.out.println(data);
	
	//	Assert.assertEquals("https://demo.screenit.io/#/candidate_profiles/2390/all", data);
		
	}

	@And("click the SelectInterviewer icon")
	public void click_the_select_interviewer_icon() {
	   
		dashboard = new DashboardPage(driver);
		
		dashboard.clickSelectInterviewerIcon();
	}

//	@Then("Search the interviewer as {String}")
//	public void search_the_interviewer_as(String SEARCH) {
//	   
//		dashboard= new DashboardPage(driver);
//		
//		dashboard.SearchInterviewer(SEARCH);
//		
//	}
//	
	@And("click Done button")
	public void click_Done_button() throws InterruptedException{
		
		dashboard= new DashboardPage(driver);
		
		dashboard.clickDoneButton();
	}
	
	
	
	@When("click the uploadResume")
	public void click_the_uploadResume() throws InterruptedException{
		
		dashboard= new DashboardPage(driver);
		
		dashboard.ClickUploadResume();
	}
	
	@And("upload the candidateresume as {string}")
	public void upload_the_candidateresume_as(String RESUME) {
	    
		dashboard= new DashboardPage(driver);
		
		dashboard.UploadResume(RESUME);
	}

	@Then("click Submit button")
	public void click_submit_button() throws InterruptedException{
		
		Thread.sleep(3000);
		
		dashboard= new DashboardPage(driver);
		
		dashboard.submitUploadResume();
	}
	
	@And("verify the status")
	public void verify_the_status() throws InterruptedException{
		
		dashboard= new DashboardPage(driver);
		
		dashboard.checkStatus();
		
		
	}
	
	@When("click the setavailability button")
	public void click_the_setavailability_button() throws InterruptedException{
		
		Thread.sleep(3000);
		
		dashboard= new DashboardPage(driver);
		
		dashboard.clickSetavailability();
		
	}
	
	@And("click the Select date button")
	public void click_the_select_data_button() throws InterruptedException{
		
		Thread.sleep(3000);
		
		dashboard= new DashboardPage(driver);
		
		dashboard.ClickSelectData();
		
	}
	
	@When("choose select date as {string}")
	public void choose_select_date_as(String DATE) {
	    
		dashboard= new DashboardPage(driver);
		
		dashboard.ChooseCurrentDate(DATE);
		
		dashboard.ClickOkButton();
	}

	@Then("choose select time as {string}")
	public void choose_select_time_as(String TIME) {
	    
		dashboard = new DashboardPage(driver);
		
		dashboard.chooseTime(TIME);
		
	}

	@Then("choose select sec as {string}")
	public void choose_select_sec_as(String SEC) {
	   
		dashboard = new DashboardPage(driver);
		
		dashboard.chooseSec(SEC);
		
	}

	@Then("choose suffix as {string}")
	public void choose_suffix_as(String SUFFIX) throws InterruptedException {
	   
		dashboard = new DashboardPage(driver);
		
		dashboard.chooseSuffix(SUFFIX);
		
		dashboard.ClickOkButton();
		
		dashboard.clickSubmitButton();
	}

	@Then("verify the candidate status")
	public void verify_the_candidate_status() throws InterruptedException {
	   
		Thread.sleep(3000);
		
		dashboard = new DashboardPage(driver);
		
		dashboard.checkStatus();
		
		
	}
	
	@Given("open new tab")
	public void open_new_tab() {
	    
	  emailpage = new EmailPage(driver);
	  
	  emailpage.OpenTab();
		
	}

	@When("enter the url as {string}")
	public void enter_the_url_as(String GMAILURL) {
	  
		driver.get(GMAILURL);
	}

	@When("enter the email id as {string}")
	public void enter_the_email_id_as(String GMAILID) throws InterruptedException {

		 Thread.sleep(3000);
		
		 emailpage = new EmailPage(driver);
		 
		 emailpage.enterGmail(GMAILID);
	}

	@When("click Next button")
	public void click_next_button() {
	   
		 emailpage = new EmailPage(driver);
		 
		 emailpage.clickNext();
		
	}
	

	@Then("enter the password as {string}")
	public void enter_the_password_as(String GMAILPASSWORD) throws InterruptedException {
	    
		 Thread.sleep(3000);
		
		 emailpage = new EmailPage(driver);
		 
		 emailpage.enterPassword(GMAILPASSWORD);
		 
		 Thread.sleep(3000);
		 
		 emailpage.clickNext();
		 
	}

	
	@Then("click signin button")
	public void click_signin_button() throws InterruptedException {
	   
		 emailpage = new EmailPage(driver);
		 
		 emailpage.clickSignin();
		 
		 Thread.sleep(3000);
		 
//		 emailpage.clickSignin();
	}
	
	
	

}
