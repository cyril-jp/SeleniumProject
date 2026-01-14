package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class MultiWndowsHandling extends Base
{
	void multiWindows()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement multi=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		multi.click();
		WebElement multi1=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		multi1.click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("*********************");
		for(String temp:driver.getWindowHandles())
		{
			System.out.println("windows"+ " " +temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());;
			System.out.println("********************");
			
				if(!temp.equals(parent))
				{
					driver.switchTo().window(temp);
					driver.close();
					
				}
				driver.switchTo().window(parent);
		    }
		}		
		
		
	void multiwindows2()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement multi=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		multi.click();
		WebElement multi1=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		multi1.click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("*********************");
		for(String temp:driver.getWindowHandles())
		{
			if(!temp.equals(parent))
			{
				driver.switchTo().window(temp);
				driver.close();
				
			}
		}
		
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiWndowsHandling multiWindowsHandling= new MultiWndowsHandling();
		multiWindowsHandling.browserInitialization();
		multiWindowsHandling.multiWindows();
		//multiWindowsHandling.multiwindows2();
		
		

	}

}
