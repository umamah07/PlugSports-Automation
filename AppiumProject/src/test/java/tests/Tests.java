package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import pages.CreateAccount;
import pages.GetStartedPage;
import pages.SignUp;

public class Tests extends BaseClass {
	
	
	@Test (priority = 1)
	public void firsttestcase() throws InterruptedException
	{
		System.out.println("App started");
		
		Thread.sleep(5000);
		
		GetStartedPage gs = new GetStartedPage(driver);
		gs.getstartedbtn().click();
		
		CreateAccount createaccount = new CreateAccount(driver);
		Thread.sleep(5000);
		createaccount.getemailfield().sendKeys("hamza+112@geeksofkolachi.com");
		createaccount.getpasswordfield().sendKeys("Hamza@123");
		
		Thread.sleep(3000);
		
		createaccount.getcreateaccountbtn().click();
		
		Thread.sleep(30000);
		
      //Clicking on create account button under "Confirm Account" screen	
		createaccount.getcreateaccountbtn().click();
		
		Thread.sleep(20000);
		
		SignUp signup = new SignUp(driver);
	  //Checking next button status when no option is selected	
		Boolean nextbutton_status1= signup.getnextbtn().isEnabled();
		String actual_result1 = String.valueOf(nextbutton_status1);
		
	    String  expected_result1= "false";
		
		Assert.assertEquals(actual_result1, expected_result1);
		
		signup.getathleteradiobtn().click();
		Thread.sleep(3000);
      //Checking next button status when athlete option is selected
		Boolean nextbutton_status2= signup.getnextbtn().isEnabled();
		String actual_result2 = String.valueOf(nextbutton_status2);
		
		String  expected_result2= "true";

		Assert.assertEquals(actual_result2, expected_result2);
		
		signup.getnextbtn().click();		
		
	}
	
	@Test (priority = 2)
	public void secondtestcase() throws InterruptedException
	{
		Thread.sleep(20000);
		SignUp signup = new SignUp(driver);
		
	  //Checking next button status when no fields are filled under "Tell Us about you" screen.	
		Boolean nextbutton_status1= signup.getnextbtn().isEnabled();
		String actual_result1 = String.valueOf(nextbutton_status1);
		
	    String  expected_result1= "false";
		
		Assert.assertEquals(actual_result1, expected_result1);
		
		signup.getfirstname().sendKeys("dummy");
		Thread.sleep(2000);
		signup.getlasttname().sendKeys("user");
		Thread.sleep(2000);
		signup.getgenderfield().click();
		Thread.sleep(3000);
	  //Selecting male option from gender drop down
		signup.getgendermaleoption().click();
		Thread.sleep(3000);
		
		signup.getDOBfield().click();
		Thread.sleep(3000);
	  //Selecting OK option under calendar
		signup.getDOB_OK_option().click();
		Thread.sleep(3000);
		
		signup.getRace_Ethnicityfield().click();
		Thread.sleep(3000);
	  //Selecting "Asian' option from race drop down
		signup.getRaceoption().click();
		Thread.sleep(3000);
		
		signup.getheight_field().click();
		Thread.sleep(3000);
	  //Selecting (4'3'') from height drop down
		signup.getheight_option().click();
		Thread.sleep(3000);
	  //Scrolling down till the bottom
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
	    Thread.sleep(3000);
		
		signup.getweightfield().click();
		Thread.sleep(3000);
	  //Selecting 73 lbs from weight drop down
	    signup.getweightoption().click();
	    Thread.sleep(3000);
        
        signup.gethighschoolgradyear().click();
        Thread.sleep(3000);
  	  //Selecting 2023 option from year drop down
  	    signup.gethighschoolgradyear_option().click();
  	    Thread.sleep(3000);
  	    
  	    signup.getGPA().click();
  	    Thread.sleep(3000);
  	  //Selecting 1.4 option from GPA drop down
  	    signup.getGPA_value().click();
  	    Thread.sleep(3000);
		
  	  //Checking next button status when all fields are filled under "Tell Us about you" screen.	
  		Boolean nextbutton_status2= signup.getnextbtn().isEnabled();
  		String actual_result2 = String.valueOf(nextbutton_status2);
  			
  		String  expected_result2= "true";

  		Assert.assertEquals(actual_result2, expected_result2);
  		
  		signup.getnextbtn().click();	
		
	}
	
	@Test (priority = 3)
	public void thirddtestcase() throws InterruptedException
	{
		Thread.sleep(20000);
		SignUp signup = new SignUp(driver);
		
	  //Checking next button status when zip code field is not selected under "Where are you located?" screen.	
		Boolean nextbutton_status1= signup.getnextbtn().isEnabled();
		String actual_result1 = String.valueOf(nextbutton_status1);
		
	    String  expected_result1= "false";
		
		Assert.assertEquals(actual_result1, expected_result1);
		
	  //Checking city name = Phoenix after entering zip code value as "85001"
		signup.getzipcodefield().sendKeys("85001");
		Thread.sleep(5000);
		
		String actual_result2 = signup.getcityfield().getText();
		String  expected_result2= "Phoenix";
		
		Assert.assertEquals(actual_result2, expected_result2);
		
	  //Checking state name = Arizona after entering zip code value as "85001"
		String actual_result3 = signup.getstatefield().getText();
		String  expected_result3= "Arizona";
		
		Assert.assertEquals(actual_result3, expected_result3);
		
	  //Checking next button status when zip code field is filled under "Where are you located?" screen.	
  		Boolean nextbutton_status2= signup.getnextbtn().isEnabled();
  		String actual_result4 = String.valueOf(nextbutton_status2);
  			
  		String  expected_result4= "true";

  		Assert.assertEquals(actual_result4, expected_result4);
  		
  		signup.getnextbtn().click();	
		
		
	}
	
