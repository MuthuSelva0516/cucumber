package org.browserlanch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Muthu Selva\\eclipse-workspace\\selenium1\\drivers\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver(); 
//	 
//	  driver.get("https://adactin.com/HotelApp/index.php"); 
//	 
//	  driver.manage().window().maximize(); 
//	 
//	  WebElement x2 = driver.findElement(By.partialLinkText("Forgot"));    
//	  x2.click();   
//	WebDriver driver = new ChromeDriver(); 
//	 
//	  driver.get("https://adactin.com/HotelApp/index.php"); 
//	 
//	  driver.manage().window().maximize(); 
//	 
//	  WebElement x2 = driver.findElement(By.linkText("Forgot Password?"));   
//	  x2.click();
//	
	
	
	WebDriver driver = new ChromeDriver(); 
	 
	  driver.get("https://adactin.com/HotelApp/index.php"); 
	 
	  driver.manage().window().maximize(); 
	 
	  WebElement x = driver.findElement(By.id("username")); 
	 
	  x.sendKeys("vengat16"); 
	  
	  String s = driver.findElement(By.id("username")).getAttribute("value");  
	  
	 
	  WebElement x1 = driver.findElement(By.name("password")); 
	 
	  x1.sendKeys("Karthick");    
	 
	  String s1 = driver.findElement(By.id("password")).getAttribute("value"); 
	  
	  WebElement x2 = driver.findElement(By.id("login"));     
	 
	  x2.click(); 
	
}
}
