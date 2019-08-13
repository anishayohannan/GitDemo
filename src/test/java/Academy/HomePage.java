package Academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Portalpage;
import resources.Base;

public class HomePage extends Base {
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	@ BeforeTest
	public void initialise() throws IOException
	{
		driver=initializeDriver();
		
	}
	@Test(dataProvider="get")
	public void basePageNavigation(String Username,String Password) throws IOException, InterruptedException
	{
		driver.get("http://www.facebook.com/");
		LandingPage Lp=new LandingPage(driver);
		Lp.getlogin().click();
		LoginPage L=new LoginPage(driver);
		L.getemail().sendKeys(Username);
		L.getpassword().sendKeys(Password);
		L.getloginl().click();
		log.info("login succesfully");
		
	}
	
		
		@DataProvider
		public Object[][] get()
		{
		
			Object[][]data=new Object[2][2];
			data[0][0]="hi@gmail.com";
			data[0][1]="anisha87";
			data[1][0]="helo@gmail.com";
			data[1][1]="678";
		
		return data;
		}
		
		
		@ AfterTest
		public void teardown()
		{
			driver.close();
			driver=null;
		}
		
		
		
		
		
		
		
}
		
		
		
		
		
		
			
			
			
	
		
		
		
		
		
		
		
		
	