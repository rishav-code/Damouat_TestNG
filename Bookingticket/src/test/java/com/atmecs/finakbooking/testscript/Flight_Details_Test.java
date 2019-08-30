package com.atmecs.finakbooking.testscript;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.flightbooking.read.Flidht_detailsprop_read;
import com.atmecs.testbase.testscript.SetupDriver;

public class Flight_Details_Test extends SetupDriver {
	
	Flidht_detailsprop_read fdr = new Flidht_detailsprop_read();
	@Test(priority=2)
	public void flightDetails() throws FileNotFoundException {
		// driver.get(prop.getProperty("url"));
		// driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath(fdr.takeproperties("loc.roundTrip.rbtn"))).click();
		driver.findElement(By.name(fdr.takeproperties("loc.passengers.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(fdr.takeproperties("loc.passengers.dpdn")));
			dropdown.findElement(By.xpath("//option[@value= '3']")).click();
		}
		driver.findElement(By.name(fdr.takeproperties("loc.passengers.dpdn"))).click();
		driver.findElement(By.name(fdr.takeproperties("loc.departingFrom.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(fdr.takeproperties("loc.departingFrom.dpdn")));
			dropdown.findElement(By.xpath("//option[@value='Acapulco']")).click();
			
		}
		driver.findElement(By.name(fdr.takeproperties("loc.departingFrom.dpdn"))).click();
		driver.findElement(By.name(fdr.takeproperties("loc.on.month.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(fdr.takeproperties("loc.on.month.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '1']")).click();
		}
		driver.findElement(By.name(fdr.takeproperties("loc.on.month.dpdn")));
		driver.findElement(By.name(fdr.takeproperties("loc.on.day.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(fdr.takeproperties("loc.on.day.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '21']")).click();
		}
		driver.findElement(By.name(fdr.takeproperties("loc.on.day.dpdn"))).click();
		driver.findElement(By.name(fdr.takeproperties("loc.arrivingIn.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(fdr.takeproperties("loc.arrivingIn.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = 'Paris']")).click();
		}
		driver.findElement(By.name(fdr.takeproperties("loc.arrivingIn.dpdn"))).click();
		driver.findElement(By.name(fdr.takeproperties("loc.returning.month.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(fdr.takeproperties("loc.returning.month.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '10']")).click();
		}
		driver.findElement(By.name(fdr.takeproperties("loc.returning.month.dpdn"))).click();
		driver.findElement(By.name(fdr.takeproperties("loc.returning.day.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(fdr.takeproperties("loc.returning.day.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '10']")).click();
		}
		driver.findElement(By.name(fdr.takeproperties("loc.returning.day.dpdn"))).click();
		driver.findElement(By.xpath(fdr.takeproperties("loc.serviceClass.economy.rbtn"))).click();
		driver.findElement(By.xpath(fdr.takeproperties("loc.serviceClass.business.rbtn"))).click();
		driver.findElement(By.xpath(fdr.takeproperties("loc.serviceClass.firstClass.rbtn"))).click();
		driver.findElement(By.name(fdr.takeproperties("loc.airline.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(fdr.takeproperties("loc.airline.dpdn")));
			dropdown.findElement(By.xpath("//option[value = 'Blue Skies Airlines']")).click();
		}
		driver.findElement(By.name(fdr.takeproperties("loc.airline.dpdn"))).click();
		driver.findElement(By.name(fdr.takeproperties("loc.continue.btn"))).click();
	}
}


