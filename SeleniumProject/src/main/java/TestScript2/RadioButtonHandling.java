package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButtonHandling extends Base
{
	void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement mesg1=driver.findElement(By.cssSelector("input#inlineRadio1"));
		mesg1.click();
		WebElement mesg2=driver.findElement(By.cssSelector("button#button-one"));
		mesg2.click();
	}
	
	void radioButton1()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement mesgtxt1=driver.findElement(By.cssSelector("input#inlineRadio1"));
		//mesgtxt1.click();
		if(mesgtxt1.isSelected())
		{
			System.out.println("Already selected");
		}
		else
		{
			
			mesgtxt1.click();
			WebElement mesgtxt2=driver.findElement(By.cssSelector("button#button-one"));
			mesgtxt2.click();
//			if(mesgtxt1.isSelected())
//			{
//				System.out.println("already selected");
//				
//			}
//			else 
//			{
//				System.out.println("not selected");
//			}
				
				
		}
		
	}
		
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButtonHandling radiobuttonhandling = new RadioButtonHandling();
		radiobuttonhandling.browserInitialization();
		//radiobuttonhandling.radioButton();
		radiobuttonhandling.radioButton1();
		
}
}

