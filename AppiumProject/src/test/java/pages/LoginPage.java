package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LoginPage {
	
	private AppiumDriver appiumDriver;
	
	private By emailByXpath = AppiumBy.xpath("(//android.widget.EditText)[1]");
	private By passwordByXpath = AppiumBy.xpath("(//android.widget.EditText)[2]");
	private By loginbtnByXpath = AppiumBy.xpath("(//android.widget.TextView)[2]");
	private By signupoptionByXpath = AppiumBy.xpath("(//android.widget.TextView)[4]");
	
	//added comment
		
	
	public LoginPage (AppiumDriver appiumDriver)
	{
		this.appiumDriver = appiumDriver;
	}
	
	
	public AppiumDriver getAppiumDriver()
	{
		return appiumDriver;
	}
	
	public WebElement email()
	{
		return appiumDriver.findElement(emailByXpath);
		
	}

	public WebElement password()
	{
		return appiumDriver.findElement(passwordByXpath);
		
	}
	
	public WebElement loginbutton()
	{
		return appiumDriver.findElement(loginbtnByXpath);
		
	}
	
	public WebElement signupoption()
	{
		return appiumDriver.findElement(signupoptionByXpath);
		
	}
}
