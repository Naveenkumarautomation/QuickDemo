package com.symbion.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.symbion.pages.ShopHomePage;
import com.symbion.pages.ShopLoginPage;
import com.symbion.pages.ShopProductOrderingPage;
import com.symbion.pages.ShopTestBase;

public class ShopProductOrderingPageTest extends ShopTestBase {
	
	ShopLoginPage LoginPage;
	ShopHomePage homePage;
	ShopProductOrderingPage productOrderingPage;
	
	public ShopProductOrderingPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		LoginPage = new ShopLoginPage();
		homePage = LoginPage.login(("shop.qa"), ("password"));
		productOrderingPage = new ShopProductOrderingPage();
}
		
	@Test
	public void OrderingSelection() throws InterruptedException {
		homePage.OrderingMenuSelect();
		Thread.sleep(5000);
		productOrderingPage.searchProducts();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}


}
