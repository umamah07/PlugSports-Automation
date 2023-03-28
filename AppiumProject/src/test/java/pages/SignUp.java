package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SignUp {
	
private AppiumDriver appiumDriver;
	
	private By athleteradiobtnByXpath = AppiumBy.xpath("(//android.view.ViewGroup)[27]");
	private By recruiterradiobtnByXpath = AppiumBy.xpath("(//android.view.ViewGroup)[29]");
	private By fanradiobtnByXpath = AppiumBy.xpath("(//android.view.ViewGroup)[31]");
	private By nextbtnByXpath = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Next\"]");
	private By firstname = AppiumBy.xpath("(//android.widget.EditText)[@text=\"First Name\"]");
	private By lastname = AppiumBy.xpath("(//android.widget.EditText)[@text=\"Last Name\"]");
	private By genderfield = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Gender\"]");
	private By gendermaleoption = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Male\"]");
	private By genderfemaleoption = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Female\"]");
	private By DOB_field = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Date of Birth\"]");
	private By DOB_OK_option = AppiumBy.xpath("(//android.widget.Button)[2]");
	private By DOB_Cancel_option = AppiumBy.xpath("(//android.widget.Button)[1]");
	private By Race_Ethnicityfield = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Race/Ethnicity\"]");
	//For race option = Asian
	private By Raceoption = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Asian\"]");
	private By height_field = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Height\"]");
	// For height option = 4'3''
	private By height_option = AppiumBy.xpath("(//android.widget.TextView)[4]");
	private By weightfield = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Weight\"]");
	// For weight option = 73 lbs
	private By weightoption = AppiumBy.xpath("(//android.widget.TextView)[@text=\"73 lbs\"]");
	private By highschoolgradyear = AppiumBy.xpath("(//android.widget.TextView)[@text=\"High School Grad Year\"]"); 
	private By highschoolgradyear_option = AppiumBy.xpath("(//android.widget.TextView)[@text=\"2023\"]");
	private By GPA  = AppiumBy.xpath("(//android.widget.TextView)[@text=\"GPA\"]");
	private By GPA_value = AppiumBy.xpath("(//android.widget.TextView)[@text=\"1.4\"]");
//	private By nextbtn = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Next\"]");

// 	"Where are you located?" screen
	private By zipcodefield = AppiumBy.xpath("(//android.widget.EditText)[@text=\"00000\"]");
	private By cityfield = AppiumBy.xpath("(//android.widget.TextView)[5]");
	private By statefield = AppiumBy.xpath("(//android.widget.TextView)[7]");

