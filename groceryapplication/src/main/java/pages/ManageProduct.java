package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.PageUtility;

public class ManageProduct 
{
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public  ManageProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); //pagefactory class, to initielements
	}
	//a[@class='btn btn-rounded btn-danger']//i[@class='fas fa-edit']

    @FindBy(xpath="	//a[@class='btn btn-rounded btn-danger']//i[@class='fas fa-edit']") WebElement newproduct;
    @FindBy(xpath="//input[@id='title']") WebElement title;
    @FindBy(xpath="//input[@value='Veg']") WebElement product;
    @FindBy(xpath="//input[@id='tag']") WebElement tag;
    @FindBy(xpath="//input[@id='purpose2']") WebElement price;
    @FindBy(xpath="//input[@id='l_minimum']") WebElement litervalue;
    @FindBy(xpath="//select[@id='l_unit']") WebElement litreunit;
    
    @FindBy(xpath="//input[@id='l_price']") WebElement litreprice;
    @FindBy(xpath="//input[@id='l_stock']") WebElement stockavailability;
    @FindBy(xpath="//button[@name='create']") WebElement create;
    //alertmesssage
    @FindBy(xpath="//h5[normalize-space()='Alert!']") WebElement alert;
    
    
    
  public void clickOnNew()
  {
	  newproduct.click();
  }
 public void clickOnTitle()
 {
	 title.click();
	 title.sendKeys("Obsqura Product" );
 }
    
 public void clickOnProduct()
 {
	 product.click();
 }
 public void clickOnTag()
 {
	 tag.click();
	 tag.sendKeys("Priyanga Prakash ");
 }
 public void clickOnPriceType()
 {
	price.click();
 }
public void clickOnLiterValue()
{
	litervalue.click();
	litervalue.sendKeys("one litre");
}
public void clickOnLitreUnit()
{
	litreunit.click();
    Select select = new Select(litreunit);
    select.selectByIndex(1);
	WebElement selectedelement=select.getFirstSelectedOption();
    selectedelement.click();
}
public void clickOnLitrePrice()
{
	litreprice.click();
}
public void clickOnStockAvailablity()
{
	stockavailability.click();
	stockavailability.sendKeys("nmm");
}
public void clickOnCreate()
{
	create.click();
}
public boolean isAlertShown()
{
	return alert.isDisplayed();
}
    
}