package com.selenium.examples;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS {
	

	@Test
	public void testSelenium() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById(\"downloadButton\").click()");
		js.executeScript("window.scrollTo(1000, 1000)");
	}
}
