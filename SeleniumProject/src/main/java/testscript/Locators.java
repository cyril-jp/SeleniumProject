package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base
{
	void id()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		WebElement message=driver.findElement(By.id("single-input-field"));//input form 1st field
				message.sendKeys("Heloo");
		WebElement message2=driver.findElement(By.id("button-one")); //input form 1st button
		message2.click();
		//driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement message3=driver.findElement(By.id("single-input-field2"));//Date picker :Date range picker
		//message3.sendKeys("5/11/2025");
		WebElement message4=driver.findElement(By.id("button-two"));//input for 2 input field button
		WebElement message5=driver.findElement(By.id("button-first"));//input form> select input>get 1st selected button
		WebElement message6=driver.findElement(By.id("subject"));//input form>Ajax form submit>subject
		
		
	}
	void className()
	{
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement text1=driver.findElement(By.className("form-control datepicker"));
		WebElement text2=driver.findElement(By.className("form-control"));
		WebElement text3=driver.findElement(By.className("dataTables_filter"));//table>table sort and search> div >search
		WebElement text4=driver.findElement(By.className("btn btn-success btn-block"));//list box>submit data button
		WebElement text5=driver.findElement(By.className("btn btn-success"));//list box>Java Script Alert Box>click me
		
		
		
	}
	void name()
	{
		WebElement msg1=driver.findElement(By.name("daterange"));//date picker >2nd input field
		WebElement msg2=driver.findElement(By.name("duallistbox_demo1[]_helper1"));//list box>bootstrap>option 1>right
		WebElement msg3=driver.findElement(By.name("example_length"));//table>table filter >name
		WebElement msg4=driver.findElement(By.name("dtBasicExample_length"));//table>table sort and search
		WebElement msg5=driver.findElement(By.name("viewport"));//table>table sort and search>meta
	}
	
	void linkText()
	{
		WebElement msgtxt1=driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement msgtxt2=driver.findElement(By.linkText("Form Submit"));
		WebElement msgtxt3=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement msgtxt4=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement msgtxt5=driver.findElement(By.linkText("Radio Buttons Demo"));
	}
	void partialLinktext()
	{
		WebElement mtext1=driver.findElement(By.partialLinkText("Ajax F"));
		WebElement mtext2=driver.findElement(By.partialLinkText("Select I"));
		WebElement mtext3=driver.findElement(By.partialLinkText("Radio B"));
		WebElement mtext4=driver.findElement(By.partialLinkText("Checkbox D"));
		WebElement mtext5=driver.findElement(By.partialLinkText("Simple F"));
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locators = new Locators();
		locators.browserInitialization();
		locators.id();
		

	}

}
