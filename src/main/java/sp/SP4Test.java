package sp;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class SP4Test {
	public static ChromeDriver driver;
	public static int i=1;
	public static SP4Test sp;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		 driver=new ChromeDriver();
		 sp=new SP4Test();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		sp.snap();
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		sp.snap();
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		sp.snap();
	}
	
	
	public void snap() throws IOException
	{
		Random r=new Random();
		if(r.nextInt()!=0)
		{	
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(".//images//pic"+i+".png");
		FileUtils.copyFile(src,dest);
		i=i+1;
		}
	}

}
