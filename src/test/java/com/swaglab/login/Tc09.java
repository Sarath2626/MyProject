package com.swaglab.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comswaglablogin;

public class Tc09 extends Base {

	@Test(description="The Username placeholder should be visible after the page redirection to the web application")

	public static void tc03() {
		
		driver.get(constant.url);

		comswaglablogin loginpage = new comswaglablogin();

		loginpage.getUsername().sendKeys(constant.username);
		
		loginpage.getPassword().sendKeys(constant.password);

		loginpage.getLoginbutton().click();
		

		String Actualtitle =  driver.getTitle();
		
		String title =  "Swag Labs";
		
		Assert.assertEquals(Actualtitle, title);
		
		driver.quit();
	}

}

