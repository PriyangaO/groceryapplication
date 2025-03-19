package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategory;

public class SubCateogoryTest extends BaseClass {
  
	LoginPage login; 
	HomePage home; 
	SubCategory sub;
	
	@Test
  public void verifyAddNewSubCateogoryWithValidDetails()
  {
	
		login= new LoginPage(driver);
		login.enterUserNameOnUserName("admin");
		login.enterPasswordOnPasswordField("admin");
		login.clickOnLoginButton();
		HomePage home= new HomePage(driver);
		home.clickOnSubCategory();
		SubCategory page=new SubCategory(driver);
		page.clickOnNew();
		page.clickOnCategory();
		page.clickOnSubCategory();
     //	page.clickOnFileUpload();
		page.clickOnSave();
		boolean isalertpresent= login.isAlertShown();
	  	Assert.assertTrue(isalertpresent,"SubCategory not created succussfully");
	
		
  }
}
