package utility;
//customize or extensive html report to generate
//extend test is a class- represents a each test case. 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	public static final ExtentReports extentReports = new ExtentReports();   //object created
	public synchronized static ExtentReports createExtentReports() //syn-- used for thread safety
	{    
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html"); 
		
		reporter.config().setReportName("groceryapplication");  		//set the title of the project
        extentReports.attachReporter(reporter);  
		extentReports.setSystemInfo("Organization", "Obsqura");  
		extentReports.setSystemInfo("Name", "Priyanga M ");
		return extentReports;   
	}
}
