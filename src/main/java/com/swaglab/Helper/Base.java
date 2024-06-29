package com.swaglab.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import com.swaglab.constant.constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	@BeforeMethod
	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();

		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();

	}

}
