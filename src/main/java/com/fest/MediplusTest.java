package com.fest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MediplusTest {
	public static ChromeDriver driver;
	@Test
	public void mediplus()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
