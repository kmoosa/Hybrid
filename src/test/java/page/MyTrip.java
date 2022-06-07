package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTrip extends BaseClass 
{
	WebDriver driver;	
	public MyTrip(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	
	@FindBy(xpath="//*[@id=\"container-26d2e6af1a\"]/div/div/header/div[2]/div[2]/div/div[2]/div/ul/li[9]/a/span")WebElement mytripbtn;
	@FindBy(xpath="//*[@id=\"confirmationNumber\"]")WebElement cnnumber;
	@FindBy(xpath="//*[@id=\"cInDate\"]")WebElement checkindatebtn;
	@FindBy(xpath="//*[@id=\"cInDate_table\"]/tbody/tr[5]/td[3]/div")WebElement checkindate;
	@FindBy(name="firstName")WebElement firstName;
	@FindBy(name="lastName")WebElement lastName;
	@FindBy(name="submit")WebElement submit;
	
	
	
	public void mytrip() throws InterruptedException
	{
	  driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		System.out.println("BOOK NOW");
		mytripbtn.click();
		cnnumber.sendKeys("123456789");
		checkindatebtn.click();
		Thread.sleep(1000l);
		checkindate.click();
		firstName.sendKeys("hello");
		lastName.sendKeys("world");
		submit.click();
		Thread.sleep(2000l);
	}
}
