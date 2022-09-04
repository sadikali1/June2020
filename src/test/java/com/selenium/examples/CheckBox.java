package com.selenium.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	
private WebDriver driver;
	
	@Test
	public void testFacbookSignUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/checkbox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		boolean status = driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
		System.out.println(status);
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		status = driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
		System.out.println(status);
		
		
	}

}
