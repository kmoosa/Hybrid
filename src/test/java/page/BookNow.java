package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookNow extends BaseClass 
	{
	WebDriver driver;
	public BookNow(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//*[@id=\"herobanner-carousel\"]/div/div[3]/div/div[4]/div/div/a")WebElement booknowbtn;
	//@FindBy(xpath="//*[@id=\"main\"]/div[1]/div/div/form/div[1]/input")WebElement destination;
	public void booknow() throws InterruptedException
	{
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		System.out.println("BOOK NOW");
		booknowbtn.click();
		//destination.sendKeys("Mumbai");
		Thread.sleep(2000l);
		driver.close();
	}
}
