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
	
  @Test
  public void verifyToAddManageProduct()
  {
	    LoginPage login= new LoginPage(driver);
		login.enterUserNameOnUserName("admin");
		login.enterPasswordOnPasswordField("admin");
		login.clickOnLoginButton();
		HomePage home= new HomePage(driver);
        home.clickOnManageProduct();
        ManageProduct product=new ManageProduct (driver);
        product.clickOnNew();
        product.clickOnTitle();
        product.clickOnProduct();
        product.clickOnTag();
        product.clickOnPriceType();
        product.clickOnLiterValue();
        product.clickOnLitreUnit();
        product.clickOnLitrePrice();
        product.clickOnStockAvailablity();
        product.clickOnCreate();
        boolean isalertpresent= product.isAlertShown();
  	    Assert.assertTrue(isalertpresent,"catogory and subcategory is not addded");
	  
	  
	  
  }
}
