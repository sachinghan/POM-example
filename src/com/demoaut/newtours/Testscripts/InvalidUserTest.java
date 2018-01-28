package com.demoaut.newtours.Testscripts;



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
public class InvalidUserTest extends BaseTest{
	InvalidUserTest(){
		
	}

	@Test
	public void invaliduserValidation()
	{
		Login lp=new Login(driver);
		lp.applicationLogin("user","user");
		
		String expectedTitle="Sign-on: Mercury To";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	
}


