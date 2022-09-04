package com.selenium.examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUp {
	
	private WebDriver driver;
	
	@Test
	public void testFacbookSignUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement element = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		element.click();
		
		WebElement firstElement = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstElement.clear();
		firstElement.sendKeys("Testing");
				
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("testing");
		//driver.quit();
		
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select select = new Select(day);
		//select.selectByIndex(10);
		select.selectByValue("10");
		
		Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
		//selectMonth.selectByValue("3");
		selectMonth.selectByVisibleText("Mar");
		
	}
	
}


// implicit wait
// explicit wait 