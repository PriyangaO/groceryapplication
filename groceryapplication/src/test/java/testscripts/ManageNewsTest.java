package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNews;
import pages.SubCategory;

public class ManageNewsTest extends BaseClass {
 
	LoginPage login; 
	HomePage home;
	ManageNews news;
	
	
	  @Test
      public void verifyToAddNews()
  {
  
	    LoginPage login= new LoginPage(driver);
home=login.enterUserNameOnUserName("admin").enterUserNameOnUserName("admin")
     .clickOnLoginButton();
		
		HomePage home= new HomePage(driver);
 news= home.clickOnManageNews().clickOnNew().clickOnTextArea().clickOnSave();
        ManageNews news=new ManageNews (driver);
        
        boolean isalertpresent=news.isAlertShown();
	  	Assert.assertTrue(isalertpresent,Constants.ip_verifyToAddNews);
  
  }
  @Test
  public void verifyEditNews()
{
	LoginPage login= new LoginPage(driver);
 home=login.enterUserNameOnUserName("admin").enterPasswordOnPasswordField("admin").clickOnLoginButton();
    
    HomePage home= new HomePage(driver);
    home.clickOnManageNews();
    ManageNews news=new ManageNews (driver);
   news=  news.clickOnEdit().clickOnUpdateNews().clickOnUpddate();
    
    boolean isalertpresent=news.isAlertShown();
  	Assert.assertTrue(isalertpresent,Constants.ip_verifyEditNews);
}
  @Test
  
  public void verifyTheNewsDelete()
  {
	    LoginPage login= new LoginPage(driver);
	 home= login.enterUserNameOnUserName("admin").enterPasswordOnPasswordField("admin").clickOnLoginButton();
	    
	    HomePage home= new HomePage(driver);
	news= home.clickOnManageNews().clickOnDelete();
	    ManageNews news=new ManageNews (driver);
	   
	    driver.switchTo().alert().accept();
	    boolean isalertdeletepresent= news.isAlertDeleteShown();
	  	Assert.assertTrue(isalertdeletepresent,Constants.ip_verifyTheNewsDelete);
  
  }
   
}
  
  
  
  
  

