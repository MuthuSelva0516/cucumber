package org.browserlanch;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Muthu Selva\\eclipse-workspace\\selenium1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php"); 
		driver.findElement(By.id("username")).sendKeys("vengat16");  
		driver.findElement(By.id("password")).sendKeys("Karthick");  
		String s = driver.findElement(By.id("username")).getAttribute("value");  
		String s1 = driver.findElement(By.id("password")).getAttribute("value"); 

	}

}
