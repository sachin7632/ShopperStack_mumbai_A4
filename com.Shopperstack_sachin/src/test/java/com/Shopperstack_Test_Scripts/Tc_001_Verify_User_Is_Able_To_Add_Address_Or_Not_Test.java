package com.Shopperstack_Test_Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.shopperstack.file.Utility.Base_Text;
import pom_file.address_form_page;
import pom_file.my_address_page;
import pom_file.my_profile_page;

public class Tc_001_Verify_User_Is_Able_To_Add_Address_Or_Not_Test  extends Base_Text{
	@Test
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException {
		homepage.getAccountsettingsbtn().click();
		homepage.getMyprofilebtn().click();
		
		
		my_profile_page myprofilepage= new my_profile_page(driver);
		myprofilepage.getMyaddressbtn().click();
		
		Thread.sleep(2000);
		my_address_page myaddress= new my_address_page(driver);
		myaddress.getAddaddressbtn().click();
		
		address_form_page addressformpage= new address_form_page(driver);
		addressformpage.getNametf().sendKeys(fileutility.readdatafromexcelfile("sheet1", 1, 0));
		addressformpage.getHouseaddresstf().sendKeys(fileutility.readdatafromexcelfile("Sheet1",1 , 1));
		Thread.sleep(2000);
		addressformpage.getStreetinfotf().sendKeys(fileutility.readdatafromexcelfile("Sheet1",1 , 2));
		addressformpage.getLandmarktf().sendKeys(fileutility.readdatafromexcelfile("Sheet1",1 , 3));
		Thread.sleep(2000);
		addressformpage.getCountrydd().sendKeys("India");
		//webdriverutility.selectyvalue(addaddressformpage.getCountrydd(),fileutility.readdatafrompropertyfile("country"));
		Thread.sleep(2000);
		addressformpage.getStatedd().sendKeys("Maharashtra");
		Thread.sleep(2000);
		addressformpage.getCitydd().sendKeys("Pune");
		//webdriverutility.selectyvalue(addaddressformpage.getCitydd(), fileutility.readdatafrompropertyfile(City));
		Thread.sleep(2000);
		
		addressformpage.getPincodetf().sendKeys(fileutility.readdatafromexcelfile("Sheet1", 1, 4));
		
		addressformpage.getPhonenumbertf().sendKeys(fileutility.readdatafromexcelfile("Sheet1", 1,5 ));
		addressformpage.getAddaddressbtn().click();
		
		Thread.sleep(3000);
		Webdriverutility.getscreenshotofwebpage(driver);
		Thread.sleep(10000);
		
	}

}
