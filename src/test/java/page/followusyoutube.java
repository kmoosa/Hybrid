package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class followusyoutube {
	WebDriver driver;
	public followusyoutube(WebDriver ldriver){
		this.driver=ldriver;		
	}
	
	@FindBy(xpath="//*[@id=\"container-77bc47ba7f\"]/div/div/div/div/div/div[2]/div/ul/li[5]/a/span[1]") WebElement ytbtn;
	public void followusyt() throws InterruptedException
	{
		ytbtn.click();
		Thread.sleep(2000l);
	}
	
	}
