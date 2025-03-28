package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.PageUtility;

public class ManageNews {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public  ManageNews(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); //pagefactory class, to initielements
	}


        @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']//i[@class='fas fa-edit']") WebElement newclick;

        @FindBy(xpath="//textarea[@id='news']") WebElement enterthenews;

        @FindBy(xpath="//button[@name='create']") WebElement save;

        @FindBy(xpath="//tbody/tr[1]/td[2]/a[1]/i[1]") WebElement edit;
        @FindBy(xpath="//textarea[@id='news']") WebElement entertheupdatenews;
        @FindBy(xpath="//button[@name='update']") WebElement update;
        @FindBy(xpath="//tbody/tr[1]/td[2]/a[2]/i[1]") WebElement delete;
        @FindBy(xpath="//h5[normalize-space()='Alert!']") WebElement alert;
        @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertdelete;
      
public ManageNews clickOnNew()
{
	newclick.click();
	return this;
}

public ManageNews clickOnTextArea()
{
	enterthenews.click();
	enterthenews.sendKeys("Welcome to ObsquraTeam ");
	return this;
}

public ManageNews clickOnSave()
{
	save.click();
	return this;
}
public ManageNews clickOnEdit()
{
	edit.click();
	return this;
}
public ManageNews clickOnUpdateNews()
{
	entertheupdatenews.click();
	entertheupdatenews.sendKeys("\n update of any obsqura news");
	return this;
}

public ManageNews clickOnUpddate()
{
	update.click();
	return this;
}

public ManageNews clickOnDelete()
{
	delete.click();
	return this;
}

public boolean isAlertShown()
{
	return alert.isDisplayed();
}

public boolean isAlertDeleteShown()
{
	return alertdelete.isDisplayed();
}

















}
