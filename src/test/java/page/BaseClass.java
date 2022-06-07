package page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import utility.BrowserFactory;
import utility.ConfigDataProvider;
import utility.Screenshot;

public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider config;

	@BeforeSuite
	public void setSuite() throws IOException
	{
		config=new ConfigDataProvider();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		driver=BrowserFactory.startbrowser(driver,config.getBrowser(),config.getUrl());		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Screenshot.capturescreenshot(driver);
		}
		driver.close();
	}
//	@BeforeClass
//	public void setup() throws InterruptedException
//	{
//		driver=BrowserFactory.startbrowser(driver,config.getBrowser(),config.getUrl());		
//	}
//	
//	@AfterClass
//	public void teardown()
//	{
//		System.out.println("tear");
//		driver.close();
//	}
	
}
