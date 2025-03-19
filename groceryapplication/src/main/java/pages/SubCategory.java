package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.PageUtility;

public class SubCategory {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public  SubCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); //pagefactory class, to initielements
	}

	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newcategory;
	@FindBy(xpath="//select[@id='cat_id']") WebElement category;
	@FindBy(xpath="//input[@id='subcategory']") WebElement subcategory;
    @FindBy(xpath="//input[@id='main_img']") WebElement fileupload;

    @FindBy(xpath="//button[@name='create']")WebElement save;
    @FindBy(xpath="//h5[normalize-space()='Alert!']") WebElement alert;


public SubCategory  clickOnNew()
{
	newcategory.click();
	return this;
}
public SubCategory clickOnCategory()
{
	pageutility.selectDropdownWithVisibleText(category,"veggies");
//	 Select select = new Select(category);
//	 select.selectByIndex(1);
//	 WebElement selectedelement=select.getFirstSelectedOption();
//	 selectedelement.click();	
	return this;
}
public SubCategory clickOnSubCategory()
{
	subcategory.sendKeys("Cauliflower6" +pageutility.generateCurrentDateAndTime());
	return this;   //chaining of pages
}

//public void clickOnFileUpload()



public SubCategory clickOnSave()
{
	save.click();
	return this;
}
public boolean isAlertShown()
{
	return alert.isDisplayed();
}


}



