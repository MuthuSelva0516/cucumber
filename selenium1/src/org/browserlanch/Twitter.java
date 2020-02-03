package org.browserlanch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Muthu Selva\\eclipse-workspace\\selenium1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/login");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@role='button'][2]"));
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.xpath("(//input[@name='session[username_or_email]'])[1]"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		email.sendKeys("muthaiyahstr@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement pswd = driver.findElement(By.xpath("//input[@name='session[password]'][1]"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pswd.sendKeys("muthuselva");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@data-testid='LoginForm_Login_Button'])[1]")).click();

	}
}
