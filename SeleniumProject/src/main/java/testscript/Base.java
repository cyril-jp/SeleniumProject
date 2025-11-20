package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public void browserInitialization()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		
	}

	public static void main(String[] args) {
		Base base = new Base();
		base.browserInitialization();

	}

}
