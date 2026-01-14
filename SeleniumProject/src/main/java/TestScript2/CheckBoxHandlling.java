package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckBoxHandlling extends Base

{
	void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbut=driver.findElement(By.cssSelector("input#gridCheck"));
		checkbut.click();		
		
	}
	
	void checkBox2()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement mesg1=driver.findElement(By.cssSelector("input#gridCheck"));
		if(mesg1.isSelected())
		{
			System.out.println("Already selected");
		}
		else
		{
			mesg1.click();
			
		}
		
		
	}
	
	void checkBox1()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement mesgtxt1=driver.findElement(By.cssSelector("input#check-box-one"));
		mesgtxt1.click();
		WebElement mesgtxt2=driver.findElement(By.cssSelector("input#check-box-two"));
		mesgtxt2.click();
		WebElement mesgtxt3=driver.findElement(By.cssSelector("input#check-box-three"));
		mesgtxt3.click();
		WebElement mesgtxt4=driver.findElement(By.cssSelector("input#check-box-four"));
		mesgtxt4.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxHandlling checkboxhandlling = new CheckBoxHandlling();
		checkboxhandlling.browserInitialization();
		
		//checkboxhandlling.checkBox();
		//checkboxhandlling.checkBox1();
		checkboxhandlling.checkBox2();		

	}

}
