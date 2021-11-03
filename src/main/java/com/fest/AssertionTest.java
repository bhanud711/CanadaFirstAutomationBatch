package com.fest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	@Test
	public void joinPage()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String url="https://www.ihg.com/rewardsclub/us/en/enrollment/join";
		//Assert.assertTrue(driver.getCurrentUrl().equals(url));
		//String name = driver.getCurrentUrl();
		//Assert.assertSame(name, url);
		//driver.findElement(By.id("firstName")).sendKeys("Ramarao");
		
	SoftAssert a=new SoftAssert();
	//a.assertTrue(driver.getCurrentUrl().equals(url));
	a.assertEquals(driver.getCurrentUrl(), url);
	
	driver.findElement(By.id("firstName")).sendKeys("Ramarao");
	}

}
