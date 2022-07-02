package com.pageobjectmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpageobject {
    private WebDriver driver;
    public loginpageobject(WebDriver driver) {
		this.driver=driver;
		
	}
	By userName=By.xpath("//*[@id='username']");
	By password=By.xpath("//*[@id='password']");
	By loginbutton=By.xpath("//*[@id='Login']");
	
	public WebElement getuserName() {
	return driver.findElement(userName);
	}
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public WebElement getloginbutton() {
		return driver.findElement(loginbutton);
	}
		
	}


