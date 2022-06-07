package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OurBrand_page {
	WebDriver driver;
	public OurBrand_page(WebDriver ldriver){
		this.driver=ldriver;		
	}
	
	@FindBy(xpath="//*[@id=\"container-26d2e6af1a\"]/div/div/header/div[2]/div[2]/div/div[2]/nav/ul/li[4]/a/span[1]") WebElement brandbtn;
	public void brand() throws InterruptedException
	{
		brandbtn.click();
		Thread.sleep(2000l);
	}
	
	}
