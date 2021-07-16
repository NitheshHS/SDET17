package com.crm.vtiger.organization;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrgTest {
	@Test
	public void createOrgTest() 
	{
		WebDriver driver=null;
		String browser = System.getProperty("BROWSER");
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("provide valid browser name!!!");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager", Keys.ENTER);
		
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	
	@Test
	public void formateDate() {
		SimpleDateFormat date = new SimpleDateFormat("dd MMM yyyy");
		String sysDate = date.format(new Date());
		System.out.println(sysDate);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 1);
		Date newDate = cal.getTime();
		String syDate=date.format(newDate);
		System.out.println(syDate);
	}

}
