package stepsdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.myloginstep;

public class myloginstepdef {
	
	
	@Steps
	myloginstep loginstep;
	
	@Given("^user opens the home page$")
	public void user_opens_the_home_page()
	{
		loginstep.openloginpage();
		System.out.println("In the Given");
	}

	@When("^user enters search text \"([^\"]*)\"$")
	public void user_enters_search_text(String arg1) {
		

		loginstep.searchforthetext(arg1);
		System.out.println("In the When");
	
	}


	@Then("^user is logged in$")
	public void user_is_logged_in() 
	
	{
		System.out.println("In the Then");
		loginstep.getwebtabledata();
	
	}

	
}
