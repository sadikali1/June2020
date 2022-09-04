package com.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;	
	protected String userName;
	protected String password;
	public String browserType;
	
	@BeforeClass
	@Parameters({"BrowserType"})
	public void setup(String browser) throws IOException {
		if(browser == null)
			browserType = Configuration.config("BrowserType");
		else
			browserType = browser;
		
		if(browserType.equals("chrome") ) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserType.equals("firefox") ) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browserType.equals("edge") ) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.navigate().to(Configuration.config("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		userName = Configuration.config("UserName");
		password = Configuration.config("Password");
	}
	
	
	@AfterClass
	public void tearDown(ITestResult result) throws IOException {
		if(! result.isSuccess()) {
			takeScreenshot("file.png");
		}
		driver.quit();
	}
	
	public void takeScreenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File file1 = new File(name);
		FileUtils.copyFile(file, file1);
	}
}
