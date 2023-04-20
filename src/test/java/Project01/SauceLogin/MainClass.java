package Project01.SauceLogin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainClass {
//	 WebDriver driver= new EdgeDriver();
//	PageClass Cfile=new PageClass();
//	
//	 @Test
//	public void test() {
//		 
//		
//		 for(int i=0;i<Cfile.logindata().size();i++) {
//	     driver.get(Cfile.getlink());
//		 driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(Cfile.logindata().get(i));
//		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Cfile.logindata().get(i+1));
//		 driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		 driver.navigate().refresh();
//		 i++;
//		
//		 }
//
//	 }
//	
	
	
	
	public void Url() {
		String url = driver.getCurrentUrl();
		Assert.assertNotEquals(url, "https://www.saucedemo.com/inventory.html");
	}
	

	WebDriver driver;
	PageClass l;
	@Test(priority = 0)
	public void page() {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		l = new PageClass(driver);

	}

	@Test(priority = 1)
	public void Test1() {
		l.login(" ", "secret_sauce");
		Url();
	}

	@Test(priority = 2)
	public void Test2() {
		l.login("standard_user", " ");
		driver.navigate().refresh();
		Url();
	}

	@Test(priority = 3)
	public void Test3() {
		l.login("sanju", "sanju");
		driver.navigate().refresh();
		Url();
	}

	@Test(priority = 4)
	public void Test4() {
		l.login("standard_user", "sanju");
		driver.navigate().refresh();
		Url();
	}

	@Test(priority = 5)
	public void Test5() {
		driver.navigate().refresh();
		l.login("sanju", "secret_sauce");
		Url();
	}

	@Test(priority = 6)
	public void Test6() {

		driver.navigate().refresh();
		l.login("standard_user", "secret_sauce");
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/inventory.html");

	}

}
