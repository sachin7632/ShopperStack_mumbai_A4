package com.shopperstack.file.Utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners_Utilility implements ITestListener {
	Base_Text basetext= new Base_Text();
	Java_Utility javautility= new Java_Utility();
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)basetext.sDriver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File tem= new File(FrameworkConstants.screenShotPath+javautility.getLocalDateandTime()+".png");
		try {
			FileHandler.copy(temp, tem);
		} catch (IOException e) {
			
			e.printStackTrace();
		}


	}
}
