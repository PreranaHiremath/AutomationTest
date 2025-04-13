package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15 pro max");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();
		driver.findElement(By.linkText("Apple iPhone 15 Pro Max (256 GB) - Blue Titanium")).click();
		driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce'])[1]")).click();
	}

}
