package com.swaglab.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comswaglablogin;  





public class Tc04 extends Base{
	

	@Test(description="The Username placeholder should be visible after the page redirection to the web application")
	public static void tc01() {
		
		driver.get(constant.url);

            
            String actualusernameplaceholder = "//input[@id='user-name']";

            String expectedusernameTitle = "//input[@id='user-name']";

            Assert.assertEquals(actualusernameplaceholder, expectedusernameTitle, "The page title match the expected title.");

            driver.quit();

	}
}
	



