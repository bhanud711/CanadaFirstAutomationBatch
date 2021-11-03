package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P12Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


driver.get("http://demo.automationtesting.in/Frames.html");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.switchTo().frame("singleframe");
WebDriverWait wait=new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ramarao");
	}

}
