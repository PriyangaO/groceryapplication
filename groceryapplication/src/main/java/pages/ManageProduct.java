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
    
    
    
  public ManageProduct clickOnNew()
  {
	  newproduct.click();
	  return this;
  }
 public ManageProduct clickOnTitle()
 {
	 title.click();
	 title.sendKeys("Obsqura Product" );
	 return this;
 }
    
 public ManageProduct clickOnProduct()
 {
	 product.click();
	 return this;
 }
 public ManageProduct clickOnTag()
 {
	 tag.click();
	 tag.sendKeys("Priyanga Prakash ");
	 return this;
 }
 public ManageProduct clickOnPriceType()
 {
	price.click();
	return this;
 }
public ManageProduct clickOnLiterValue()
{
	litervalue.click();
	litervalue.sendKeys("one litre");
	return this;
}
public ManageProduct clickOnLitreUnit()
{
	litreunit.click();
    Select select = new Select(litreunit);   //correct it by using page utility
    select.selectByIndex(1);
	WebElement selectedelement=select.getFirstSelectedOption();
    selectedelement.click();
    return this;
}
public ManageProduct clickOnLitrePrice()
{
	litreprice.click();
	return this;
}
public ManageProduct clickOnStockAvailablity()
{
	stockavailability.click();
	stockavailability.sendKeys("nmm");
	return this;
	
}
public ManageProduct clickOnCreate()
{
	create.click();
	return this ;
}
public boolean isAlertShown()
{
	return alert.isDisplayed();
}
    
}