package org.browserlanch;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchuserinput 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser Name:");
		String browser=sc.nextLine();
		WebDriver driver=null;
//		if(browser.equals("Firefox"))  
//		{ 
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\Muthu Selva\\eclipse-workspace\\selenium1\\drivers\\chromedriver.exe" );
//			driver = new ChromeDriver();
//		}
//		else
		if(browser.equals("Chrome"))  
			{ 
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Muthu Selva\\eclipse-workspace\\selenium1\\drivers\\chromedriver.exe"); 
				driver = new ChromeDriver();   
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				}   
			else   
			{   
				System.out.println("Invalid browser");
				}  
		Thread.sleep(2000);  
		driver.close(); 
		}
	
		
		
	}

