package com.selenium.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumExample {
	
	private WebDriver driver;
	
	@Test
	public void testSelenium() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
	}

}


