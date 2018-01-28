package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {

	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(10) > tbody > tr:nth-child(5) > td.frame_action_xrows > input[type='radio']")

	private WebElement returnFlight;
	
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > p > input[type='image']")
	@CacheLookup
	private WebElement submit;
	
	public SelectFlight(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void selectFlight()
	{
		returnFlight.click();
		submit.click();
	}
	
}
