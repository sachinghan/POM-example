package com.demoaut.newtours.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	@FindBy(css="input[value='Business']")
	@CacheLookup
	private WebElement businessClass;
	
	@FindBy(name="airline")
	@CacheLookup
	private WebElement flight;
	
	@FindBy(name="findFlights")
	@CacheLookup
	private WebElement submit;
	
	public FlightFinder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void findingFlight()
	{
		businessClass.click();
		Select drpDownFlight= new Select(flight);
		drpDownFlight.selectByIndex(2);
		submit.click();
		
		
	}
	
	

}
