package TestScript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling extends Base
{
	void tablePrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table1=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table1.getText());
		
	}
	void rowPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table1=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		System.out.println(table1.getText());
		
	}
	void cellPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table1=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[3]"));
		System.out.println(table1.getText());
	}
	void columnPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> table1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		for(WebElement table:table1)
		System.out.println(table.getText());
		
	}
	void checkColumnPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> table2=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(WebElement table:table2)
		{
			String str=table.getText();
		   if(str.equalsIgnoreCase("Ashton cox"))	
		   {
			   System.out.println("Ashton Cox is present");
//			   break;
			   
		   }
//		   else
//			   System.out.println("Ashton Cox is not present"); 
		

		}
	}
	

	public static void main(String[] args) {
		TableHandling tablehandling=new TableHandling();
		tablehandling.browserInitialization();
		//tablehandling.tablePrinting();
		//tablehandling.rowPrinting();
		//tablehandling.cellPrinting();
		//tablehandling.columnPrinting();
		tablehandling.checkColumnPrinting();
		// TODO Auto-generated method stub

	}

}
