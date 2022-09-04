package com.test.jcpennary;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.ProductDetailPage;
import com.utils.BaseTest;

public class Seach extends BaseTest {
		
	String product = "Fieldcrest Luxury Alden Linen Light-Filtering Rod Pocket Back Tab Single Curtain Panel";
		
	@Test
	public void testClick() {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		
		homePage.searchProduct(product);
		
		String title = driver.findElement(By.cssSelector("h1[data-automation-id='product-title']")).getText();
		Assert.assertEquals(title, product);
		
		ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);
		productDetailPage.verifyProduct(product);
		
	}	
	

}
