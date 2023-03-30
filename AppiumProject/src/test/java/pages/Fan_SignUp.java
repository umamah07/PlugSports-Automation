package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class Fan_SignUp {
	
private AppiumDriver appiumDriver;
		
	private By fanradiobtnByXpath = AppiumBy.xpath("(//android.view.ViewGroup)[31]");
	private By nextbtnByXpath = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Next\"]");
	
//  "Tell us about you" screen	
	private By firstname = AppiumBy.xpath("(//android.widget.EditText)[@text=\"First Name\"]");
	private By lastname = AppiumBy.xpath("(//android.widget.EditText)[@text=\"Last Name\"]");
	private By whatisyourfavoritesport = AppiumBy.xpath("(//android.widget.TextView)[@text=\"What is your favorite Sport\"]");
	//baseball
	private By favoritesportvalue = AppiumBy.xpath("(//android.widget.TextView)[1]");
	
// 	"Where are you located?" screen
	private By zipcodefield = AppiumBy.xpath("(//android.widget.EditText)[@text=\"00000\"]");
	private By cityfield = AppiumBy.xpath("(//android.widget.TextView)[5]");
	private By statefield = AppiumBy.xpath("(//android.widget.TextView)[7]");
	private By whereareyoulocated_nextbtn = AppiumBy.xpath("(//android.widget.TextView)[8]");

//  "Review your account" screen
	private By review_firstname_field = AppiumBy.xpath("(//android.widget.TextView)[5]");	
	private By review_lastname_field = AppiumBy.xpath("(//android.widget.TextView)[6]");
	private By review_sport_field = AppiumBy.xpath("(//android.widget.TextView)[8]");
	
	private By review_city_value = AppiumBy.xpath("(//android.widget.TextView)[12]");
	private By review_zipcode_value = AppiumBy.xpath("(//android.widget.TextView)[14]");
	private By review_state_value = AppiumBy.xpath("(//android.widget.TextView)[16]");
	
	private By continuebtn = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Continue\"]");
	
	
	
	public Fan_SignUp (AppiumDriver appiumDriver)
	{
		this.appiumDriver = appiumDriver;
	}
	
	
	public AppiumDriver getAppiumDriver()
	{
		return appiumDriver;
	}
	
	public WebElement getfanradiobtn()
	{
		return appiumDriver.findElement(fanradiobtnByXpath);	
		
	}

	public WebElement getnextbtn()
	{
		return appiumDriver.findElement(nextbtnByXpath);	
		
	}
	
	public WebElement getfirstname()
	{
		return appiumDriver.findElement(firstname);	
		
	}
	
	public WebElement getlasttname()
	{
		return appiumDriver.findElement(lastname);	
		
	}
	
	public WebElement getwhatisyourfavoritesport()
	{
		return appiumDriver.findElement(whatisyourfavoritesport);	
		
	}
	
	public WebElement getfavoritesportvalue()
	{
		return appiumDriver.findElement(favoritesportvalue);	
		
	}	
	
	public WebElement getwhereareyoulocated_nextbtn()
	{
		return appiumDriver.findElement(whereareyoulocated_nextbtn);	
		
	}

	public WebElement getzipcodefield()
	{
		return appiumDriver.findElement(zipcodefield);	
		
	}
	
	public WebElement getcityfield()
	{
		return appiumDriver.findElement(cityfield);	
		
	}
	
	public WebElement getstatefield()
	{
		return appiumDriver.findElement(statefield);	
		
	}
	
	public WebElement getreview_firstname_field()
	{
		return appiumDriver.findElement(review_firstname_field);	
		
	}
	
	public WebElement getreview_lastname_field()
	{
		return appiumDriver.findElement(review_lastname_field);	
		
	}
	
	public WebElement getreview_sport_field()
	{
		return appiumDriver.findElement(review_sport_field);	
		
	}
	
	public WebElement getreview_city_value()
	{
		return appiumDriver.findElement(review_city_value);	
		
	}
	
	public WebElement getreview_zipcode_value()
	{
		return appiumDriver.findElement(review_zipcode_value);	
		
	}
	
	public WebElement getreview_state_value()
	{
		return appiumDriver.findElement(review_state_value);	
		
	}
	
	public WebElement getcontinuebtn()
	{
		return appiumDriver.findElement(continuebtn);	
		
	}


}
