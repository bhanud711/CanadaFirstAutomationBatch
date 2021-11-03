package com.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17Windows {
	
	public static String parent,linkedIn,facebook,youtube;
	public static Set<String> all;
	public static Iterator<String> i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
String parent = driver.getWindowHandle();
System.out.println(parent);
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.xpath("//img[@alt=\"LinkedIn OrangeHRM group\"]")).click();
all = driver.getWindowHandles();
i = all.iterator();
 while(i.hasNext())
 {
	 linkedIn =i.next();
	 if(!parent.equals(linkedIn))
	 {
		 System.out.println(linkedIn);
		 driver.switchTo().window(linkedIn);
	 }
	 
 }
 System.out.println(driver.getCurrentUrl());
 System.out.println(driver.getTitle());
driver.findElement(By.id("email-or-phone")).sendKeys("Ramarao");
driver.switchTo().window(parent);
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//img[@alt=\"OrangeHRM on Facebook\"]")).click();
System.out.println(driver.getTitle());
all = driver.getWindowHandles();
i = all.iterator();
while(i.hasNext())
{
	facebook=i.next();	
	if(!parent.equals(facebook))
	{
		System.out.println(facebook);
		driver.switchTo().window(facebook);
	}
}
System.out.println(driver.getTitle());
driver.switchTo().window(linkedIn);
driver.findElement(By.id("password")).sendKeys("Rama");
driver.switchTo().window(facebook);
driver.findElement(By.id("email")).sendKeys("ram");
driver.switchTo().window(parent);
driver.findElement(By.id("btnLogin")).click();
driver.switchTo().window(facebook);
driver.findElement(By.id("pass")).sendKeys("Ramarao");

	}

}
