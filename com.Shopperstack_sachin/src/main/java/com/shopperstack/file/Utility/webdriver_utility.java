package com.shopperstack.file.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class webdriver_utility {
	Java_Utility javautility= new Java_Utility();
	public void selectyvalue(WebElement element,String value) {
	 Select sel= new Select(element);
	 sel.selectByValue(value);
	}
	
	
public void getscreenshotofwebpage(WebDriver driver) throws IOException {
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest= new File(FrameworkConstants.screenShotPath+javautility.getLocalDateandTime()+".png");
	FileHandler.copy(temp, dest);
			
}
public void getscreenshotofelement(WebElement element) throws IOException {
	
	File temp=element.getScreenshotAs(OutputType.FILE);
	File dest= new File(FrameworkConstants.screenShotPath+javautility.getLocalDateandTime()+".png");
	FileHandler.copy(temp, dest);
	
}
}
