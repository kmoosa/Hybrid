package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Followusfb {
	WebDriver driver;
	public Followusfb(WebDriver ldriver){
		this.driver=ldriver;		
	}
	
	@FindBy(xpath="//*[@id=\"container-77bc47ba7f\"]/div/div/div/div/div/div[2]/div/ul/li[1]/a/span[1]") WebElement fbbtn;
	public void followusfb() throws InterruptedException
	{
		fbbtn.click();
		Thread.sleep(2000l);
	}
	
	}
