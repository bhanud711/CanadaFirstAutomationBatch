package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P15Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()='Click me']")).click();
Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();

driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
alert.dismiss();
driver.findElement(By.xpath("//button[@id='promtButton']")).click();
alert.sendKeys("Ramarao");
alert.accept();
	}

}
