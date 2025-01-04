package pom_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomepage1{
	public welcomepage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(id = "loginBtn")
		private WebElement loginbtn;
		public WebElement getLoginbtn() {
			return loginbtn;
		}
		
		
		
	}


