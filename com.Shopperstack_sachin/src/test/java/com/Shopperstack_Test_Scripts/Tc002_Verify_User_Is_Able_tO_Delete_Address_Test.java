package com.Shopperstack_Test_Scripts;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.shopperstack.file.Utility.Base_Text;
import com.shopperstack.file.Utility.webdriver_utility;

import pom_file.my_address_page;
import pom_file.my_profile_page;

public class Tc002_Verify_User_Is_Able_tO_Delete_Address_Test extends Base_Text {

	
	
	@Test
	public void deleteaddress() throws InterruptedException, IOException {
		homepage.getAccountsettingsbtn().click();
		homepage.getMyprofilebtn().click();
		
		my_profile_page myprofilepage= new my_profile_page(driver);
		myprofilepage.getMyaddressbtn().click();
		
		Thread.sleep(3000);
		my_address_page myaddresspage= new my_address_page(driver);
		myaddresspage.getDeletbtn().click();
		Thread.sleep(5000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",myaddresspage.getPopbtn());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(3000);
		webdriver_utility webdriverutilitys = new webdriver_utility();
		webdriverutilitys.getscreenshotofwebpage(driver);
		Thread.sleep(2000);
		
		
	}
}
