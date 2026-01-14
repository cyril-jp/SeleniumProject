package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base
{
	void tagandId()
	{
		WebElement msg1= driver.findElement(By.cssSelector("button#button-one"));
		WebElement msg2= driver.findElement(By.cssSelector("button#button-two"));
		WebElement msg3=driver.findElement(By.cssSelector("div#collapsibleNavbar"));//nav bar at the top
		WebElement msg4=driver.findElement(By.cssSelector("a#progress-bars"));
		WebElement msg5=driver.findElement(By.cssSelector("input#single-input-field"));//date picker field
		
		
	}
	void tagandClass()
	{
		WebElement txt1=driver.findElement(By.cssSelector("input.form-control"));
		WebElement txt2=driver.findElement(By.cssSelector("section.clearfix"));//date picker
		WebElement txt3=driver.findElement(By.cssSelector("div.dataTables_wrapper"));
		WebElement txt4=driver.findElement(By.cssSelector("div.dataTables_filter"));
		WebElement txt5=driver.findElement(By.cssSelector("div.dataTables_length"));//table >table filter
		
		
		}
	void tagclassandAttribute()
	{
		WebElement tmsg1=driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
		WebElement tmsg2=driver.findElement(By.cssSelector("div.my-2[id='message-one']"));
		WebElement tmsg3=driver.findElement(By.cssSelector("div.dataTables_filter[id='example_filter']"));//table>table filter
		WebElement tmsg4=driver.findElement(By.cssSelector("div.dataTables_length[id='example_length']"));//""
		WebElement tmsg5=driver.findElement(By.cssSelector("div.dataTables_wrapper[id='example_wrapper']"));//""
		
	}
	void tagandAttribute()
	{
		WebElement tmsg1=driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement tmsg2=driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement tmsg3=driver.findElement(By.cssSelector("div[id='example_length']"));//table filter
		WebElement tmsg4=driver.findElement(By.cssSelector("div[id='example_filter']"));//""
		WebElement tmsg5=driver.findElement(By.cssSelector("div[id='example_paginate']"));//""
	}
	
	}
	//1.Tag and ID(tag#id)
	//2.Tag and class(tag.class)
	//3.Tag and Attribute(tag[attribute='value']
	//4.Tag,class,and Attribute(tag.classname[attribute='value']

