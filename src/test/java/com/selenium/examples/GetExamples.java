package com.selenium.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetExamples {

	private WebDriver driver;

	@Test
	public void testFacbookSignUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title =  driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Facebook – log in or sign up", title);
		
		//String source = driver.getPageSource();		
		//System.out.println(source);
		
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//String url = driver.getCurrentUrl();
		//System.out.print(url);		
		//Assert.assertTrue(url.contains("ogin/identify"));
		
		//driver.navigate().refresh();
		//driver.navigate().back();
		//driver.navigate().forward();
		
		WebElement element = driver.findElement(By.xpath("//h2"));
		
		String text = element.getText();
		System.out.println(text);
		Assert.assertEquals("Facebook helps you connect and share with the people in your life.", text);
		
		WebElement input = driver.findElement(By.id("email"));
		String att = input.getAttribute("aria-label");
		System.out.println(att);
		
		WebElement loginButton = driver.findElement(By.name("login"));
		String fontSizeValue = loginButton.getCssValue("font-size");
		System.out.println(fontSizeValue);
		
		Point point = loginButton.getLocation();
		System.out.println(point.getX() + " " + point.getY());
		
		Dimension dim = loginButton.getSize();
		System.out.println(dim.getHeight() + " "+ dim.getWidth());
		
		String name = loginButton.getTagName();
		System.out.println(name);
	}
	
	
}
