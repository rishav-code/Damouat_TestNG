package com.atmecs.finakbooking.testscript;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.atmecs.flightbooking.read.Flight_Book_Prop_Read;
import com.atmecs.testbase.testscript.SetupDriver;


public class Final_Submit extends SetupDriver{
	
	
	static Flight_Book_Prop_Read rd= new Flight_Book_Prop_Read();
	@Test(priority=4)
	public static void test() throws FileNotFoundException {
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name(rd.takeproperties("loc.firstname.txt"))).click();
		driver.findElement(By.name(rd.takeproperties("loc.firstname.txt"))).sendKeys("Saurabh");
		driver.findElement(By.name(rd.takeproperties("loc.lastname.txt"))).sendKeys("Chauhan");
		driver.findElement(By.name(rd.takeproperties("loc.mealdropdown.dpdn"))).click();
		{
			Select menuValues = new Select(driver.findElement(By.name(rd.takeproperties("loc.mealdropdown.dpdn"))));
			menuValues.selectByIndex(2);
		}
		driver.findElement(By.name(rd.takeproperties("loc.cardtype.dpdn"))).click();
		{
			Select cardType = new Select(driver.findElement(By.name(rd.takeproperties("loc.cardtype.dpdn"))));
			cardType.selectByVisibleText("MasterCard");
		}
		driver.findElement(By.name(rd.takeproperties("loc.cardnumber.txt"))).sendKeys("1232456123");
		driver.findElement(By.name(rd.takeproperties("loc.Expirationdate.dpdn"))).click();
		{
			Select expirationDate = new Select(driver.findElement(By.name(rd.takeproperties("loc.Expirationdate.dpdn"))));
			expirationDate.selectByVisibleText("05");
		}
		driver.findElement(By.name(rd.takeproperties("loc.Expiration_year.dpdn"))).click();
		{
			Select expirationDate = new Select(
					driver.findElement(By.name(rd.takeproperties("loc.Expiration_year.dpdn"))));
			expirationDate.selectByIndex(3);
		}
		driver.findElement(By.name(rd.takeproperties("loc.creditcardfirstname.txt"))).sendKeys("rishav");
		driver.findElement(By.name(rd.takeproperties("loc.creditcardmiddlename.txt"))).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@name='billAddress1")).sendKeys(" csr estates, ");
		driver.findElement(By.name(rd.takeproperties("loc.bAddress.txt2"))).sendKeys(" madhapur");
		driver.findElement(By.name(rd.takeproperties("loc.bcity.txt"))).sendKeys("deoghar");
		
		
		driver.findElement(By.name(rd.takeproperties("loc.bstate.txt"))).sendKeys("Jharkhand");
		driver.findElement(By.name(rd.takeproperties("loc.bpostalcode.txt"))).sendKeys("814112");
		driver.findElement(By.name(rd.takeproperties("loc.bcountry.dpdn"))).click();
		{
		Select country = new Select(driver.findElement(By.name(rd.takeproperties("loc.bcountry.dpdn"))));
		country.selectByIndex(14);
		}
		driver.findElement(By.name(rd.takeproperties("loc.dAddress.txt1"))).sendKeys("csr estates ");
		driver.findElement(By.name(rd.takeproperties("loc.dAddress.txt2"))).sendKeys(" madhapur");
		driver.findElement(By.name(rd.takeproperties("loc.dcity.txt"))).sendKeys("Hyderabad");
		driver.findElement(By.name(rd.takeproperties("loc.dstate.txt"))).sendKeys("Telangana");
		driver.findElement(By.name(rd.takeproperties("loc.dpostalcode.txt"))).sendKeys("814112");
		driver.findElement(By.name(rd.takeproperties("loc.dcountry.dpdn"))).click();
		{
		Select country = new Select(driver.findElement(By.name(rd.takeproperties("loc.dcountry.dpdn"))));
		country.selectByIndex(14);
		}
		driver.findElement(By.name(rd.takeproperties("loc.securepurchase.btn"))).click();
		}
	

		
		}
	