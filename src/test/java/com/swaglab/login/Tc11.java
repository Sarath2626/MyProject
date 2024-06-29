package com.swaglab.login;

import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comswaglablogin;

public class Tc11 extends Base{
	
	@Test(description="After user login than user able to logout the application")

	public static void tc03() throws InterruptedException {
		
		driver.get(constant.url);

		comswaglablogin loginpage = new comswaglablogin();

		loginpage.getUsername().sendKeys(constant.username);
		
		loginpage.getPassword().sendKeys(constant.password);

		loginpage.getLoginbutton().click();
		
		
		
		loginpage.getLogout().click();
	
		Thread.sleep(2000);
		
		loginpage.getLogoutbutton().click();

		
		
		

}
}
