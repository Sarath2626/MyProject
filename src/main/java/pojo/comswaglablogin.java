package pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglab.Helper.Base;

public class comswaglablogin extends Base{
	
	public comswaglablogin() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		Loginbutton = loginbutton;
	}


	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement Loginbutton;
	
	
	@FindBy (xpath = "//h3[@data-test='error']")
	WebElement ErrorMessage;
	
	@FindBy (xpath ="//button[text()='Open Menu']")
    WebElement logout;
     
	@FindBy (xpath ="//a[@id='logout_sidebar_link'] ")
    WebElement logoutbutton;
	
	@FindBy (xpath ="//a[@id='item_4_img_link']/../../div[3]/button")
	WebElement Addtocartbutton;
	
	@FindBy (xpath ="//a[@class='shopping_cart_link fa-layers fa-fw']")
	WebElement Addtocart;
	
	@FindBy (xpath ="//div[text()='Products']")
	WebElement productpage;
	
	@FindBy (xpath="//div[text()='Sauce Labs Backpack']")
	WebElement productbrandname;
	
	@FindBy (xpath = "//img[@class='inventory_item_img']")
	List<WebElement> Images;
	
	public List<WebElement> getImages() {
		return Images;
	}

	public void setImages(List<WebElement> images) {
		Images = images;
	}

	public WebElement getProductbrandname() {
		return productbrandname;
	}

	public void setProductbrandname(WebElement productbrandname) {
		this.productbrandname = productbrandname;
	}

	public WebElement getProductpage() {
		return productpage;
	}

	public void setProductpage(WebElement productpage) {
		this.productpage = productpage;
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}

	public void setAddtocart(WebElement addtocart) {
		Addtocart = addtocart;
	}

	public WebElement getAddtocartbutton() {
		return Addtocartbutton;
	}

	public void setAddtocartbutton(WebElement addtocartbutton) {
		Addtocartbutton = addtocartbutton;
	}

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}

	public void setLogoutbutton(WebElement logoutbutton) {
		this.logoutbutton = logoutbutton;
	}

	public WebElement getErrorMessage() {
		return ErrorMessage;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}

	public void setErrorMessage(WebElement errorMessage) {
		ErrorMessage = errorMessage;
	}
	
	

}
