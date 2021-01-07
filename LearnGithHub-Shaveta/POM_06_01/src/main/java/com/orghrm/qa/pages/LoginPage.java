package com.orghrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	private By userRole_dd  = By.name("user_role");
	private By username_txt = By.name("user_name");
	private By password_txt = By.name("password");
	private By login_btn    = By.name("login");
	
	
	public WebElement getUserRole_dd() {
		WebElement userRole = getElement(userRole_dd);
		return userRole;
	}
	public WebElement getUserName_txt() {
		WebElement username = getElement(username_txt);
		return username;
	}
	
	public WebElement getPassword_txt() {
		WebElement password = getElement(password_txt);
		return password;
	}
	
	public WebElement getLogin_btn() {
		WebElement loginBtn = getElement(login_btn);
		return loginBtn;
	}
	
	
	public HomePage doLogin(String userRole,String userName,String password) {
		getUserRole_dd().sendKeys(userRole);
		getUserName_txt().sendKeys(userName);
		getPassword_txt().sendKeys(password);
		getLogin_btn().click();
		HomePage homePage =  new HomePage();
		return homePage;
	}
}
