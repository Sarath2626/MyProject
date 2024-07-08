package com.swaglab.Productpage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comproductpage;
import pojo.comswaglablogin;

public class Tc01 extends Base{
	
	@Test(description="The user able to view the product on the poduct page")

	public static void tc03() throws InterruptedException {
		
		driver.get(constant.url);

		comswaglablogin loginpage = new comswaglablogin();

		loginpage.getUsername().sendKeys(constant.username);
		
		loginpage.getPassword().sendKeys(constant.password);

		loginpage.getLoginbutton().click();
		
		comproductpage pp = new comproductpage();
		
        String actual = pp.getProductpage().getText();
		
		//System.out.println(actual);

        String expected = "Products";

        
        Assert.assertEquals(actual, expected, "The page title match the expected title.");



}
	
}
