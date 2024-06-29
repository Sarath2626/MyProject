package com.swaglab.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comswaglablogin;

public class TC01 extends Base {

	@Test(description="The user should able redirect to the swaglab web application")

	public static void tc01() {
		
		driver.get(constant.url);

		Assert.assertEquals(driver.getCurrentUrl(), constant.url);
	

	}

}
