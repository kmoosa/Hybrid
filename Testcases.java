package utitlity;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Testcases extends DriverClass {

	@Test
	public void testcase1() throws InterruptedException
	{	
		System.out.println(driver.getTitle());
		Thread.sleep(2000l);
	}
	@Test
	public void testcase2() throws InterruptedException
	{	
	//	System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"container-26d2e6af1a\"]/div/div/header/div[2]/div[2]/div/div[2]/div/ul/li[6]/a/span[2]")).click();
		
		Thread.sleep(2000l);
	}
	@Test
	public void testcase3() throws InterruptedException
	{	
		//driver.findElement(By.className("t-subtitle-l")).click();
		driver.findElement(By.xpath("//*[@id=\"sign-in-tooltip-id\"]/button")).click();
		Thread.sleep(2000l);
	}
	@Test
	public void testcase4() throws InterruptedException
	{	
		driver.findElement(By.xpath("//*[@id=\"signin-userid\"]")).sendKeys("user123");
		Thread.sleep(2000l);
	}
	@Test
	public void testcase5() throws InterruptedException
	{	
		driver.findElement(By.xpath("//*[@id=\"signin-user-password\"]")).sendKeys("pass123");
		
		Thread.sleep(2000l);
	}
	@Test
	public void testcase6() throws InterruptedException
	{	
		driver.findElement(By.xpath("//*[@id=\"container-26d2e6af1a\"]/div/div/header/div[2]/div[2]/div/div[2]/div/ul/li[6]/div/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(2000l);
	}
}
