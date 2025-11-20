package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void browserInitialization()
	{
		 driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		//driver.close();
		//driver.quit();
	}
	public void browserclose()
	{
		driver.close();
	    driver.quit();
	}

	public static void main(String[] args) {
		Base base = new Base();
		base.browserInitialization();

	}

}
