package test;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.BaseClass;
import page.BookNow;
import page.Followus;
import page.Followusfb;
import page.HelpSection;
import page.Join_page;
import page.Login_Page;
import page.MyTrip;
import page.OurBrand_page;
import page.followusyoutube;
import utility.BrowserFactory;


public class Logintest extends BaseClass {
	//public WebDriver driver;
	@Test(priority=0)
	public void loginapp() 
	{
		System.out.println("loginapp");
		Login_Page loginpage=PageFactory.initElements(driver,Login_Page.class);
		loginpage.logintomarriott("user123","pass123");
	}
	
	@Test(priority=1)
	public void joinapp() throws InterruptedException 
	{
		Join_page joinpage=PageFactory.initElements(driver,Join_page.class);
		joinpage.jointomarriott("First","Last","46","abc@gmail.com","pass123","pass123");
	}
	
	@Test(priority=2)
	public void mytrip() throws InterruptedException
	{
		System.out.println("mytrip");
		MyTrip mytrip=PageFactory.initElements(driver,MyTrip.class);
		mytrip.mytrip();
	}
	
	@Test(priority=3)
	public void help() throws InterruptedException
	{
		HelpSection help=PageFactory.initElements(driver,HelpSection.class);
		help.help();
	}
	
	@Test(priority=4)
	public void followus() throws InterruptedException
	{
		Followus follow=PageFactory.initElements(driver,Followus.class);
		follow.followusig();
	}
	
	@Test(priority=5)
	public void followusfbp() throws InterruptedException
	{
		Followusfb follow=PageFactory.initElements(driver,Followusfb.class);
		follow.followusfb();
	}
	
	@Test(priority=6)
	public void followusyt() throws InterruptedException
	{
		followusyoutube follow=PageFactory.initElements(driver,followusyoutube.class);
		follow.followusyt();
	}
	
	@Test(priority=7)
	public void brand() throws InterruptedException
	{
		OurBrand_page brand=PageFactory.initElements(driver,OurBrand_page.class);
		brand.brand();
	}
	
	@Test(priority=8)
	public void booknow() throws InterruptedException
	{
		BookNow booknow=PageFactory.initElements(driver,BookNow.class);
		booknow.booknow();
	}
	
	
}
