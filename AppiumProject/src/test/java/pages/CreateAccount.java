package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class CreateAccount {
	
	
private AppiumDriver appiumDriver;
	
	private By getemailfieldByXpath = AppiumBy.xpath("(//android.widget.EditText)[@text=\"Email\"]");
	private By getpasswordfieldByXpath = AppiumBy.xpath("(//android.widget.EditText)[@text=\"Password\"]");
	private By getcreateaccountbtnByXpath = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Create Account\"]");
	
	
	public CreateAccount (AppiumDriver appiumDriver)
	{
		this.appiumDriver = appiumDriver;
	}
	
	
	public AppiumDriver getAppiumDriver()
	{
		return appiumDriver;
	}
	
	public WebElement getemailfield()
	{
		return appiumDriver.findElement(getemailfieldByXpath);
		
	}
	
	public WebElement getpasswordfield()
	{
		return appiumDriver.findElement(getpasswordfieldByXpath);
		
	}
	
	public WebElement getcreateaccountbtn()
	{
		return appiumDriver.findElement(getcreateaccountbtnByXpath);
		
	}

}
