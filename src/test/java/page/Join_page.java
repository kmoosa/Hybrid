package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Join_page extends BaseClass 
	{
	WebDriver driver;
	public Join_page(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	
	@FindBy(xpath="//*[@id=\"sign-in-tooltip-id\"]/a")WebElement joinbtn;
	@FindBy(name="firstName") WebElement fname_; 
	@FindBy(name="lastname") WebElement l_name;
	@FindBy(name="postalCode") WebElement pincod__;
	@FindBy(xpath="//*[@id=\"field-email\"]") WebElement e_mail;
	@FindBy(xpath="//*[@id=\"field-password\"]") WebElement pass_;
	@FindBy(xpath="//*[@id=\"field-password-confirmation\"]") WebElement passcon_;
	
	public void jointomarriott(String fname,String lname,String pincode,String email,String pass,String passcon) throws InterruptedException
	{
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//		joinbtn.click();
//		fname_.sendKeys(fname);
//		l_name.sendKeys(lname);
//		pincod__.sendKeys(pincode);
//		e_mail.sendKeys(email);
//		pass_.sendKeys(pass);
//		passcon_.sendKeys(passcon);
//		Thread.sleep(2000l);	
		System.out.println("join page");
		driver.getTitle();
	}
	

}