package SaucePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import PageBase.SaucePageBase;

public class loginPage extends SaucePageBase {

	@FindBy(xpath = "//*[@id=\"user-name\"]")
	WebElement userName;
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement Password;
	@FindBy(xpath = "//*[@id=\"login-button\"]")
	WebElement click;

	
	public loginPage() {
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

	public void Url() {
		String url = driver.getCurrentUrl();
//		Assert.assertNotEquals(url, "https://www.saucedemo.com/inventory.html");
	}

}