package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelUtility;

public class LoginPage 

{
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); //pagefactory class, to initielements
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")WebElement usernameField;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement passwordField;
	@FindBy(xpath="//button[text()='Sign In']")WebElement loginButton;
	//homepagetext
	@FindBy(xpath="//div[@class='info']") WebElement homepagetext;
	//alert message
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alertmsg;
	
	public LoginPage enterUserNameOnUserName(String username)
	{
		usernameField.sendKeys(username);
		return this;
	}
	public LoginPage enterPasswordOnPasswordField(String password)
	{
		passwordField.sendKeys(password);
		return this;
	}
	public  HomePage clickOnLoginButton()
	{
		loginButton.click();
		return new HomePage(driver);
	}
    public boolean isHomePageLoaded()
    {
    	return homepagetext.isDisplayed();
    }
	public boolean isAlertShown()
	{
		return alertmsg.isDisplayed();
	}

	public HomePage loginUsingExcelData() throws IOException   // return homepage  need to add 
	{
		String username=ExcelUtility.readStringData(1, 0, "ga_loginpage");
		String password=ExcelUtility.readStringData(1, 1, "ga_loginpage");
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
		return new HomePage(driver);
	}




}
