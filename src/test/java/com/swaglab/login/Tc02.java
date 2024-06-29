package com.swaglab.login;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.Helper.Base;
import com.swaglab.constant.constant;


import pojo.comswaglablogin;

public class Tc02 extends Base{
	
	@Test(description="The page title should be correct")
	public static void tc01() {
		driver.get(constant.url);
		comswaglablogin loginpage = new comswaglablogin();
		  

		String Actualtitle =  driver.getTitle();
		
		String title =  "Swag Labs";
		Assert.assertEquals(Actualtitle, title);

		

	    }
	}


