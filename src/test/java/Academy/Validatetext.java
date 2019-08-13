package Academy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LandingPage;
import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Validatetext extends Base { 
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	
	
	@ BeforeTest
	public void initialise() throws IOException
	{
		driver=initializeDriver();
		log.info("driver is initialized");
		driver.get("http://www.facebook.com/");
		log.info("navigated to homepage");
	}
	@Test
	public void basePageNavigation() throws IOException, InterruptedException
	{
		
		LandingPage Lp=new LandingPage(driver);
		System.out.println(Lp.gettext().getText());
		AssertJUnit.assertEquals("Sign Up1", Lp.gettext().getText());
		log.info("succesfully validated");
		
		
		
		

	}
		
	@ AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
		
		

		
		
		
			
			
			
	
		
		
		
		
		
		
		
		
	