package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import pages.AdminUser;
import pages.HomePage;
import pages.LoginPage;


public class AdminUserTest extends BaseClass{
	LoginPage login; 
  @Test
  public void verifingToAddUser()
  {
	    login= new LoginPage(driver);
		login.enterUserNameOnUserName("admin");
		login.enterPasswordOnPasswordField("admin");
		login.clickOnLoginButton();
		HomePage home= new HomePage(driver);
		home.clickOnAdminUsers();
	    AdminUser user=new AdminUser(driver);
		user.clickOnNew();
		user.clickOnUserName();
		user.clickOnPassword();
		user.clickOnUserType();
		user.clickOnCreate();
		boolean isalertpresent= user.isAlertShown();
	  	Assert.assertTrue(isalertpresent,"AdminUser not created succussfully");
	  
	  
  }

@Test

public void verifyToEditUsers()
{
	login= new LoginPage(driver);
	login.enterUserNameOnUserName("admin");
  login.enterPasswordOnPasswordField("admin");
	login.clickOnLoginButton();
	HomePage home= new HomePage(driver);
	home.clickOnAdminUsers();
    AdminUser user=new AdminUser(driver);
    user.clickOnEdit();
    user.clickOnUpdate();
    boolean isalertpresent= user.isAlertShown();
  	Assert.assertTrue(isalertpresent,"Adminuser not updated succussfully");
	
	
}

@Test

public void verifyToDeleteUsers()
{
	login= new LoginPage(driver);
	login.enterUserNameOnUserName("admin");
    login.enterPasswordOnPasswordField("admin");
	login.clickOnLoginButton();
	HomePage home= new HomePage(driver);
	home.clickOnAdminUsers();
	AdminUser user=new AdminUser(driver);
    user.clickOnDelete();
    driver.switchTo().alert().accept();
    boolean isalertpresent= user.isAlertShown();
  	Assert.assertTrue(isalertpresent,"Adminuser  not deleted succussfully");
}
@Test
public void verifyAdminUserSearch()

{
	login= new LoginPage(driver);
	login.enterUserNameOnUserName("admin");
    login.enterPasswordOnPasswordField("admin");
	login.clickOnLoginButton();
	HomePage home= new HomePage(driver);
	home.clickOnAdminUsers();
	AdminUser user=new AdminUser(driver);
    user.clickOnSearch();
    user.clickOnUserField();
    user.clickOnUserSearch();
    boolean isalertpresent= user.isSearchShown();
  	Assert.assertTrue(isalertpresent,"Adminuser not search succussfully");
	
	
}




}


