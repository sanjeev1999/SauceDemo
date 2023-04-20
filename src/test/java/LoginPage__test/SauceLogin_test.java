package LoginPage__test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageBase.SaucePageBase;
import SaucePages.loginPage;

public class SauceLogin_test extends SaucePageBase{
	static loginPage loginpage;
	
//	SauceLogin_test(){
//		super();
//	}
	
	@BeforeMethod
	public void environmentSetup() {
		environment();
		loginpage=new loginPage();	
		
	}
	
	public void loginToSauceDemo1() {
		loginpage.userName(properties.getProperty("user1"));
		loginpage.Password(properties.getProperty("password1"));
		loginpage.Click();
		}
	public void loginToSauceDemo2() {
		loginpage.userName(properties.getProperty("user2"));
		loginpage.Password(properties.getProperty("password2"));
		loginpage.Click();
		}
	public void loginToSauceDemo3() {
		loginpage.userName(properties.getProperty("user3"));
		loginpage.Password(properties.getProperty("password3"));
		loginpage.Click();
		}
	public void loginToSauceDemo4() {
		loginpage.userName("standard_user");
		loginpage.Password("secret_sauce");
		loginpage.Click();
		}
	
	
  @Test(priority=1)
  public void test1() {
	  loginToSauceDemo1();
	  	 
  }
  @Test(priority=2)
  public void test2() {
	  loginToSauceDemo2();
	 
  }
  @Test(priority=3)
  public void test3() {
	  loginToSauceDemo3();
	 
  }
 
  @Test(priority=4)
  public void test4() {
	  loginToSauceDemo4();
	 
  } 
}
