package com.org;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P7DropDown {
public static ChromeDriver driver;
public static int i=1;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
driver=new ChromeDriver();
P7DropDown dd=new P7DropDown();
driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
dd.snap();
driver.manage().window().maximize();
dd.snap();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
dd.snap();
WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
Select s=new Select(country);
//s.selectByIndex(2);
//s.selectByValue("ZW");
s.selectByVisibleText("Canada");
dd.snap();
List<WebElement> all = s.getOptions();
Iterator<WebElement> i = all.iterator();
while(i.hasNext())
{
	String name=i.next().getText();
	System.out.println("Countryname is  "+name);
}
System.out.println("Total Countries"+all.size());

}
	
	
	public void snap() throws IOException
	{
		Random r=new Random();
		if(r.nextInt()!=0)
		{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File(".//pics//img"+i+".png");
	FileUtils.copyFile(src, dest);
	i=i+1;
		}
	}

}
