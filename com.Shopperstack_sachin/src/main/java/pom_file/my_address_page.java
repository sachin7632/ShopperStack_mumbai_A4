package pom_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  my_address_page {
	public my_address_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addaddressbtn;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement popbtn;
	
	public WebElement getPopbtn() {
		return popbtn;
	}

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeSmall MuiButton-textSizeSmall  css-1bhvu8']")
	private WebElement deletbtn;
	
	@FindBy(xpath = "(//span[@class='MuiTouchRipple-root css-w0pj6f'])[3]")
	private WebElement yesbtn;

	public WebElement getAddaddressbtn() {
		return addaddressbtn;
	}

	public WebElement getDeletbtn() {
		return deletbtn;
	}

	public WebElement getYesbtn() {
		return yesbtn;
	}
}


