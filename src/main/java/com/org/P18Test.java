package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P18Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Actions a=new Actions(driver);
        WebElement leave=driver.findElement(By.xpath("//b[text()='Leave']"));
        WebElement ent=driver.findElement(By.xpath("//a[text()='Entitlements']"));
        WebElement addEnt=driver.findElement(By.xpath("//a[text()='Add Entitlements']"));
        a.moveToElement(leave).moveToElement(ent).moveToElement(addEnt).click().build().perform();
        
	}

}
