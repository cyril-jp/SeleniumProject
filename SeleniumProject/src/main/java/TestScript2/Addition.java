package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Addition extends Base
{
	void sum()
	{
//	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
//		WebElement message=driver.findElement(By.id("value-a"));
//		message.sendKeys("10");
//		WebElement message2=driver.findElement(By.id("value-b"));
//		message2.sendKeys("20");
//		WebElement message3=driver.findElement(By.id("button-two")); 
//		message3.click();
		
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement mesg1=driver.findElement(By.cssSelector("input#single-input-field2"));
		mesg1.sendKeys("5/10/2025");
		WebElement mesg2=driver.findElement(By.cssSelector("button#button-two"));
//		WebElement mesg2=driver.findElement(By.className("active day"));
//		mesg2.click();
		mesg2.click();
		


}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition addition = new Addition();
		addition.browserInitialization();
		addition.sum();
}
}
