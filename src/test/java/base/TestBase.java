package base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {
	
	public static WebDriver driver;
	
		public static WebDriverWait wait;
	
	
	
	
	@BeforeSuite
	public void setUp()
	{
		
		if(driver==null)
		{
			 driver = new FirefoxDriver();
		}
		 driver.get("http://gmail.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		 wait = new WebDriverWait(driver,60);
		
		 
			
		
			
	}
	
	@AfterSuite
	public void tearDown()
	{
		//driver.quit();
	}

}
