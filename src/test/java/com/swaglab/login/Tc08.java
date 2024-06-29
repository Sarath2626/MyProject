package com.swaglab.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comswaglablogin;

public class Tc08 extends Base{
	

	@Test(description="The Username placeholder should be visible after the page redirection to the web application")

	public static void tc03() {
		
		driver.get(constant.url);

		comswaglablogin loginpage = new comswaglablogin();

		loginpage.getUsername().sendKeys(constant.username2);

		loginpage.getLoginbutton().click();
		
        String actual = loginpage.getErrorMessage().getText();
		
		//System.out.println(actual);

        String expected = "Epic sadface: Password is required";
        
        Assert.assertEquals(actual, expected, "The page title match the expected title.");
		
		//driver.quit();
	}

}

