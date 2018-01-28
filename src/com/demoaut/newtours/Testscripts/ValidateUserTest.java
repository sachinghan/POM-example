package com.demoaut.newtours.Testscripts;

import java.util.concurrent.TimeUnit;



import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import reporter.JyperionListener;

import com.demoaut.newtours.Pages.Login;

@Listeners(JyperionListener.class)

public class ValidateUserTest extends BaseTest{
	ValidateUserTest(){
	}
	
	@Test
	public void userValidation()
	{
		Login lp=new Login(driver);
		lp.applicationLogin("mercury","mercury");
		
		String expectedTitle="Find a Flight: Mercury Tours:";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	

}
