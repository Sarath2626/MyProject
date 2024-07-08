package pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglab.Helper.Base;

public class comswaglablogin extends Base {

	// This is constructor
	public comswaglablogin() {

		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {s
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

	
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement Loginbutton;

	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement ErrorMessage;

	@FindBy(xpath = "//button[text()='Open Menu']")
	WebElement logout;

	@FindBy(xpath = "//a[@id='logout_sidebar_link'] ")
	WebElement logoutbutton;

	

	

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
