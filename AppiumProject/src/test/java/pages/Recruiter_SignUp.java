package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class Recruiter_SignUp {
	
	private AppiumDriver appiumDriver;
	
	private By recruiterradiobtnByXpath = AppiumBy.xpath("(//android.view.ViewGroup)[29]");
	private By nextbtnByXpath = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Next\"]");
	
//  "Tell Us about you" screen
	private By firstname = AppiumBy.xpath("(//android.widget.EditText)[@text=\"First Name\"]");
	private By lastname = AppiumBy.xpath("(//android.widget.EditText)[@text=\"Last Name\"]");
	private By nickname = AppiumBy.xpath("(//android.widget.EditText)[@text=\"Nickname (e.g. Coach Smith)\"]");
	
// 	"Where are you located?" screen
	private By zipcodefield = AppiumBy.xpath("(//android.widget.EditText)[@text=\"00000\"]");
	private By cityfield = AppiumBy.xpath("(//android.widget.TextView)[5]");
	private By statefield = AppiumBy.xpath("(//android.widget.TextView)[7]");

// 	"Tell Us about your organization" screen
	private By organizationname = AppiumBy.xpath("(//android.widget.EditText)[@text=\"Organization Name\"]");
	private By division = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Division\"]");
	// division value = Highschool
	private By divisionvalue = AppiumBy.xpath("(//android.widget.TextView)[2]");
	
	private By title = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Title\"]");
	// title value = Head Coach
	private By titlevalue = AppiumBy.xpath("(//android.widget.TextView)[1]");
	
	private By employeetenure = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Employee Tenure\"]");
	// employee tenure value = 0-3 Years
	private By employeetenurevalue = AppiumBy.xpath("(//android.widget.TextView)[1]");

// 	"What do you recruit?" screen	
	private By headingfield3 = AppiumBy.xpath("(//android.widget.TextView)[@text=\"What do you recruit?\"]");
	private By sportfield = AppiumBy.xpath("(//android.widget.TextView)[3]");
	//baseball
	private By sportvalue = AppiumBy.xpath("(//android.widget.TextView)[1]");
	
	private By genderfield = AppiumBy.xpath("(//android.widget.TextView)[7]");
	// gender value = Men's
	private By gendervalue = AppiumBy.xpath("(//android.widget.TextView)[1]");

//  "Review your account" screen
	private By review_firstname_value = AppiumBy.xpath("(//android.widget.TextView)[5]");	
	private By review_lastname_value = AppiumBy.xpath("(//android.widget.TextView)[6]");
	private By review_nickname_value = AppiumBy.xpath("(//android.widget.TextView)[7]");
	
	private By review_city_value = AppiumBy.xpath("(//android.widget.TextView)[11]");
	private By review_zipcode_value = AppiumBy.xpath("(//android.widget.TextView)[13]");
	private By review_state_value = AppiumBy.xpath("(//android.widget.TextView)[2]");
	
	private By review_organizationname_value = AppiumBy.xpath("(//android.widget.TextView)[5]");
	private By review_roledivision_value = AppiumBy.xpath("(//android.widget.TextView)[7]");
	private By review_title_value = AppiumBy.xpath("(//android.widget.TextView)[9]");
	private By review_employeetenure_value = AppiumBy.xpath("(//android.widget.TextView)[11]");
	
	private By review_sport_value = AppiumBy.xpath("(//android.widget.TextView)[15]");
	private By review_recruitingdivision_value = AppiumBy.xpath("(//android.widget.TextView)[17]");
	private By review_gender_value = AppiumBy.xpath("(//android.widget.TextView)[19]");
	
	private By continuebtn = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Continue\"]");
	
	
	
	
	public Recruiter_SignUp (AppiumDriver appiumDriver)
	{
		this.appiumDriver = appiumDriver;
	}
	
	
	public AppiumDriver getAppiumDriver()
	{
		return appiumDriver;
	}
	
	public WebElement getrecruiteradiobtn()
	{
		return appiumDriver.findElement(recruiterradiobtnByXpath);	
		
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
	
	public WebElement getnickname()
	{
		return appiumDriver.findElement(nickname);	
		
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
	
	public WebElement getorganizationname()
	{
		return appiumDriver.findElement(organizationname);	
		
	}
	
	public WebElement getdivision()
	{
		return appiumDriver.findElement(division);	
		
	}
	
	public WebElement getdivisionvalue()
	{
		return appiumDriver.findElement(divisionvalue);	
		
	}
	
	public WebElement gettitle()
	{
		return appiumDriver.findElement(title);	
		
	}
	
	public WebElement gettitlevalue()
	{
		return appiumDriver.findElement(titlevalue);	
		
	}
	
	public WebElement getemployeetenure()
	{
		return appiumDriver.findElement(employeetenure);	
		
	}
	
	public WebElement getemployeetenurevalue()
	{
		return appiumDriver.findElement(employeetenurevalue);	
		
	}
	
	public WebElement getheadingfield3()
	{
		return appiumDriver.findElement(headingfield3);	
		
	}
	
	public WebElement getsportfield()
	{
		return appiumDriver.findElement(sportfield);	
		
	}

	public WebElement getsportvalue()
	{
		return appiumDriver.findElement(sportvalue);	
		
	}
	
	public WebElement getgenderfield()
	{
		return appiumDriver.findElement(genderfield);	
		
	}

	public WebElement getgendervalue()
	{
		return appiumDriver.findElement(gendervalue);	
		
	}
	
	public WebElement getreview_firstname_value()
	{
		return appiumDriver.findElement(review_firstname_value);	
		
	}
	
	public WebElement getreview_lastname_value()
	{
		return appiumDriver.findElement(review_lastname_value);	
		
	}
	
	public WebElement getreview_nickname_value()
	{
		return appiumDriver.findElement(review_nickname_value);	
		
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
	
	public WebElement getreview_organizationname_value()
	{
		return appiumDriver.findElement(review_organizationname_value);	
		
	}
	
	public WebElement getreview_roledivision_value()
	{
		return appiumDriver.findElement(review_roledivision_value);	
		
	}
	
	public WebElement getreview_title_value()
	{
		return appiumDriver.findElement(review_title_value);	
		
	}
	
	public WebElement getreview_employeetenure_value()
	{
		return appiumDriver.findElement(review_employeetenure_value);	
		
	}
	
	public WebElement getreview_sport_value()
	{
		return appiumDriver.findElement(review_sport_value);	
		
	}
	
	public WebElement getreview_recruitingdivision_value()
	{
		return appiumDriver.findElement(review_recruitingdivision_value);	
		
	}
	
	public WebElement getreview_gender_value()
	{
		return appiumDriver.findElement(review_gender_value);	
		
	}
	
	public WebElement getcontinuebtn()
	{
		return appiumDriver.findElement(continuebtn);	
		
	}


}
