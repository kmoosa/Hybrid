package page;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Login_Page extends BaseClass
	{
	WebDriver driver;	
	public Login_Page(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	
	@FindBy(xpath="//*[@id=\"container-26d2e6af1a\"]/div/div/header/div[2]/div[2]/div/div[2]/div/ul/li[6]/a/span[2]") WebElement signin1;
	@FindBy(xpath="//*[@id=\"sign-in-tooltip-id\"]/button") WebElement signin2;
	@FindBy(name="userID") WebElement uname;
	@FindBy(name="password") WebElement pass;
	@FindBy(xpath="//*[@id=\"container-26d2e6af1a\"]/div/div/header/div[2]/div[2]/div/div[2]/div/ul/li[6]/div/div[2]/form/div[3]/button") WebElement loginbutton;
	
	public void logintomarriott(String username,String password)
	{
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		System.out.println("loginto marriott");
		signin1.click();
		signin2.click();
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();
	}

}