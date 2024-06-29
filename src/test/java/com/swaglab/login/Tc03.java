package com.swaglab.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comswaglablogin;

public class Tc03 extends Base {
	
	@Test

	public static void tc03() {
		driver.get(constant.url);

		comswaglablogin loginpage = new comswaglablogin();

		loginpage.getUsername().sendKeys(constant.username);


		loginpage.getLoginbutton().click();
		
		WebElement click=driver.findElement(By.xpath("//button[contains(text(), 'ADD TO CART')]"));
		
		click.click();

	}

}
