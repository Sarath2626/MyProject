package com.swaglab.Productpage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;

import pojo.comswaglablogin;

public class Tc02 extends Base{
	
	@Test(description="All products should have the particular image")

	public static void tc02() throws InterruptedException {
		
		driver.get(constant.url);

		comswaglablogin loginpage = new comswaglablogin();

		loginpage.getUsername().sendKeys(constant.username);
		
		loginpage.getPassword().sendKeys(constant.password);

		loginpage.getLoginbutton().click();
		
		loginpage.getAddtocartbutton().click();
		
		 //String actual = loginpage.getProductbrandname().getText();
		 
          int size = loginpage.getImages().size();

          System.out.println(size);

		 	for(WebElement x:loginpage.getImages() )
		 		{
			  boolean displayed = x.isDisplayed();
			 if(displayed==true) {
				 
				assertEquals(displayed, true);
				
			 }
		 				
		 		}     

		 System.out.println("The images diplayed");	
	
	}
}

