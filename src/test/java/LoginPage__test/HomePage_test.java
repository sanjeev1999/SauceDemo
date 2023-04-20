package LoginPage__test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageBase.SaucePageBase;
import SaucePages.HomePage;

public class HomePage_test extends SaucePageBase {
	static HomePage homepage;

	@BeforeTest
	public void environmentSetup() {
		environment();
		homepage = new HomePage();
	}

	public void loginToSauceDemo1() {
		homepage.userName("standard_user");
		homepage.Password("secret_sauce");
		homepage.Click();
	}

	@Test(priority = 1)
	public void test1() {
		loginToSauceDemo1();
	}
	@Test(priority=2)
	  public void test2() throws InterruptedException {
		 homepage.Dropdown1();
	  }
	@Test(priority=3)
	  public void test3() throws InterruptedException {
		 homepage.Dropdown1();
	  }
	@Test(priority=4)
	  public void test4() throws InterruptedException {
		 homepage.Dropdown1();
	  }


	

	@Test(priority = 5)
	public void test6() throws InterruptedException {
		Assert.assertTrue(homepage.img1());
	}
	@Test(priority = 6)
	public void test7() throws InterruptedException {
		Assert.assertTrue(homepage.img2());
	}
	@Test(priority = 7)
	public void test8() throws InterruptedException {
		Assert.assertTrue(homepage.img3());
	}
	@Test(priority = 8)
	public void test9() throws InterruptedException {
		Assert.assertTrue(homepage.img4());
	}
	@Test(priority = 9)
	public void test10() throws InterruptedException {
		Assert.assertTrue(homepage.Addtocart());
	}
	
	@Test(priority = 10)
	public void test5() throws InterruptedException {
		homepage.About();
	}

}
