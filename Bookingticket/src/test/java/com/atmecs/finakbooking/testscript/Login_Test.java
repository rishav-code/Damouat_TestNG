package com.atmecs.finakbooking.testscript;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.flightbooking.read.Login_pageprop_read;
import com.atmecs.testbase.testscript.SetupDriver;

public class Login_Test extends SetupDriver {
	static Login_pageprop_read lpr =new Login_pageprop_read();
	@Test(priority=1)
	public static void logintest() throws FileNotFoundException {
		
		driver.get("http://www.newtours.demoaut.com/.");
		driver.manage().window().maximize();
		WebElement login_username = (driver.findElement(By.name(lpr.takeproperties("loc.login.username.txt"))));
		login_username.click();
		login_username.sendKeys("mercury");
		WebElement login_password = (driver.findElement(By.name(lpr.takeproperties("loc.login.password.txt"))));
		login_password.click();
		login_password.sendKeys("mercury");
		WebElement login_signin = (driver.findElement(By.name(lpr.takeproperties("loc.login.signin.btn"))));
		login_signin.click();

}
}