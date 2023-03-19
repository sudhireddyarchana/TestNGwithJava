package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAnnotationAttribute3 {
	@Test(expectedExceptions= {Exception.class})
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("s")).sendKeys("abdul kalam");
	}


}
