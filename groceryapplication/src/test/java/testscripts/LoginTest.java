package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import automationcore.BaseClass;
import pages.LoginPage;
import constants.Constants;

public class LoginTest extends BaseClass{
  @Test
  public void verifyLoginWithValidCredentials () 
  {
	  LoginPage login = new LoginPage(driver); //contrctor call
	  String username="admin";
	  String password="admin";
	  login.enterUserNameOnUserName(username);   
	  login.enterPasswordOnPasswordField(password);
	  login.clickOnLoginButton();
	  boolean ishomepageloaded= login.isHomePageLoaded();
	  Assert.assertTrue(ishomepageloaded,Constants.ip_verifyloginwithvaliddata);
  }

@Test
  public void verifyLoginWithValidUserNameInvalidPassword()
  {
	  LoginPage login = new LoginPage(driver); //contrctor call
	  String username="admin";
	  String password="123";
	  login.enterUserNameOnUserName(username);   
	  login.enterPasswordOnPasswordField(password);
	  login.clickOnLoginButton();
	  boolean isalertpresent= login.isAlertShown();
	  Assert.assertTrue(isalertpresent,Constants.ip_verifyloginwithinvalidpassword);
	  
  }
  
@Test
public void verifyLoginWithInvalidUserNameValidPassword()
{
	LoginPage login = new LoginPage(driver); //contrctor call
	  String username="mn";
	  String password="admin";
	  login.enterUserNameOnUserName(username);   
	  login.enterPasswordOnPasswordField(password);
	  login.clickOnLoginButton();
	  boolean isalertpresent= login.isAlertShown();
	  Assert.assertTrue(isalertpresent,Constants.ip_verifyloginwithinvalidusername);
}
	
@Test(dataProvider="invaliduserpassword")
public void verifyLoginWithInValidUserNameInValidPassword( String username,String password)
{
	  LoginPage login = new LoginPage(driver); 	  
	  login.enterUserNameOnUserName(username);   
	  login.enterPasswordOnPasswordField(password);
	  login.clickOnLoginButton();
	  boolean isalertpresent= login.isAlertShown();
	  Assert.assertTrue(isalertpresent,Constants.ip_verifyloginwithinvaliddata);
}
	

@DataProvider(name="invaliduserpassword")
public Object[][] dPMethod()      
{
	return new Object[][] {{"priya","sai"}};
			
}	

@Test
public void verifyUsingValidCredentials() throws IOException
{
	  LoginPage login=new LoginPage(driver);//constructor call
	  login.loginUsingExcelData();
	  boolean ishomepageLoaded=login.isHomePageLoaded();
	  Assert.assertTrue(ishomepageLoaded,"login page is failed using valid credentials");
}



}
			
