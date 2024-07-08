package com.swaglab.Productpage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comproductpage;
import pojo.comswaglablogin;

public class Tc05 extends Base {

	@Test(description = "All the products  should have the addtocart button ")

	public static void tc03() throws InterruptedException {

		driver.get(constant.url);

		comswaglablogin loginpage = new comswaglablogin();

		loginpage.getUsername().sendKeys(constant.username);

		loginpage.getPassword().sendKeys(constant.password);

		loginpage.getLoginbutton().click();
		
		comproductpage pp = new comproductpage();


		String actual = pp.getAddtocartbutton().getText();

		String expected = "ADD TO CART";

		Assert.assertEquals(actual, expected, "The addtocart button should be visible on the product page");
	}

}
