package com.orghrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage extends Page {

	@Override
	public String getPageTitle() { 
		 String actualTitle = driver.getTitle();
		 return actualTitle;
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement elm = driver.findElement(locator);
		 return elm;
	}

	 

}
