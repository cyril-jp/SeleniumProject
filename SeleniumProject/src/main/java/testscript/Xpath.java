package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base
{
	void relativeXpath()
	{
		//tag[@attribute='value']
		WebElement txt1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement txt2 = driver.findElement(By.xpath("//div[@id='example_length']"));
		WebElement txt3 = driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement txt4 = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement txt5 = driver.findElement(By.xpath("//div[@id='message-one']"));
		
	}
	void text()
	{
		//tag[text()='text']
		WebElement txt1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement txt2 = driver.findElement(By.xpath("//div[text()='Showing 1 to 10 of 57 entries']"));
		WebElement txt3 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement txt4 = driver.findElement(By.xpath("//button[text()='Submit form']"));//form submit
		WebElement txt5 = driver.findElement(By.xpath("//button[text()='Get First Selected']"));
	}
	void contains()
	{
		WebElement txt1 = driver.findElement(By.xpath("//input[contains(@id,'input-field')]"));
		WebElement txt2 = driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		WebElement txt3 = driver.findElement(By.xpath("//button[contains(@id,'button-t')]"));
		WebElement txt4 = driver.findElement(By.xpath("//div[contains(@id,'message-two')]"));
		WebElement txt5 = driver.findElement(By.xpath("//div[contains(@id,'example_wrapper')]"));
		
		//tag[contains(@attribute,'value')]
	}
	void startsWith()
	{
		//tag[starts-with(@attribute,'value')]
		WebElement txt1 = driver.findElement(By.xpath("//input[starts-with(@id,'single-in')]"));
		WebElement txt2 = driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement txt3 = driver.findElement(By.xpath("//div[starts-with(@id,'example_wr')]"));
		WebElement txt4 = driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
		WebElement txt5 = driver.findElement(By.xpath("//div[starts-with(@id,'message-two')]"));
		
		
	}
	void and()
	{
		//tag[@attribute='value' and @attribute='value']
		WebElement txt1 = driver.findElement(By.xpath("//input[@id='single-input-field' and @class='form-control']"));
		WebElement txt2 = driver.findElement(By.xpath("//input[@id='single-input-field' and @class='form-control datepicker']"));
		WebElement txt3 = driver.findElement(By.xpath("//div[@id='example_filter' and @class='dataTables_filter']"));
		WebElement txt4 = driver.findElement(By.xpath("//div[@id='example_length' and  @class='dataTables_length']"));
		WebElement txt5 = driver.findElement(By.xpath("//div[@id='example_wrapper' and @class='dataTables_wrapper']"));
		
	}
	void or()
	{
		WebElement txt1 = driver.findElement(By.xpath("//input[@id='single-input-field' or @class='form-control']"));
		WebElement txt2 = driver.findElement(By.xpath("//input[@id='single-input-field' or @class='form-control datepicker']"));
		WebElement txt3 = driver.findElement(By.xpath("//div[@id='example_filter' or @class='dataTables_filter']"));
		WebElement txt4 = driver.findElement(By.xpath("//div[@id='example_length' or  @class='dataTables_length']"));
		WebElement txt5 = driver.findElement(By.xpath("//div[@id='example_wrapper' or @class='dataTables_wrapper']"));
		//tag[@attribute='value' or @attribute='value']
	}

}

