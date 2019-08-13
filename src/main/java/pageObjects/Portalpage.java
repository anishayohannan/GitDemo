package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Portalpage {
	
	
	
	public WebDriver driver;
	
	By checkbox=By.name("approvals_code");
	
	
	
	
	
	public Portalpage(WebDriver driver) {
		
		this.driver=driver;
	}





	public  WebElement getcheckbox()
	{
		return driver.findElement(checkbox);
	}
	
	

}
