package automationcore;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import utility.ScreenShot;

public class BaseClass {
	Properties properties;
	FileInputStream file;
	
		 public WebDriver driver;
		  @BeforeMethod(alwaysRun = true)
		  @Parameters("browser")
		  public void initializeBrowser(String browser) throws Exception 
		  {
			  properties=new Properties();
			  file=new FileInputStream(Constants.CONFIGFILE);
			  properties.load(file);
		 // 	  driver=new ChromeDriver();                 //to lanuch browser
		  	if(browser.equalsIgnoreCase("Chrome"))
		  	{
		  		driver=new ChromeDriver();
		  	}
		  	else if(browser.equalsIgnoreCase("Edge"))
		  	{
		  		driver=new EdgeDriver();
		  	}
		  	else if(browser.equalsIgnoreCase("Firefox"))
		  	{
		  		driver=new FirefoxDriver();
		  	}
		  	else
		  	{
		  		throw new Exception("Invalid Browser");
		  	}
		  	
		  driver.get(properties.getProperty("baseurl"));
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //wait
	  }
	  

	  @AfterMethod(alwaysRun=true)
	  
	  public void driverQuit(ITestResult itestresult) throws IOException 
	  {
		   
	//		driver.quit();
		  if(itestresult.getStatus()==itestresult.FAILURE)
		  {
				ScreenShot screenshot = new ScreenShot();
				screenshot.getScreenshot(driver,itestresult.getName());
		  }
	  }

	}
  
