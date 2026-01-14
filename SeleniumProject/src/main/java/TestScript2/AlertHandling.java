package TestScript2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base

{
	void simpleAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alert.click();
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		alert1.accept();
		
		
	}
	void confirmationAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		alert.click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		
	}
	void promptAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		alert.click();
		Alert alert1=driver.switchTo().alert();
		alert1.sendKeys("Cyril");
		alert1.accept();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.browserInitialization();
		alerthandling.simpleAlert();
		//alerthandling.confirmationAlert();
		//alerthandling.promptAlert();
		
		

	}

}
