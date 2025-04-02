package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategory;

public class SubCateogoryTest extends BaseClass {

	LoginPage login;
	HomePage home;
	SubCategory sub;

	@Test
	public void verifyAddNewSubCateogoryWithValidDetails() {

		login = new LoginPage(driver);
		home = login.enterUserNameOnUserName("admin").enterPasswordOnPasswordField("admin")
				
				.clickOnLoginButton();

		sub = home.clickOnSubCategory().clickOnNew()
		.clickOnCategory().clickOnSubCategory().clickOnSave();
		SubCategory page = new SubCategory(driver);
		boolean isalertpresent = login.isAlertShown();
		Assert.assertTrue(isalertpresent,Constants.ip_verifyAddNewSubCateogoryWithValidDetails);

	}
}
