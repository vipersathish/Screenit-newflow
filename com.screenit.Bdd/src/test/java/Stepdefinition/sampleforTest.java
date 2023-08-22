package Stepdefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sampleforTest {
	
	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	    
		System.out.println("eee");
	}

	@When("user enter the deatils")
	public void user_enter_the_deatils(DataTable dataTable) {
	   
		
	List<List<String>> aslist 	=dataTable.asLists();
	
	for(int i=0;i<aslist.size();i++){
		
	List<String> data = 	aslist.get(i);
	
	System.out.println(data.get(1));
		
	}
	
	
	}

	@Then("user successfully register")
	public void user_successfully_register() {
	  
		
		System.out.println("sdefefer");
	}


}
