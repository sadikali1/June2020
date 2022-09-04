package com.test.jcpennary;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductDetailPage;
import com.pages.SignInPage;
import com.utils.BaseTest;

public class CheckoutWIthNewUser extends BaseTest {
	
	String product = "Fieldcrest Luxury Alden Linen Light-Filtering Rod Pocket Back Tab Single Curtain Panel";
	
	@Test
	public void testCheckOut() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.searchProduct(product);
		
		ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);
		productDetailPage.verifyProduct(product);
		
		productDetailPage.clickOnAddToCart();	
		productDetailPage.clickOnCheckOut();		
		
		CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
		cartPage.verifyProduct(product);
		cartPage.clickOnCheckOutButton();
		
		SignInPage singInPage = PageFactory.initElements(driver, SignInPage.class);
		singInPage.clickAccountButton();
	}

}
