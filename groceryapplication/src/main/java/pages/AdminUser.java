package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.PageUtility;

public class AdminUser {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public  AdminUser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); //pagefactory class, to initielements
	}

	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newusers;
	@FindBy(xpath="//input[@id='username']") WebElement username;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath="//select[@id='user_type']") WebElement usertype;
	@FindBy(xpath="//button[@name='Create']") WebElement create;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	@FindBy(xpath="//tbody/tr[1]/td[5]/a[2]") WebElement edit;
	@FindBy(xpath="//button[@name='Update']") WebElement update;
	@FindBy(xpath="//tbody/tr[1]/td[5]/a[3]/i[1]") WebElement delete;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement search;
	
	@FindBy(xpath="//input[@id='un']") WebElement user;
	@FindBy(xpath="//button[@name='Search']") WebElement usersearch;
	@FindBy(xpath="//td[normalize-space()='dwd']") WebElement data;
	
	
public void clickOnNew()
{
	newusers.click();
}
	
public void clickOnUserName()
{
	username.click();
	username.sendKeys("Priya1289");
}
	
public void clickOnPassword()
{
	password.click();
	password.sendKeys("admin12298");
	
}
public void clickOnUserType()
{
	usertype.click();
	pageutility.selectDropdownWithVisibleText(usertype,"Staff");
}
	
public void clickOnCreate()
{
   create.click();
   
}
	
public boolean isAlertShown()
{
	return alert.isDisplayed();
}	
	
public void clickOnEdit()
{
	edit.click();
}
	
public void  clickOnUpdate()
{
	update.click();
}
	
public void clickOnDelete()
{
	delete.click();
}
public void clickOnSearch()
{
	search.click();
}
public void clickOnUserField()
{
	user.click();
	user.sendKeys("dwd");
}
public void clickOnUserSearch()
{
	usersearch.click();
}
public boolean isSearchShown()
{
	return data.isDisplayed();
}
}