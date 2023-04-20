package PageBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaucePageBase {

	public static WebDriver driver;

	public static Properties properties;

	public SaucePageBase() {
		String path = "D:\\JAVA\\SauceLogin\\Configuration\\Configuration.properties";
		properties = new Properties();
		FileInputStream f;
		try {
			f = new FileInputStream(path);

			try {
				properties.load(f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void environment() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
	     driver =new ChromeDriver(option);
		//driver = new EdgeDriver();
		driver.get(properties.getProperty("URL"));

		driver.manage().window().maximize();

	}
}
