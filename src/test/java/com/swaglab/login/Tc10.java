package com.swaglab.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comswaglablogin;

public class Tc10 extends Base {
	

	@Test(description="The Username placeholder should be visible after the page redirection to the web application")

	public static void tc03() {
		
		driver.get(constant.url);

		comswaglablogin loginpage = new comswaglablogin();

		loginpage.getUsername().sendKeys(constant.username1);
		
		loginpage.getPassword().sendKeys(constant.password1);

		loginpage.getLoginbutton().click();
		
        String actual = loginpage.getErrorMessage().getText();
		
		//System.out.println(actual);

        String expected = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actual, expected, "The page title match the expected title.");

		driver.quit();
	}



}
