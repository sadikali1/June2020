package com.test.steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	static WebDriver driver;

	@Before
	public void setup() {
		System.out.println("Before running scenario");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@BeforeStep
	public void beforeStep() {
		System.out.println("Before Running each Steps");
	}

	@AfterStep
	public void afterStep() {
		System.out.println("After Running each Steps");
	}

	@After
	public void tearDown() {
		System.out.println("After running scenario");
		driver.close();
	}

}
