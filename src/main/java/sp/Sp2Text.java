package sp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sp2Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement checkbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		boolean flag=checkbox.isSelected();
		System.out.println(flag);
		if(flag)
		{
			System.out.println("Checkbox is checked already");
		}
		else {
			System.out.println("We are going to select the checkbox");
			checkbox.click();
		}
		
	}

}
