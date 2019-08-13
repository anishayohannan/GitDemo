package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Portalpage;
import resources.Base;

public class StepDefinitions extends Base {
	@Given("^Initialize the browser with Chrome$")
	public void initialize_the_browser_with_Chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializeDriver();
	}

	@Given("^navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		driver.get(arg1);
	}

	@Given("^click on login link in home page to land on secure signin page\\.$")
	public void click_on_login_link_in_home_page_to_land_on_secure_signin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		LandingPage Lp=new LandingPage(driver);
		Lp.getlogin().click();
	}

	@When("^User enter (.+) and (.+) and logs in$")
    public void user_enter_and_and_logs_in(String username, String password) throws Throwable {
        LoginPage L=new LoginPage(driver);
		L.getemail().sendKeys(username);
		L.getpassword().sendKeys(password);
		L.getloginl().click();
	}

	@Then("^Verify that User is successfully logged in\\.$")
	public void verify_that_User_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Portalpage P=new Portalpage(driver);
		Assert.assertTrue(P.getcheckbox().isDisplayed());
	}
	
	@And("^close all the browsers\\.$")
    public void close_all_the_browsers() throws Throwable {
      driver.quit();
    }



}
