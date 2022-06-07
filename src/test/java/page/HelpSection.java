package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class HelpSection extends BaseClass 
		{
		WebDriver driver;
		public HelpSection(WebDriver ldriver){
		this.driver=ldriver;
		}
			
		
  @FindBy(xpath="//*[@id=\"container-26d2e6af1a\"]/div/div/header/div[2]/div[2]/div/div[2]/div/ul/li[2]/a/span[2]")WebElement helpbtn;
 // @FindBy(xpath="//*[@id="121:0-input"]")WebElement helptext;
  @FindBy(id="121:0-input")WebElement helptext;

  public void help() throws InterruptedException
	{
		helpbtn.click();
		helptext.sendKeys("help");
		Thread.sleep(1000l);
	}
}
