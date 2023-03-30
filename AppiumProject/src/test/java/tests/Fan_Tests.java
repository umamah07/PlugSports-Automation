package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import pages.CreateAccount;
import pages.Fan_SignUp;
import pages.GetStartedPage;


public class Fan_Tests extends BaseClass {
	

	@Test (priority = 1)
	public void firsttestcase() throws InterruptedException
	{
		System.out.println("App started");
		
		Thread.sleep(5000);
		
		GetStartedPage gs = new GetStartedPage(driver);
		gs.getstartedbtn().click();
		
		CreateAccount createaccount = new CreateAccount(driver);
		Thread.sleep(5000);
		createaccount.getemailfield().sendKeys("hamza+126@geeksofkolachi.com");
		createaccount.getpasswordfield().sendKeys("Hamza@123");
		
		Thread.sleep(3000);
		
		createaccount.getcreateaccountbtn().click();
		
		Thread.sleep(30000);
		
      //Clicking on create account button under "Confirm Account" screen	
		createaccount.getcreateaccountbtn().click();
		
		Thread.sleep(20000);
		
		Fan_SignUp signup = new Fan_SignUp(driver);
	  //Checking next button status when no option is selected	
		Boolean nextbutton_status1= signup.getnextbtn().isEnabled();
		String actual_result1 = String.valueOf(nextbutton_status1);
		
	    String  expected_result1= "false";
		
		Assert.assertEquals(actual_result1, expected_result1);
		
		signup.getfanradiobtn().click();
		Thread.sleep(3000);
      //Checking next button status when recruiter option is selected
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
		Fan_SignUp signup = new Fan_SignUp(driver);
		
	  //Checking next button status when no fields are filled under "Tell Us about you" screen.	
		Boolean nextbutton_status1= signup.getnextbtn().isEnabled();
		String actual_result1 = String.valueOf(nextbutton_status1);
		
	    String  expected_result1= "false";
		
		Assert.assertEquals(actual_result1, expected_result1);
		
		signup.getfirstname().sendKeys("dummy");
		Thread.sleep(2000);
		signup.getlasttname().sendKeys("user");
		Thread.sleep(2000);
		signup.getwhatisyourfavoritesport().click();
		Thread.sleep(2000);
	//  Selecting favorite sport value = Baseball
		signup.getfavoritesportvalue().click();
		Thread.sleep(3000);
	
	//  Checking next button status when all fields are filled under "Tell Us about you" screen.	
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
		Fan_SignUp signup = new Fan_SignUp(driver);
		
	  //Checking next button status when zip code field is not selected under "Where are you located?" screen.	
		Boolean nextbutton_status1= signup.getwhereareyoulocated_nextbtn().isEnabled();
		String actual_result1 = String.valueOf(nextbutton_status1);
		
	    String  expected_result1= "false";
		
		Assert.assertEquals(actual_result1, expected_result1);
		
		signup.getzipcodefield().sendKeys("85001");
		Thread.sleep(5000);
		
	  //Checking city name = Phoenix after entering zip code value as "85001"
		String actual_result2 = signup.getcityfield().getText();
		String  expected_result2= "Phoenix";
		
		Assert.assertEquals(actual_result2, expected_result2);
		
	  //Checking state name = Arizona after entering zip code value as "85001"
		String actual_result3 = signup.getstatefield().getText();
		String  expected_result3= "Arizona";
		
		Assert.assertEquals(actual_result3, expected_result3);
		
	  //Checking next button status when zip code field is filled under "Where are you located?" screen.	
  		Boolean nextbutton_status2= signup.getwhereareyoulocated_nextbtn().isEnabled();
  		String actual_result4 = String.valueOf(nextbutton_status2);
  			
  		String  expected_result4= "true";

  		Assert.assertEquals(actual_result4, expected_result4);
  		
  		signup.getwhereareyoulocated_nextbtn().click();	
		
		
	}
	
	@Test (priority = 4)
	public void fourthtestcase() throws InterruptedException
	{
		Thread.sleep(20000);
		Fan_SignUp signup = new Fan_SignUp(driver);
		
		String actual_result1 = signup.getreview_firstname_field().getText();
		Thread.sleep(2000);
		String  expected_result1= "dummy";
		
		Assert.assertEquals(actual_result1, expected_result1);
		
		String actual_result2 = signup.getreview_lastname_field().getText();
		Thread.sleep(2000);
		String  expected_result2= "user";
		
		Assert.assertEquals(actual_result2, expected_result2);
		
		String actual_result3 = signup.getreview_sport_field().getText();
		Thread.sleep(2000);
		String  expected_result3= "Baseball";
		
		Assert.assertEquals(actual_result3, expected_result3);
		
		String actual_result4 = signup.getreview_city_value().getText();
		Thread.sleep(2000);
		String  expected_result4= "Phoenix";
		
		Assert.assertEquals(actual_result4, expected_result4);
		
		String actual_result5 = signup.getreview_zipcode_value().getText();
		Thread.sleep(2000);
		String  expected_result5= "85001";
		
		Assert.assertEquals(actual_result5, expected_result5);
		
//		Scrolling till the bottom
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
		Thread.sleep(3000);

		String actual_result6 = signup.getreview_state_value().getText();
		Thread.sleep(2000);
		String  expected_result6= "Arizona";
		
		Assert.assertEquals(actual_result6, expected_result6);
		
		signup.getcontinuebtn().click();
		Thread.sleep(2000);

		
	}
		
		

}
