package liveprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class liveproject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\work directory\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/index.php");
//		driver.findElement(By.xpath("//input[@name='uid']")).click();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr267152");
//		driver.findElement(By.xpath("//input[@type='password']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("EtYnyqu");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
