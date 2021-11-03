package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P8MultiDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement browsers = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		Select s=new Select(browsers);
		s.selectByVisibleText("Browser Commands");
		s.selectByVisibleText("Navigation Commands");
		s.selectByVisibleText("Wait Commands");
		s.deselectByVisibleText("Navigation Commands");
		s.deselectAll();
	}

}
