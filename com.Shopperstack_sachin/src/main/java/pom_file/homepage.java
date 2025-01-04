package pom_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
 public	homepage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
  
 
 @FindBy(xpath = "//span[contains(@class,'BaseBadge-badge')]")
 private WebElement accountsettingsbtn;
 
 @FindBy(xpath = "//li [text()='My Profile']")
 private WebElement myprofilebtn;
 
 @FindBy(xpath = "//li[text()='Logout']")
 private WebElement logoutbtn;

public WebElement getAccountsettingsbtn() {
	return accountsettingsbtn;
}

public WebElement getMyprofilebtn() {
	return myprofilebtn;
}

public WebElement getLogoutbtn() {
	return logoutbtn;
}
}
