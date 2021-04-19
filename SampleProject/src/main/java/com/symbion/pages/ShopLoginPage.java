package com.symbion.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.symbion.util.TimeUtil;

public class ShopLoginPage extends ShopTestBase{
	
	@FindBy(id="UserName")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ctl00_cplMain_Login2_LoginButton")
	WebElement loginBtn;
	
	public ShopLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ShopHomePage login(String un, String pwd) throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(TimeUtil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		username.sendKeys(un);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		return new ShopHomePage();
	}

}
