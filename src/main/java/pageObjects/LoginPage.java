package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	By email=By.cssSelector("[id='email']");
	By password=By.cssSelector("[name='pass']");
	By login=By.cssSelector("[id='loginbutton']");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getloginl()
	{
		return driver.findElement(login);
	}
	
	
	
	
	
	

}
