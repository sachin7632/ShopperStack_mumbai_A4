package com.shopperstack.file.Utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pom_file.address_form_page;
import pom_file.homepage;
import pom_file.loginpage;
import pom_file.my_address_page;
import pom_file.my_profile_page;
import pom_file.welcomepage1;

public class Base_Text {
	
	
	
	public WebDriver driver;
	public	static WebDriver sDriver;
	public File_Utility fileutility= new File_Utility();
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public welcomepage1 welcomepage;
	public loginpage loginpage;
	public WebDriverWait wait;
	public homepage homepage;
	public Java_Utility javautility= new Java_Utility();
	public my_profile_page myprofilepage;
	public webdriver_utility webdriverutility;
	public address_form_page addaddressformpage;
	public webdriver_utility Webdriverutility = new webdriver_utility();
	
	
	
	
	
	@BeforeSuite
	public void beforesuit() {
		System.out.println("@BeforeSuit");
	}	
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("@BeforeTest");
		spark= new ExtentSparkReporter(FrameworkConstants.extentReportPath+javautility.getLocalDateandTime()+".html");
		reports = new ExtentReports();
		reports.attachReporter(spark);
		test= reports.createTest("Demo");
		}
	
	@BeforeClass
	public void BeforeClass() throws IOException
	{System.out.println("@Beforeclass");
	String browserName = fileutility.readdatafrompropertyfile("browserName");
	String url= fileutility.readdatafrompropertyfile("url");
	if(browserName.contains("chrome")) {
		driver= new ChromeDriver();
	}
	else if (browserName.contains("firefox")) {
		driver=new FirefoxDriver();
	}
	else if (browserName.contains("edge")) {
		driver= new EdgeDriver();
		
	}
	else {
		System.out.println("enter A Valid Browser Name");
		
	}
	sDriver= driver;
	wait= new WebDriverWait(driver, Duration.ofSeconds(15));
	homepage= new homepage(driver);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get(url);
	}
	
	
	@BeforeMethod
	public void BeforeMethod() throws IOException {
		System.out.println("@BeforeMethod");
		welcomepage= new welcomepage1(driver);
		wait.until(ExpectedConditions.elementToBeClickable(welcomepage.getLoginbtn()));
		
		welcomepage.getLoginbtn().click();
		loginpage= new loginpage(driver);
		loginpage.getEmailtextfield().sendKeys(fileutility.readdatafrompropertyfile("username"));
		loginpage.getPasswordtextfield().sendKeys(fileutility.readdatafrompropertyfile("password"));
		loginpage.getLoginbtn().click();
		
		
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("@aftermethod");
		homepage.getAccountsettingsbtn().click();
		homepage.getLogoutbtn().click();
		
	}	
	@AfterClass
	public void afterclass() throws InterruptedException {
		System.out.println("@Afterclass");
		Thread.sleep(2000);
		driver.quit();
	}	
	@AfterTest
	public void aftertest() {
		System.out.println("@AfterTest");
		reports.flush();
	}	
	@AfterSuite
	public void aftersuite() {
		System.out.println("@Aftersuit");
	}	
	
	
	
	
	

}
