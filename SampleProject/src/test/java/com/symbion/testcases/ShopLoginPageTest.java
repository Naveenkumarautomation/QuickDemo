package com.symbion.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.symbion.pages.ShopHomePage;
import com.symbion.pages.ShopLoginPage;
import com.symbion.pages.ShopTestBase;

public class ShopLoginPageTest extends ShopTestBase{
	
	public static ShopLoginPage LoginPage;
	ShopHomePage homePage;
	
	public ShopLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		LoginPage = new ShopLoginPage();
		
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		homePage = LoginPage.login(("shop.qa"), ("password"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