// 	"What do you play?" screen	
	private By headingfield3 = AppiumBy.xpath("(//android.widget.TextView)[@text=\"What do you play?\"]");
	private By sportfield = AppiumBy.xpath("(//android.widget.TextView)[3]");
	//baseball
	private By sportvalue = AppiumBy.xpath("(//android.widget.TextView)[1]");

	private By positionfield = AppiumBy.xpath("(//android.widget.TextView)[5]");
	// center field position
	private By positionvalue = AppiumBy.xpath("(//android.widget.TextView)[2]");
	
	private By divisionfield = AppiumBy.xpath("(//android.widget.TextView)[7]");
	// division value = Highschool
	private By divisionvalue = AppiumBy.xpath("(//android.widget.TextView)[2]");	
	
	//Review your account screen
	private By review_firstname_field = AppiumBy.xpath("(//android.widget.TextView)[5]");	
	private By review_lastname_field = AppiumBy.xpath("(//android.widget.TextView)[6]");
	private By review_gender_field = AppiumBy.xpath("(//android.widget.TextView)[8]");
	private By review_DOB_field = AppiumBy.xpath("(//android.widget.TextView)[10]");
	private By review_race_field = AppiumBy.xpath("(//android.widget.TextView)[12]");
	private By review_height_field = AppiumBy.xpath("(//android.widget.TextView)[14]");
	private By review_weight_field = AppiumBy.xpath("(//android.widget.TextView)[4]");
	private By review_highschoolgradyear_field = AppiumBy.xpath("(//android.widget.TextView)[2]");
	private By review_GPA_field = AppiumBy.xpath("(//android.widget.TextView)[4]");
	private By review_city_field = AppiumBy.xpath("(//android.widget.TextView)[8]");
	private By review_zipcode_field = AppiumBy.xpath("(//android.widget.TextView)[10]");
	private By review_state_field = AppiumBy.xpath("(//android.widget.TextView)[12]");
	private By review_sport_field = AppiumBy.xpath("(//android.widget.TextView)[16]");
	private By review_position_field = AppiumBy.xpath("(//android.widget.TextView)[18]");
	private By review_division_field = AppiumBy.xpath("(//android.widget.TextView)[20]");				
	private By continuebtn = AppiumBy.xpath("(//android.widget.TextView)[@text=\"Continue\"]");
	

	
	public SignUp (AppiumDriver appiumDriver)
	{
		this.appiumDriver = appiumDriver;
	}
	
	
	public AppiumDriver getAppiumDriver()
	{
		return appiumDriver;
	}
	
	public WebElement getathleteradiobtn()
	{
		return appiumDriver.findElement(athleteradiobtnByXpath);
		
	}
	
	public WebElement getrecruiteradiobtn()
	{
		return appiumDriver.findElement(recruiterradiobtnByXpath);	
		
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

	public WebElement getgenderfield()
	{
		return appiumDriver.findElement(genderfield);	
		
	}
	
	public WebElement getgendermaleoption()
	{
		return appiumDriver.findElement(gendermaleoption);	
		
	}
	
	public WebElement getgenderfemaleoption()
	{
		return appiumDriver.findElement(genderfemaleoption);	
		
	}
	
	public WebElement getDOBfield()
	{
		return appiumDriver.findElement(DOB_field);	
		
	}
	
	public WebElement getDOB_OK_option()
	{
		return appiumDriver.findElement(DOB_OK_option);	
		
	}
	
	public WebElement getDOB_Cancel_option()
	{
		return appiumDriver.findElement(DOB_Cancel_option);	
		
	}
	
	public WebElement getRace_Ethnicityfield()
	{
		return appiumDriver.findElement(Race_Ethnicityfield);	
		
	}
	
	public WebElement getRaceoption()
	{
		return appiumDriver.findElement(Raceoption);	
		
	}
	
	public WebElement getheight_field()
	{
		return appiumDriver.findElement(height_field);	
		
	}
	
	public WebElement getheight_option()
	{
		return appiumDriver.findElement(height_option);	
		
	}
	
	public WebElement getweightfield()
	{
		return appiumDriver.findElement(weightfield);	
		
	}
	
	public WebElement getweightoption()
	{
		return appiumDriver.findElement(weightoption);	
		
	}
	
	public WebElement gethighschoolgradyear()
	{
		return appiumDriver.findElement(highschoolgradyear);	
		
	}
	
	public WebElement gethighschoolgradyear_option()
	{
		return appiumDriver.findElement(highschoolgradyear_option);	
		
	}
	
	public WebElement getGPA()
	{
		return appiumDriver.findElement(GPA);	
		
	}
	
	public WebElement getGPA_value()
	{
		return appiumDriver.findElement(GPA_value);	
		
	}
	
	public WebElement getzipcodefield()
	{
		return appiumDriver.findElement(zipcodefield);	
		
	}
	
	public WebElement getsportfield()
	{
		return appiumDriver.findElement(sportfield);	
		
	}

	public WebElement getsportvalue()
	{
		return appiumDriver.findElement(sportvalue);	
		
	}
	
	public WebElement getpositionfield()
	{
		return appiumDriver.findElement(positionfield);	
		
	}
	
	public WebElement getpositionvalue()
	{
		return appiumDriver.findElement(positionvalue);	
		
	}
	
	public WebElement getdivisionfield()
	{
		return appiumDriver.findElement(divisionfield);	
		
	}
	
	public WebElement getdivisionvalue()
	{
		return appiumDriver.findElement(divisionvalue);	
		
	}

	public WebElement getcontinuebtn()
	{
		return appiumDriver.findElement(continuebtn);	
		
	}
	
	public WebElement getcityfield()
	{
		return appiumDriver.findElement(cityfield);	
		
	}
	
	public WebElement getstatefield()
	{
		return appiumDriver.findElement(statefield);	
		
	}
	
	public WebElement getheadingfield3()
	{
		return appiumDriver.findElement(headingfield3);	
		
	}
	
	public WebElement getreview_firstname_field()
	{
		return appiumDriver.findElement(review_firstname_field);	
		
	}
	
	public WebElement getreview_lastname_field()
	{
		return appiumDriver.findElement(review_lastname_field);	
		
	}
	
	public WebElement getreview_gender_field()
	{
		return appiumDriver.findElement(review_gender_field);	
		
	}
	
	public WebElement getreview_DOB_field()
	{
		return appiumDriver.findElement(review_DOB_field);	
		
	}
	
	public WebElement getreview_race_field()
	{
		return appiumDriver.findElement(review_race_field);	
		
	}
	
	public WebElement getreview_height_field()
	{
		return appiumDriver.findElement(review_height_field);	
		
	}
	
	public WebElement getreview_weight_field()
	{
		return appiumDriver.findElement(review_weight_field);	
		
	}

	public WebElement getreview_highschoolgradyear_field()
	{
		return appiumDriver.findElement(review_highschoolgradyear_field);	
		
	}
	
	public WebElement getreview_GPA_field()
	{
		return appiumDriver.findElement(review_GPA_field);	
		
	}
	
	public WebElement getreview_city_field()
	{
		return appiumDriver.findElement(review_city_field);	
		
	}
	
	
	public WebElement getreview_zipcode_field()
	{
		return appiumDriver.findElement(review_zipcode_field);	
		
	}
	
	public WebElement getreview_state_field()
	{
		return appiumDriver.findElement(review_state_field);	
		
	}
	
	public WebElement getreview_sport_field()
	{
		return appiumDriver.findElement(review_sport_field);	
		
	}
	
	public WebElement getreview_position_field()
	{
		return appiumDriver.findElement(review_position_field);	
		
	}
	
	public WebElement getreview_division_field()
	{
		return appiumDriver.findElement(review_division_field);	
		
	}
}
