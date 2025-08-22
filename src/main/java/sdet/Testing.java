package sdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	WebElement username=driver.findElement(By.id("inputUsername"));
	username.sendKeys("suresh2k02@gmail.com");
	WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys("hello123");
			
	driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
	driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
	
	driver.findElement(By.cssSelector("button.signInBtn")).click();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	//WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement txt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error']")));
	System.out.println(txt.getText());

	}

}
