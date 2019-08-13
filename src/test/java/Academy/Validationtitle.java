package Academy;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LandingPage;
import resources.Base;

public class Validationtitle extends Base {
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	
	@ BeforeTest
	public void initialise() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.facebook.com/");
	}
	@Test
	public void basePageNavigation() throws IOException, InterruptedException
	{
		
		LandingPage Lp=new LandingPage(driver);
		System.out.println(Lp.gettitle().getText());
		
		AssertJUnit.assertTrue(Lp.gettitle().isDisplayed());
		log.info("displayed");
		
		
		
		
	}
	@ AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
		
}
		
		
		
		
		
		
			
			
			
	
		
		
		
		
		
		
		
		
	