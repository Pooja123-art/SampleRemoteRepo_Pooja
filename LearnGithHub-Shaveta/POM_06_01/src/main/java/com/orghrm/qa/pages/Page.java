package com.orghrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

abstract public class Page {
	WebDriver driver;
	abstract public String getPageTitle();
	abstract public WebElement getElement(By locator);
//
	// abstract public void getPageHeading();---->
	//	abstract public void getElements();
	//	//Wait
	//	abstract public void waitForElement();
}
