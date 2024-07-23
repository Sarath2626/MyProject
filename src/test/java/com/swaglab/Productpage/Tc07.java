package com.swaglab.Productpage;

import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comproductpage;
import pojo.comswaglablogin;

public class Tc07 extends Base {
	@Test(description = "The after clicking the hyperlinks and buttons should be redirect to the particular respective pages ")

	public static void tc03() throws InterruptedException {

		driver.get(constant.url);

		comswaglablogin loginpage = new comswaglablogin();

		loginpage.getUsername().sendKeys(constant.username);

		loginpage.getPassword().sendKeys(constant.password);

		loginpage.getLoginbutton().click();
		
		
		comproductpage pp = new comproductpage();
		
	}
		 
		 


	
}
