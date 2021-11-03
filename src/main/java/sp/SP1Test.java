package sp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SP1Test {

	public static Point p;
	public static int x;
	public static int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement user = driver.findElement(By.id("txtUsername"));
		p= user.getLocation();
		x=p.getX();
		System.out.println("X co ordinator value is"+x);
		y = p.getY();
		System.out.println("Y coordinate value is"+y);
		WebElement password = driver.findElement(By.id("txtPassword"));
		p=password.getLocation();
		x=p.getX();
		System.out.println("X co ordinator value is"+x);
		y = p.getY();
		System.out.println("Y coordinate value is"+y);
		
	}

}
