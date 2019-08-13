package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	
	public WebDriver driver;
	
	By signin=By.cssSelector("input[id='u_0_2']");
	By text=By.cssSelector("#content > div > div > div > div > div._6_._74 > h2");
	By title=By.cssSelector("#u_0_u > span:nth-child(1) > label");
	
	
	
	
	
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}





	public  WebElement getlogin()
	{
		return driver.findElement(signin);
	}
	public  WebElement gettext()
	{
		return driver.findElement(text);
	}
	public  WebElement gettitle()
	{
		return driver.findElement(title);
	}
	

}
