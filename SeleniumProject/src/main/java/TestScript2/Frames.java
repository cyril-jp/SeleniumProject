package TestScript2;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;

import testscript.Base;

public class Frames extends Base

{
	void frameHandling()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frame1);
		WebElement frame=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		frame.click();
	}
	void frames2Handling()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		List<WebElement> frm1=driver.findElements(By.tagName("iframe"));
		System.out.println(frm1.size());
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames frames = new Frames();
		frames.browserInitialization();
		//frames.frameHandling();
		frames.frames2Handling();

	}

}
