package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	AppiumDriver driver;
	
//	Xpath for sign up = (//android.widget.TextView)[4]
//	Xpath for email field under create account screen = (//android.widget.EditText)[1] 
//	Xpath for password field under create account screen = (//android.widget.EditText)[2] 
//	Xpath for create account button = (//android.widget.TextView)[2]
//	Xpath for create an account button under confirm account screen = (//android.widget.TextView)[6]
//	Xpath for email field under login screen = (//android.widget.EditText)[1] 
//	Xpath for password field under login screen = (//android.widget.EditText)[2]	
//	Xpath for login button = (//android.widget.TextView)[2]
//	Xpath for athlete radio button = (//android.view.ViewGroup)[27]
//  Xpath for recruiter radio button = (//android.view.ViewGroup)[29]
//  Xpath for fan radio button = (//android.view.ViewGroup)[31]	
//	Xpath for next button under "Which One Describes You" screen = (//android.widget.TextView)[7]
//	Xpath for First name field under "tell us about yourself" screen = (//android.widget.EditText)[1]
//	Xpath for Last name field under "tell us about yourself" screen = (//android.widget.EditText)[2]
//	Xpath for Gender field under "tell us about yourself" screen = (//android.widget.TextView)[@text="Gender"]	
//	Xpath for Gender Dropdown option (male) = (//android.widget.TextView)[1]
//	Xpath for Gender Dropdown option (female) = (//android.widget.TextView)[2]
//	Xpath for Date of birth under "tell us about yourself" screen = (//android.widget.TextView)[@text="Date of Birth"]	
//	Xpath for "OK" button under Calendar = (//android.widget.Button)[2]
//	Xpath for "Cancel" button under Calendar = (//android.widget.Button)[1]
//	Xpath for Race/Ethnicity field under "tell us about yourself" screen = (//android.widget.TextView)[@text="Race/Ethnicity"]
//	Xpath for Race/Ethnicity Dropdown option (Asian) = (//android.widget.CheckedTextView)[2]
//	Xpath for height field under "tell us about yourself" screen = (//android.widget.TextView)[@text="Height"]
//	Xpath for height value = (4'3'') = (//android.widget.TextView)[4]
//	Xpath for Weight field under "tell us about yourself" screen = (//android.widget.TextView)[@text="Weight"]
//	Xpath for weight value = (73 lbs) = (//android.widget.TextView)[4]
//	Xpath for High School Grad Year field under "tell us about yourself" screen = (//android.widget.TextView)[@text="High School Grad Year"]
//	Xpath for High School Grad Year value --> (2023) = (//android.widget.TextView)[@text="2023"]
//	Xpath for GPA under "tell us about yourself" screen = (//android.widget.TextView)[@text="GPA"]
//	Xpath for GPA value --> (1.4) = (//android.widget.TextView)[@text="1.4"]
//	Xpath for Next Button under "tell us about yourself" screen = (//android.widget.TextView)[@text="Next"]
//	Xpath for Zip Code field under "Where are you located?" screen = (//android.widget.EditText)[@text="00000"]	
//	Xpath for Next Button under "Where are you located?" screen = (//android.widget.TextView)[@text="Next"]
//	Xpath for Sport field under "Where do you play?" screen = (//android.widget.TextView)[@text="Sport"]
//	Xpath for Sport value --> (Baseball) = (//android.widget.TextView)[@text="Baseball"]	
//	Xpath for Position field under "Where do you play?" screen = (//android.widget.TextView)[@text="Position"]
//	Xpath for Position value --> (Center Field) = (//android.widget.TextView)[@text="Center Field"]		
//	Xpath for Division field under "Where do you play?" screen = (//android.widget.TextView)[@text="Division"]
//	Xpath for Division value --> (Highschool) = (//android.widget.TextView)[@text="Highschool"]		
//	Xpath for Next Button under "Where do you play?" screen = (//android.widget.TextView)[@text="Next"]
//	Xpath for Continue Button under "Review Your Account" screen = (//android.widget.TextView)[@text="Continue"]
	
	
	@BeforeTest
	public void setup()
	{
		try{
		DesiredCapabilities caps = new DesiredCapabilities();
		
		String platform = "android";
		if (platform.equalsIgnoreCase("android"))
		{		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android SDK built for arm64");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
	//	caps.setCapability(MobileCapabilityType.APP, "");
		
		caps.setCapability("appPackage","com.plugsports.plug");
		caps.setCapability("appActivity","com.plugsports.plug.MainActivity");
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("noReset","true");
		}
		else if (platform.equalsIgnoreCase("ios"))
		{
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		}
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, caps);
		
		}
		catch(Exception exp)
		{
			System.out.println("Cause is "+ exp.getCause());
			System.out.println("Message is "+ exp.getMessage());
			exp.printStackTrace();				
		}
		
	}
	
	
	@AfterSuite
	public void teardown()
	{
		
	}

}
