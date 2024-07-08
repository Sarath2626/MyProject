package com.swaglab.Productpage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comproductpage;
import pojo.comswaglablogin;

public class Tc06 extends Base{
	
	@Test(description = "All the products  should have the addtocart button ")

	public static void tc03() throws InterruptedException {

		driver.get(constant.url);

		comswaglablogin loginpage = new comswaglablogin();

		loginpage.getUsername().sendKeys(constant.username);

		loginpage.getPassword().sendKeys(constant.password);

		loginpage.getLoginbutton().click();
		

        // Navigate to the product page
        comproductpage pp = new comproductpage();

        // Retrieve all "Add to Cart" buttons
        WebElement addToCartButtons = pp.getAddtocartbutton();

       
}
	
}