	@Test (priority = 4)
	public void fourthtestcase() throws InterruptedException
	{
		Thread.sleep(20000);
		SignUp signup = new SignUp(driver);
		
	  //Checking next button status when all fields are empty under "What do you play?" screen.	
/*	Boolean nextbutton_status1= signup.getnextbtn().isEnabled();
		String actual_result1 = String.valueOf(nextbutton_status1);
		
	    String  expected_result1= "false";
		
		Assert.assertEquals(actual_result1, expected_result1);
*/		
		signup.getsportfield().click();
		Thread.sleep(3000);
	  //Selecting sports value = Baseball
		signup.getsportvalue().click();
		Thread.sleep(3000);
		
		signup.getpositionfield().click();
		Thread.sleep(3000);
	  //Selecting sports position = Center Field
		signup.getpositionvalue().click();
		Thread.sleep(3000);
		
		signup.getdivisionfield().click();
		Thread.sleep(3000);
	  //Selecting division value = Highschool
		signup.getdivisionvalue().click();
		Thread.sleep(3000);
		
	  //Checking next button status when all fields are filled under "What do you play?" screen.	
  		Boolean nextbutton_status2= signup.getnextbtn().isEnabled();
  		String actual_result2 = String.valueOf(nextbutton_status2);
  			
  		String  expected_result2= "true";

  		Assert.assertEquals(actual_result2, expected_result2);
  		
  		signup.getnextbtn().click();	
		
	}
	
	@Test (priority = 5)
	public void fifthtestcase() throws InterruptedException
	{
		Thread.sleep(20000);
		SignUp signup = new SignUp(driver);
		
		String actual_result1 = signup.getreview_firstname_field().getText();
		Thread.sleep(2000);
		String  expected_result1= "dummy";
		
		Assert.assertEquals(actual_result1, expected_result1);
		
		String actual_result2 = signup.getreview_lastname_field().getText();
		Thread.sleep(2000);
		String  expected_result2= "user";
		
		Assert.assertEquals(actual_result2, expected_result2);
		
		String actual_result3 = signup.getreview_gender_field().getText();
		Thread.sleep(2000);
		String  expected_result3= "Male";
		
		Assert.assertEquals(actual_result3, expected_result3);
		
		String actual_result4 = signup.getreview_DOB_field().getText();
		Thread.sleep(2000);
		String  expected_result4= "03/27/10";
		
		Assert.assertEquals(actual_result4, expected_result4);
		
		String actual_result5 = signup.getreview_race_field().getText();
		Thread.sleep(2000);
		String  expected_result5= "Asian";
		
		Assert.assertEquals(actual_result5, expected_result5);
		
		String actual_result6 = signup.getreview_height_field().getText();
		Thread.sleep(2000);
		String  expected_result6= "4'3\"";
		
		Assert.assertEquals(actual_result6, expected_result6);
	/*	
//		Scrolling until "Weight" text gets displayed
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Weight\"))"));
	    Thread.sleep(3000);
		
		String actual_result7 = signup.getreview_weight_field().getText();
		Thread.sleep(2000);
		String  expected_result7= "73 lbs";
		
		Assert.assertEquals(actual_result7, expected_result7);
		
	*/
		
	//	Scrolling till the bottom
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
		Thread.sleep(3000);
		
		String actual_result8 = signup.getreview_highschoolgradyear_field().getText();
		Thread.sleep(2000);
		String  expected_result8= "2023";
		
		Assert.assertEquals(actual_result8, expected_result8);
		
		String actual_result9 = signup.getreview_GPA_field().getText();
		Thread.sleep(2000);
		String  expected_result9= "1.4";
		
		Assert.assertEquals(actual_result9, expected_result9);
		
		String actual_result10 = signup.getreview_city_field().getText();
		Thread.sleep(2000);
		String  expected_result10= "Phoenix";
		
		Assert.assertEquals(actual_result10, expected_result10);
		
		String actual_result11 = signup.getreview_zipcode_field().getText();
		Thread.sleep(2000);
		String  expected_result11= "85001";
		
		Assert.assertEquals(actual_result11, expected_result11);

		
		String actual_result12 = signup.getreview_state_field().getText();
		Thread.sleep(2000);
		String  expected_result12= "Arizona";
		
		Assert.assertEquals(actual_result12, expected_result12);
		
		
		String actual_result13 = signup.getreview_sport_field().getText();
		Thread.sleep(2000);
		String  expected_result13= "Baseball";
		
		Assert.assertEquals(actual_result13, expected_result13);
		
		String actual_result14 = signup.getreview_position_field().getText();
		Thread.sleep(2000);
		String  expected_result14= "Center Field";
		
		Assert.assertEquals(actual_result14, expected_result14);
		
	//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
	//	Thread.sleep(3000);
		
		String actual_result15 = signup.getreview_division_field().getText();
		Thread.sleep(2000);
		String  expected_result15= "Highschool";
		
		Assert.assertEquals(actual_result15, expected_result15);
		
		signup.getcontinuebtn().click();
		Thread.sleep(2000);

		
		
		
		
	}
	

}
