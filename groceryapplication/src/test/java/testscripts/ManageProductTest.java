package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import constants.Constants;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

import pages.ManageProduct;

public class ManageProductTest extends BaseClass {
	LoginPage login; 
	HomePage home;
	ManageProduct pro;
  @Test
  public void verifyToAddManageProduct()
  {
	    LoginPage login= new LoginPage(driver);
	home=login.enterUserNameOnUserName("admin")
		.enterPasswordOnPasswordField("admin").clickOnLoginButton();
		
		HomePage home= new HomePage(driver);
   pro= home.clickOnManageProduct().clickOnNew().clickOnTitle().clickOnProduct().clickOnTag()
		   .clickOnPriceType().clickOnLiterValue().clickOnLitreUnit().clickOnLitrePrice().clickOnStockAvailablity().clickOnCreate();
        ManageProduct product=new ManageProduct (driver);
       
        boolean isalertpresent= product.isAlertShown();
  	    Assert.assertTrue(isalertpresent,"catogory and subcategory is not addded");
	  
	  
	  
  }
}
