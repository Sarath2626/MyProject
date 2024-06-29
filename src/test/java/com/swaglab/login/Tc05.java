package com.swaglab.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

public class Tc05 extends Base {


	@Test(description="The Username placeholder should be visible after the page redirection to the web application")
	public static void tc01() {
		
		driver.get(constant.url);

            
            String actualpasswordplaceholder = "//input[@id='password']";

            String expectedpassword = "//input[@id='password']";

            
            Assert.assertEquals(actualpasswordplaceholder, expectedpassword, "The page title match the expected title.");

            driver.quit();

	}
}


