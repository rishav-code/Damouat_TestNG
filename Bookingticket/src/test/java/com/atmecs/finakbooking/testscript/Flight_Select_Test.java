package com.atmecs.finakbooking.testscript;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.flightbooking.read.Flight_selectprop_read;
import com.atmecs.testbase.testscript.SetupDriver;

public class Flight_Select_Test extends SetupDriver {
	Flight_selectprop_read fsr= new Flight_selectprop_read();
	@Test(priority=3)
	public void selectFlight() throws FileNotFoundException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(fsr.takeproperties("loc.blue_skies_airlines_361.rbtn"))).click();
		driver.findElement(By.xpath(fsr.takeproperties("loc.pangea_airlines_362.rbtn"))).click();
		driver.findElement(By.xpath(fsr.takeproperties("loc.unified_airlines_363.rbtn"))).click();
		driver.findElement(By.xpath(fsr.takeproperties("loc.pangea_airlines_632.rbtn"))).click();
		driver.findElement(By.xpath(fsr.takeproperties("loc.blue_skies_airlines_631.rbtn"))).click();
		driver.findElement(By.xpath(fsr.takeproperties("loc.unified_airlines_633.rbtn"))).click();
		driver.findElement(By.xpath(fsr.takeproperties("loc.continue.btn"))).click();


		}

}
