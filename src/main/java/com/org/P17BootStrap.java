package com.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17BootStrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		loop:
		for(WebElement el:all)
		{
			if(el.getText().equals("JavaScript")) {
				el.click();
				break loop;
			}
			
		}
	}
	}


