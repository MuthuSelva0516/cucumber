package org.browserlanch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleDemo
{
	 public static void main(String[] args) throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Muthu Selva\\eclipse-workspace\\selenium1\\drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.gmail.com");
		 String title = driver.getTitle();
		 System.out.println("Title:"+title);
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println("currentUrl:"+currentUrl);
		 Thread.sleep(2000);
		 
	 }

}
