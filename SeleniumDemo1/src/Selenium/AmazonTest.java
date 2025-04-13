package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonTest {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("hprerana1@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.id("ap_password")).sendKeys("9886624476");
        driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung Galaxy S24 Ultra 5G");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();
		driver.findElement(By.xpath("(//button[@id='a-autoid-1-announce'])[1]")).click();
	}

}
