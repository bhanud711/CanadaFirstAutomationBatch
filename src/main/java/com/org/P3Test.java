package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.testandquiz.com/selenium/testing.html");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
//driver.findElement(By.linkText("This is a link")).click();
//driver.findElement(By.partialLinkText("This is a")).click();
driver.findElement(By.className("Automation")).click();
driver.findElement(By.name("gender")).click();
driver.findElement(By.id("idOfButton")).click();
		
	}

}
