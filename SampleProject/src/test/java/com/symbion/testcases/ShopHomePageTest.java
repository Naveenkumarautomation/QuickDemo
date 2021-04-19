package com.symbion.testcases;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.symbion.pages.ShopHomePage;
import com.symbion.pages.ShopLoginPage;
import com.symbion.pages.ShopTestBase;

public class ShopHomePageTest extends ShopTestBase{

	ShopLoginPage LoginPage;
	ShopHomePage homePage;
	
	public ShopHomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		LoginPage = new ShopLoginPage();
		homePage = LoginPage.login(("shop.qa"), ("password"));
}
		
	@Test
	public void OrderingSelection() throws InterruptedException {
		homePage.OrderingMenuSelect();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
