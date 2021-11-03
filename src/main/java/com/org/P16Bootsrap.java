package com.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P16Bootsrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.aircanada.com/us/en/aco/home.html#/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='tripTypeField']/following::span")).click();
		List<WebElement> all = driver.findElements(By.xpath("//ul[@id='tripTypeId']/li"));
		for(WebElement el:all)
		{
			if(el.getText().contentEquals("One-way")) {
				el.click();
				break;
			}
		
		}
	}

}
