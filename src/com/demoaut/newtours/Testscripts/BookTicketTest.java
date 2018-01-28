package com.demoaut.newtours.Testscripts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.demoaut.newtours.Pages.BookAFlight;
import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SelectFlight;

import reporter.JyperionListener;
@Listeners(JyperionListener.class)


public class BookTicketTest extends BaseTest{
	
BookTicketTest(){
	
}
	
	@Test
	public void ticketBooking()
	{
		Login lp= new Login(driver);
		FlightFinder ff= new FlightFinder(driver);
		SelectFlight sf= new SelectFlight(driver);
		BookAFlight bf= new BookAFlight(driver);
		
		
		lp.applicationLogin("mercury","mercury");
		ff.FindingFlight();
		sf.selectFlight();
		bf.flightBooking("chinmayee", "mohanty", "123ABC");
		
		String expectedMessage= "Your itinerary has been booked!";
		String actualMessage = driver.findElement(By.cssSelector
				("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	

}
