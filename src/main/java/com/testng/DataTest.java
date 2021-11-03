package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class DataTest {
	public static ChromeDriver driver;
	
	@Test(dataProvider="good")
	public void login(String name1, String name2)
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(name1);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(name2);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	}

@DataProvider(name="good")
static Object[][] canada()
	{
		return new Object[][] {
			{"Admin","admin123"}
		};
		
	}

}
