package Task01;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task01 {
	WebDriver driver;

	@BeforeTest
	void environment() {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}

	@Test
	public void test1() {
		List<WebElement> links = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]"))
				.findElements(By.className("inventory_item_name"));
		System.out.println(links.size());
		for (WebElement link : links) {
			String text1 = link.getText();
			System.out.println(text1);
		}

		List<WebElement> Prices = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]"))
				.findElements(By.className("inventory_item_price"));
		System.out.println(Prices.size());
		for (WebElement price : Prices) {
			String text2 = price.getText();
			System.out.println(text2);
		}



//	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
//	 String s= driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
//	  System.out.println(s);
//	  if(s=="1") System.out.println("pass");
//	  else System.out.println("fail");

//	String S1=  driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
//	String S2=  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
//	String S3=  driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).getText();
//	String S4=  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")).getText();
//	String S5=  driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).getText();
//	String S6=  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div")).getText();
//	String S7=  driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
//	String S8=  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div")).getText();
//	String S9=  driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
//	String S10=  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div")).getText();
//	
//	
//	
//		System.out.println(S1);
//		System.out.println(S2);
//		System.out.println(S3);
//		System.out.println(S4);
//		System.out.println(S5);
//		System.out.println(S6);
//		System.out.println(S7);
//		System.out.println(S8);
//		System.out.println(S9);
//		System.out.println(S10);

	}
}





//WebElement A[] = new WebElement[Prices.size()];
//int i;
//for (WebElement Price : Prices) {
//	i = 1;
//	A[i] = Price;
//	i++;
//}
//i = 1;
//for (WebElement link : links) {
//	String text = link.getText();
//	System.out.println(text);
//	String text2 = A[i].getText();
//	System.out.println(text2);
//	i++;
//}