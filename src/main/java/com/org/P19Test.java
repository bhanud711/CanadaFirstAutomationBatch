package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P19Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement pass = driver.findElement(By.xpath("//*[@id='txtPassword']"));
        WebElement button = driver.findElement(By.id("btnLogin"));
        Actions a=new Actions(driver);
        a.moveToElement(user).sendKeys("Admin").perform();
	}

}
