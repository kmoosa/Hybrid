package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Followus {
	WebDriver driver;
	public Followus(WebDriver ldriver){
		this.driver=ldriver;		
	}
	
	@FindBy(xpath="//*[@id=\"container-77bc47ba7f\"]/div/div/div/div/div/div[2]/div/ul/li[2]/a/span[1]") WebElement instabtn;
	public void followusig() throws InterruptedException
	{
		instabtn.click();
		Thread.sleep(2000l);
	}
	
	}
