package Project01.SauceLogin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageClass {
	
//	Properties properties;
//	String path= "D:\\JAVA\\SauceLogin\\Configuration\\Configuration.properties";
//	
//	public PageClass() {
//	properties = new Properties();
//	FileInputStream f;
//	try {
//		f = new FileInputStream(path);
//	
//	try {
//		properties.load(f);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	}
//	 public String getlink() {
//		 String url=properties.getProperty("URL");
//		 return url;
//		 
//	 }
//	 public List<String> logindata() {
//		 List<String > l= new ArrayList<>();
//		 
//		 l.add(properties.getProperty("user1"));
//		 l.add(properties.getProperty("password1"));
//		 l.add(properties.getProperty("user2"));
//		 l.add(properties.getProperty("password2"));
//		 l.add(properties.getProperty("user3"));
//		 l.add(properties.getProperty("password3"));
//		 l.add(properties.getProperty("user4"));
//		 l.add(properties.getProperty("password4"));
//		 l.add(properties.getProperty("user5"));
//		 l.add(properties.getProperty("password5"));
//		 l.add(properties.getProperty("user6"));
//		 l.add(properties.getProperty("password6"));
//		 l.add(properties.getProperty("user7"));
//		 l.add(properties.getProperty("password7"));
//		 return l;
//	 }
	
	
	 
	
	
	 
	 
 
	public  WebDriver driver;
	PageClass(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement userName;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement click;
	
	
  public void login(String username ,String password) {
	  userName.sendKeys(username);
	  Password.sendKeys(password);
	  click.click();
  }
//  

  
  
}
