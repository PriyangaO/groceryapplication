package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNews;
import pages.SubCategory;

public class ManageNewsTest extends BaseClass {
  @Test
  public void verifyToAddNews()
  {
  
	    LoginPage login= new LoginPage(driver);
		login.enterUserNameOnUserName("admin");
		login.enterPasswordOnPasswordField("admin");
		login.clickOnLoginButton();
		HomePage home= new HomePage(driver);
        home.clickOnManageNews();
        ManageNews news=new ManageNews (driver);
        news.clickOnNew();
        news.clickOnTextArea();
        news.clickOnSave();
        boolean isalertpresent=news.isAlertShown();
	  	Assert.assertTrue(isalertpresent,"ManageNews not created succesfully");
  
  }
  @Test
  public void verifyEditNews()
{
	LoginPage login= new LoginPage(driver);
    login.enterUserNameOnUserName("admin");
    login.enterPasswordOnPasswordField("admin");
    login.clickOnLoginButton();
    HomePage home= new HomePage(driver);
    home.clickOnManageNews();
    ManageNews news=new ManageNews (driver);
    news.clickOnEdit();
    news.clickOnUpdateNews();
    news.clickOnUpddate();
    boolean isalertpresent=news.isAlertShown();
  	Assert.assertTrue(isalertpresent,"ManageNews not edited succesfully");
}
  @Test
  
  public void verifyTheNewsDelete()
  {
	    LoginPage login= new LoginPage(driver);
	    login.enterUserNameOnUserName("admin");
	    login.enterPasswordOnPasswordField("admin");
	    login.clickOnLoginButton();
	    HomePage home= new HomePage(driver);
	    home.clickOnManageNews();
	    ManageNews news=new ManageNews (driver);
	    news.clickOnDelete();
	    driver.switchTo().alert().accept();
	    boolean isalertdeletepresent= news.isAlertDeleteShown();
	  	Assert.assertTrue(isalertdeletepresent,"ManageNews not deleted succesfully");
  
  }
   
}
  
  
  
  
  

