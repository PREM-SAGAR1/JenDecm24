package hi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserlaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","D:\\April2023\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();


	}

}
