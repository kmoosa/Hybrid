package utility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	public static WebDriver startbrowser(WebDriver driver,String browsername,String url) throws InterruptedException
	{
		System.out.println("BROWSERFACTORY");
		if(browsername.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		 driver=new ChromeDriver();
		}
		else{
			System.out.print("Wrong browser");}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}	
	public static void  closedriver(WebDriver driver)
	{
		System.out.println("closedriver browser factory");				
	}
}
