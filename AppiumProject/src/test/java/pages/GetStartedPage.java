package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class GetStartedPage {

private AppiumDriver appiumDriver;
	
	private By getstartedbtnByXpath = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Get Started\"]");
	private By signinoptionnByXpath = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Sign in\"]");
	
	
	public GetStartedPage (AppiumDriver appiumDriver)
	{
		this.appiumDriver = appiumDriver;
	}
	
	
	public AppiumDriver getAppiumDriver()
	{
		return appiumDriver;
	}
	
	public WebElement getstartedbtn()
	{
		return appiumDriver.findElement(getstartedbtnByXpath);
		
	}
	
	public WebElement getsigninoption()
	{
		return appiumDriver.findElement(signinoptionnByXpath);
		
	}
}
