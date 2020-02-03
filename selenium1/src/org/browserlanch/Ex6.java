package org.browserlanch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Muthu Selva\\eclipse-workspace\\selenium1\\drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/"); 
//		 boolean logo = driver.findElement(By.xpath("<i class=\"fb_logo img sp_RNXRBsVDn05_1_5x sx_f22681\">")).isDisplayed();
//		 
//		 if(logo==true)
//		 {
//			 System.out.println("logo is avaliable");
//			 
//		 }
//		 else
//		 {
//			 System.out.println("logo is not avaliable");
//		 }
//	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
	boolean logo= driver.findElement(By.xpath("//a[@title='Go to Facebook home']")).isEnabled();
	
	 if(logo==true)
		 {
			 System.out.println("logo is avaliable");
			 
		 }
		 else
		 {
			 System.out.println("logo is not avaliable");
		 }
	
		
		
		
		
		
	}
}
