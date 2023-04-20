package SaucePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageBase.SaucePageBase;

public class HomePage extends SaucePageBase{
	@FindBy(xpath = "//*[@id=\"user-name\"]")
	WebElement userName;
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement Password;
	@FindBy(xpath = "//*[@id=\"login-button\"]")
	WebElement click;
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement menu;
	@FindBy(xpath="//*[@id=\"about_sidebar_link\"]")
	WebElement About;
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement Logout;
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/div/span/select")
	WebElement Dropdown;
	
	@FindBy(xpath="//*[@id=\"item_4_img_link\"]/img")
	WebElement img1;
	@FindBy(xpath="//*[@id=\"item_0_img_link\"]/img")
	WebElement img2;
	@FindBy(xpath="//*[@id=\"item_1_img_link\"]/img")
	WebElement img3;
	@FindBy(xpath="//*[@id=\"item_1_img_link\"]/img")
	WebElement img4;
	@FindBy(xpath="//*[@id=\"item_5_img_link\"]/img")
	WebElement addtocart;
	
	public HomePage() {
	// this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void userName(String username) {
		userName.sendKeys(username);
	}

	public void Password(String password) {
		Password.sendKeys(password);
	}

	public void Click() {
		click.click();
		}
	public void About() throws InterruptedException {
		menu.click();
		Thread.sleep(500);
		About.click();
	}
	public void Logout() throws InterruptedException {
		menu.click();
		Thread.sleep(500);
		Logout.click();
	}
	
	public boolean img1() {
		return img1.isDisplayed();
	}
	public boolean img2() {
		return img2.isDisplayed();
	}
	public boolean img3() {
		return img3.isDisplayed();
	}
	public boolean img4() {
		return img3.isDisplayed();
	}
	public boolean Addtocart() {
		return img3.isDisplayed();
	}
	
	
	
	public void Dropdown1() {
		Select s=new Select(Dropdown);
		//Dropdown.click();
		s.selectByVisibleText("Name (A to Z)");
	}
	public void Dropdown2() {
		Select s=new Select(Dropdown);
		//Dropdown.click(););
		s.selectByVisibleText("Name (A to Z)");
	}
	public void Dropdown3() {
		Select s=new Select(Dropdown);
		//Dropdown.click();
		s.selectByVisibleText("Name (A to Z)");
	}
	
	
	
	
	
  
}
