package TestScript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class DropDownHandling extends Base

{
	void selectByValue()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement drop=driver.findElement(By.cssSelector("select#single-input-field"));
		Select select=new Select(drop);
		select.selectByValue("Red");
	
	}
	void selectByIndex()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement drop=driver.findElement(By.cssSelector("select#single-input-field"));
		Select select=new Select(drop);
		select.selectByIndex(2);
		
	}
	void selectByVisibleText()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement drop=driver.findElement(By.cssSelector("select#single-input-field"));
		Select select=new Select(drop);
		select.selectByVisibleText("Red");
	}
	
//	void customDropDown()
//	{
//		driver.navigate().to("https://selenium.qabible.in/select-input.php");
//		WebElement drop=driver.findElement(By.cssSelector("select#single-input-field"));
//		WebElement drop1=driver.findElement(By.xpath(""));
//		drop.click();
//	}
	void selectList()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement drop=driver.findElement(By.cssSelector("select#single-input-field"));
		Select select = new Select(drop);
		List<WebElement> options = select.getOptions();

		for(WebElement option : options) {
		    System.out.println(option.getText());
		}
	}

	public static void main(String[] args) {
		DropDownHandling dropdownhandling=new DropDownHandling();
		dropdownhandling.browserInitialization();
		//dropdownhandling.selectByVisibleText();
		//dropdownhandling.selectByIndex();
		//dropdownhandling.selectByValue();
		dropdownhandling.selectList();
		
		
		

	}

}
