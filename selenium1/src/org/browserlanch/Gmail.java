package org.browserlanch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Muthu Selva\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email.sendKeys("kumarstays7@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		WebElement pswd = driver.findElement(By.xpath("//input[@name='password']"));
		Thread.sleep(3000);
		pswd.sendKeys("muthaiyah");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.quit();

	}
}
