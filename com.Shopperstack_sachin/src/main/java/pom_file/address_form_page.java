package pom_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class address_form_page {
	public address_form_page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	
	}
	@FindBy(id  ="Name")
	private WebElement nametf;
	
	@FindBy(id = "House/Office Info")
	private WebElement houseaddresstf;
	
	@FindBy(id = "Street Info")
	private WebElement streetinfotf;
	
	@FindBy(id = "Landmark" )
	private WebElement landmarktf;
	
	@FindBy(name = "country")
	private WebElement countrydd;
	
	@FindBy(name = "State")
	private WebElement statedd;
	
	@FindBy(id = "City")
	private WebElement citydd;
	
	@FindBy(id = "Phone Number")
	private WebElement phonenumbertf;
	
	@FindBy(id = "Pincode")
	private WebElement pincodetf;
	
	@FindBy(name = "addAdress")
	private WebElement addaddressbtn;
	
	@FindBy(xpath = "//div[@style='display: flex;']/input[@id='86829']")
	private WebElement addressradiobtn;
	
	public WebElement getNametf() {
		return nametf;
	}
	public WebElement getHouseaddresstf() {
		return houseaddresstf;
	}
	public WebElement getStreetinfotf() {
		return streetinfotf;
	}
	public WebElement getLandmarktf() {
		return landmarktf;
	}
	public WebElement getCountrydd() {
		return countrydd;
	}
	public WebElement getStatedd() {
		return statedd;
	}
	public WebElement getCitydd() {
		return citydd;
	}
	public WebElement getPhonenumbertf() {
		return phonenumbertf;
	}
	public WebElement getPincodetf() {
		return pincodetf;
	}
	public WebElement getAddaddressbtn() {
		return addaddressbtn;
	}
	public WebElement getAddressradiobtn() {
		return addressradiobtn;
	}
	
	
	
	
	
	
	
	
	
	

}
