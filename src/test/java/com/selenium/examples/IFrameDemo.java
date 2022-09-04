package com.selenium.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameDemo {
	
	private WebDriver driver;
	
	@Test
	public void testIFrame() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		String content = driver.findElement(By.xpath("//div[@id=\"framesWrapper\"]/div")).getText();
		System.out.println(content);
		
	}
	
	
	@Test
	public void testNestedIFrame() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.switchTo().frame("frame1");
		String text = driver.findElement(By.xpath("//body")).getText();
		System.out.println(text);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));		
		String childText = driver.findElement(By.xpath("//p")).getText();
		System.out.println(childText);
		
		driver.switchTo().defaultContent();
		String content = driver.findElement(By.xpath("//div[@id=\"framesWrapper\"]/div")).getText();
		System.out.println(content);
		
	}

}
