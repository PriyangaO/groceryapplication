package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public  HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); //pagefactory class, to initielements
	}
@FindBy(xpath="//p[normalize-space()='Sub Category']") WebElement subcategory;

@FindBy(xpath="//p[normalize-space()='Manage News']") WebElement managenews;

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product'][normalize-space()='More info']") WebElement manageproduct;

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'][normalize-space()='More info']") WebElement adminusers;



public SubCategory clickOnSubCategory()
{
	subcategory.click();
	return new SubCategory(driver);
}

public ManageNews clickOnManageNews()
{
	managenews.click();
	return new ManageNews(driver);
}

public ManageProduct clickOnManageProduct()
{
	manageproduct.click();
	return new ManageProduct(driver);
}

public AdminUser clickOnAdminUsers()
{
	adminusers.click();
	return new AdminUser(driver);
}
}