package com.pageobjectmodule;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginpagetest {
	@Test(dataProvider="getdata")
public void loginpageobject(Object username,Object password) {
		System.setProperty("webdriver.chrome.driver","F://selenium files//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		loginpageobject pageobject=new loginpageobject(driver);
		pageobject.getuserName().sendKeys(username.toString());
		pageobject.getpassword().sendKeys(password.toString());
		pageobject.getloginbutton().click();
		
	}
@DataProvider(name="gatdata")
public Object[][]getdata(){
	Object[][] data=new Object[2][2];
	data[0][0]="username";
	data[0][1]="password";
	
	data[1][0]="username1";
	data[1][1]="password1";
	return data;
}
}
