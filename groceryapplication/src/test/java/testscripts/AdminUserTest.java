package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import pages.AdminUser;
import pages.HomePage;
import pages.LoginPage;


public class AdminUserTest extends BaseClass{
	LoginPage login; 
	HomePage home;
	AdminUser adminn;
  @Test
  public void verifingToAddUser()
  {
	    login= new LoginPage(driver);
	home=	login.enterUserNameOnUserName("admin")
			.enterPasswordOnPasswordField("admin").clickOnLoginButton();
		
		
    adminn=	home.clickOnAdminUsers().clickOnNew()
.clickOnUserName().clickOnPassword().clickOnUserType().clickOnCreate();
	    AdminUser user=new AdminUser(driver);
		
		boolean isalertpresent= user.isAlertShown();
	  	Assert.assertTrue(isalertpresent,"AdminUser not created succussfully");
	  
	  
  }

@Test

public void verifyToEditUsers()
{
	login= new LoginPage(driver);
home=	login.enterUserNameOnUserName("admin").enterPasswordOnPasswordField("admin").clickOnLoginButton();
     

 adminn=	home.clickOnAdminUsers().clickOnEdit().clickOnUpdate();
    AdminUser user=new AdminUser(driver);
    
    boolean isalertpresent= user.isAlertShown();
  	Assert.assertTrue(isalertpresent,"Adminuser not updated succussfully");
	
	
}

@Test

public void verifyToDeleteUsers()
{
	login= new LoginPage(driver);
	
home=login.enterUserNameOnUserName("admin").enterPasswordOnPasswordField("admin").clickOnLoginButton();
    
	HomePage home= new HomePage(driver);
adminn=	home.clickOnAdminUsers().clickOnDelete();
	AdminUser user=new AdminUser(driver);
  
    driver.switchTo().alert().accept();
    boolean isalertpresent= user.isAlertShown();
  	Assert.assertTrue(isalertpresent,"Adminuser  not deleted succussfully");
}
@Test
public void verifyAdminUserSearch()

{
	login= new LoginPage(driver);
home=login.enterUserNameOnUserName("admin").enterPasswordOnPasswordField("admin").clickOnLoginButton();
    
	HomePage home= new HomePage(driver);
adminn=	home.clickOnAdminUsers().clickOnSearch().clickOnUserField().clickOnSearch();
	AdminUser user=new AdminUser(driver);
    
    boolean isalertpresent= user.isSearchShown();
  	Assert.assertTrue(isalertpresent,"Adminuser not search succussfully");
	
	
}




}


