package TestScript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class MultipleWindowHandling extends Base

{
	void multipleWindow()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement multiple=driver.findElement(By.xpath("//a[@id='contact-us']"));
		multiple.click();
		WebElement multiple1=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		multiple1.click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("********************");
		Set<String> Allwindows=driver.getWindowHandles();
		for(String temp:Allwindows)
		{
			System.out.println("window"+temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("************************");
		}
		
		
		
		
	}

	public static void main(String[] args) {
		
		MultipleWindowHandling multiplewindowhandling=new MultipleWindowHandling();
		multiplewindowhandling.browserInitialization();
		multiplewindowhandling.multipleWindow();
		// TODO Auto-generated method stub

	}

}
