package com.swaglab.Productpage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comswaglablogin;

public class Tc04 extends Base{
	@Test(description="All the  products should have the brand name")

	public static void tc03() throws InterruptedException {
		
		driver.get(constant.url);

		comswaglablogin loginpage = new comswaglablogin();

		loginpage.getUsername().sendKeys(constant.username);
		
		loginpage.getPassword().sendKeys(constant.password);

		loginpage.getLoginbutton().click();
		
		 String actual = loginpage.getProductbrandname().getText();
			
			//System.out.println(actual);  

	        String expected = "Sauce Labs Backpack";

	        
	        Assert.assertEquals(actual, expected, "The page title match the expected title.");
	}	        

}
 