package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		//System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('txtUsername').value='ramarao';");
		WebElement user=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		js.executeScript("arguments[0].value='ramarao';",user);
		js.executeScript("document.getElementById('txtPassword').value='ramarao';");
		
		WebElement button=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		js.executeScript("arguments[0].click();",button);
		
		String urlvalue=js.executeScript("return document.URL;").toString();
		System.out.println(urlvalue);
		
		String titleValue=js.executeScript("return document.title;").toString();
		System.out.println(titleValue);
		
		js.executeScript("history.go(0)");
		
		
	}

}
