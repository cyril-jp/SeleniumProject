package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class ActionClass extends Base

{
	void dragAndDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		Actions actions=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(source, destination).perform();
		
	}
	void rightClick()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		Actions actions=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		actions.contextClick(right).perform();
		
	}
	void doubleCLick()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		Actions actions=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		actions.doubleClick(right).perform();
	}
	void mouseHover()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		Actions actions=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		actions.moveToElement(right).perform();
	
	}
	void clickMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		Actions actions=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		actions.click(right).perform();
	}

	public static void main(String[] args) {
		ActionClass	actionclass= new ActionClass();
		actionclass.browserInitialization();
		//actionclass.dragAndDrop();
		//actionclass.rightClick();
		//actionclass.doubleCLick();
		actionclass.mouseHover();
		//actionclass.clickMethod();

	}

}
